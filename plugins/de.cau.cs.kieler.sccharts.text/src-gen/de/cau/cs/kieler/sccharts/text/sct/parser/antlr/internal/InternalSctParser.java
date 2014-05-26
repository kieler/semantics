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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'for'", "'='", "'..'", "'package'", "'scchart'", "'references'", "'bind'", "','", "'{'", "'}'", "'import'", "'.'", "'*'", "'initial'", "'final'", "'state'", "';'", "'immediate'", "'deferred'", "'with'", "'/'", "'do'", "'const'", "'input'", "'output'", "'static'", "'signal'", "'['", "']'", "'combine'", "'to'", "'entry'", "'during'", "'exit'", "'weak'", "'suspend'", "'('", "')'", "'@'", "'normal'", "'connector'", "'reference'", "'textual'", "'goto'", "'abort to'", "'join to'", "'-->'", "'o->'", "'>->'", "'reset'", "'shallow history'", "'history'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'%'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
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
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_COMMENT_ANNOTATION=10;
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
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_STRING=5;
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
    public static final int RULE_BOOLEAN=9;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
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
    public static final int RULE_NUMBER=12;
    public static final int T__59=59;
    public static final int RULE_INT=6;
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
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_HOSTCODE=7;
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
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalSctParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSctParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSctParser.tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g"; }



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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:74:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:75:2: (iv_ruleRoot= ruleRoot EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:76:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRoot_in_entryRuleRoot81);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRoot91); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:83:1: ruleRoot returns [EObject current=null] : this_SCChart_0= ruleSCChart ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject this_SCChart_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:86:28: (this_SCChart_0= ruleSCChart )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:88:2: this_SCChart_0= ruleSCChart
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRootAccess().getSCChartParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSCChart_in_ruleRoot140);
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


    // $ANTLR start "entryRuleSingleRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:107:1: entryRuleSingleRegion returns [EObject current=null] : iv_ruleSingleRegion= ruleSingleRegion EOF ;
    public final EObject entryRuleSingleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRegion = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:108:2: (iv_ruleSingleRegion= ruleSingleRegion EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:109:2: iv_ruleSingleRegion= ruleSingleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion174);
            iv_ruleSingleRegion=ruleSingleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRegion184); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleRegion"


    // $ANTLR start "ruleSingleRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:116:1: ruleSingleRegion returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )? ( (lv_states_7_0= ruleState ) )* ) ;
    public final EObject ruleSingleRegion() throws RecognitionException {
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:119:28: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:120:1: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:120:1: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )? ( (lv_states_7_0= ruleState ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:120:2: () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:120:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:121:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSingleRegionAccess().getRegionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:129:2: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:129:3: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:129:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==56) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:130:1: (lv_annotations_1_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:130:1: (lv_annotations_1_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:131:3: lv_annotations_1_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleSingleRegion243);
                    	    lv_annotations_1_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSingleRegionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_1_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleRegion256); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleRegionAccess().getRegionKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:151:1: ( (lv_id_3_0= RULE_ID ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:152:1: (lv_id_3_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:152:1: (lv_id_3_0= RULE_ID )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:153:3: lv_id_3_0= RULE_ID
                            {
                            lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRegion273); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_id_3_0, grammarAccess.getSingleRegionAccess().getIdIDTerminalRuleCall_1_2_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSingleRegionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"id",
                                      		lv_id_3_0, 
                                      		"ID");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:169:3: ( (lv_label_4_0= RULE_STRING ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_STRING) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:170:1: (lv_label_4_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:170:1: (lv_label_4_0= RULE_STRING )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:171:3: lv_label_4_0= RULE_STRING
                            {
                            lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingleRegion296); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_label_4_0, grammarAccess.getSingleRegionAccess().getLabelSTRINGTerminalRuleCall_1_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSingleRegionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"label",
                                      		lv_label_4_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleRegion314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSingleRegionAccess().getColonKeyword_1_4());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:191:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
                    loop4:
                    do {
                        int alt4=2;
                        alt4 = dfa4.predict(input);
                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: (lv_declarations_6_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: (lv_declarations_6_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:193:3: lv_declarations_6_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getDeclarationsDeclarationParserRuleCall_1_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleSingleRegion335);
                    	    lv_declarations_6_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSingleRegionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_6_0, 
                    	              		"Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:209:5: ( (lv_states_7_0= ruleState ) )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:210:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:210:1: (lv_states_7_0= ruleState )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:211:3: lv_states_7_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getStatesStateParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleSingleRegion359);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSingleRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_7_0, 
            	              		"State");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleRegion"


    // $ANTLR start "entryRuleFor"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:235:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:236:2: (iv_ruleFor= ruleFor EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:237:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFor_in_entryRuleFor396);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFor406); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:244:1: ruleFor returns [EObject current=null] : ( () otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_to_6_0= RULE_INT ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_from_4_0=null;
        Token otherlv_5=null;
        Token lv_to_6_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:247:28: ( ( () otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_to_6_0= RULE_INT ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:1: ( () otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_to_6_0= RULE_INT ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:1: ( () otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_to_6_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:2: () otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_from_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_to_6_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:249:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForAccess().getForAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFor455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getForKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:261:1: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:262:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:262:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:263:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getForRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFor479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getForAccess().getLoopVariableValuedObjectCrossReference_2_0()); 
              	
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFor491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getForAccess().getEqualsSignKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:281:1: ( (lv_from_4_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:282:1: (lv_from_4_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:282:1: (lv_from_4_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:283:3: lv_from_4_0= RULE_INT
            {
            lv_from_4_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleFor508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_from_4_0, grammarAccess.getForAccess().getFromINTTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"from",
                      		lv_from_4_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFor525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getForAccess().getFullStopFullStopKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:303:1: ( (lv_to_6_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:304:1: (lv_to_6_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:304:1: (lv_to_6_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:305:3: lv_to_6_0= RULE_INT
            {
            lv_to_6_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleFor542); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_to_6_0, grammarAccess.getForAccess().getToINTTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getForRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"to",
                      		lv_to_6_0, 
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:329:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:330:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:331:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRegion_in_entryRuleRegion583);
            iv_ruleRegion=ruleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegion593); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:338:1: ruleRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_for_2_0= ruleFor ) )? otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) )? ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_declarations_7_0= ruleDeclaration ) )* ( (lv_states_8_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_for_2_0 = null;

        EObject lv_declarations_7_0 = null;

        EObject lv_states_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:341:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_for_2_0= ruleFor ) )? otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) )? ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_declarations_7_0= ruleDeclaration ) )* ( (lv_states_8_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:342:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_for_2_0= ruleFor ) )? otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) )? ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_declarations_7_0= ruleDeclaration ) )* ( (lv_states_8_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:342:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_for_2_0= ruleFor ) )? otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) )? ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_declarations_7_0= ruleDeclaration ) )* ( (lv_states_8_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:342:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* ( (lv_for_2_0= ruleFor ) )? otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) )? ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_declarations_7_0= ruleDeclaration ) )* ( (lv_states_8_0= ruleState ) )+
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:342:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:343:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegionAccess().getRegionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:351:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT_ANNOTATION||LA7_0==56) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:352:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:352:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:353:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleRegion651);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:369:3: ( (lv_for_2_0= ruleFor ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:370:1: (lv_for_2_0= ruleFor )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:370:1: (lv_for_2_0= ruleFor )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:371:3: lv_for_2_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRegionAccess().getForForParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFor_in_ruleRegion673);
                    lv_for_2_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRegionRule());
                      	        }
                             		set(
                             			current, 
                             			"for",
                              		lv_for_2_0, 
                              		"For");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegion686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getRegionKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:391:1: ( (lv_id_4_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:392:1: (lv_id_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:392:1: (lv_id_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:393:3: lv_id_4_0= RULE_ID
                    {
                    lv_id_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRegion703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_4_0, grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:409:3: ( (lv_label_5_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:410:1: (lv_label_5_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:410:1: (lv_label_5_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:411:3: lv_label_5_0= RULE_STRING
                    {
                    lv_label_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRegion726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_5_0, grammarAccess.getRegionAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRegion744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRegionAccess().getColonKeyword_6());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:431:1: ( (lv_declarations_7_0= ruleDeclaration ) )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:432:1: (lv_declarations_7_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:432:1: (lv_declarations_7_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:433:3: lv_declarations_7_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getDeclarationsDeclarationParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleRegion765);
            	    lv_declarations_7_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declarations",
            	              		lv_declarations_7_0, 
            	              		"Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:449:3: ( (lv_states_8_0= ruleState ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:450:1: (lv_states_8_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:450:1: (lv_states_8_0= ruleState )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:451:3: lv_states_8_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRegion787);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_8_0, 
            	              		"State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleSCChart"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:475:1: entryRuleSCChart returns [EObject current=null] : iv_ruleSCChart= ruleSCChart EOF ;
    public final EObject entryRuleSCChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCChart = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:476:2: (iv_ruleSCChart= ruleSCChart EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:477:2: iv_ruleSCChart= ruleSCChart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCChartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSCChart_in_entryRuleSCChart824);
            iv_ruleSCChart=ruleSCChart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCChart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSCChart834); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:484:1: ruleSCChart returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? ) ;
    public final EObject ruleSCChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_annotations_3_0 = null;

        EObject lv_bindings_10_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_declarations_14_0 = null;

        EObject lv_localActions_15_0 = null;

        EObject lv_regions_16_0 = null;

        EObject lv_regions_17_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:487:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:488:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:488:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:488:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:488:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:488:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSCChart872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSCChartAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:492:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:493:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:493:1: (lv_name_1_0= ruleQualifiedName )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:494:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSCChartAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSCChart893);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:510:4: ( (lv_imports_2_0= ruleImportDecl ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:511:1: (lv_imports_2_0= ruleImportDecl )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:511:1: (lv_imports_2_0= ruleImportDecl )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:512:3: lv_imports_2_0= ruleImportDecl
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getImportsImportDeclParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportDecl_in_ruleSCChart916);
            	    lv_imports_2_0=ruleImportDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_2_0, 
            	              		"ImportDecl");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:528:3: ( (lv_annotations_3_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==56) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:529:1: (lv_annotations_3_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:529:1: (lv_annotations_3_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:530:3: lv_annotations_3_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleSCChart938);
            	    lv_annotations_3_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_3_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSCChart951); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSCChartAccess().getScchartKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:550:1: ( (lv_id_5_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:551:1: (lv_id_5_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:551:1: (lv_id_5_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:552:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSCChart968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_5_0, grammarAccess.getSCChartAccess().getIdIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSCChartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:568:2: ( (lv_label_6_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:569:1: (lv_label_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:569:1: (lv_label_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:570:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSCChart990); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_6_0, grammarAccess.getSCChartAccess().getLabelSTRINGTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:586:3: ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )?
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:586:4: (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:586:4: (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:586:6: otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )?
                    {
                    otherlv_7=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSCChart1010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSCChartAccess().getReferencesKeyword_6_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:590:1: ( (otherlv_8= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:591:1: (otherlv_8= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:591:1: (otherlv_8= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:592:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSCChart1034); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getSCChartAccess().getReferencedScopeStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:606:2: (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==24) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:606:4: otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )*
                            {
                            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSCChart1047); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSCChartAccess().getBindKeyword_6_0_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:610:1: ( (lv_bindings_10_0= ruleBinding ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:611:1: (lv_bindings_10_0= ruleBinding )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:611:1: (lv_bindings_10_0= ruleBinding )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:612:3: lv_bindings_10_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleSCChart1068);
                            lv_bindings_10_0=ruleBinding();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"bindings",
                                      		lv_bindings_10_0, 
                                      		"Binding");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:628:2: (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==25) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:628:4: otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) )
                            	    {
                            	    otherlv_11=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleSCChart1081); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getSCChartAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:632:1: ( (lv_bindings_12_0= ruleBinding ) )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:633:1: (lv_bindings_12_0= ruleBinding )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:633:1: (lv_bindings_12_0= ruleBinding )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:634:3: lv_bindings_12_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleSCChart1102);
                            	    lv_bindings_12_0=ruleBinding();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"bindings",
                            	              		lv_bindings_12_0, 
                            	              		"Binding");
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


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:651:6: (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:651:6: (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:651:8: otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSCChart1126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getSCChartAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:1: ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:2: ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:2: ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        alt19 = dfa19.predict(input);
                        switch (alt19) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:3: ( (lv_declarations_14_0= ruleDeclaration ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:3: ( (lv_declarations_14_0= ruleDeclaration ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:656:1: (lv_declarations_14_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:656:1: (lv_declarations_14_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:657:3: lv_declarations_14_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleSCChart1149);
                    	    lv_declarations_14_0=ruleDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declarations",
                    	              		lv_declarations_14_0, 
                    	              		"Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:674:6: ( (lv_localActions_15_0= ruleLocalAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:674:6: ( (lv_localActions_15_0= ruleLocalAction ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:675:1: (lv_localActions_15_0= ruleLocalAction )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:675:1: (lv_localActions_15_0= ruleLocalAction )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:676:3: lv_localActions_15_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_ruleSCChart1176);
                    	    lv_localActions_15_0=ruleLocalAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"localActions",
                    	              		lv_localActions_15_0, 
                    	              		"LocalAction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:4: ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==16||LA21_0==18||(LA21_0>=31 && LA21_0<=33)||(LA21_0>=56 && LA21_0<=60)) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==27) ) {
                        int LA21_2 = input.LA(2);

                        if ( (synpred23_InternalSct()) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:5: ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:5: ( (lv_regions_16_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_regions_16_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_regions_16_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:694:3: lv_regions_16_0= ruleSingleRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleSCChart1200);
                            lv_regions_16_0=ruleSingleRegion();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"regions",
                                      		lv_regions_16_0, 
                                      		"SingleRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:710:2: ( (lv_regions_17_0= ruleRegion ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==16||LA20_0==18||LA20_0==56) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:1: (lv_regions_17_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:1: (lv_regions_17_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:712:3: lv_regions_17_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleSCChart1221);
                            	    lv_regions_17_0=ruleRegion();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"regions",
                            	              		lv_regions_17_0, 
                            	              		"Region");
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


                    }

                    otherlv_18=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleSCChart1237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSCChartAccess().getRightCurlyBracketKeyword_6_1_2());
                          
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


    // $ANTLR start "entryRuleImportDecl"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:740:1: entryRuleImportDecl returns [EObject current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final EObject entryRuleImportDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDecl = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:741:2: (iv_ruleImportDecl= ruleImportDecl EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:742:2: iv_ruleImportDecl= ruleImportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportDecl_in_entryRuleImportDecl1276);
            iv_ruleImportDecl=ruleImportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportDecl1286); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:749:1: ruleImportDecl returns [EObject current=null] : (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ) ;
    public final EObject ruleImportDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:752:28: ( (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:753:1: (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:753:1: (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:753:3: otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleImportDecl1323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDeclAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:757:1: ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:757:2: ( ( ruleQualifiedName ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:757:2: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:758:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:758:1: ( ruleQualifiedName )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:759:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getImportDeclRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDeclAccess().getImportedTypeStateCrossReference_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleImportDecl1351);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:776:6: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:776:6: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:777:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:777:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:778:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDeclAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDecl1378);
                    lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportDeclRule());
                      	        }
                             		set(
                             			current, 
                             			"importedNamespace",
                              		lv_importedNamespace_2_0, 
                              		"QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleQualifiedName"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:802:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:803:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:804:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1416);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1427); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:811:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:814:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:815:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:815:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:815:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:822:1: (kw= '.' this_ID_2= RULE_ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:823:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleQualifiedName1486); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1501); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:843:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:844:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:845:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1549);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1560); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:852:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:855:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:856:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:856:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:857:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1607);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleQualifiedNameWithWildcard1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleQualifiedNameWithWildcard1638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleState"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:887:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:888:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:889:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1678);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1688); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:896:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? ) ;
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
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_bindings_12_0 = null;

        EObject lv_bindings_14_0 = null;

        EObject lv_declarations_16_0 = null;

        EObject lv_localActions_17_0 = null;

        EObject lv_regions_18_0 = null;

        EObject lv_regions_19_0 = null;

        EObject lv_outgoingTransitions_21_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:899:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:900:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:900:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:900:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:900:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_COMMENT_ANNOTATION||LA25_0==56) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:901:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:901:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:902:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleState1734);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:918:3: ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:918:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:918:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:918:5: ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:918:5: ( (lv_initial_1_0= 'initial' ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:919:1: (lv_initial_1_0= 'initial' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:919:1: (lv_initial_1_0= 'initial' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:920:3: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleState1755); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:933:2: ( (lv_final_2_0= 'final' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:934:1: (lv_final_2_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:934:1: (lv_final_2_0= 'final' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:935:3: lv_final_2_0= 'final'
                            {
                            lv_final_2_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleState1786); if (state.failed) return current;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:7: ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:7: ( (lv_final_3_0= 'final' ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (lv_final_3_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (lv_final_3_0= 'final' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:951:3: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleState1826); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:964:2: ( (lv_initial_4_0= 'initial' ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==31) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:965:1: (lv_initial_4_0= 'initial' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:965:1: (lv_initial_4_0= 'initial' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:966:3: lv_initial_4_0= 'initial'
                            {
                            lv_initial_4_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleState1857); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:979:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=57 && LA29_0<=60)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:980:1: (lv_type_5_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:980:1: (lv_type_5_0= ruleStateType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:981:3: lv_type_5_0= ruleStateType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleState1895);
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
                              		"StateType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleState1908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getStateKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1001:1: ( (lv_id_7_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1002:1: (lv_id_7_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1002:1: (lv_id_7_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1003:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1925); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1019:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1020:1: (lv_label_8_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1020:1: (lv_label_8_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1021:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleState1947); if (state.failed) return current;
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
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1037:3: ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )?
            int alt36=3;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            else if ( (LA36_0==26) ) {
                alt36=2;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1037:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1037:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1037:6: otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    {
                    otherlv_9=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getReferencesKeyword_6_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1041:1: ( (otherlv_10= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1042:1: (otherlv_10= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1042:1: (otherlv_10= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1043:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getStateAccess().getReferencedScopeStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1057:2: (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==24) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1057:4: otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            {
                            otherlv_11=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState2004); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getBindKeyword_6_0_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1061:1: ( (lv_bindings_12_0= ruleBinding ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1062:1: (lv_bindings_12_0= ruleBinding )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1062:1: (lv_bindings_12_0= ruleBinding )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1063:3: lv_bindings_12_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleState2025);
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
                                      		"Binding");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1079:2: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            loop31:
                            do {
                                int alt31=2;
                                int LA31_0 = input.LA(1);

                                if ( (LA31_0==25) ) {
                                    alt31=1;
                                }


                                switch (alt31) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1079:4: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
                            	    {
                            	    otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState2038); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1083:1: ( (lv_bindings_14_0= ruleBinding ) )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1084:1: (lv_bindings_14_0= ruleBinding )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1084:1: (lv_bindings_14_0= ruleBinding )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1085:3: lv_bindings_14_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleState2059);
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
                            	              		"Binding");
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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1102:6: (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1102:6: (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1102:8: otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleState2083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:1: ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:2: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:2: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*
                    loop33:
                    do {
                        int alt33=3;
                        alt33 = dfa33.predict(input);
                        switch (alt33) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:3: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:3: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1107:1: (lv_declarations_16_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1107:1: (lv_declarations_16_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1108:3: lv_declarations_16_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleState2106);
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
                    	              		"Declaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1125:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1125:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1126:1: (lv_localActions_17_0= ruleLocalAction )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1126:1: (lv_localActions_17_0= ruleLocalAction )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1127:3: lv_localActions_17_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_ruleState2133);
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
                    	              		"LocalAction");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:4: ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_COMMENT_ANNOTATION||LA35_0==16||LA35_0==18||(LA35_0>=31 && LA35_0<=33)||(LA35_0>=56 && LA35_0<=60)) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==27) ) {
                        int LA35_2 = input.LA(2);

                        if ( (synpred40_InternalSct()) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:5: ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:5: ( (lv_regions_18_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1144:1: (lv_regions_18_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1144:1: (lv_regions_18_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1145:3: lv_regions_18_0= ruleSingleRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleState2157);
                            lv_regions_18_0=ruleSingleRegion();

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
                                      		"SingleRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1161:2: ( (lv_regions_19_0= ruleRegion ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==16||LA34_0==18||LA34_0==56) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1162:1: (lv_regions_19_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1162:1: (lv_regions_19_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1163:3: lv_regions_19_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleState2178);
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
                            	              		"Region");
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
                            break;

                    }


                    }

                    otherlv_20=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleState2194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1183:4: ( (lv_outgoingTransitions_21_0= ruleTransition ) )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1184:1: (lv_outgoingTransitions_21_0= ruleTransition )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1184:1: (lv_outgoingTransitions_21_0= ruleTransition )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1185:3: lv_outgoingTransitions_21_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState2218);
            	    lv_outgoingTransitions_21_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outgoingTransitions",
            	              		lv_outgoingTransitions_21_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1201:3: (otherlv_22= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1201:5: otherlv_22= ';'
                    {
                    otherlv_22=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleState2232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStateAccess().getSemicolonKeyword_8());
                          
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleLocalAction"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1213:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1214:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1215:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_entryRuleLocalAction2270);
            iv_ruleLocalAction=ruleLocalAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalAction2280); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1222:1: ruleLocalAction returns [EObject current=null] : (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject this_EntryAction_0 = null;

        EObject this_DuringAction_1 = null;

        EObject this_ExitAction_2 = null;

        EObject this_SuspendAction_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1225:28: ( (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1226:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1226:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt39=1;
                }
                break;
            case 35:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==50) ) {
                    alt39=2;
                }
                else if ( ((LA39_2>=52 && LA39_2<=53)) ) {
                    alt39=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case 50:
                {
                alt39=2;
                }
                break;
            case 51:
                {
                alt39=3;
                }
                break;
            case 52:
            case 53:
                {
                alt39=4;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1227:2: this_EntryAction_0= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getEntryActionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntryAction_in_ruleLocalAction2330);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1240:2: this_DuringAction_1= ruleDuringAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getDuringActionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDuringAction_in_ruleLocalAction2360);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1253:2: this_ExitAction_2= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getExitActionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExitAction_in_ruleLocalAction2390);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1266:2: this_SuspendAction_3= ruleSuspendAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getSuspendActionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSuspendAction_in_ruleLocalAction2420);
                    this_SuspendAction_3=ruleSuspendAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SuspendAction_3; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1285:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1286:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1287:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition2455);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition2465); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1294:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_immediate_4_0=null;
        Token lv_deferred_5_0=null;
        Token otherlv_7=null;
        Token lv_delay_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_label_16_0=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_1_0 = null;

        Enumerator lv_type_2_0 = null;

        Enumerator lv_history_6_0 = null;

        EObject lv_trigger_9_0 = null;

        EObject lv_effects_13_0 = null;

        EObject lv_effects_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1297:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_COMMENT_ANNOTATION||LA40_0==56) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1299:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1299:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1300:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTransition2511);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1316:3: ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=64 && LA41_0<=66)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=61 && LA41_0<=63)) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1316:4: ( (lv_type_1_0= ruleTransitionTypeLegacy ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1316:4: ( (lv_type_1_0= ruleTransitionTypeLegacy ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1317:1: (lv_type_1_0= ruleTransitionTypeLegacy )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1317:1: (lv_type_1_0= ruleTransitionTypeLegacy )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1318:3: lv_type_1_0= ruleTransitionTypeLegacy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeLegacyEnumRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionTypeLegacy_in_ruleTransition2534);
                    lv_type_1_0=ruleTransitionTypeLegacy();

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
                              		"TransitionTypeLegacy");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1335:6: ( (lv_type_2_0= ruleTransitionType ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1335:6: ( (lv_type_2_0= ruleTransitionType ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1336:1: (lv_type_2_0= ruleTransitionType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1336:1: (lv_type_2_0= ruleTransitionType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1337:3: lv_type_2_0= ruleTransitionType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionType_in_ruleTransition2561);
                    lv_type_2_0=ruleTransitionType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"TransitionType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1353:3: ( (otherlv_3= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1354:1: (otherlv_3= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1354:1: (otherlv_3= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1355:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition2586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1369:2: ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1369:3: ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1369:3: ( (lv_immediate_4_0= 'immediate' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==35) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1370:1: (lv_immediate_4_0= 'immediate' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1370:1: (lv_immediate_4_0= 'immediate' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1371:3: lv_immediate_4_0= 'immediate'
                            {
                            lv_immediate_4_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTransition2605); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_immediate_4_0, grammarAccess.getTransitionAccess().getImmediateImmediateKeyword_3_0_0());
                                  
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1384:3: ( (lv_deferred_5_0= 'deferred' ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==36) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1385:1: (lv_deferred_5_0= 'deferred' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1385:1: (lv_deferred_5_0= 'deferred' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1386:3: lv_deferred_5_0= 'deferred'
                            {
                            lv_deferred_5_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTransition2637); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_deferred_5_0, grammarAccess.getTransitionAccess().getDeferredDeferredKeyword_3_1_0());
                                  
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1399:3: ( (lv_history_6_0= ruleHistoryType ) )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=67 && LA44_0<=69)) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:1: (lv_history_6_0= ruleHistoryType )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:1: (lv_history_6_0= ruleHistoryType )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1401:3: lv_history_6_0= ruleHistoryType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_3_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleHistoryType_in_ruleTransition2672);
                            lv_history_6_0=ruleHistoryType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"history",
                                      		lv_history_6_0, 
                                      		"HistoryType");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:3: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
                    int alt50=3;
                    alt50 = dfa50.predict(input);
                    switch (alt50) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )?
                            int alt46=3;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==37) ) {
                                int LA46_1 = input.LA(2);

                                if ( (LA46_1==RULE_ID||(LA46_1>=RULE_INT && LA46_1<=RULE_BOOLEAN)||LA46_1==54||LA46_1==76||LA46_1==79||LA46_1==81||LA46_1==83) ) {
                                    alt46=1;
                                }
                                else if ( (LA46_1==EOF||LA46_1==RULE_COMMENT_ANNOTATION||LA46_1==16||LA46_1==18||LA46_1==27||(LA46_1>=31 && LA46_1<=34)||(LA46_1>=38 && LA46_1<=39)||(LA46_1>=56 && LA46_1<=66)) ) {
                                    alt46=2;
                                }
                            }
                            switch (alt46) {
                                case 1 :
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:8: otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                                    {
                                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTransition2689); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getWithKeyword_3_3_0_0_0_0());
                                          
                                    }
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1421:1: ( (lv_delay_8_0= RULE_INT ) )?
                                    int alt45=2;
                                    alt45 = dfa45.predict(input);
                                    switch (alt45) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
                                            {
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1423:3: lv_delay_8_0= RULE_INT
                                            {
                                            lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition2706); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              			newLeafNode(lv_delay_8_0, grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_3_3_0_0_0_1_0()); 
                                              		
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getTransitionRule());
                                              	        }
                                                     		setWithLastConsumed(
                                                     			current, 
                                                     			"delay",
                                                      		lv_delay_8_0, 
                                                      		"INT");
                                              	    
                                            }

                                            }


                                            }
                                            break;

                                    }

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_trigger_9_0= ruleBoolExpression )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_trigger_9_0= ruleBoolExpression )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1441:3: lv_trigger_9_0= ruleBoolExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_3_3_0_0_0_2_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleTransition2733);
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
                                              		"BoolExpression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1458:7: otherlv_10= 'with'
                                    {
                                    otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleTransition2752); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getWithKeyword_3_3_0_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:3: ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( ((LA49_0>=38 && LA49_0<=39)) ) {
                                alt49=1;
                            }
                            switch (alt49) {
                                case 1 :
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:4: (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:4: (otherlv_11= '/' | otherlv_12= 'do' )
                                    int alt47=2;
                                    int LA47_0 = input.LA(1);

                                    if ( (LA47_0==38) ) {
                                        alt47=1;
                                    }
                                    else if ( (LA47_0==39) ) {
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
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:6: otherlv_11= '/'
                                            {
                                            otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTransition2768); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getSolidusKeyword_3_3_0_1_0_0());
                                                  
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1467:7: otherlv_12= 'do'
                                            {
                                            otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTransition2786); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getDoKeyword_3_3_0_1_0_1());
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1471:2: ( (lv_effects_13_0= ruleEffect ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:1: (lv_effects_13_0= ruleEffect )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:1: (lv_effects_13_0= ruleEffect )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1473:3: lv_effects_13_0= ruleEffect
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2808);
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
                                              		"Effect");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                                    loop48:
                                    do {
                                        int alt48=2;
                                        int LA48_0 = input.LA(1);

                                        if ( (LA48_0==34) ) {
                                            int LA48_1 = input.LA(2);

                                            if ( (LA48_1==RULE_ID||LA48_1==RULE_HOSTCODE) ) {
                                                alt48=1;
                                            }


                                        }


                                        switch (alt48) {
                                    	case 1 :
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:4: otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) )
                                    	    {
                                    	    otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTransition2821); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getSemicolonKeyword_3_3_0_1_2_0());
                                    	          
                                    	    }
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1493:1: ( (lv_effects_15_0= ruleEffect ) )
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1494:1: (lv_effects_15_0= ruleEffect )
                                    	    {
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1494:1: (lv_effects_15_0= ruleEffect )
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1495:3: lv_effects_15_0= ruleEffect
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2842);
                                    	    lv_effects_15_0=ruleEffect();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                                    	      	        }
                                    	             		add(
                                    	             			current, 
                                    	             			"effects",
                                    	              		lv_effects_15_0, 
                                    	              		"Effect");
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
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1512:6: ( (lv_label_16_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1512:6: ( (lv_label_16_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1513:1: (lv_label_16_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1513:1: (lv_label_16_0= RULE_STRING )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1514:3: lv_label_16_0= RULE_STRING
                            {
                            lv_label_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTransition2870); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_label_16_0, grammarAccess.getTransitionAccess().getLabelSTRINGTerminalRuleCall_3_3_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTransitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"label",
                                      		lv_label_16_0, 
                                      		"STRING");
                              	    
                            }

                            }


                            }


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


    // $ANTLR start "entryRuleDeclaration"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1538:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1539:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1540:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_entryRuleDeclaration2915);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaration2925); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1547:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_1_0=null;
        Token lv_input_2_0=null;
        Token lv_output_3_0=null;
        Token lv_static_4_0=null;
        Token lv_signal_5_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_valuedObjects_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1550:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1551:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1551:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1551:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1551:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_COMMENT_ANNOTATION||LA52_0==56) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1552:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1552:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1553:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleDeclaration2971);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1569:3: ( (lv_const_1_0= 'const' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==40) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1570:1: (lv_const_1_0= 'const' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1570:1: (lv_const_1_0= 'const' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1571:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDeclaration2990); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1584:3: ( (lv_input_2_0= 'input' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1585:1: (lv_input_2_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1585:1: (lv_input_2_0= 'input' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1586:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDeclaration3022); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_input_2_0, grammarAccess.getDeclarationAccess().getInputInputKeyword_2_0());
                          
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1599:3: ( (lv_output_3_0= 'output' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==42) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1600:1: (lv_output_3_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1600:1: (lv_output_3_0= 'output' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1601:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDeclaration3054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_output_3_0, grammarAccess.getDeclarationAccess().getOutputOutputKeyword_3_0());
                          
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1614:3: ( (lv_static_4_0= 'static' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1615:1: (lv_static_4_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1615:1: (lv_static_4_0= 'static' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1616:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDeclaration3086); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_static_4_0, grammarAccess.getDeclarationAccess().getStaticStaticKeyword_4_0());
                          
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1629:3: ( (lv_signal_5_0= 'signal' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==44) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1630:1: (lv_signal_5_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1630:1: (lv_signal_5_0= 'signal' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1631:3: lv_signal_5_0= 'signal'
                    {
                    lv_signal_5_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDeclaration3118); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_signal_5_0, grammarAccess.getDeclarationAccess().getSignalSignalKeyword_5_0());
                          
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1644:3: ( (lv_type_6_0= ruleValueType ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1645:1: (lv_type_6_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1645:1: (lv_type_6_0= ruleValueType )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1646:3: lv_type_6_0= ruleValueType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleDeclaration3153);
            lv_type_6_0=ruleValueType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_6_0, 
                      		"ValueType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1662:2: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1663:1: (lv_valuedObjects_7_0= ruleValuedObject )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1663:1: (lv_valuedObjects_7_0= ruleValuedObject )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1664:3: lv_valuedObjects_7_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleDeclaration3174);
            lv_valuedObjects_7_0=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"valuedObjects",
                      		lv_valuedObjects_7_0, 
                      		"ValuedObject");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1680:2: (otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==25) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1680:4: otherlv_8= ',' ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    {
            	    otherlv_8=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleDeclaration3187); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getCommaKeyword_8_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1684:1: ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1685:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1685:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1686:3: lv_valuedObjects_9_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleDeclaration3208);
            	    lv_valuedObjects_9_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_9_0, 
            	              		"ValuedObject");
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1702:4: (otherlv_10= ';' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==34) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1702:6: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDeclaration3223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getDeclarationAccess().getSemicolonKeyword_9());
                          
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1714:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1715:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1716:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_entryRuleValuedObject3261);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObject3271); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1723:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1726:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1728:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1728:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1729:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObject3313); if (state.failed) return current;
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
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1745:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==45) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1745:4: otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleValuedObject3331); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1749:1: ( (lv_cardinalities_2_0= RULE_INT ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1750:1: (lv_cardinalities_2_0= RULE_INT )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1750:1: (lv_cardinalities_2_0= RULE_INT )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1751:3: lv_cardinalities_2_0= RULE_INT
            	    {
            	    lv_cardinalities_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleValuedObject3348); if (state.failed) return current;
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
            	              		"INT");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleValuedObject3365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1771:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==19) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1771:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleValuedObject3380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1775:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1776:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1776:1: (lv_initialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1777:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObject3401);
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
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1793:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==47) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1793:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleValuedObject3416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1798:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1798:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1799:3: lv_combineOperator_7_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleValuedObject3437);
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
    // $ANTLR end "ruleValuedObject"


    // $ANTLR start "entryRuleBinding"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1825:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1826:2: (iv_ruleBinding= ruleBinding EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1827:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinding_in_entryRuleBinding3477);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinding3487); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1834:1: ruleBinding returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1837:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1838:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1838:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1838:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1838:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1839:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1839:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1840:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinding3536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getFormalValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleBinding3548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getToKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1858:1: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1859:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1859:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1860:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinding3572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getActualValuedObjectCrossReference_2_0()); 
              	
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1882:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1883:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1884:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntryAction_in_entryRuleEntryAction3608);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntryAction3618); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1891:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1894:28: ( ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1895:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1895:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1895:2: () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1895:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1896:2: 
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

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleEntryAction3667); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1908:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||(LA63_0>=RULE_INT && LA63_0<=RULE_BOOLEAN)||LA63_0==54||LA63_0==76||LA63_0==79||LA63_0==81||LA63_0==83) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1909:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1909:1: (lv_trigger_2_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1910:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleEntryAction3688);
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
                              		"BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1926:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==38) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1926:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEntryAction3702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1930:1: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1931:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1931:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1932:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleEntryAction3723);
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
                              		"Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1948:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==34) ) {
                            int LA64_1 = input.LA(2);

                            if ( (LA64_1==RULE_ID||LA64_1==RULE_HOSTCODE) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1948:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEntryAction3736); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1952:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1953:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1953:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1954:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleEntryAction3757);
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
                    	              		"Effect");
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1970:6: (otherlv_7= ';' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==34) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1970:8: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEntryAction3774); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1982:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1983:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1984:2: iv_ruleDuringAction= ruleDuringAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDuringActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDuringAction_in_entryRuleDuringAction3812);
            iv_ruleDuringAction=ruleDuringAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDuringAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDuringAction3822); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1991:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1994:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1995:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1995:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1995:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? (otherlv_8= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1995:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1996:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2004:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==35) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2005:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2005:1: (lv_immediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2006:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDuringAction3877); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleDuringAction3903); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2023:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID||(LA68_0>=RULE_INT && LA68_0<=RULE_BOOLEAN)||LA68_0==54||LA68_0==76||LA68_0==79||LA68_0==81||LA68_0==83) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2024:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2024:1: (lv_trigger_3_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2025:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleDuringAction3924);
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
                              		"BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2041:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==38) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2041:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDuringAction3938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDuringActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2045:1: ( (lv_effects_5_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2046:1: (lv_effects_5_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2046:1: (lv_effects_5_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2047:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleDuringAction3959);
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
                              		"Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2063:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==34) ) {
                            int LA69_1 = input.LA(2);

                            if ( (LA69_1==RULE_ID||LA69_1==RULE_HOSTCODE) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2063:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDuringAction3972); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2067:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2068:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2068:1: (lv_effects_7_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2069:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleDuringAction3993);
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
                    	              		"Effect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2085:6: (otherlv_8= ';' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==34) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2085:8: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleDuringAction4010); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2097:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2098:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2099:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExitAction_in_entryRuleExitAction4048);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExitAction4058); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2106:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2109:28: ( ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2110:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2110:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2110:2: () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? (otherlv_7= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2110:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2111:2: 
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

            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleExitAction4107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2123:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID||(LA72_0>=RULE_INT && LA72_0<=RULE_BOOLEAN)||LA72_0==54||LA72_0==76||LA72_0==79||LA72_0==81||LA72_0==83) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2124:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2124:1: (lv_trigger_2_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2125:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExitAction4128);
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
                              		"BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2141:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==38) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2141:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleExitAction4142); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2145:1: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2146:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2146:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2147:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleExitAction4163);
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
                              		"Effect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2163:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==34) ) {
                            int LA73_1 = input.LA(2);

                            if ( (LA73_1==RULE_ID||LA73_1==RULE_HOSTCODE) ) {
                                alt73=1;
                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2163:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleExitAction4176); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2167:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2168:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2168:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2169:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleExitAction4197);
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
                    	              		"Effect");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop73;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2185:6: (otherlv_7= ';' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==34) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2185:8: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleExitAction4214); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2197:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2198:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2199:2: iv_ruleSuspendAction= ruleSuspendAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSuspendAction_in_entryRuleSuspendAction4252);
            iv_ruleSuspendAction=ruleSuspendAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSuspendAction4262); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2206:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token lv_weak_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2209:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2210:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2210:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2210:2: () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? (otherlv_5= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2210:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2211:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2219:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==35) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2220:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2220:1: (lv_immediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2221:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSuspendAction4317); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2234:3: ( (lv_weak_2_0= 'weak' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==52) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2235:1: (lv_weak_2_0= 'weak' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2235:1: (lv_weak_2_0= 'weak' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2236:3: lv_weak_2_0= 'weak'
                    {
                    lv_weak_2_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSuspendAction4349); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSuspendAction4375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendActionAccess().getSuspendKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2253:1: ( (lv_trigger_4_0= ruleBoolExpression ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||(LA78_0>=RULE_INT && LA78_0<=RULE_BOOLEAN)||LA78_0==54||LA78_0==76||LA78_0==79||LA78_0==81||LA78_0==83) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2254:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2254:1: (lv_trigger_4_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2255:3: lv_trigger_4_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuspendActionAccess().getTriggerBoolExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleSuspendAction4396);
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
                              		"BoolExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2271:3: (otherlv_5= ';' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==34) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2271:5: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSuspendAction4410); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2283:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2284:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2285:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect4448);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect4458); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2292:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2295:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2296:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2296:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                int LA80_1 = input.LA(2);

                if ( (LA80_1==19||LA80_1==45) ) {
                    alt80=2;
                }
                else if ( (LA80_1==EOF||LA80_1==RULE_COMMENT_ANNOTATION||LA80_1==16||LA80_1==18||LA80_1==27||(LA80_1>=31 && LA80_1<=35)||(LA80_1>=40 && LA80_1<=44)||(LA80_1>=49 && LA80_1<=54)||(LA80_1>=56 && LA80_1<=66)||(LA80_1>=86 && LA80_1<=92)) ) {
                    alt80=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 80, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA80_0==RULE_HOSTCODE) ) {
                alt80=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2297:2: this_Emission_0= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect4508);
                    this_Emission_0=ruleEmission();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Emission_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2310:2: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect4538);
                    this_Assignment_1=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2323:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect4568);
                    this_TextEffect_2=ruleTextEffect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextEffect_2; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2342:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2343:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2344:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission4603);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission4613); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2351:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2354:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2355:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2355:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2355:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2355:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2356:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2356:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2357:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission4662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2371:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==54) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2371:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleEmission4675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2375:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2376:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2376:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2377:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission4696);
                    lv_newValue_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEmissionRule());
                      	        }
                             		set(
                             			current, 
                             			"newValue",
                              		lv_newValue_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleEmission4708); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2());
                          
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2405:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2406:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2407:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment4746);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment4756); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2414:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_indices_2_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2417:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2418:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2418:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2418:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* otherlv_4= '=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2418:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2419:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2419:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2420:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment4805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2434:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==45) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2434:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAssignment4818); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2438:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2439:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2439:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2440:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignmentAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment4839);
            	    lv_indices_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indices",
            	              		lv_indices_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAssignment4851); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAssignment4865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2464:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2465:1: (lv_expression_5_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2465:1: (lv_expression_5_0= ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2466:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment4886);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"Expression");
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


    // $ANTLR start "entryRuleTextEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2490:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2491:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2492:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect4922);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect4932); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextEffect"


    // $ANTLR start "ruleTextEffect"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2499:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2502:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2503:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2503:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2504:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2504:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2505:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect4973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextEffectAccess().getTextHOSTCODETerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextEffectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"HOSTCODE");
              	    
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
    // $ANTLR end "ruleTextEffect"


    // $ANTLR start "entryRuleExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2529:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2530:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2531:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression5013);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression5023); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2538:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2541:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2542:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2542:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2543:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression5073);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2556:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression5103);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2575:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2576:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2577:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression5138);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression5148); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2584:1: ruleBoolExpression returns [EObject current=null] : this_OrAndExpression_0= ruleOrAndExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrAndExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2587:28: (this_OrAndExpression_0= ruleOrAndExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2589:2: this_OrAndExpression_0= ruleOrAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_ruleBoolExpression5197);
            this_OrAndExpression_0=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrAndExpression_0; 
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


    // $ANTLR start "entryRuleOrAndExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2608:1: entryRuleOrAndExpression returns [EObject current=null] : iv_ruleOrAndExpression= ruleOrAndExpression EOF ;
    public final EObject entryRuleOrAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAndExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2609:2: (iv_ruleOrAndExpression= ruleOrAndExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2610:2: iv_ruleOrAndExpression= ruleOrAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression5231);
            iv_ruleOrAndExpression=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrAndExpression5241); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrAndExpression"


    // $ANTLR start "ruleOrAndExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2617:1: ruleOrAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) ;
    public final EObject ruleOrAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_5_1 = null;

        Enumerator lv_operator_5_2 = null;

        EObject lv_subExpressions_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2620:28: ( (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2621:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2621:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2622:2: this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5291);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==77||LA85_0==84) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:3: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2634:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndAdd(
                    	                  grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2642:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2644:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2644:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    int alt84=2;
                    	    int LA84_0 = input.LA(1);

                    	    if ( (LA84_0==77) ) {
                    	        alt84=1;
                    	    }
                    	    else if ( (LA84_0==84) ) {
                    	        alt84=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 84, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt84) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2645:3: lv_operator_2_1= ruleOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrAndExpression5327);
                    	            lv_operator_2_1=ruleOrOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_2_1, 
                    	                      		"OrOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2660:8: lv_operator_2_2= ruleLogicalOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression5346);
                    	            lv_operator_2_2=ruleLogicalOrOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_2_2, 
                    	                      		"LogicalOrOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2678:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2679:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2679:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2680:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5370);
                    	    lv_subExpressions_3_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_3_0, 
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2697:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2697:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==78||LA87_0==85) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2697:7: () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2697:7: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2698:2: 
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	  /* */ 
                    	      	
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndAdd(
                    	                  grammarAccess.getOrAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_1_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2706:2: ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2707:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2707:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2708:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2708:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    int alt86=2;
                    	    int LA86_0 = input.LA(1);

                    	    if ( (LA86_0==78) ) {
                    	        alt86=1;
                    	    }
                    	    else if ( (LA86_0==85) ) {
                    	        alt86=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 86, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt86) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2709:3: lv_operator_5_1= ruleAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleOrAndExpression5414);
                    	            lv_operator_5_1=ruleAndOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_5_1, 
                    	                      		"AndOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2724:8: lv_operator_5_2= ruleLogicalAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression5433);
                    	            lv_operator_5_2=ruleLogicalAndOperator();

                    	            state._fsp--;
                    	            if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              	        if (current==null) {
                    	              	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	              	        }
                    	                     		set(
                    	                     			current, 
                    	                     			"operator",
                    	                      		lv_operator_5_2, 
                    	                      		"LogicalAndOperator");
                    	              	        afterParserOrEnumRuleCall();
                    	              	    
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2742:2: ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2743:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2743:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2744:3: lv_subExpressions_6_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5457);
                    	    lv_subExpressions_6_0=ruleCompareOperation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"subExpressions",
                    	              		lv_subExpressions_6_0, 
                    	              		"CompareOperation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop87;
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
    // $ANTLR end "ruleOrAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2768:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2769:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2770:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5496);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation5506); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2777:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:28: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt89=2;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2782:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5557);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2793:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2793:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2793:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2794:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0(),
                                  current);
                          
                    }

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2802:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2803:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2803:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2804:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation5590);
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
                              		"CompareOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2820:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2821:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2821:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2822:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5611);
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
                              		"NotOrValuedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2840:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation5644);
                    this_NotExpression_4=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_4; 
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
    // $ANTLR end "ruleCompareOperation"


    // $ANTLR start "entryRuleNotOrValuedExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2859:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2860:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2861:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression5679);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression5689); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2868:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2871:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2872:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2872:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt90=2;
            alt90 = dfa90.predict(input);
            switch (alt90) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2873:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression5739);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2886:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression5769);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2905:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2906:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2907:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression5804);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression5814); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2914:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2917:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2918:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2918:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==79) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_ID||LA91_0==RULE_HOSTCODE||LA91_0==RULE_BOOLEAN||LA91_0==54||LA91_0==76||LA91_0==83) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2918:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2918:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2918:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2918:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2919:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2927:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2928:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2928:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2929:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression5873);
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
                              		"NotOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2945:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2946:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2946:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2947:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression5894);
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
                              		"NotExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2965:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression5926);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2984:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2985:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2986:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression5961);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression5971); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2993:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2996:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2998:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression6020);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3017:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3018:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3019:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression6054);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression6064); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3026:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3029:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3030:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3030:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3031:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression6114);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3042:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==80) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3042:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3042:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3043:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3051:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3052:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3052:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3053:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression6147);
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
            	              		"AddOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3069:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3070:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3070:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3071:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression6168);
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
            	              		"SubExpression");
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleSubExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3095:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3096:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3097:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression6206);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression6216); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3104:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3107:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3108:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3108:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3109:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression6266);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3120:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==81) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3120:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3120:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3121:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3129:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3130:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3130:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3131:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression6299);
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
            	              		"SubOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3147:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3148:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3148:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3149:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression6320);
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
            	              		"MultExpression");
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


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3173:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3174:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3175:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression6358);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression6368); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3182:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3185:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3186:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3186:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3187:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression6418);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3198:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==30) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3198:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3198:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3199:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3207:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3208:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3208:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3209:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression6451);
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
            	              		"MultOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3225:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3226:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3226:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3227:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression6472);
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
            	              		"DivExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3251:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3252:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3253:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression6510);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression6520); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3260:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3263:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3264:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3264:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3265:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression6570);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3276:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==17) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3276:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3276:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3277:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3285:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3286:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3286:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3287:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression6603);
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
                              		"DivOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3303:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3304:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3304:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3305:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression6624);
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
                              		"ModExpression");
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
    // $ANTLR end "ruleDivExpression"


    // $ANTLR start "entryRuleModExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3329:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3330:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3331:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression6662);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression6672); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3338:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3341:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3342:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3342:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3343:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression6722);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3354:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==82) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3354:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3354:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3355:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3363:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3364:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3364:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3365:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression6755);
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
                              		"ModOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3381:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3382:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3382:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3383:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression6776);
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
                              		"AtomicValuedExpression");
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
    // $ANTLR end "ruleModExpression"


    // $ANTLR start "entryRuleNegExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3407:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3408:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3409:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression6814);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression6824); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3416:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3420:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3420:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==81) ) {
                alt97=1;
            }
            else if ( (LA97_0==RULE_ID||(LA97_0>=RULE_INT && LA97_0<=RULE_BOOLEAN)||LA97_0==54||LA97_0==76||LA97_0==83) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3420:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3420:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3420:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3420:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3421:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3429:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3430:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3430:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3431:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression6883);
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
                              		"SubOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3447:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3448:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3448:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3449:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression6904);
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
                              		"NegExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression6936);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3486:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3487:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3488:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6971);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression6981); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3495:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_BoolValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BoolExpression_3 = null;

        EObject this_TextExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3498:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3499:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3499:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt98=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt98=1;
                }
                break;
            case RULE_ID:
            case 76:
            case 83:
                {
                alt98=2;
                }
                break;
            case 54:
                {
                alt98=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt98=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3500:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression7031);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3513:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression7061);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3525:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3525:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3525:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAtomicExpression7079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression7104);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAtomicExpression7115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3547:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression7147);
                    this_TextExpression_5=ruleTextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextExpression_5; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3566:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3567:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3568:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression7182);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression7192); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3575:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3578:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3579:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3579:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt99=4;
            alt99 = dfa99.predict(input);
            switch (alt99) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3580:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression7242);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3593:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression7272);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleAtomicValuedExpression7290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression7315);
                    this_ValuedExpression_3=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleAtomicValuedExpression7326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3627:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression7358);
                    this_AtomicExpression_5=ruleAtomicExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AtomicExpression_5; 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3646:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3647:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3648:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression7393);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression7403); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3655:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3658:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3659:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3659:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==76||LA101_0==83) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_ID) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3659:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3659:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3659:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3659:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3660:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3668:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3669:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3669:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3670:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3670:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==76) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==83) ) {
                        alt100=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3671:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression7464);
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
                                      		"PreOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3686:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression7483);
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
                                      		"ValOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleValuedObjectTestExpression7498); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3708:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3709:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3709:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3710:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression7519);
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
                              		"ValuedObjectTestExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleValuedObjectTestExpression7531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3732:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression7563);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3751:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3752:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3753:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference7598);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference7608); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3760:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_indices_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3763:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3764:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3764:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3764:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3764:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3765:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3765:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3766:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference7657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3780:2: (otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( (LA102_0==45) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3780:4: otherlv_1= '[' ( (lv_indices_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleValuedObjectReference7670); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3784:1: ( (lv_indices_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3785:1: (lv_indices_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3785:1: (lv_indices_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3786:3: lv_indices_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getIndicesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference7691);
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
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleValuedObjectReference7703); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop102;
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


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3814:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3815:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3816:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression7741);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression7751); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3823:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3826:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3827:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3827:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3828:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3828:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3829:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7792); if (state.failed) return current;
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
                      		"HOSTCODE");
              	    
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3853:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3854:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3855:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue7832);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue7842); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3862:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3865:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3866:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3866:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3867:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3867:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3868:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue7883); if (state.failed) return current;
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
                      		"INT");
              	    
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3892:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3893:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3894:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue7923);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue7933); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3901:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3904:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3905:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3905:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3906:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3906:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3907:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue7974); if (state.failed) return current;
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
                      		"FLOAT");
              	    
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3931:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3932:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3933:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue8014);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue8024); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3940:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3943:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3944:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3944:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3945:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3945:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3946:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue8065); if (state.failed) return current;
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
                      		"BOOLEAN");
              	    
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


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3972:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3973:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3974:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation8107);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation8117); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3981:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_TagAnnotation_1 = null;

        EObject this_KeyStringValueAnnotation_2 = null;

        EObject this_TypedKeyStringValueAnnotation_3 = null;

        EObject this_KeyBooleanValueAnnotation_4 = null;

        EObject this_KeyIntValueAnnotation_5 = null;

        EObject this_KeyFloatValueAnnotation_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3984:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3985:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3985:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt103=7;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3986:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation8167);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3999:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation8197);
                    this_TagAnnotation_1=ruleTagAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TagAnnotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4012:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation8227);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4025:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation8257);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4038:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation8287);
                    this_KeyBooleanValueAnnotation_4=ruleKeyBooleanValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyBooleanValueAnnotation_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4051:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation8317);
                    this_KeyIntValueAnnotation_5=ruleKeyIntValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyIntValueAnnotation_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4064:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation8347);
                    this_KeyFloatValueAnnotation_6=ruleKeyFloatValueAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_KeyFloatValueAnnotation_6; 
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


    // $ANTLR start "entryRuleCommentAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4085:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4086:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4087:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8384);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation8394); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4094:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4097:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4098:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4098:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4099:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4099:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4100:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"COMMENT_ANNOTATION");
              	    
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4124:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4125:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4126:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation8475);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation8485); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4133:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4136:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4137:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4137:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4137:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTagAnnotation8522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4141:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4142:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4142:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4143:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation8543);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4159:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==54) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4159:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTagAnnotation8556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4163:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==RULE_COMMENT_ANNOTATION||LA104_0==56) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4164:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4164:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4165:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation8577);
                    	    lv_annotations_3_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTagAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_3_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTagAnnotation8590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleTagAnnotation"


    // $ANTLR start "entryRuleKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4193:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4194:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4195:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8628);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8638); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4202:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4205:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4206:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4206:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4206:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleKeyStringValueAnnotation8675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4210:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4211:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4211:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4212:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8696);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4228:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4229:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4229:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4230:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8717);
            lv_value_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4246:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==54) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4246:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyStringValueAnnotation8730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4250:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==RULE_COMMENT_ANNOTATION||LA106_0==56) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4251:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4251:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4252:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation8751);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleKeyStringValueAnnotation8764); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyStringValueAnnotation"


    // $ANTLR start "entryRuleTypedKeyStringValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4280:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4281:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4282:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8802);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8812); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4289:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
    public final EObject ruleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_annotations_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4292:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4293:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4293:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4293:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTypedKeyStringValueAnnotation8849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4297:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4298:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4298:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4299:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8870);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTypedKeyStringValueAnnotation8882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4319:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4320:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4320:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4321:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8903);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTypedKeyStringValueAnnotation8915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4341:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4342:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4342:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4343:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8936);
            lv_value_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4359:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==54) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4359:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypedKeyStringValueAnnotation8949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4363:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==RULE_COMMENT_ANNOTATION||LA108_0==56) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4364:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4364:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4365:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation8970);
                    	    lv_annotations_7_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypedKeyStringValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_7_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTypedKeyStringValueAnnotation8983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2());
                          
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
    // $ANTLR end "ruleTypedKeyStringValueAnnotation"


    // $ANTLR start "entryRuleKeyBooleanValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4393:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4394:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4395:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation9021);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation9031); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4402:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4405:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4406:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4406:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4406:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleKeyBooleanValueAnnotation9068); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4410:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4411:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4411:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4412:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation9089);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4428:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4429:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4429:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4430:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation9106); if (state.failed) return current;
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
                      		"BOOLEAN");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4446:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==54) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4446:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyBooleanValueAnnotation9124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4450:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==RULE_COMMENT_ANNOTATION||LA110_0==56) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4451:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4451:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4452:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation9145);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyBooleanValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleKeyBooleanValueAnnotation9158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyBooleanValueAnnotation"


    // $ANTLR start "entryRuleKeyIntValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4480:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4481:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4482:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation9196);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation9206); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4489:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4492:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4493:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4493:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4493:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleKeyIntValueAnnotation9243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4497:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4498:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4498:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4499:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation9264);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4515:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4516:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4516:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4517:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation9281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyIntValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"INT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4533:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==54) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4533:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyIntValueAnnotation9299); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4537:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==RULE_COMMENT_ANNOTATION||LA112_0==56) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4538:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4538:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4539:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation9320);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyIntValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleKeyIntValueAnnotation9333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyIntValueAnnotation"


    // $ANTLR start "entryRuleKeyFloatValueAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4567:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4568:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4569:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation9371);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation9381); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4576:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4579:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4580:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4580:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4580:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleKeyFloatValueAnnotation9418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4584:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4585:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4585:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4586:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation9439);
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
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4602:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4603:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4603:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4604:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation9456); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getKeyFloatValueAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"FLOAT");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4620:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==54) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4620:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyFloatValueAnnotation9474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4624:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==RULE_COMMENT_ANNOTATION||LA114_0==56) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4625:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4625:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4626:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation9495);
                    	    lv_annotations_4_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getKeyFloatValueAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_4_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleKeyFloatValueAnnotation9508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2());
                          
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
    // $ANTLR end "ruleKeyFloatValueAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4656:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4657:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4658:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString9549);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString9560); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4665:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4668:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4669:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4669:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_STRING) ) {
                alt116=1;
            }
            else if ( (LA116_0==RULE_ID) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4669:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString9600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4677:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString9626); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
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


    // $ANTLR start "entryRuleExtendedID"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4693:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4694:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID9672);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID9683); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4701:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4705:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4705:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4705:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID9723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4712:1: (kw= '.' this_ID_2= RULE_ID )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==29) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4713:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleExtendedID9742); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID9757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop117;
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "ruleStateType"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4733:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4735:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4736:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4736:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            int alt118=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt118=1;
                }
                break;
            case 58:
                {
                alt118=2;
                }
                break;
            case 59:
                {
                alt118=3;
                }
                break;
            case 60:
                {
                alt118=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4736:2: (enumLiteral_0= 'normal' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4736:2: (enumLiteral_0= 'normal' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4736:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleStateType9818); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4742:6: (enumLiteral_1= 'connector' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4742:6: (enumLiteral_1= 'connector' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4742:8: enumLiteral_1= 'connector'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleStateType9835); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4748:6: (enumLiteral_2= 'reference' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4748:6: (enumLiteral_2= 'reference' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4748:8: enumLiteral_2= 'reference'
                    {
                    enumLiteral_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleStateType9852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4754:6: (enumLiteral_3= 'textual' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4754:6: (enumLiteral_3= 'textual' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4754:8: enumLiteral_3= 'textual'
                    {
                    enumLiteral_3=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleStateType9869); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4764:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4766:28: ( ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4767:1: ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4767:1: ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt119=1;
                }
                break;
            case 62:
                {
                alt119=2;
                }
                break;
            case 63:
                {
                alt119=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4767:2: (enumLiteral_0= 'goto' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4767:2: (enumLiteral_0= 'goto' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4767:4: enumLiteral_0= 'goto'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTransitionType9914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4773:6: (enumLiteral_1= 'abort to' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4773:6: (enumLiteral_1= 'abort to' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4773:8: enumLiteral_1= 'abort to'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTransitionType9931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4779:6: (enumLiteral_2= 'join to' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4779:6: (enumLiteral_2= 'join to' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4779:8: enumLiteral_2= 'join to'
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTransitionType9948); if (state.failed) return current;
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


    // $ANTLR start "ruleTransitionTypeLegacy"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4789:1: ruleTransitionTypeLegacy returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) ;
    public final Enumerator ruleTransitionTypeLegacy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4791:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4792:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4792:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            int alt120=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt120=1;
                }
                break;
            case 65:
                {
                alt120=2;
                }
                break;
            case 66:
                {
                alt120=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4792:2: (enumLiteral_0= '-->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4792:2: (enumLiteral_0= '-->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4792:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTransitionTypeLegacy9993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeLegacyAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeLegacyAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4798:6: (enumLiteral_1= 'o->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4798:6: (enumLiteral_1= 'o->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4798:8: enumLiteral_1= 'o->'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTransitionTypeLegacy10010); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeLegacyAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeLegacyAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4804:6: (enumLiteral_2= '>->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4804:6: (enumLiteral_2= '>->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4804:8: enumLiteral_2= '>->'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTransitionTypeLegacy10027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeLegacyAccess().getTERMINATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTransitionTypeLegacyAccess().getTERMINATIONEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleTransitionTypeLegacy"


    // $ANTLR start "ruleDivOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4814:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4816:28: ( (enumLiteral_0= ':' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4817:1: (enumLiteral_0= ':' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4817:1: (enumLiteral_0= ':' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4817:3: enumLiteral_0= ':'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDivOperator10071); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4827:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4829:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4830:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4830:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt121=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt121=1;
                }
                break;
            case 68:
                {
                alt121=2;
                }
                break;
            case 69:
                {
                alt121=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4830:2: (enumLiteral_0= 'reset' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4830:2: (enumLiteral_0= 'reset' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4830:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleHistoryType10115); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4836:6: (enumLiteral_1= 'shallow history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4836:6: (enumLiteral_1= 'shallow history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4836:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleHistoryType10132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4842:6: (enumLiteral_2= 'history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4842:6: (enumLiteral_2= 'history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4842:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleHistoryType10149); if (state.failed) return current;
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


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4852:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4854:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4855:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4855:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt122=6;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt122=1;
                }
                break;
            case 71:
                {
                alt122=2;
                }
                break;
            case 72:
                {
                alt122=3;
                }
                break;
            case 73:
                {
                alt122=4;
                }
                break;
            case 74:
                {
                alt122=5;
                }
                break;
            case 75:
                {
                alt122=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4855:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4855:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4855:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleCompareOperator10194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4861:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4861:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4861:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleCompareOperator10211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4867:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4867:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4867:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleCompareOperator10228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4873:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4873:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4873:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleCompareOperator10245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4879:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4879:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4879:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleCompareOperator10262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4885:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4885:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4885:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleCompareOperator10279); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4895:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4897:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4898:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4898:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4898:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_rulePreOperator10323); if (state.failed) return current;
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


    // $ANTLR start "ruleOrOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4908:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4910:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4911:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4911:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4911:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleOrOperator10366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4921:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4923:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4924:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4924:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4924:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleAndOperator10409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4934:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4936:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4937:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4937:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4937:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleNotOperator10452); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4947:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4949:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4950:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4950:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4950:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleAddOperator10495); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4960:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4962:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4963:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4963:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4963:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleSubOperator10538); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4973:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4975:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4976:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4976:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4976:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleMultOperator10581); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4986:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4988:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4989:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4989:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4989:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleModOperator10624); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4999:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5001:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5002:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5002:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5002:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleValOperator10667); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5012:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5014:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5015:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5015:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5015:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleLogicalOrOperator10710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5025:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5027:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5028:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5028:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5028:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleLogicalAndOperator10753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      newLeafNode(enumLiteral_0, grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5038:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5040:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5041:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5041:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt123=7;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt123=1;
                }
                break;
            case 87:
                {
                alt123=2;
                }
                break;
            case 88:
                {
                alt123=3;
                }
                break;
            case 89:
                {
                alt123=4;
                }
                break;
            case 90:
                {
                alt123=5;
                }
                break;
            case 91:
                {
                alt123=6;
                }
                break;
            case 92:
                {
                alt123=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5041:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5041:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5041:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleValueType10797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5047:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5047:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5047:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleValueType10814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5053:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5053:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5053:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleValueType10831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5059:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5059:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5059:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleValueType10848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5065:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5065:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5065:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleValueType10865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5071:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5071:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5071:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleValueType10882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5077:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5077:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5077:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleValueType10899); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5087:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5089:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5090:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5090:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt124=8;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt124=1;
                }
                break;
            case 80:
                {
                alt124=2;
                }
                break;
            case 30:
                {
                alt124=3;
                }
                break;
            case 94:
                {
                alt124=4;
                }
                break;
            case 95:
                {
                alt124=5;
                }
                break;
            case 77:
                {
                alt124=6;
                }
                break;
            case 78:
                {
                alt124=7;
                }
                break;
            case 92:
                {
                alt124=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5090:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5090:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5090:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleCombineOperator10944); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5096:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5096:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5096:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleCombineOperator10961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5102:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5102:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5102:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCombineOperator10978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5108:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5108:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5108:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleCombineOperator10995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5114:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5114:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5114:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleCombineOperator11012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5120:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5120:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5120:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleCombineOperator11029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5126:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5126:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5126:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleCombineOperator11046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5132:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5132:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:5132:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleCombineOperator11063); if (state.failed) return current;
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

    // $ANTLR start synpred4_InternalSct
    public final void synpred4_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: ( (lv_declarations_6_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: (lv_declarations_6_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: (lv_declarations_6_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:193:3: lv_declarations_6_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSingleRegionAccess().getDeclarationsDeclarationParserRuleCall_1_5_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred4_InternalSct335);
        lv_declarations_6_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSct

    // $ANTLR start synpred5_InternalSct
    public final void synpred5_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_declarations_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:129:3: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:129:3: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:129:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
        loop125:
        do {
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_COMMENT_ANNOTATION||LA125_0==56) ) {
                alt125=1;
            }


            switch (alt125) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:130:1: (lv_annotations_1_0= ruleAnnotation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:130:1: (lv_annotations_1_0= ruleAnnotation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:131:3: lv_annotations_1_0= ruleAnnotation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_synpred5_InternalSct243);
        	    lv_annotations_1_0=ruleAnnotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop125;
            }
        } while (true);

        otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred5_InternalSct256); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:151:1: ( (lv_id_3_0= RULE_ID ) )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==RULE_ID) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:152:1: (lv_id_3_0= RULE_ID )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:152:1: (lv_id_3_0= RULE_ID )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:153:3: lv_id_3_0= RULE_ID
                {
                lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred5_InternalSct273); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:169:3: ( (lv_label_4_0= RULE_STRING ) )?
        int alt127=2;
        int LA127_0 = input.LA(1);

        if ( (LA127_0==RULE_STRING) ) {
            alt127=1;
        }
        switch (alt127) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:170:1: (lv_label_4_0= RULE_STRING )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:170:1: (lv_label_4_0= RULE_STRING )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:171:3: lv_label_4_0= RULE_STRING
                {
                lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred5_InternalSct296); if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred5_InternalSct314); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:191:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
        loop128:
        do {
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==RULE_COMMENT_ANNOTATION||(LA128_0>=40 && LA128_0<=44)||LA128_0==56||(LA128_0>=86 && LA128_0<=92)) ) {
                alt128=1;
            }


            switch (alt128) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: (lv_declarations_6_0= ruleDeclaration )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:192:1: (lv_declarations_6_0= ruleDeclaration )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:193:3: lv_declarations_6_0= ruleDeclaration
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getDeclarationsDeclarationParserRuleCall_1_5_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred5_InternalSct335);
        	    lv_declarations_6_0=ruleDeclaration();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop128;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred5_InternalSct

    // $ANTLR start synpred6_InternalSct
    public final void synpred6_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_7_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:210:1: ( (lv_states_7_0= ruleState ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:210:1: (lv_states_7_0= ruleState )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:210:1: (lv_states_7_0= ruleState )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:211:3: lv_states_7_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSingleRegionAccess().getStatesStateParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleState_in_synpred6_InternalSct359);
        lv_states_7_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalSct

    // $ANTLR start synpred11_InternalSct
    public final void synpred11_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_7_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:432:1: ( (lv_declarations_7_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:432:1: (lv_declarations_7_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:432:1: (lv_declarations_7_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:433:3: lv_declarations_7_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRegionAccess().getDeclarationsDeclarationParserRuleCall_7_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred11_InternalSct765);
        lv_declarations_7_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSct

    // $ANTLR start synpred12_InternalSct
    public final void synpred12_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_8_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:450:1: ( (lv_states_8_0= ruleState ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:450:1: (lv_states_8_0= ruleState )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:450:1: (lv_states_8_0= ruleState )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:451:3: lv_states_8_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_8_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleState_in_synpred12_InternalSct787);
        lv_states_8_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalSct

    // $ANTLR start synpred20_InternalSct
    public final void synpred20_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_14_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:3: ( ( (lv_declarations_14_0= ruleDeclaration ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:3: ( (lv_declarations_14_0= ruleDeclaration ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:655:3: ( (lv_declarations_14_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:656:1: (lv_declarations_14_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:656:1: (lv_declarations_14_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:657:3: lv_declarations_14_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCChartAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred20_InternalSct1149);
        lv_declarations_14_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred20_InternalSct

    // $ANTLR start synpred23_InternalSct
    public final void synpred23_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_16_0 = null;

        EObject lv_regions_17_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:5: ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:5: ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:5: ( (lv_regions_16_0= ruleSingleRegion ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_regions_16_0= ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_regions_16_0= ruleSingleRegion )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:694:3: lv_regions_16_0= ruleSingleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred23_InternalSct1200);
        lv_regions_16_0=ruleSingleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:710:2: ( (lv_regions_17_0= ruleRegion ) )*
        loop132:
        do {
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_COMMENT_ANNOTATION||LA132_0==16||LA132_0==18||LA132_0==56) ) {
                alt132=1;
            }


            switch (alt132) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:1: (lv_regions_17_0= ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:1: (lv_regions_17_0= ruleRegion )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:712:3: lv_regions_17_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred23_InternalSct1221);
        	    lv_regions_17_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop132;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred23_InternalSct

    // $ANTLR start synpred37_InternalSct
    public final void synpred37_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_16_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:3: ( ( (lv_declarations_16_0= ruleDeclaration ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:3: ( (lv_declarations_16_0= ruleDeclaration ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1106:3: ( (lv_declarations_16_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1107:1: (lv_declarations_16_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1107:1: (lv_declarations_16_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1108:3: lv_declarations_16_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred37_InternalSct2106);
        lv_declarations_16_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred37_InternalSct

    // $ANTLR start synpred40_InternalSct
    public final void synpred40_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_18_0 = null;

        EObject lv_regions_19_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:5: ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:5: ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:5: ( (lv_regions_18_0= ruleSingleRegion ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1144:1: (lv_regions_18_0= ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1144:1: (lv_regions_18_0= ruleSingleRegion )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1145:3: lv_regions_18_0= ruleSingleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred40_InternalSct2157);
        lv_regions_18_0=ruleSingleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1161:2: ( (lv_regions_19_0= ruleRegion ) )*
        loop141:
        do {
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==RULE_COMMENT_ANNOTATION||LA141_0==16||LA141_0==18||LA141_0==56) ) {
                alt141=1;
            }


            switch (alt141) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1162:1: (lv_regions_19_0= ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1162:1: (lv_regions_19_0= ruleRegion )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1163:3: lv_regions_19_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred40_InternalSct2178);
        	    lv_regions_19_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop141;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred40_InternalSct

    // $ANTLR start synpred42_InternalSct
    public final void synpred42_InternalSct_fragment() throws RecognitionException {   
        EObject lv_outgoingTransitions_21_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1184:1: ( (lv_outgoingTransitions_21_0= ruleTransition ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1184:1: (lv_outgoingTransitions_21_0= ruleTransition )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1184:1: (lv_outgoingTransitions_21_0= ruleTransition )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1185:3: lv_outgoingTransitions_21_0= ruleTransition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTransition_in_synpred42_InternalSct2218);
        lv_outgoingTransitions_21_0=ruleTransition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred42_InternalSct

    // $ANTLR start synpred52_InternalSct
    public final void synpred52_InternalSct_fragment() throws RecognitionException {   
        Token lv_delay_8_0=null;

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: ( (lv_delay_8_0= RULE_INT ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1423:3: lv_delay_8_0= RULE_INT
        {
        lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred52_InternalSct2706); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred52_InternalSct

    // $ANTLR start synpred58_InternalSct
    public final void synpred58_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token lv_delay_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_trigger_9_0 = null;

        EObject lv_effects_13_0 = null;

        EObject lv_effects_15_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )?
        int alt149=3;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==37) ) {
            int LA149_1 = input.LA(2);

            if ( (LA149_1==EOF||(LA149_1>=38 && LA149_1<=39)) ) {
                alt149=2;
            }
            else if ( (LA149_1==RULE_ID||(LA149_1>=RULE_INT && LA149_1<=RULE_BOOLEAN)||LA149_1==54||LA149_1==76||LA149_1==79||LA149_1==81||LA149_1==83) ) {
                alt149=1;
            }
        }
        switch (alt149) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:8: otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                {
                otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred58_InternalSct2689); if (state.failed) return ;
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1421:1: ( (lv_delay_8_0= RULE_INT ) )?
                int alt148=2;
                alt148 = dfa148.predict(input);
                switch (alt148) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1423:3: lv_delay_8_0= RULE_INT
                        {
                        lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred58_InternalSct2706); if (state.failed) return ;

                        }


                        }
                        break;

                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_trigger_9_0= ruleBoolExpression )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_trigger_9_0= ruleBoolExpression )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1441:3: lv_trigger_9_0= ruleBoolExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_3_3_0_0_0_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred58_InternalSct2733);
                lv_trigger_9_0=ruleBoolExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1458:7: otherlv_10= 'with'
                {
                otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred58_InternalSct2752); if (state.failed) return ;

                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:3: ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( ((LA152_0>=38 && LA152_0<=39)) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:4: (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:4: (otherlv_11= '/' | otherlv_12= 'do' )
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==38) ) {
                    alt150=1;
                }
                else if ( (LA150_0==39) ) {
                    alt150=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 150, 0, input);

                    throw nvae;
                }
                switch (alt150) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:6: otherlv_11= '/'
                        {
                        otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_synpred58_InternalSct2768); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1467:7: otherlv_12= 'do'
                        {
                        otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_synpred58_InternalSct2786); if (state.failed) return ;

                        }
                        break;

                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1471:2: ( (lv_effects_13_0= ruleEffect ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:1: (lv_effects_13_0= ruleEffect )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:1: (lv_effects_13_0= ruleEffect )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1473:3: lv_effects_13_0= ruleEffect
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred58_InternalSct2808);
                lv_effects_13_0=ruleEffect();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                loop151:
                do {
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==34) ) {
                        alt151=1;
                    }


                    switch (alt151) {
                	case 1 :
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:4: otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) )
                	    {
                	    otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_synpred58_InternalSct2821); if (state.failed) return ;
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1493:1: ( (lv_effects_15_0= ruleEffect ) )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1494:1: (lv_effects_15_0= ruleEffect )
                	    {
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1494:1: (lv_effects_15_0= ruleEffect )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1495:3: lv_effects_15_0= ruleEffect
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_2_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred58_InternalSct2842);
                	    lv_effects_15_0=ruleEffect();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop151;
                    }
                } while (true);


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred58_InternalSct

    // $ANTLR start synpred60_InternalSct
    public final void synpred60_InternalSct_fragment() throws RecognitionException {   
        Token lv_immediate_4_0=null;
        Token lv_deferred_5_0=null;
        Token otherlv_7=null;
        Token lv_delay_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_label_16_0=null;
        Enumerator lv_history_6_0 = null;

        EObject lv_trigger_9_0 = null;

        EObject lv_effects_13_0 = null;

        EObject lv_effects_15_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1369:3: ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1369:3: ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1369:3: ( (lv_immediate_4_0= 'immediate' ) )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==35) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1370:1: (lv_immediate_4_0= 'immediate' )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1370:1: (lv_immediate_4_0= 'immediate' )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1371:3: lv_immediate_4_0= 'immediate'
                {
                lv_immediate_4_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_synpred60_InternalSct2605); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1384:3: ( (lv_deferred_5_0= 'deferred' ) )?
        int alt154=2;
        int LA154_0 = input.LA(1);

        if ( (LA154_0==36) ) {
            alt154=1;
        }
        switch (alt154) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1385:1: (lv_deferred_5_0= 'deferred' )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1385:1: (lv_deferred_5_0= 'deferred' )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1386:3: lv_deferred_5_0= 'deferred'
                {
                lv_deferred_5_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_synpred60_InternalSct2637); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1399:3: ( (lv_history_6_0= ruleHistoryType ) )?
        int alt155=2;
        int LA155_0 = input.LA(1);

        if ( ((LA155_0>=67 && LA155_0<=69)) ) {
            alt155=1;
        }
        switch (alt155) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:1: (lv_history_6_0= ruleHistoryType )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:1: (lv_history_6_0= ruleHistoryType )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1401:3: lv_history_6_0= ruleHistoryType
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_3_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleHistoryType_in_synpred60_InternalSct2672);
                lv_history_6_0=ruleHistoryType();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:3: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
        int alt161=3;
        switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
                {
                alt161=1;
                }
                break;
            case EOF:
                {
                int LA161_2 = input.LA(2);

                if ( (synpred58_InternalSct()) ) {
                    alt161=1;
                }
                }
                break;
            case RULE_STRING:
                {
                alt161=2;
                }
                break;
        }

        switch (alt161) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )?
                int alt157=3;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==37) ) {
                    int LA157_1 = input.LA(2);

                    if ( (LA157_1==RULE_ID||(LA157_1>=RULE_INT && LA157_1<=RULE_BOOLEAN)||LA157_1==54||LA157_1==76||LA157_1==79||LA157_1==81||LA157_1==83) ) {
                        alt157=1;
                    }
                    else if ( (LA157_1==EOF||(LA157_1>=38 && LA157_1<=39)) ) {
                        alt157=2;
                    }
                }
                switch (alt157) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1417:8: otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                        {
                        otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred60_InternalSct2689); if (state.failed) return ;
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1421:1: ( (lv_delay_8_0= RULE_INT ) )?
                        int alt156=2;
                        alt156 = dfa156.predict(input);
                        switch (alt156) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
                                {
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1422:1: (lv_delay_8_0= RULE_INT )
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1423:3: lv_delay_8_0= RULE_INT
                                {
                                lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred60_InternalSct2706); if (state.failed) return ;

                                }


                                }
                                break;

                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_trigger_9_0= ruleBoolExpression )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_trigger_9_0= ruleBoolExpression )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1441:3: lv_trigger_9_0= ruleBoolExpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_3_3_0_0_0_2_0()); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred60_InternalSct2733);
                        lv_trigger_9_0=ruleBoolExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1458:7: otherlv_10= 'with'
                        {
                        otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred60_InternalSct2752); if (state.failed) return ;

                        }
                        break;

                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:3: ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( ((LA160_0>=38 && LA160_0<=39)) ) {
                    alt160=1;
                }
                switch (alt160) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:4: (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:4: (otherlv_11= '/' | otherlv_12= 'do' )
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==38) ) {
                            alt158=1;
                        }
                        else if ( (LA158_0==39) ) {
                            alt158=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 158, 0, input);

                            throw nvae;
                        }
                        switch (alt158) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1462:6: otherlv_11= '/'
                                {
                                otherlv_11=(Token)match(input,38,FollowSets000.FOLLOW_38_in_synpred60_InternalSct2768); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1467:7: otherlv_12= 'do'
                                {
                                otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_39_in_synpred60_InternalSct2786); if (state.failed) return ;

                                }
                                break;

                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1471:2: ( (lv_effects_13_0= ruleEffect ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:1: (lv_effects_13_0= ruleEffect )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:1: (lv_effects_13_0= ruleEffect )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1473:3: lv_effects_13_0= ruleEffect
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_1_0()); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred60_InternalSct2808);
                        lv_effects_13_0=ruleEffect();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                        loop159:
                        do {
                            int alt159=2;
                            int LA159_0 = input.LA(1);

                            if ( (LA159_0==34) ) {
                                alt159=1;
                            }


                            switch (alt159) {
                        	case 1 :
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:4: otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) )
                        	    {
                        	    otherlv_14=(Token)match(input,34,FollowSets000.FOLLOW_34_in_synpred60_InternalSct2821); if (state.failed) return ;
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1493:1: ( (lv_effects_15_0= ruleEffect ) )
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1494:1: (lv_effects_15_0= ruleEffect )
                        	    {
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1494:1: (lv_effects_15_0= ruleEffect )
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1495:3: lv_effects_15_0= ruleEffect
                        	    {
                        	    if ( state.backtracking==0 ) {
                        	       
                        	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_2_1_0()); 
                        	      	    
                        	    }
                        	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred60_InternalSct2842);
                        	    lv_effects_15_0=ruleEffect();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop159;
                            }
                        } while (true);


                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1512:6: ( (lv_label_16_0= RULE_STRING ) )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1512:6: ( (lv_label_16_0= RULE_STRING ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1513:1: (lv_label_16_0= RULE_STRING )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1513:1: (lv_label_16_0= RULE_STRING )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1514:3: lv_label_16_0= RULE_STRING
                {
                lv_label_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred60_InternalSct2870); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred60_InternalSct

    // $ANTLR start synpred93_InternalSct
    public final void synpred93_InternalSct_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2543:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2543:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred93_InternalSct5073);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalSct

    // $ANTLR start synpred96_InternalSct
    public final void synpred96_InternalSct_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:2: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        loop167:
        do {
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==77||LA167_0==84) ) {
                alt167=1;
            }


            switch (alt167) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2633:3: ()
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2634:2: 
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	  /* */ 
        	      	
        	    }

        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2642:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2644:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2644:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    int alt166=2;
        	    int LA166_0 = input.LA(1);

        	    if ( (LA166_0==77) ) {
        	        alt166=1;
        	    }
        	    else if ( (LA166_0==84) ) {
        	        alt166=2;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 166, 0, input);

        	        throw nvae;
        	    }
        	    switch (alt166) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2645:3: lv_operator_2_1= ruleOrOperator
        	            {
        	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_synpred96_InternalSct5327);
        	            lv_operator_2_1=ruleOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2660:8: lv_operator_2_2= ruleLogicalOrOperator
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
        	              	    
        	            }
        	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_synpred96_InternalSct5346);
        	            lv_operator_2_2=ruleLogicalOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }


        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2678:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2679:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2679:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2680:3: lv_subExpressions_3_0= ruleCompareOperation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred96_InternalSct5370);
        	    lv_subExpressions_3_0=ruleCompareOperation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop167;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred96_InternalSct

    // $ANTLR start synpred99_InternalSct
    public final void synpred99_InternalSct_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2782:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred99_InternalSct5557);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2793:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2793:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2793:2: ()
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2794:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2802:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2803:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2803:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2804:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred99_InternalSct5590);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2820:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2821:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2821:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2822:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred99_InternalSct5611);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred99_InternalSct

    // $ANTLR start synpred100_InternalSct
    public final void synpred100_InternalSct_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2873:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2873:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred100_InternalSct5739);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_InternalSct

    // $ANTLR start synpred113_InternalSct
    public final void synpred113_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ValuedExpression_3 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:6: ( (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
        {
        otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_synpred113_InternalSct7290); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred113_InternalSct7315);
        this_ValuedExpression_3=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_4=(Token)match(input,55,FollowSets000.FOLLOW_55_in_synpred113_InternalSct7326); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred113_InternalSct

    // Delegated rules

    public final boolean synpred5_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred12_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA89 dfa89 = new DFA89(this);
    protected DFA90 dfa90 = new DFA90(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA103 dfa103 = new DFA103(this);
    protected DFA148 dfa148 = new DFA148(this);
    protected DFA156 dfa156 = new DFA156(this);
    static final String DFA5_eotS =
        "\17\uffff";
    static final String DFA5_eofS =
        "\1\4\16\uffff";
    static final String DFA5_minS =
        "\1\12\3\0\13\uffff";
    static final String DFA5_maxS =
        "\1\74\3\0\13\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\2\11\uffff\1\1";
    static final String DFA5_specialS =
        "\1\uffff\1\0\1\1\1\2\13\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\5\uffff\1\3\1\uffff\1\4\10\uffff\1\4\3\uffff\3\4\26\uffff"+
            "\1\2\4\4",
            "\1\uffff",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "129:2: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_1 = input.LA(1);

                         
                        int index5_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index5_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA4_eotS =
        "\32\uffff";
    static final String DFA4_eofS =
        "\1\3\31\uffff";
    static final String DFA4_minS =
        "\1\12\2\0\27\uffff";
    static final String DFA4_maxS =
        "\1\134\2\0\27\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\12\uffff\1\1\13\uffff";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\27\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\5\uffff\1\3\1\uffff\1\3\10\uffff\1\3\3\uffff\3\3\6\uffff"+
            "\5\16\13\uffff\1\2\4\3\31\uffff\7\16",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 191:1: ( (lv_declarations_6_0= ruleDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\1\1\15\uffff";
    static final String DFA6_minS =
        "\1\12\1\uffff\2\0\12\uffff";
    static final String DFA6_maxS =
        "\1\74\1\uffff\2\0\12\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\6\uffff";
    static final String DFA6_specialS =
        "\2\uffff\1\0\1\1\12\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\5\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\uffff\3\7\26\uffff"+
            "\1\3\4\7",
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
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 209:5: ( (lv_states_7_0= ruleState ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSct()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSct()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\26\uffff";
    static final String DFA11_eofS =
        "\26\uffff";
    static final String DFA11_minS =
        "\1\12\2\0\23\uffff";
    static final String DFA11_maxS =
        "\1\134\2\0\23\uffff";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\6\uffff\1\1\13\uffff";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\23\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\24\uffff\3\3\6\uffff\5\12\13\uffff\1\2\4\3\31\uffff\7"+
            "\12",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 431:1: ( (lv_declarations_7_0= ruleDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\16\uffff";
    static final String DFA12_eofS =
        "\1\1\15\uffff";
    static final String DFA12_minS =
        "\1\12\2\uffff\2\0\11\uffff";
    static final String DFA12_maxS =
        "\1\74\2\uffff\2\0\11\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\6\uffff";
    static final String DFA12_specialS =
        "\3\uffff\1\0\1\1\11\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\3\5\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\uffff\3\7\26\uffff"+
            "\1\4\4\7",
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
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()+ loopback of 449:3: ( (lv_states_8_0= ruleState ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSct()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred12_InternalSct()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\37\uffff";
    static final String DFA19_eofS =
        "\37\uffff";
    static final String DFA19_minS =
        "\1\12\2\0\34\uffff";
    static final String DFA19_maxS =
        "\1\134\2\0\34\uffff";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\11\uffff\1\1\13\uffff\1\2\5\uffff";
    static final String DFA19_specialS =
        "\1\uffff\1\0\1\1\34\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\5\uffff\1\3\1\uffff\1\3\10\uffff\1\3\3\uffff\3\3\1\uffff"+
            "\1\31\4\uffff\5\15\4\uffff\5\31\2\uffff\1\2\4\3\31\uffff\7\15",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 655:2: ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA23_eotS =
        "\6\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\3\2\uffff\1\3\1\uffff";
    static final String DFA23_minS =
        "\1\4\1\12\1\4\1\uffff\1\12\1\uffff";
    static final String DFA23_maxS =
        "\1\4\1\70\1\36\1\uffff\1\70\1\uffff";
    static final String DFA23_acceptS =
        "\3\uffff\1\1\1\uffff\1\2";
    static final String DFA23_specialS =
        "\6\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\1\3\13\uffff\1\3\5\uffff\1\3\1\2\32\uffff\1\3",
            "\1\4\31\uffff\1\5",
            "",
            "\1\3\13\uffff\1\3\5\uffff\1\3\1\2\32\uffff\1\3",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "757:1: ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
    static final String DFA33_eotS =
        "\37\uffff";
    static final String DFA33_eofS =
        "\37\uffff";
    static final String DFA33_minS =
        "\1\12\2\0\34\uffff";
    static final String DFA33_maxS =
        "\1\134\2\0\34\uffff";
    static final String DFA33_acceptS =
        "\3\uffff\1\3\11\uffff\1\1\13\uffff\1\2\5\uffff";
    static final String DFA33_specialS =
        "\1\uffff\1\0\1\1\34\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\1\5\uffff\1\3\1\uffff\1\3\10\uffff\1\3\3\uffff\3\3\1\uffff"+
            "\1\31\4\uffff\5\15\4\uffff\5\31\2\uffff\1\2\4\3\31\uffff\7\15",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 1106:2: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_1 = input.LA(1);

                         
                        int index33_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index33_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_2 = input.LA(1);

                         
                        int index33_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index33_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\25\uffff";
    static final String DFA37_eofS =
        "\1\1\24\uffff";
    static final String DFA37_minS =
        "\1\12\2\uffff\2\0\20\uffff";
    static final String DFA37_maxS =
        "\1\102\2\uffff\2\0\20\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\15\uffff\1\1\5\uffff";
    static final String DFA37_specialS =
        "\3\uffff\1\0\1\1\20\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\5\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\uffff\4\1\25\uffff"+
            "\1\4\4\1\6\17",
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

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 1183:4: ( (lv_outgoingTransitions_21_0= ruleTransition ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalSct()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\27\uffff";
    static final String DFA51_eofS =
        "\1\3\26\uffff";
    static final String DFA51_minS =
        "\1\5\1\uffff\24\0\1\uffff";
    static final String DFA51_maxS =
        "\1\105\1\uffff\24\0\1\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\24\uffff\1\2";
    static final String DFA51_specialS =
        "\2\uffff\1\20\1\13\1\16\1\1\1\6\1\22\1\10\1\15\1\4\1\23\1\12\1"+
        "\11\1\7\1\3\1\21\1\2\1\5\1\14\1\17\1\0\1\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\1\4\uffff\1\4\5\uffff\1\7\1\uffff\1\6\10\uffff\1\10\3\uffff"+
            "\1\11\1\12\1\17\1\2\5\1\20\uffff\1\5\1\13\1\14\1\15\1\16\1\23"+
            "\1\24\1\25\1\20\1\21\1\22\3\1",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "1369:2: ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_21 = input.LA(1);

                         
                        int index51_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_5 = input.LA(1);

                         
                        int index51_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_17 = input.LA(1);

                         
                        int index51_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_17);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_15 = input.LA(1);

                         
                        int index51_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_15);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_10 = input.LA(1);

                         
                        int index51_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_18 = input.LA(1);

                         
                        int index51_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_14 = input.LA(1);

                         
                        int index51_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_14);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_13 = input.LA(1);

                         
                        int index51_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_13);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_19 = input.LA(1);

                         
                        int index51_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_19);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_9 = input.LA(1);

                         
                        int index51_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_9);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_4 = input.LA(1);

                         
                        int index51_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_4);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_20 = input.LA(1);

                         
                        int index51_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_20);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_16 = input.LA(1);

                         
                        int index51_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_16);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA51_11 = input.LA(1);

                         
                        int index51_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index51_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\30\uffff";
    static final String DFA50_eofS =
        "\1\3\27\uffff";
    static final String DFA50_minS =
        "\1\5\1\uffff\24\0\2\uffff";
    static final String DFA50_maxS =
        "\1\102\1\uffff\24\0\2\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\24\uffff\1\2\1\3";
    static final String DFA50_specialS =
        "\2\uffff\1\20\1\0\1\10\1\11\1\4\1\21\1\22\1\17\1\13\1\12\1\2\1"+
        "\1\1\23\1\7\1\16\1\15\1\3\1\5\1\6\1\14\2\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\26\4\uffff\1\4\5\uffff\1\7\1\uffff\1\6\10\uffff\1\10\3\uffff"+
            "\1\11\1\12\1\17\1\2\2\uffff\3\1\20\uffff\1\5\1\13\1\14\1\15"+
            "\1\16\1\23\1\24\1\25\1\20\1\21\1\22",
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
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "1417:3: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_18 = input.LA(1);

                         
                        int index50_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_18);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_19 = input.LA(1);

                         
                        int index50_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_19);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_20 = input.LA(1);

                         
                        int index50_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_15 = input.LA(1);

                         
                        int index50_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA50_21 = input.LA(1);

                         
                        int index50_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_21);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA50_17 = input.LA(1);

                         
                        int index50_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_17);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA50_16 = input.LA(1);

                         
                        int index50_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA50_9 = input.LA(1);

                         
                        int index50_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_9);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index50_14);
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
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\14\uffff";
    static final String DFA45_minS =
        "\1\4\1\0\12\uffff";
    static final String DFA45_maxS =
        "\1\123\1\0\12\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA45_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\2\1\uffff\1\1\3\2\54\uffff\1\2\25\uffff\1\2\2\uffff\1\2"+
            "\1\uffff\1\2\1\uffff\1\2",
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
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1421:1: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\14\uffff";
    static final String DFA83_eofS =
        "\14\uffff";
    static final String DFA83_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA83_maxS =
        "\1\123\11\0\2\uffff";
    static final String DFA83_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA83_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\10\1\uffff\1\2\1\11\1\3\1\5\54\uffff\1\4\25\uffff\1\6\2"+
            "\uffff\1\12\1\uffff\1\1\1\uffff\1\7",
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

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "2542:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_1 = input.LA(1);

                         
                        int index83_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_3 = input.LA(1);

                         
                        int index83_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_4 = input.LA(1);

                         
                        int index83_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_5 = input.LA(1);

                         
                        int index83_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_6 = input.LA(1);

                         
                        int index83_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA83_7 = input.LA(1);

                         
                        int index83_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA83_8 = input.LA(1);

                         
                        int index83_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA83_9 = input.LA(1);

                         
                        int index83_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred93_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index83_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\57\uffff";
    static final String DFA88_eofS =
        "\1\5\56\uffff";
    static final String DFA88_minS =
        "\1\12\1\uffff\54\0\1\uffff";
    static final String DFA88_maxS =
        "\1\134\1\uffff\54\0\1\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\1\54\uffff\1\2";
    static final String DFA88_specialS =
        "\2\uffff\1\37\1\12\1\21\1\1\1\3\1\26\1\7\1\53\1\11\1\52\1\34\1"+
        "\44\1\46\1\33\1\31\1\27\1\47\1\30\1\5\1\15\1\45\1\25\1\0\1\23\1"+
        "\35\1\43\1\2\1\51\1\40\1\32\1\24\1\20\1\22\1\36\1\50\1\6\1\41\1"+
        "\14\1\10\1\17\1\13\1\4\1\16\1\42\1\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\6\5\uffff\1\11\1\uffff\1\10\6\uffff\1\53\1\uffff\1\12\3"+
            "\uffff\1\13\1\14\1\21\1\4\1\45\2\uffff\1\2\1\3\1\30\1\31\1\32"+
            "\1\33\1\34\1\uffff\1\55\1\52\1\uffff\1\44\1\46\1\47\1\50\1\51"+
            "\1\uffff\1\54\1\7\1\15\1\16\1\17\1\20\1\25\1\26\1\27\1\22\1"+
            "\23\1\24\12\uffff\1\1\1\56\5\uffff\1\1\1\56\1\35\1\36\1\37\1"+
            "\40\1\41\1\42\1\43",
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
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "2633:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_24 = input.LA(1);

                         
                        int index88_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA88_5 = input.LA(1);

                         
                        int index88_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA88_28 = input.LA(1);

                         
                        int index88_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_28);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA88_6 = input.LA(1);

                         
                        int index88_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA88_43 = input.LA(1);

                         
                        int index88_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_43);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA88_20 = input.LA(1);

                         
                        int index88_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA88_37 = input.LA(1);

                         
                        int index88_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_37);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA88_8 = input.LA(1);

                         
                        int index88_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA88_40 = input.LA(1);

                         
                        int index88_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_40);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA88_10 = input.LA(1);

                         
                        int index88_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA88_3 = input.LA(1);

                         
                        int index88_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_3);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA88_42 = input.LA(1);

                         
                        int index88_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_42);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA88_39 = input.LA(1);

                         
                        int index88_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_39);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA88_21 = input.LA(1);

                         
                        int index88_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_21);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA88_44 = input.LA(1);

                         
                        int index88_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_44);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA88_41 = input.LA(1);

                         
                        int index88_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_41);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA88_33 = input.LA(1);

                         
                        int index88_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA88_4 = input.LA(1);

                         
                        int index88_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_4);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA88_34 = input.LA(1);

                         
                        int index88_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_34);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA88_25 = input.LA(1);

                         
                        int index88_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_25);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA88_32 = input.LA(1);

                         
                        int index88_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_32);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA88_23 = input.LA(1);

                         
                        int index88_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA88_7 = input.LA(1);

                         
                        int index88_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_7);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA88_17 = input.LA(1);

                         
                        int index88_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_17);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA88_19 = input.LA(1);

                         
                        int index88_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_19);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA88_16 = input.LA(1);

                         
                        int index88_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_16);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA88_31 = input.LA(1);

                         
                        int index88_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_31);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA88_15 = input.LA(1);

                         
                        int index88_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_15);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA88_12 = input.LA(1);

                         
                        int index88_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_12);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA88_26 = input.LA(1);

                         
                        int index88_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_26);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA88_35 = input.LA(1);

                         
                        int index88_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_35);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA88_2 = input.LA(1);

                         
                        int index88_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_2);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA88_30 = input.LA(1);

                         
                        int index88_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_30);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA88_38 = input.LA(1);

                         
                        int index88_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_38);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA88_45 = input.LA(1);

                         
                        int index88_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_45);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA88_27 = input.LA(1);

                         
                        int index88_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_27);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA88_13 = input.LA(1);

                         
                        int index88_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_13);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA88_22 = input.LA(1);

                         
                        int index88_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_22);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA88_14 = input.LA(1);

                         
                        int index88_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_14);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA88_18 = input.LA(1);

                         
                        int index88_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_18);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA88_36 = input.LA(1);

                         
                        int index88_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_36);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA88_29 = input.LA(1);

                         
                        int index88_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_29);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA88_11 = input.LA(1);

                         
                        int index88_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_11);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA88_9 = input.LA(1);

                         
                        int index88_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred96_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 46;}

                         
                        input.seek(index88_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA89_eotS =
        "\14\uffff";
    static final String DFA89_eofS =
        "\14\uffff";
    static final String DFA89_minS =
        "\1\4\3\uffff\7\0\1\uffff";
    static final String DFA89_maxS =
        "\1\123\3\uffff\7\0\1\uffff";
    static final String DFA89_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA89_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA89_transitionS = {
            "\1\10\1\uffff\1\1\1\11\1\1\1\5\54\uffff\1\4\25\uffff\1\6\2"+
            "\uffff\1\12\1\uffff\1\1\1\uffff\1\7",
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

    static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
    static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
    static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
    static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
    static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
    static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
    static final short[][] DFA89_transition;

    static {
        int numStates = DFA89_transitionS.length;
        DFA89_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
        }
    }

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = DFA89_eot;
            this.eof = DFA89_eof;
            this.min = DFA89_min;
            this.max = DFA89_max;
            this.accept = DFA89_accept;
            this.special = DFA89_special;
            this.transition = DFA89_transition;
        }
        public String getDescription() {
            return "2781:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA89_4 = input.LA(1);

                         
                        int index89_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA89_5 = input.LA(1);

                         
                        int index89_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA89_6 = input.LA(1);

                         
                        int index89_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA89_7 = input.LA(1);

                         
                        int index89_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA89_8 = input.LA(1);

                         
                        int index89_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA89_9 = input.LA(1);

                         
                        int index89_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA89_10 = input.LA(1);

                         
                        int index89_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred99_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index89_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 89, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA90_eotS =
        "\13\uffff";
    static final String DFA90_eofS =
        "\13\uffff";
    static final String DFA90_minS =
        "\1\4\3\uffff\6\0\1\uffff";
    static final String DFA90_maxS =
        "\1\123\3\uffff\6\0\1\uffff";
    static final String DFA90_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA90_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA90_transitionS = {
            "\1\10\1\uffff\1\1\1\11\1\1\1\5\54\uffff\1\4\25\uffff\1\6\2"+
            "\uffff\1\12\1\uffff\1\1\1\uffff\1\7",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA90_eot = DFA.unpackEncodedString(DFA90_eotS);
    static final short[] DFA90_eof = DFA.unpackEncodedString(DFA90_eofS);
    static final char[] DFA90_min = DFA.unpackEncodedStringToUnsignedChars(DFA90_minS);
    static final char[] DFA90_max = DFA.unpackEncodedStringToUnsignedChars(DFA90_maxS);
    static final short[] DFA90_accept = DFA.unpackEncodedString(DFA90_acceptS);
    static final short[] DFA90_special = DFA.unpackEncodedString(DFA90_specialS);
    static final short[][] DFA90_transition;

    static {
        int numStates = DFA90_transitionS.length;
        DFA90_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA90_transition[i] = DFA.unpackEncodedString(DFA90_transitionS[i]);
        }
    }

    class DFA90 extends DFA {

        public DFA90(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 90;
            this.eot = DFA90_eot;
            this.eof = DFA90_eof;
            this.min = DFA90_min;
            this.max = DFA90_max;
            this.accept = DFA90_accept;
            this.special = DFA90_special;
            this.transition = DFA90_transition;
        }
        public String getDescription() {
            return "2872:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA90_4 = input.LA(1);

                         
                        int index90_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index90_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA90_5 = input.LA(1);

                         
                        int index90_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index90_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA90_6 = input.LA(1);

                         
                        int index90_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index90_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA90_7 = input.LA(1);

                         
                        int index90_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index90_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA90_8 = input.LA(1);

                         
                        int index90_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index90_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA90_9 = input.LA(1);

                         
                        int index90_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index90_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 90, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA99_eotS =
        "\12\uffff";
    static final String DFA99_eofS =
        "\12\uffff";
    static final String DFA99_minS =
        "\1\4\2\uffff\1\0\6\uffff";
    static final String DFA99_maxS =
        "\1\123\2\uffff\1\0\6\uffff";
    static final String DFA99_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String DFA99_specialS =
        "\3\uffff\1\0\6\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\4\1\uffff\1\1\1\4\1\2\1\4\54\uffff\1\3\25\uffff\1\4\6\uffff"+
            "\1\4",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "3579:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA99_3 = input.LA(1);

                         
                        int index99_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_InternalSct()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index99_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 99, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA103_eotS =
        "\14\uffff";
    static final String DFA103_eofS =
        "\3\uffff\1\7\7\uffff\1\7";
    static final String DFA103_minS =
        "\1\12\1\uffff\3\4\6\uffff\1\4";
    static final String DFA103_maxS =
        "\1\70\1\uffff\1\4\1\134\1\4\6\uffff\1\134";
    static final String DFA103_acceptS =
        "\1\uffff\1\1\3\uffff\1\7\1\5\1\2\1\6\1\3\1\4\1\uffff";
    static final String DFA103_specialS =
        "\14\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\1\55\uffff\1\2",
            "",
            "\1\3",
            "\2\11\1\10\1\uffff\1\5\1\6\1\7\5\uffff\1\7\1\uffff\1\7\3\uffff"+
            "\1\7\6\uffff\1\4\1\uffff\3\7\6\uffff\5\7\1\12\10\uffff\15\7"+
            "\23\uffff\7\7",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\11\1\10\1\uffff\1\5\1\6\1\7\5\uffff\1\7\1\uffff\1\7\3\uffff"+
            "\1\7\6\uffff\1\4\1\uffff\3\7\6\uffff\5\7\1\12\10\uffff\15\7"+
            "\23\uffff\7\7"
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "3985:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
    static final String DFA148_eotS =
        "\14\uffff";
    static final String DFA148_eofS =
        "\14\uffff";
    static final String DFA148_minS =
        "\1\4\1\0\12\uffff";
    static final String DFA148_maxS =
        "\1\123\1\0\12\uffff";
    static final String DFA148_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA148_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA148_transitionS = {
            "\1\2\1\uffff\1\1\3\2\54\uffff\1\2\25\uffff\1\2\2\uffff\1\2"+
            "\1\uffff\1\2\1\uffff\1\2",
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
            ""
    };

    static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
    static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
    static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
    static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
    static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
    static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
    static final short[][] DFA148_transition;

    static {
        int numStates = DFA148_transitionS.length;
        DFA148_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
        }
    }

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = DFA148_eot;
            this.eof = DFA148_eof;
            this.min = DFA148_min;
            this.max = DFA148_max;
            this.accept = DFA148_accept;
            this.special = DFA148_special;
            this.transition = DFA148_transition;
        }
        public String getDescription() {
            return "1421:1: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA148_1 = input.LA(1);

                         
                        int index148_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index148_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 148, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA156_eotS =
        "\14\uffff";
    static final String DFA156_eofS =
        "\14\uffff";
    static final String DFA156_minS =
        "\1\4\1\0\12\uffff";
    static final String DFA156_maxS =
        "\1\123\1\0\12\uffff";
    static final String DFA156_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA156_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA156_transitionS = {
            "\1\2\1\uffff\1\1\3\2\54\uffff\1\2\25\uffff\1\2\2\uffff\1\2"+
            "\1\uffff\1\2\1\uffff\1\2",
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
            ""
    };

    static final short[] DFA156_eot = DFA.unpackEncodedString(DFA156_eotS);
    static final short[] DFA156_eof = DFA.unpackEncodedString(DFA156_eofS);
    static final char[] DFA156_min = DFA.unpackEncodedStringToUnsignedChars(DFA156_minS);
    static final char[] DFA156_max = DFA.unpackEncodedStringToUnsignedChars(DFA156_maxS);
    static final short[] DFA156_accept = DFA.unpackEncodedString(DFA156_acceptS);
    static final short[] DFA156_special = DFA.unpackEncodedString(DFA156_specialS);
    static final short[][] DFA156_transition;

    static {
        int numStates = DFA156_transitionS.length;
        DFA156_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA156_transition[i] = DFA.unpackEncodedString(DFA156_transitionS[i]);
        }
    }

    class DFA156 extends DFA {

        public DFA156(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 156;
            this.eot = DFA156_eot;
            this.eof = DFA156_eof;
            this.min = DFA156_min;
            this.max = DFA156_max;
            this.accept = DFA156_accept;
            this.special = DFA156_special;
            this.transition = DFA156_transition;
        }
        public String getDescription() {
            return "1421:1: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA156_1 = input.LA(1);

                         
                        int index156_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index156_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 156, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRoot91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSCChart_in_ruleRoot140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion174 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRegion184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleSingleRegion243 = new BitSet(new long[]{0x0100000000010400L});
        public static final BitSet FOLLOW_16_in_ruleSingleRegion256 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRegion273 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRegion296 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSingleRegion314 = new BitSet(new long[]{0x1F001F0380010402L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleSingleRegion335 = new BitSet(new long[]{0x1F001F0380010402L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleState_in_ruleSingleRegion359 = new BitSet(new long[]{0x1F00000380010402L});
        public static final BitSet FOLLOW_ruleFor_in_entryRuleFor396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFor406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleFor455 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFor479 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFor491 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleFor508 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFor525 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleFor542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion583 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegion593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleRegion651 = new BitSet(new long[]{0x0100000000050400L});
        public static final BitSet FOLLOW_ruleFor_in_ruleRegion673 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRegion686 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRegion703 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion726 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRegion744 = new BitSet(new long[]{0x1F001F0380010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleRegion765 = new BitSet(new long[]{0x1F001F0380010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleState_in_ruleRegion787 = new BitSet(new long[]{0x1F00000380010402L});
        public static final BitSet FOLLOW_ruleSCChart_in_entryRuleSCChart824 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSCChart834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleSCChart872 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSCChart893 = new BitSet(new long[]{0x0100000010410400L});
        public static final BitSet FOLLOW_ruleImportDecl_in_ruleSCChart916 = new BitSet(new long[]{0x0100000010410400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleSCChart938 = new BitSet(new long[]{0x0100000000410400L});
        public static final BitSet FOLLOW_22_in_ruleSCChart951 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSCChart968 = new BitSet(new long[]{0x0000000004800022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSCChart990 = new BitSet(new long[]{0x0000000004800002L});
        public static final BitSet FOLLOW_23_in_ruleSCChart1010 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSCChart1034 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleSCChart1047 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleSCChart1068 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_25_in_ruleSCChart1081 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleSCChart1102 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_26_in_ruleSCChart1126 = new BitSet(new long[]{0x1F3E1F0B88050400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleSCChart1149 = new BitSet(new long[]{0x1F3E1F0B88050400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleLocalAction_in_ruleSCChart1176 = new BitSet(new long[]{0x1F3E1F0B88050400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleSCChart1200 = new BitSet(new long[]{0x0100000008050400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleSCChart1221 = new BitSet(new long[]{0x0100000008050400L});
        public static final BitSet FOLLOW_27_in_ruleSCChart1237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportDecl_in_entryRuleImportDecl1276 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportDecl1286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleImportDecl1323 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImportDecl1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDecl1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1467 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleQualifiedName1486 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1501 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1607 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleQualifiedNameWithWildcard1625 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleQualifiedNameWithWildcard1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1678 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleState1734 = new BitSet(new long[]{0x1F00000380010400L});
        public static final BitSet FOLLOW_31_in_ruleState1755 = new BitSet(new long[]{0x1E00000300000000L});
        public static final BitSet FOLLOW_32_in_ruleState1786 = new BitSet(new long[]{0x1E00000200000000L});
        public static final BitSet FOLLOW_32_in_ruleState1826 = new BitSet(new long[]{0x1E00000280000000L});
        public static final BitSet FOLLOW_31_in_ruleState1857 = new BitSet(new long[]{0x1E00000200000000L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleState1895 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleState1908 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1925 = new BitSet(new long[]{0xE100000404810422L,0x0000000000000007L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleState1947 = new BitSet(new long[]{0xE100000404810402L,0x0000000000000007L});
        public static final BitSet FOLLOW_23_in_ruleState1967 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1991 = new BitSet(new long[]{0xE100000401010402L,0x0000000000000007L});
        public static final BitSet FOLLOW_24_in_ruleState2004 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleState2025 = new BitSet(new long[]{0xE100000402010402L,0x0000000000000007L});
        public static final BitSet FOLLOW_25_in_ruleState2038 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleState2059 = new BitSet(new long[]{0xE100000402010402L,0x0000000000000007L});
        public static final BitSet FOLLOW_26_in_ruleState2083 = new BitSet(new long[]{0x1F3E1F0B88050400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleState2106 = new BitSet(new long[]{0x1F3E1F0B88050400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleLocalAction_in_ruleState2133 = new BitSet(new long[]{0x1F3E1F0B88050400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleState2157 = new BitSet(new long[]{0x0100000008050400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleState2178 = new BitSet(new long[]{0x0100000008050400L});
        public static final BitSet FOLLOW_27_in_ruleState2194 = new BitSet(new long[]{0xE100000400010402L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState2218 = new BitSet(new long[]{0xE100000400010402L,0x0000000000000007L});
        public static final BitSet FOLLOW_34_in_ruleState2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction2270 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction2280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntryAction_in_ruleLocalAction2330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuringAction_in_ruleLocalAction2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExitAction_in_ruleLocalAction2390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuspendAction_in_ruleLocalAction2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTransition2511 = new BitSet(new long[]{0xE100000000010400L,0x0000000000000007L});
        public static final BitSet FOLLOW_ruleTransitionTypeLegacy_in_ruleTransition2534 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition2561 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2586 = new BitSet(new long[]{0x000000F800000022L,0x0000000000000038L});
        public static final BitSet FOLLOW_35_in_ruleTransition2605 = new BitSet(new long[]{0x000000F000000022L,0x0000000000000038L});
        public static final BitSet FOLLOW_36_in_ruleTransition2637 = new BitSet(new long[]{0x000000E000000022L,0x0000000000000038L});
        public static final BitSet FOLLOW_ruleHistoryType_in_ruleTransition2672 = new BitSet(new long[]{0x000000E000000022L});
        public static final BitSet FOLLOW_37_in_ruleTransition2689 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition2706 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleTransition2733 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_37_in_ruleTransition2752 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_38_in_ruleTransition2768 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_39_in_ruleTransition2786 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2808 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleTransition2821 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2842 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration2971 = new BitSet(new long[]{0x01001F0000010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_40_in_ruleDeclaration2990 = new BitSet(new long[]{0x01001F0000010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_41_in_ruleDeclaration3022 = new BitSet(new long[]{0x01001F0000010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_42_in_ruleDeclaration3054 = new BitSet(new long[]{0x01001F0000010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_43_in_ruleDeclaration3086 = new BitSet(new long[]{0x01001F0000010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_44_in_ruleDeclaration3118 = new BitSet(new long[]{0x01001F0000010400L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration3153 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration3174 = new BitSet(new long[]{0x0000000402000002L});
        public static final BitSet FOLLOW_25_in_ruleDeclaration3187 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration3208 = new BitSet(new long[]{0x0000000402000002L});
        public static final BitSet FOLLOW_34_in_ruleDeclaration3223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject3261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject3271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject3313 = new BitSet(new long[]{0x0000A00000080002L});
        public static final BitSet FOLLOW_45_in_ruleValuedObject3331 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleValuedObject3348 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleValuedObject3365 = new BitSet(new long[]{0x0000A00000080002L});
        public static final BitSet FOLLOW_19_in_ruleValuedObject3380 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject3401 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleValuedObject3416 = new BitSet(new long[]{0x0000000040000000L,0x00000000F0016000L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject3437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding3477 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinding3487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinding3536 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleBinding3548 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinding3572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction3608 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction3618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleEntryAction3667 = new BitSet(new long[]{0x00400044000003D2L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleEntryAction3688 = new BitSet(new long[]{0x0000004400000002L});
        public static final BitSet FOLLOW_38_in_ruleEntryAction3702 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction3723 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleEntryAction3736 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction3757 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleEntryAction3774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuringAction_in_entryRuleDuringAction3812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDuringAction3822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleDuringAction3877 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleDuringAction3903 = new BitSet(new long[]{0x00400044000003D2L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleDuringAction3924 = new BitSet(new long[]{0x0000004400000002L});
        public static final BitSet FOLLOW_38_in_ruleDuringAction3938 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleDuringAction3959 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleDuringAction3972 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleDuringAction3993 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleDuringAction4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction4048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExitAction4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleExitAction4107 = new BitSet(new long[]{0x00400044000003D2L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExitAction4128 = new BitSet(new long[]{0x0000004400000002L});
        public static final BitSet FOLLOW_38_in_ruleExitAction4142 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction4163 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleExitAction4176 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction4197 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleExitAction4214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuspendAction_in_entryRuleSuspendAction4252 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSuspendAction4262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleSuspendAction4317 = new BitSet(new long[]{0x0030000000000000L});
        public static final BitSet FOLLOW_52_in_ruleSuspendAction4349 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleSuspendAction4375 = new BitSet(new long[]{0x00400004000003D2L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleSuspendAction4396 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_ruleSuspendAction4410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect4448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect4458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect4508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect4568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission4603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission4613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission4662 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleEmission4675 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission4696 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleEmission4708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4805 = new BitSet(new long[]{0x0000200000080000L});
        public static final BitSet FOLLOW_45_in_ruleAssignment4818 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment4839 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleAssignment4851 = new BitSet(new long[]{0x0000200000080000L});
        public static final BitSet FOLLOW_19_in_ruleAssignment4865 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment4886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect4922 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect4932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect4973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression5013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression5023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression5103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression5138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression5148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_ruleBoolExpression5197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression5231 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrAndExpression5241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000306000L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrAndExpression5327 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression5346 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000102000L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleOrAndExpression5414 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression5433 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5457 = new BitSet(new long[]{0x0000000000000002L,0x0000000000204000L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FC0L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation5590 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression5679 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression5689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression5739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression5769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression5804 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression5814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression5873 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression5894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression5926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression5961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression6020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression6054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression6064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression6114 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression6147 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression6168 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression6206 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression6216 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression6266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression6299 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression6320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression6358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression6368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression6418 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression6451 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression6472 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression6510 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression6520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression6570 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression6603 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression6624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression6662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression6672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression6722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression6755 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression6814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression6824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression6883 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression6904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression6936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression6981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression7031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression7061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAtomicExpression7079 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression7104 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleAtomicExpression7115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression7147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression7182 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression7192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression7242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression7272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleAtomicValuedExpression7290 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression7315 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleAtomicValuedExpression7326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression7358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression7393 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression7403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression7464 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression7483 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleValuedObjectTestExpression7498 = new BitSet(new long[]{0x0000000000000010L,0x0000000000081000L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression7519 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleValuedObjectTestExpression7531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression7563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference7598 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference7608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference7657 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleValuedObjectReference7670 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference7691 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleValuedObjectReference7703 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression7741 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression7751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue7832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue7842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue7883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue7923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue7933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue7974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue8014 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue8024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue8065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation8107 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation8117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation8167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation8197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation8227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation8257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation8287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation8317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation8347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation8394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation8475 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation8485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTagAnnotation8522 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation8543 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTagAnnotation8556 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation8577 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_55_in_ruleTagAnnotation8590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleKeyStringValueAnnotation8675 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8696 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8717 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyStringValueAnnotation8730 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation8751 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_55_in_ruleKeyStringValueAnnotation8764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypedKeyStringValueAnnotation8849 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8870 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_45_in_ruleTypedKeyStringValueAnnotation8882 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8903 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleTypedKeyStringValueAnnotation8915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8936 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypedKeyStringValueAnnotation8949 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation8970 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_55_in_ruleTypedKeyStringValueAnnotation8983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation9021 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation9031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleKeyBooleanValueAnnotation9068 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation9089 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation9106 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyBooleanValueAnnotation9124 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation9145 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_55_in_ruleKeyBooleanValueAnnotation9158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation9196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation9206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleKeyIntValueAnnotation9243 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation9264 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation9281 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyIntValueAnnotation9299 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation9320 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_55_in_ruleKeyIntValueAnnotation9333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation9371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation9381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleKeyFloatValueAnnotation9418 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation9439 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation9456 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyFloatValueAnnotation9474 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation9495 = new BitSet(new long[]{0x0180000000010400L});
        public static final BitSet FOLLOW_55_in_ruleKeyFloatValueAnnotation9508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString9549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString9560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString9600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString9626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID9672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID9683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9723 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleExtendedID9742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9757 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_57_in_ruleStateType9818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleStateType9835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleStateType9852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleStateType9869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTransitionType9914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTransitionType9931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTransitionType9948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTransitionTypeLegacy9993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTransitionTypeLegacy10010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTransitionTypeLegacy10027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleDivOperator10071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleHistoryType10115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleHistoryType10132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleHistoryType10149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCompareOperator10194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleCompareOperator10211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleCompareOperator10228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleCompareOperator10245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleCompareOperator10262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleCompareOperator10279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_rulePreOperator10323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleOrOperator10366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleAndOperator10409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleNotOperator10452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleAddOperator10495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleSubOperator10538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleMultOperator10581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleModOperator10624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleValOperator10667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleLogicalOrOperator10710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleLogicalAndOperator10753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleValueType10797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleValueType10814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleValueType10831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleValueType10848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleValueType10865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleValueType10882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleValueType10899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleCombineOperator10944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleCombineOperator10961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCombineOperator10978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleCombineOperator10995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleCombineOperator11012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleCombineOperator11029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleCombineOperator11046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleCombineOperator11063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred4_InternalSct335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_synpred5_InternalSct243 = new BitSet(new long[]{0x0100000000010400L});
        public static final BitSet FOLLOW_16_in_synpred5_InternalSct256 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred5_InternalSct273 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred5_InternalSct296 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred5_InternalSct314 = new BitSet(new long[]{0x01001F0000010402L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred5_InternalSct335 = new BitSet(new long[]{0x01001F0000010402L,0x000000001FC00000L});
        public static final BitSet FOLLOW_ruleState_in_synpred6_InternalSct359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred11_InternalSct765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_synpred12_InternalSct787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred20_InternalSct1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred23_InternalSct1200 = new BitSet(new long[]{0x0100000000050402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred23_InternalSct1221 = new BitSet(new long[]{0x0100000000050402L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred37_InternalSct2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred40_InternalSct2157 = new BitSet(new long[]{0x0100000000050402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred40_InternalSct2178 = new BitSet(new long[]{0x0100000000050402L});
        public static final BitSet FOLLOW_ruleTransition_in_synpred42_InternalSct2218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred52_InternalSct2706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred58_InternalSct2689 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred58_InternalSct2706 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred58_InternalSct2733 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_37_in_synpred58_InternalSct2752 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_38_in_synpred58_InternalSct2768 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_39_in_synpred58_InternalSct2786 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred58_InternalSct2808 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_synpred58_InternalSct2821 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred58_InternalSct2842 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_35_in_synpred60_InternalSct2605 = new BitSet(new long[]{0x000000F000000022L,0x0000000000000038L});
        public static final BitSet FOLLOW_36_in_synpred60_InternalSct2637 = new BitSet(new long[]{0x000000E000000022L,0x0000000000000038L});
        public static final BitSet FOLLOW_ruleHistoryType_in_synpred60_InternalSct2672 = new BitSet(new long[]{0x000000E000000022L});
        public static final BitSet FOLLOW_37_in_synpred60_InternalSct2689 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred60_InternalSct2706 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred60_InternalSct2733 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_37_in_synpred60_InternalSct2752 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_38_in_synpred60_InternalSct2768 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_39_in_synpred60_InternalSct2786 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred60_InternalSct2808 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_34_in_synpred60_InternalSct2821 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred60_InternalSct2842 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred60_InternalSct2870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred93_InternalSct5073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_synpred96_InternalSct5327 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_synpred96_InternalSct5346 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred96_InternalSct5370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000102000L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred99_InternalSct5557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FC0L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred99_InternalSct5590 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A9000L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred99_InternalSct5611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred100_InternalSct5739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_synpred113_InternalSct7290 = new BitSet(new long[]{0x00400000000003D0L,0x00000000000A1000L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred113_InternalSct7315 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_synpred113_InternalSct7326 = new BitSet(new long[]{0x0000000000000002L});
    }


}