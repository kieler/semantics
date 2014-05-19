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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'package'", "'scchart'", "'references'", "'bind'", "','", "'{'", "'}'", "'import'", "'.'", "'*'", "'initial'", "'final'", "'state'", "';'", "'immediate'", "'deferred'", "'with'", "'/'", "'do'", "'const'", "'input'", "'output'", "'static'", "'signal'", "'['", "']'", "'='", "'combine'", "'to'", "'entry'", "'during'", "'exit'", "'weak'", "'suspend'", "'('", "')'", "'@'", "'normal'", "'connector'", "'reference'", "'textual'", "'goto'", "'abort to'", "'join to'", "'-->'", "'o->'", "'>->'", "'reset'", "'shallow history'", "'history'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'%'", "'val'", "'||'", "'&&'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'string'", "'host'", "'none'", "'max'", "'min'"
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_COMMENT_ANNOTATION=10;
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

                        if ( (LA1_0==RULE_COMMENT_ANNOTATION||LA1_0==54) ) {
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


    // $ANTLR start "entryRuleRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:235:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:236:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:237:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRegion_in_entryRuleRegion396);
            iv_ruleRegion=ruleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegion406); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:244:1: ruleRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:247:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_declarations_6_0= ruleDeclaration ) )* ( (lv_states_7_0= ruleState ) )+
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:248:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:249:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:257:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT_ANNOTATION||LA7_0==54) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:258:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:258:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:259:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleRegion464);
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegion477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getRegionKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:279:1: ( (lv_id_3_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:280:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:280:1: (lv_id_3_0= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:281:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRegion494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_3_0, grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegionRule());
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:297:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:298:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:298:1: (lv_label_4_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:299:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRegion517); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_4_0, grammarAccess.getRegionAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRegionRule());
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

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRegion535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRegionAccess().getColonKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:319:1: ( (lv_declarations_6_0= ruleDeclaration ) )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:320:1: (lv_declarations_6_0= ruleDeclaration )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:320:1: (lv_declarations_6_0= ruleDeclaration )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:321:3: lv_declarations_6_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleRegion556);
            	    lv_declarations_6_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
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
            	    break loop10;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:337:3: ( (lv_states_7_0= ruleState ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:338:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:338:1: (lv_states_7_0= ruleState )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:339:3: lv_states_7_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRegion578);
            	    lv_states_7_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
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
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:363:1: entryRuleSCChart returns [EObject current=null] : iv_ruleSCChart= ruleSCChart EOF ;
    public final EObject entryRuleSCChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCChart = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:364:2: (iv_ruleSCChart= ruleSCChart EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:365:2: iv_ruleSCChart= ruleSCChart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCChartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSCChart_in_entryRuleSCChart615);
            iv_ruleSCChart=ruleSCChart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCChart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSCChart625); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:372:1: ruleSCChart returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:375:28: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:376:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:376:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:376:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )? ( (lv_imports_2_0= ruleImportDecl ) )* ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= 'scchart' ( (lv_id_5_0= RULE_ID ) ) ( (lv_label_6_0= RULE_STRING ) )? ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:376:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:376:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) )
                    {
                    otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSCChart663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getSCChartAccess().getPackageKeyword_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:380:1: ( (lv_name_1_0= ruleQualifiedName ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:381:1: (lv_name_1_0= ruleQualifiedName )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:381:1: (lv_name_1_0= ruleQualifiedName )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:382:3: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSCChartAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSCChart684);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:398:4: ( (lv_imports_2_0= ruleImportDecl ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:399:1: (lv_imports_2_0= ruleImportDecl )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:399:1: (lv_imports_2_0= ruleImportDecl )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:400:3: lv_imports_2_0= ruleImportDecl
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getImportsImportDeclParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportDecl_in_ruleSCChart707);
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
            	    break loop13;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:416:3: ( (lv_annotations_3_0= ruleAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==54) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:417:1: (lv_annotations_3_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:417:1: (lv_annotations_3_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:418:3: lv_annotations_3_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getAnnotationsAnnotationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleSCChart729);
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
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSCChart742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSCChartAccess().getScchartKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:438:1: ( (lv_id_5_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:439:1: (lv_id_5_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:439:1: (lv_id_5_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:440:3: lv_id_5_0= RULE_ID
            {
            lv_id_5_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSCChart759); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:456:2: ( (lv_label_6_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:457:1: (lv_label_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:457:1: (lv_label_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:458:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSCChart781); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:474:3: ( (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? ) | (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            else if ( (LA21_0==23) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:474:4: (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:474:4: (otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:474:6: otherlv_7= 'references' ( (otherlv_8= RULE_ID ) ) (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )?
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSCChart801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSCChartAccess().getReferencesKeyword_6_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:478:1: ( (otherlv_8= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:479:1: (otherlv_8= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:479:1: (otherlv_8= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:480:3: otherlv_8= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                              
                    }
                    otherlv_8=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSCChart825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_8, grammarAccess.getSCChartAccess().getReferencedScopeStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:494:2: (otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==21) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:494:4: otherlv_9= 'bind' ( (lv_bindings_10_0= ruleBinding ) ) (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )*
                            {
                            otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSCChart838); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_9, grammarAccess.getSCChartAccess().getBindKeyword_6_0_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:498:1: ( (lv_bindings_10_0= ruleBinding ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:499:1: (lv_bindings_10_0= ruleBinding )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:499:1: (lv_bindings_10_0= ruleBinding )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:500:3: lv_bindings_10_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleSCChart859);
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

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:516:2: (otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==22) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:516:4: otherlv_11= ',' ( (lv_bindings_12_0= ruleBinding ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSCChart872); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getSCChartAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:520:1: ( (lv_bindings_12_0= ruleBinding ) )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:521:1: (lv_bindings_12_0= ruleBinding )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:521:1: (lv_bindings_12_0= ruleBinding )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:522:3: lv_bindings_12_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getBindingsBindingParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleSCChart893);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:539:6: (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:539:6: (otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:539:8: otherlv_13= '{' ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSCChart917); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getSCChartAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:1: ( ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:2: ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:2: ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        alt18 = dfa18.predict(input);
                        switch (alt18) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:3: ( (lv_declarations_14_0= ruleDeclaration ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:3: ( (lv_declarations_14_0= ruleDeclaration ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:544:1: (lv_declarations_14_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:544:1: (lv_declarations_14_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:545:3: lv_declarations_14_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleSCChart940);
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
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:562:6: ( (lv_localActions_15_0= ruleLocalAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:562:6: ( (lv_localActions_15_0= ruleLocalAction ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:563:1: (lv_localActions_15_0= ruleLocalAction )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:563:1: (lv_localActions_15_0= ruleLocalAction )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:564:3: lv_localActions_15_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_ruleSCChart967);
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
                    	    break loop18;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:580:4: ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_COMMENT_ANNOTATION||LA20_0==16||(LA20_0>=28 && LA20_0<=30)||(LA20_0>=54 && LA20_0<=58)) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==24) ) {
                        int LA20_2 = input.LA(2);

                        if ( (synpred22_InternalSct()) ) {
                            alt20=1;
                        }
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:580:5: ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:580:5: ( (lv_regions_16_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:581:1: (lv_regions_16_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:581:1: (lv_regions_16_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:582:3: lv_regions_16_0= ruleSingleRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleSCChart991);
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

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:598:2: ( (lv_regions_17_0= ruleRegion ) )*
                            loop19:
                            do {
                                int alt19=2;
                                int LA19_0 = input.LA(1);

                                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==16||LA19_0==54) ) {
                                    alt19=1;
                                }


                                switch (alt19) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:599:1: (lv_regions_17_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:599:1: (lv_regions_17_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:600:3: lv_regions_17_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleSCChart1012);
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
                            	    break loop19;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }

                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSCChart1028); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:628:1: entryRuleImportDecl returns [EObject current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final EObject entryRuleImportDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDecl = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:629:2: (iv_ruleImportDecl= ruleImportDecl EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:630:2: iv_ruleImportDecl= ruleImportDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDeclRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportDecl_in_entryRuleImportDecl1067);
            iv_ruleImportDecl=ruleImportDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportDecl1077); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:637:1: ruleImportDecl returns [EObject current=null] : (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ) ;
    public final EObject ruleImportDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:640:28: ( (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:641:1: (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:641:1: (otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:641:3: otherlv_0= 'import' ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleImportDecl1114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportDeclAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:645:1: ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:645:2: ( ( ruleQualifiedName ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:645:2: ( ( ruleQualifiedName ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:646:1: ( ruleQualifiedName )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:646:1: ( ruleQualifiedName )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:647:3: ruleQualifiedName
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
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleImportDecl1142);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:664:6: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:664:6: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:665:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:665:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:666:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDeclAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDecl1169);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:690:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:691:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1207);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1218); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:699:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:702:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:703:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:703:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:703:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:710:1: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleQualifiedName1277); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1292); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:731:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:732:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:733:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1340);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1351); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:740:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:743:28: ( (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:744:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:744:1: (this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:745:5: this_QualifiedName_0= ruleQualifiedName kw= '.' kw= '*'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1398);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleQualifiedNameWithWildcard1416); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1()); 
                  
            }
            kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleQualifiedNameWithWildcard1429); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:775:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:776:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:777:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1469);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1479); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:784:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:787:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:788:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:788:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:788:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )? ( (lv_outgoingTransitions_21_0= ruleTransition ) )* (otherlv_22= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:788:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMENT_ANNOTATION||LA24_0==54) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:789:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:789:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:790:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleState1525);
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
            	    break loop24;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:806:3: ( ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? ) | ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? ) )?
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:806:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:806:4: ( ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:806:5: ( (lv_initial_1_0= 'initial' ) ) ( (lv_final_2_0= 'final' ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:806:5: ( (lv_initial_1_0= 'initial' ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:807:1: (lv_initial_1_0= 'initial' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:807:1: (lv_initial_1_0= 'initial' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:808:3: lv_initial_1_0= 'initial'
                    {
                    lv_initial_1_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleState1546); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:821:2: ( (lv_final_2_0= 'final' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==29) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:822:1: (lv_final_2_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:822:1: (lv_final_2_0= 'final' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:823:3: lv_final_2_0= 'final'
                            {
                            lv_final_2_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleState1577); if (state.failed) return current;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:837:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:837:6: ( ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:837:7: ( (lv_final_3_0= 'final' ) ) ( (lv_initial_4_0= 'initial' ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:837:7: ( (lv_final_3_0= 'final' ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:838:1: (lv_final_3_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:838:1: (lv_final_3_0= 'final' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:839:3: lv_final_3_0= 'final'
                    {
                    lv_final_3_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleState1617); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:852:2: ( (lv_initial_4_0= 'initial' ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==28) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:853:1: (lv_initial_4_0= 'initial' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:853:1: (lv_initial_4_0= 'initial' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:854:3: lv_initial_4_0= 'initial'
                            {
                            lv_initial_4_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleState1648); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:867:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=55 && LA28_0<=58)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:868:1: (lv_type_5_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:868:1: (lv_type_5_0= ruleStateType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:869:3: lv_type_5_0= ruleStateType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleState1686);
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

            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleState1699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getStateKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:889:1: ( (lv_id_7_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:890:1: (lv_id_7_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:890:1: (lv_id_7_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:891:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1716); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:907:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:908:1: (lv_label_8_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:908:1: (lv_label_8_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:909:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleState1738); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:925:3: ( (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? ) | (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            else if ( (LA35_0==23) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:925:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:925:4: (otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:925:6: otherlv_9= 'references' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleState1758); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getReferencesKeyword_6_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:929:1: ( (otherlv_10= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:930:1: (otherlv_10= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:930:1: (otherlv_10= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:931:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getStateAccess().getReferencedScopeStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:2: (otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )* )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==21) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:4: otherlv_11= 'bind' ( (lv_bindings_12_0= ruleBinding ) ) (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            {
                            otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState1795); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getBindKeyword_6_0_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:1: ( (lv_bindings_12_0= ruleBinding ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (lv_bindings_12_0= ruleBinding )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (lv_bindings_12_0= ruleBinding )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:951:3: lv_bindings_12_0= ruleBinding
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleState1816);
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

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:967:2: (otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) ) )*
                            loop30:
                            do {
                                int alt30=2;
                                int LA30_0 = input.LA(1);

                                if ( (LA30_0==22) ) {
                                    alt30=1;
                                }


                                switch (alt30) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:967:4: otherlv_13= ',' ( (lv_bindings_14_0= ruleBinding ) )
                            	    {
                            	    otherlv_13=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1829); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:971:1: ( (lv_bindings_14_0= ruleBinding ) )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:972:1: (lv_bindings_14_0= ruleBinding )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:972:1: (lv_bindings_14_0= ruleBinding )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:973:3: lv_bindings_14_0= ruleBinding
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getBindingsBindingParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleBinding_in_ruleState1850);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:990:6: (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:990:6: (otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:990:8: otherlv_15= '{' ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? ) otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1874); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:1: ( ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:2: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )* ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:2: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*
                    loop32:
                    do {
                        int alt32=3;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:3: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:3: ( (lv_declarations_16_0= ruleDeclaration ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:995:1: (lv_declarations_16_0= ruleDeclaration )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:995:1: (lv_declarations_16_0= ruleDeclaration )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:996:3: lv_declarations_16_0= ruleDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_ruleState1897);
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
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1013:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1013:6: ( (lv_localActions_17_0= ruleLocalAction ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1014:1: (lv_localActions_17_0= ruleLocalAction )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1014:1: (lv_localActions_17_0= ruleLocalAction )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1015:3: lv_localActions_17_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_ruleState1924);
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
                    	    break loop32;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1031:4: ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==16||(LA34_0>=28 && LA34_0<=30)||(LA34_0>=54 && LA34_0<=58)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==24) ) {
                        int LA34_2 = input.LA(2);

                        if ( (synpred39_InternalSct()) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1031:5: ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1031:5: ( (lv_regions_18_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1032:1: (lv_regions_18_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1032:1: (lv_regions_18_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1033:3: lv_regions_18_0= ruleSingleRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleState1948);
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

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1049:2: ( (lv_regions_19_0= ruleRegion ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_COMMENT_ANNOTATION||LA33_0==16||LA33_0==54) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1050:1: (lv_regions_19_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1050:1: (lv_regions_19_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1051:3: lv_regions_19_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleState1969);
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
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }

                    otherlv_20=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1071:4: ( (lv_outgoingTransitions_21_0= ruleTransition ) )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1072:1: (lv_outgoingTransitions_21_0= ruleTransition )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1072:1: (lv_outgoingTransitions_21_0= ruleTransition )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:3: lv_outgoingTransitions_21_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState2009);
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
            	    break loop36;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1089:3: (otherlv_22= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1089:5: otherlv_22= ';'
                    {
                    otherlv_22=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleState2023); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1101:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1102:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1103:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_entryRuleLocalAction2061);
            iv_ruleLocalAction=ruleLocalAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalAction2071); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1110:1: ruleLocalAction returns [EObject current=null] : (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject this_EntryAction_0 = null;

        EObject this_DuringAction_1 = null;

        EObject this_ExitAction_2 = null;

        EObject this_SuspendAction_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1113:28: ( (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1114:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1114:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt38=1;
                }
                break;
            case 32:
                {
                int LA38_2 = input.LA(2);

                if ( ((LA38_2>=50 && LA38_2<=51)) ) {
                    alt38=4;
                }
                else if ( (LA38_2==48) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt38=2;
                }
                break;
            case 49:
                {
                alt38=3;
                }
                break;
            case 50:
            case 51:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1115:2: this_EntryAction_0= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getEntryActionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntryAction_in_ruleLocalAction2121);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1128:2: this_DuringAction_1= ruleDuringAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getDuringActionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDuringAction_in_ruleLocalAction2151);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1141:2: this_ExitAction_2= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getExitActionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExitAction_in_ruleLocalAction2181);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1154:2: this_SuspendAction_3= ruleSuspendAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getSuspendActionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSuspendAction_in_ruleLocalAction2211);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1173:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1174:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1175:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition2246);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition2256); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1182:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1185:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1186:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1186:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1186:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) ) ( (otherlv_3= RULE_ID ) ) ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1186:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_COMMENT_ANNOTATION||LA39_0==54) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1187:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1187:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1188:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTransition2302);
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
            	    break loop39;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1204:3: ( ( (lv_type_1_0= ruleTransitionTypeLegacy ) ) | ( (lv_type_2_0= ruleTransitionType ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=62 && LA40_0<=64)) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=59 && LA40_0<=61)) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1204:4: ( (lv_type_1_0= ruleTransitionTypeLegacy ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1204:4: ( (lv_type_1_0= ruleTransitionTypeLegacy ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1205:1: (lv_type_1_0= ruleTransitionTypeLegacy )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1205:1: (lv_type_1_0= ruleTransitionTypeLegacy )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1206:3: lv_type_1_0= ruleTransitionTypeLegacy
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeLegacyEnumRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionTypeLegacy_in_ruleTransition2325);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1223:6: ( (lv_type_2_0= ruleTransitionType ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1223:6: ( (lv_type_2_0= ruleTransitionType ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1224:1: (lv_type_2_0= ruleTransitionType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1224:1: (lv_type_2_0= ruleTransitionType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1225:3: lv_type_2_0= ruleTransitionType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionType_in_ruleTransition2352);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1241:3: ( (otherlv_3= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1242:1: (otherlv_3= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1242:1: (otherlv_3= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1243:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition2377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_2_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1257:2: ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1257:3: ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1257:3: ( (lv_immediate_4_0= 'immediate' ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==32) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1258:1: (lv_immediate_4_0= 'immediate' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1258:1: (lv_immediate_4_0= 'immediate' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1259:3: lv_immediate_4_0= 'immediate'
                            {
                            lv_immediate_4_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTransition2396); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1272:3: ( (lv_deferred_5_0= 'deferred' ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==33) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1273:1: (lv_deferred_5_0= 'deferred' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1273:1: (lv_deferred_5_0= 'deferred' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1274:3: lv_deferred_5_0= 'deferred'
                            {
                            lv_deferred_5_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTransition2428); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1287:3: ( (lv_history_6_0= ruleHistoryType ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=65 && LA43_0<=67)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1288:1: (lv_history_6_0= ruleHistoryType )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1288:1: (lv_history_6_0= ruleHistoryType )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1289:3: lv_history_6_0= ruleHistoryType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_3_2_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleHistoryType_in_ruleTransition2463);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:3: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
                    int alt49=3;
                    alt49 = dfa49.predict(input);
                    switch (alt49) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )?
                            int alt45=3;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==34) ) {
                                int LA45_1 = input.LA(2);

                                if ( (LA45_1==EOF||LA45_1==RULE_COMMENT_ANNOTATION||LA45_1==16||LA45_1==24||(LA45_1>=28 && LA45_1<=31)||(LA45_1>=35 && LA45_1<=36)||(LA45_1>=54 && LA45_1<=64)) ) {
                                    alt45=2;
                                }
                                else if ( (LA45_1==RULE_ID||(LA45_1>=RULE_INT && LA45_1<=RULE_BOOLEAN)||LA45_1==52||LA45_1==74||LA45_1==77||LA45_1==79||LA45_1==81) ) {
                                    alt45=1;
                                }
                            }
                            switch (alt45) {
                                case 1 :
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:8: otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                                    {
                                    otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTransition2480); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getWithKeyword_3_3_0_0_0_0());
                                          
                                    }
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1309:1: ( (lv_delay_8_0= RULE_INT ) )?
                                    int alt44=2;
                                    alt44 = dfa44.predict(input);
                                    switch (alt44) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
                                            {
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1311:3: lv_delay_8_0= RULE_INT
                                            {
                                            lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition2497); if (state.failed) return current;
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

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1327:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:1: (lv_trigger_9_0= ruleBoolExpression )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:1: (lv_trigger_9_0= ruleBoolExpression )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1329:3: lv_trigger_9_0= ruleBoolExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_3_3_0_0_0_2_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleTransition2524);
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
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1346:7: otherlv_10= 'with'
                                    {
                                    otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTransition2543); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getWithKeyword_3_3_0_0_1());
                                          
                                    }

                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:3: ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( ((LA48_0>=35 && LA48_0<=36)) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:4: (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:4: (otherlv_11= '/' | otherlv_12= 'do' )
                                    int alt46=2;
                                    int LA46_0 = input.LA(1);

                                    if ( (LA46_0==35) ) {
                                        alt46=1;
                                    }
                                    else if ( (LA46_0==36) ) {
                                        alt46=2;
                                    }
                                    else {
                                        if (state.backtracking>0) {state.failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 46, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt46) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:6: otherlv_11= '/'
                                            {
                                            otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTransition2559); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getSolidusKeyword_3_3_0_1_0_0());
                                                  
                                            }

                                            }
                                            break;
                                        case 2 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1355:7: otherlv_12= 'do'
                                            {
                                            otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTransition2577); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getDoKeyword_3_3_0_1_0_1());
                                                  
                                            }

                                            }
                                            break;

                                    }

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1359:2: ( (lv_effects_13_0= ruleEffect ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1360:1: (lv_effects_13_0= ruleEffect )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1360:1: (lv_effects_13_0= ruleEffect )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1361:3: lv_effects_13_0= ruleEffect
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2599);
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

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1377:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                                    loop47:
                                    do {
                                        int alt47=2;
                                        int LA47_0 = input.LA(1);

                                        if ( (LA47_0==31) ) {
                                            int LA47_1 = input.LA(2);

                                            if ( (LA47_1==RULE_ID||LA47_1==RULE_HOSTCODE) ) {
                                                alt47=1;
                                            }


                                        }


                                        switch (alt47) {
                                    	case 1 :
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1377:4: otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) )
                                    	    {
                                    	    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTransition2612); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	          	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getSemicolonKeyword_3_3_0_1_2_0());
                                    	          
                                    	    }
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1381:1: ( (lv_effects_15_0= ruleEffect ) )
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1382:1: (lv_effects_15_0= ruleEffect )
                                    	    {
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1382:1: (lv_effects_15_0= ruleEffect )
                                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1383:3: lv_effects_15_0= ruleEffect
                                    	    {
                                    	    if ( state.backtracking==0 ) {
                                    	       
                                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_2_1_0()); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2633);
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
                                    	    break loop47;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:6: ( (lv_label_16_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:6: ( (lv_label_16_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1401:1: (lv_label_16_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1401:1: (lv_label_16_0= RULE_STRING )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1402:3: lv_label_16_0= RULE_STRING
                            {
                            lv_label_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTransition2661); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1426:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1427:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1428:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_entryRuleDeclaration2706);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclaration2716); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1435:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) ( (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1438:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) ( (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) ( (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) ( (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_const_1_0= 'const' ) )? ( (lv_input_2_0= 'input' ) )? ( (lv_output_3_0= 'output' ) )? ( (lv_static_4_0= 'static' ) )? ( (lv_signal_5_0= 'signal' ) )? ( (lv_type_6_0= ruleValueType ) ) ( (lv_valuedObjects_7_0= ruleValuedObject ) ) ( (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )* (otherlv_10= ';' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_COMMENT_ANNOTATION||LA51_0==54) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1441:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleDeclaration2762);
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
            	    break loop51;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1457:3: ( (lv_const_1_0= 'const' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1458:1: (lv_const_1_0= 'const' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1458:1: (lv_const_1_0= 'const' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1459:3: lv_const_1_0= 'const'
                    {
                    lv_const_1_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDeclaration2781); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:3: ( (lv_input_2_0= 'input' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==38) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1473:1: (lv_input_2_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1473:1: (lv_input_2_0= 'input' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1474:3: lv_input_2_0= 'input'
                    {
                    lv_input_2_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDeclaration2813); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1487:3: ( (lv_output_3_0= 'output' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==39) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1488:1: (lv_output_3_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1488:1: (lv_output_3_0= 'output' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1489:3: lv_output_3_0= 'output'
                    {
                    lv_output_3_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDeclaration2845); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1502:3: ( (lv_static_4_0= 'static' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==40) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1503:1: (lv_static_4_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1503:1: (lv_static_4_0= 'static' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1504:3: lv_static_4_0= 'static'
                    {
                    lv_static_4_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDeclaration2877); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1517:3: ( (lv_signal_5_0= 'signal' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==41) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1518:1: (lv_signal_5_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1518:1: (lv_signal_5_0= 'signal' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1519:3: lv_signal_5_0= 'signal'
                    {
                    lv_signal_5_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDeclaration2909); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1532:3: ( (lv_type_6_0= ruleValueType ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1533:1: (lv_type_6_0= ruleValueType )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1533:1: (lv_type_6_0= ruleValueType )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1534:3: lv_type_6_0= ruleValueType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeValueTypeEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleDeclaration2944);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1550:2: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1551:1: (lv_valuedObjects_7_0= ruleValuedObject )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1551:1: (lv_valuedObjects_7_0= ruleValuedObject )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1552:3: lv_valuedObjects_7_0= ruleValuedObject
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleDeclaration2965);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1568:2: ( (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==31) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==RULE_ID) ) {
                        alt58=1;
                    }


                }
                else if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1568:3: (otherlv_8= ';' )? ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1568:3: (otherlv_8= ';' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==31) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1568:5: otherlv_8= ';'
            	            {
            	            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDeclaration2979); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getDeclarationAccess().getSemicolonKeyword_8_0());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1572:3: ( (lv_valuedObjects_9_0= ruleValuedObject ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1573:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1573:1: (lv_valuedObjects_9_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1574:3: lv_valuedObjects_9_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getValuedObjectsValuedObjectParserRuleCall_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleDeclaration3002);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1590:4: (otherlv_10= ';' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==31) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1590:6: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDeclaration3017); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1602:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1603:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1604:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_entryRuleValuedObject3055);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObject3065); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1611:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1614:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1615:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1615:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1615:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )? (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1615:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1616:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1616:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1617:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObject3107); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1633:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']' )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==42) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1633:4: otherlv_1= '[' ( (lv_cardinalities_2_0= RULE_INT ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleValuedObject3125); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1637:1: ( (lv_cardinalities_2_0= RULE_INT ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1638:1: (lv_cardinalities_2_0= RULE_INT )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1638:1: (lv_cardinalities_2_0= RULE_INT )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1639:3: lv_cardinalities_2_0= RULE_INT
            	    {
            	    lv_cardinalities_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleValuedObject3142); if (state.failed) return current;
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

            	    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleValuedObject3159); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectAccess().getRightSquareBracketKeyword_1_2());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1659:3: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==44) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1659:5: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleValuedObject3174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1663:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1664:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1664:1: (lv_initialValue_5_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1665:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObject3195);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1681:4: (otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==45) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1681:6: otherlv_6= 'combine' ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    {
                    otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleValuedObject3210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getValuedObjectAccess().getCombineKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1685:1: ( (lv_combineOperator_7_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1686:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1686:1: (lv_combineOperator_7_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1687:3: lv_combineOperator_7_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleValuedObject3231);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1713:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1714:2: (iv_ruleBinding= ruleBinding EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1715:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBinding_in_entryRuleBinding3271);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinding3281); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1722:1: ruleBinding returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1725:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1726:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1726:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1726:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'to' ( (otherlv_2= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1726:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1728:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinding3330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getFormalValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleBinding3342); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getToKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1746:1: ( (otherlv_2= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1747:1: (otherlv_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1747:1: (otherlv_2= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1748:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleBinding3366); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1770:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1771:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1772:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntryAction_in_entryRuleEntryAction3402);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntryAction3412); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1779:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1782:28: ( ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1783:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1783:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1783:2: () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1783:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1784:2: 
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

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleEntryAction3461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1796:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||(LA63_0>=RULE_INT && LA63_0<=RULE_BOOLEAN)||LA63_0==52||LA63_0==74||LA63_0==77||LA63_0==79||LA63_0==81) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: (lv_trigger_2_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1798:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleEntryAction3482);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1814:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==35) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1814:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEntryAction3496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1818:1: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1819:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1819:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1820:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleEntryAction3517);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1836:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==31) ) {
                            int LA64_1 = input.LA(2);

                            if ( (LA64_1==RULE_ID||LA64_1==RULE_HOSTCODE) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1836:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEntryAction3530); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1840:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1841:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1841:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1842:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleEntryAction3551);
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

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEntryAction3567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEntryActionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1870:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1871:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1872:2: iv_ruleDuringAction= ruleDuringAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDuringActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDuringAction_in_entryRuleDuringAction3603);
            iv_ruleDuringAction=ruleDuringAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDuringAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDuringAction3613); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1879:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1882:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1883:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1883:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1883:2: () ( (lv_immediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1883:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1884:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1892:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==32) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1893:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1893:1: (lv_immediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1894:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDuringAction3668); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleDuringAction3694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1911:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID||(LA67_0>=RULE_INT && LA67_0<=RULE_BOOLEAN)||LA67_0==52||LA67_0==74||LA67_0==77||LA67_0==79||LA67_0==81) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1912:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1912:1: (lv_trigger_3_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1913:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleDuringAction3715);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1929:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==35) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1929:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDuringAction3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDuringActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1933:1: ( (lv_effects_5_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1934:1: (lv_effects_5_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1934:1: (lv_effects_5_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1935:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleDuringAction3750);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1951:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==31) ) {
                            int LA68_1 = input.LA(2);

                            if ( (LA68_1==RULE_ID||LA68_1==RULE_HOSTCODE) ) {
                                alt68=1;
                            }


                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1951:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDuringAction3763); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1955:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1956:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1956:1: (lv_effects_7_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1957:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleDuringAction3784);
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDuringAction3800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDuringActionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1985:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1986:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1987:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExitAction_in_entryRuleExitAction3836);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExitAction3846); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1994:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1997:28: ( ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1998:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1998:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1998:2: () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1998:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1999:2: 
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

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleExitAction3895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2011:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_ID||(LA70_0>=RULE_INT && LA70_0<=RULE_BOOLEAN)||LA70_0==52||LA70_0==74||LA70_0==77||LA70_0==79||LA70_0==81) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2012:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2012:1: (lv_trigger_2_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2013:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExitAction3916);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2029:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==35) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2029:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleExitAction3930); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2033:1: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2034:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2034:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2035:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleExitAction3951);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2051:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==31) ) {
                            int LA71_1 = input.LA(2);

                            if ( (LA71_1==RULE_ID||LA71_1==RULE_HOSTCODE) ) {
                                alt71=1;
                            }


                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2051:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleExitAction3964); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2055:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2056:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2056:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2057:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleExitAction3985);
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
                    	    break loop71;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleExitAction4001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExitActionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2085:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2086:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2087:2: iv_ruleSuspendAction= ruleSuspendAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSuspendAction_in_entryRuleSuspendAction4037);
            iv_ruleSuspendAction=ruleSuspendAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSuspendAction4047); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2094:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? otherlv_5= ';' ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_immediate_1_0=null;
        Token lv_weak_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_trigger_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2097:28: ( ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? otherlv_5= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2098:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? otherlv_5= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2098:1: ( () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? otherlv_5= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2098:2: () ( (lv_immediate_1_0= 'immediate' ) )? ( (lv_weak_2_0= 'weak' ) )? otherlv_3= 'suspend' ( (lv_trigger_4_0= ruleBoolExpression ) )? otherlv_5= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2098:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2099:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2107:2: ( (lv_immediate_1_0= 'immediate' ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==32) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2108:1: (lv_immediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2108:1: (lv_immediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2109:3: lv_immediate_1_0= 'immediate'
                    {
                    lv_immediate_1_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSuspendAction4102); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2122:3: ( (lv_weak_2_0= 'weak' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==50) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2123:1: (lv_weak_2_0= 'weak' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2123:1: (lv_weak_2_0= 'weak' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2124:3: lv_weak_2_0= 'weak'
                    {
                    lv_weak_2_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSuspendAction4134); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSuspendAction4160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSuspendActionAccess().getSuspendKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2141:1: ( (lv_trigger_4_0= ruleBoolExpression ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID||(LA75_0>=RULE_INT && LA75_0<=RULE_BOOLEAN)||LA75_0==52||LA75_0==74||LA75_0==77||LA75_0==79||LA75_0==81) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2142:1: (lv_trigger_4_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2142:1: (lv_trigger_4_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2143:3: lv_trigger_4_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuspendActionAccess().getTriggerBoolExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleSuspendAction4181);
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

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSuspendAction4194); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSuspendActionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2171:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2172:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2173:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect4230);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect4240); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2180:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2183:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2184:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2184:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==EOF||LA76_1==RULE_COMMENT_ANNOTATION||LA76_1==16||LA76_1==24||(LA76_1>=28 && LA76_1<=31)||LA76_1==52||(LA76_1>=54 && LA76_1<=64)) ) {
                    alt76=1;
                }
                else if ( (LA76_1==44) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA76_0==RULE_HOSTCODE) ) {
                alt76=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2185:2: this_Emission_0= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect4290);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2198:2: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect4320);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2211:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect4350);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2230:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2231:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2232:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission4385);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission4395); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2239:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2242:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2243:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2243:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2243:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2243:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2244:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2244:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2245:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission4444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2259:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==52) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2259:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleEmission4457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2263:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2264:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2264:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2265:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission4478);
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

                    otherlv_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleEmission4490); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2293:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2294:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2295:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment4528);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment4538); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2302:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2305:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2306:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2306:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2306:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2306:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2307:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2307:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2308:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment4587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAssignment4599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2326:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2327:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2327:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2328:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment4620);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2352:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2353:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2354:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect4656);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect4666); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2361:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2364:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2365:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2365:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2366:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2366:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2367:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect4707); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2391:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2392:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2393:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression4747);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression4757); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2400:1: ruleExpression returns [EObject current=null] : (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2403:28: ( (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2404:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2404:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt78=2;
            alt78 = dfa78.predict(input);
            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2405:2: this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression4807);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2418:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression4837);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2437:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2438:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2439:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4872);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression4882); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2446:1: ruleBoolExpression returns [EObject current=null] : this_OrAndExpression_0= ruleOrAndExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrAndExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2449:28: (this_OrAndExpression_0= ruleOrAndExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2451:2: this_OrAndExpression_0= ruleOrAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrAndExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_ruleBoolExpression4931);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2470:1: entryRuleOrAndExpression returns [EObject current=null] : iv_ruleOrAndExpression= ruleOrAndExpression EOF ;
    public final EObject entryRuleOrAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAndExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2471:2: (iv_ruleOrAndExpression= ruleOrAndExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2472:2: iv_ruleOrAndExpression= ruleOrAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression4965);
            iv_ruleOrAndExpression=ruleOrAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrAndExpression4975); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2479:1: ruleOrAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2482:28: ( (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2483:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2483:1: (this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2484:2: this_CompareOperation_0= ruleCompareOperation ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5025);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==75||LA80_0==82) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:3: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2496:2: 
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2504:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2505:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2505:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2506:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2506:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
                    	    int alt79=2;
                    	    int LA79_0 = input.LA(1);

                    	    if ( (LA79_0==75) ) {
                    	        alt79=1;
                    	    }
                    	    else if ( (LA79_0==82) ) {
                    	        alt79=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 79, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt79) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2507:3: lv_operator_2_1= ruleOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_0_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrAndExpression5061);
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
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2522:8: lv_operator_2_2= ruleLogicalOrOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression5080);
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2540:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2541:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2541:1: (lv_subExpressions_3_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2542:3: lv_subExpressions_3_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5104);
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
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2559:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2559:6: ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==76||LA82_0==83) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2559:7: () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2559:7: ()
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2560:2: 
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2568:2: ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2569:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2569:1: ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2570:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2570:1: (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator )
                    	    int alt81=2;
                    	    int LA81_0 = input.LA(1);

                    	    if ( (LA81_0==76) ) {
                    	        alt81=1;
                    	    }
                    	    else if ( (LA81_0==83) ) {
                    	        alt81=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 81, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt81) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2571:3: lv_operator_5_1= ruleAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_1_0_0()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleOrAndExpression5148);
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
                    	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2586:8: lv_operator_5_2= ruleLogicalAndOperator
                    	            {
                    	            if ( state.backtracking==0 ) {
                    	               
                    	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_1_0_1()); 
                    	              	    
                    	            }
                    	            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression5167);
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

                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2604:2: ( (lv_subExpressions_6_0= ruleCompareOperation ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2605:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2605:1: (lv_subExpressions_6_0= ruleCompareOperation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2606:3: lv_subExpressions_6_0= ruleCompareOperation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5191);
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
                    	    break loop82;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2630:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2631:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2632:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5230);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation5240); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2639:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2642:28: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt84=2;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2644:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5291);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2655:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2655:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2655:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2656:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2664:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2665:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2665:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2666:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation5324);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2682:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2683:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2683:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2684:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5345);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2702:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation5378);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2721:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2722:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2723:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression5413);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression5423); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2730:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2733:28: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2734:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2734:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2735:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression5473);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2748:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression5503);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2767:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2768:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2769:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression5538);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression5548); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2776:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2779:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==77) ) {
                alt86=1;
            }
            else if ( (LA86_0==RULE_ID||LA86_0==RULE_HOSTCODE||LA86_0==RULE_BOOLEAN||LA86_0==52||LA86_0==74||LA86_0==81) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2780:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2781:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2789:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2790:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2790:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2791:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression5607);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2807:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2808:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2808:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2809:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression5628);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2827:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression5660);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2846:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2847:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2848:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression5695);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression5705); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2855:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2858:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2860:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression5754);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2879:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2880:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2881:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression5788);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression5798); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2888:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2891:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2892:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2892:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2893:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression5848);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2904:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==78) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2904:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2904:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2905:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2913:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2914:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2914:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2915:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression5881);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2931:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2932:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2932:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2933:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression5902);
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
            	    break loop87;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2957:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2958:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2959:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression5940);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression5950); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2966:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2969:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2970:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2970:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2971:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression6000);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2982:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==79) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2982:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2982:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2983:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2991:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2992:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2992:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2993:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression6033);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3009:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3010:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3010:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3011:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression6054);
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
            	    break loop88;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3035:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3036:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3037:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression6092);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression6102); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3044:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3047:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3048:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3048:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3049:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression6152);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3060:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==27) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3060:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3060:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3061:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3069:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3070:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3070:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3071:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression6185);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3087:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3088:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3088:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3089:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression6206);
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
            	    break loop89;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3113:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3114:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3115:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression6244);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression6254); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3122:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3125:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3126:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3126:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3127:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression6304);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3138:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==17) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3138:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3138:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3139:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3147:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3148:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3148:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3149:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression6337);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3165:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3166:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3166:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3167:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression6358);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3191:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3192:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3193:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression6396);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression6406); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3200:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3203:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3204:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3204:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3205:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression6456);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3216:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==80) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3216:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3216:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3217:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3225:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3226:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3226:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3227:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression6489);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3243:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3244:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3244:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3245:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression6510);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3269:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3270:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3271:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression6548);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression6558); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3278:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3281:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3282:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3282:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==79) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_ID||(LA92_0>=RULE_INT && LA92_0<=RULE_BOOLEAN)||LA92_0==52||LA92_0==74||LA92_0==81) ) {
                alt92=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3282:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3282:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3282:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3282:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3283:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3291:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3292:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3292:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3293:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression6617);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3309:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3310:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3310:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3311:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression6638);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3329:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression6670);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3348:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3349:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3350:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6705);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression6715); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3357:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3360:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3361:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3361:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt93=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt93=1;
                }
                break;
            case RULE_ID:
            case 74:
            case 81:
                {
                alt93=2;
                }
                break;
            case 52:
                {
                alt93=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt93=4;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3362:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression6765);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3375:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression6795);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3387:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3387:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3387:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAtomicExpression6813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression6838);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAtomicExpression6849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3409:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression6881);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3428:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3429:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3430:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression6916);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression6926); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3437:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3440:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3441:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3441:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt94=4;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3442:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression6976);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3455:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression7006);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleAtomicValuedExpression7024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression7049);
                    this_ValuedExpression_3=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAtomicValuedExpression7060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3489:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression7092);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3508:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3509:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3510:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression7127);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression7137); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3517:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3520:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3521:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3521:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==74||LA96_0==81) ) {
                alt96=1;
            }
            else if ( (LA96_0==RULE_ID) ) {
                alt96=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3521:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3521:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3521:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3521:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3522:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3530:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3531:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3531:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3532:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3532:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==74) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==81) ) {
                        alt95=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3533:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression7198);
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
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3548:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression7217);
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

                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleValuedObjectTestExpression7232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3570:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3571:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3571:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3572:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression7253);
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

                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleValuedObjectTestExpression7265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3594:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression7297);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3613:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3614:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3615:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference7332);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference7342); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3622:1: ruleValuedObjectReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cardinalities_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3625:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3626:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3626:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3626:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3626:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3627:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3627:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3628:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference7391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3642:2: (otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']' )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==42) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3642:4: otherlv_1= '[' ( (lv_cardinalities_2_0= ruleExpression ) ) otherlv_3= ']'
            	    {
            	    otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleValuedObjectReference7404); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getValuedObjectReferenceAccess().getLeftSquareBracketKeyword_1_0());
            	          
            	    }
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3646:1: ( (lv_cardinalities_2_0= ruleExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3647:1: (lv_cardinalities_2_0= ruleExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3647:1: (lv_cardinalities_2_0= ruleExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3648:3: lv_cardinalities_2_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectReferenceAccess().getCardinalitiesExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObjectReference7425);
            	    lv_cardinalities_2_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getValuedObjectReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cardinalities",
            	              		lv_cardinalities_2_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleValuedObjectReference7437); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getValuedObjectReferenceAccess().getRightSquareBracketKeyword_1_2());
            	          
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3676:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3677:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3678:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression7475);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression7485); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3685:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3688:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3689:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3689:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3690:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3690:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3691:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7526); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3715:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3716:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3717:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue7566);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue7576); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3724:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3727:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3728:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3728:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3729:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3729:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3730:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue7617); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3754:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3755:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3756:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue7657);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue7667); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3763:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3766:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3767:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3767:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3768:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3768:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3769:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue7708); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3793:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3794:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3795:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue7748);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue7758); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3802:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3805:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3806:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3806:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3807:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3807:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3808:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue7799); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3834:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3835:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3836:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation7841);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation7851); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3843:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3846:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3847:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3847:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt98=7;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3848:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation7901);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3861:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation7931);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3874:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation7961);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3887:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation7991);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3900:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation8021);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3913:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation8051);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3926:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation8081);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3947:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3948:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3949:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8118);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation8128); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3956:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3959:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3960:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3960:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3961:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3961:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3962:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8169); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3986:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3987:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3988:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation8209);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation8219); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3995:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3998:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3999:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3999:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3999:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTagAnnotation8256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4003:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4004:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4004:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4005:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation8277);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4021:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==52) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4021:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTagAnnotation8290); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4025:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==RULE_COMMENT_ANNOTATION||LA99_0==54) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4026:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4026:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4027:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation8311);
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
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTagAnnotation8324); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4055:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4056:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4057:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8362);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8372); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4064:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4067:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4068:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4068:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4068:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyStringValueAnnotation8409); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4072:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4073:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4073:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4074:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8430);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4090:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4091:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4091:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4092:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8451);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4108:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==52) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4108:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleKeyStringValueAnnotation8464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4112:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==RULE_COMMENT_ANNOTATION||LA101_0==54) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4113:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4113:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4114:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation8485);
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
                    	    break loop101;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleKeyStringValueAnnotation8498); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4142:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4143:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4144:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8536);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8546); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4151:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4154:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4155:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4155:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4155:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypedKeyStringValueAnnotation8583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4159:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4160:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4160:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4161:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8604);
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

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTypedKeyStringValueAnnotation8616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4181:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4182:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4182:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4183:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8637);
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

            otherlv_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTypedKeyStringValueAnnotation8649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4203:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4204:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4204:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4205:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8670);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4221:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==52) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4221:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTypedKeyStringValueAnnotation8683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4225:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==RULE_COMMENT_ANNOTATION||LA103_0==54) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4226:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4226:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4227:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation8704);
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
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypedKeyStringValueAnnotation8717); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4255:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4256:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4257:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation8755);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation8765); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4264:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4267:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4268:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4268:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4268:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyBooleanValueAnnotation8802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4272:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4273:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4273:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4274:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation8823);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4290:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4291:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4291:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4292:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation8840); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4308:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==52) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4308:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleKeyBooleanValueAnnotation8858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4312:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==RULE_COMMENT_ANNOTATION||LA105_0==54) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4313:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4313:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4314:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation8879);
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
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleKeyBooleanValueAnnotation8892); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4342:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4343:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4344:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation8930);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation8940); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4351:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4354:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4355:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4355:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4355:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyIntValueAnnotation8977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4359:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4360:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4360:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4361:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation8998);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4377:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4378:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4378:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4379:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation9015); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4395:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==52) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4395:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleKeyIntValueAnnotation9033); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4399:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==RULE_COMMENT_ANNOTATION||LA107_0==54) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4400:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4400:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4401:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation9054);
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
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleKeyIntValueAnnotation9067); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4429:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4430:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4431:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation9105);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation9115); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4438:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4441:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4442:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4442:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4442:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleKeyFloatValueAnnotation9152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4446:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4447:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4447:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4448:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation9173);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4464:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4465:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4465:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4466:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation9190); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4482:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==52) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4482:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleKeyFloatValueAnnotation9208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4486:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==RULE_COMMENT_ANNOTATION||LA109_0==54) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4487:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4487:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4488:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation9229);
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
                    	    break loop109;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleKeyFloatValueAnnotation9242); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4518:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4519:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4520:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString9283);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString9294); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4527:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4530:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4531:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4531:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_STRING) ) {
                alt111=1;
            }
            else if ( (LA111_0==RULE_ID) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4531:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString9334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4539:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString9360); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4554:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4555:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4556:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID9406);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID9417); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4563:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4566:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4567:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4567:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4567:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID9457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4574:1: (kw= '.' this_ID_2= RULE_ID )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==26) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4575:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleExtendedID9476); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID9491); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop112;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4595:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4597:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4598:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4598:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt113=1;
                }
                break;
            case 56:
                {
                alt113=2;
                }
                break;
            case 57:
                {
                alt113=3;
                }
                break;
            case 58:
                {
                alt113=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4598:2: (enumLiteral_0= 'normal' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4598:2: (enumLiteral_0= 'normal' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4598:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleStateType9552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4604:6: (enumLiteral_1= 'connector' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4604:6: (enumLiteral_1= 'connector' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4604:8: enumLiteral_1= 'connector'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleStateType9569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4610:6: (enumLiteral_2= 'reference' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4610:6: (enumLiteral_2= 'reference' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4610:8: enumLiteral_2= 'reference'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleStateType9586); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4616:6: (enumLiteral_3= 'textual' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4616:6: (enumLiteral_3= 'textual' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4616:8: enumLiteral_3= 'textual'
                    {
                    enumLiteral_3=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleStateType9603); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4626:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4628:28: ( ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4629:1: ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4629:1: ( (enumLiteral_0= 'goto' ) | (enumLiteral_1= 'abort to' ) | (enumLiteral_2= 'join to' ) )
            int alt114=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt114=1;
                }
                break;
            case 60:
                {
                alt114=2;
                }
                break;
            case 61:
                {
                alt114=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4629:2: (enumLiteral_0= 'goto' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4629:2: (enumLiteral_0= 'goto' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4629:4: enumLiteral_0= 'goto'
                    {
                    enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTransitionType9648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4635:6: (enumLiteral_1= 'abort to' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4635:6: (enumLiteral_1= 'abort to' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4635:8: enumLiteral_1= 'abort to'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTransitionType9665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4641:6: (enumLiteral_2= 'join to' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4641:6: (enumLiteral_2= 'join to' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4641:8: enumLiteral_2= 'join to'
                    {
                    enumLiteral_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTransitionType9682); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4651:1: ruleTransitionTypeLegacy returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) ;
    public final Enumerator ruleTransitionTypeLegacy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4653:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4654:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4654:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt115=1;
                }
                break;
            case 63:
                {
                alt115=2;
                }
                break;
            case 64:
                {
                alt115=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4654:2: (enumLiteral_0= '-->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4654:2: (enumLiteral_0= '-->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4654:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTransitionTypeLegacy9727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeLegacyAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeLegacyAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4660:6: (enumLiteral_1= 'o->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4660:6: (enumLiteral_1= 'o->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4660:8: enumLiteral_1= 'o->'
                    {
                    enumLiteral_1=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTransitionTypeLegacy9744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeLegacyAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeLegacyAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4666:6: (enumLiteral_2= '>->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4666:6: (enumLiteral_2= '>->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4666:8: enumLiteral_2= '>->'
                    {
                    enumLiteral_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTransitionTypeLegacy9761); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4676:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4678:28: ( (enumLiteral_0= ':' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4679:1: (enumLiteral_0= ':' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4679:1: (enumLiteral_0= ':' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4679:3: enumLiteral_0= ':'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDivOperator9805); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4689:1: ruleHistoryType returns [Enumerator current=null] : ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) ;
    public final Enumerator ruleHistoryType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4691:28: ( ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:1: ( (enumLiteral_0= 'reset' ) | (enumLiteral_1= 'shallow history' ) | (enumLiteral_2= 'history' ) )
            int alt116=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt116=1;
                }
                break;
            case 66:
                {
                alt116=2;
                }
                break;
            case 67:
                {
                alt116=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:2: (enumLiteral_0= 'reset' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:2: (enumLiteral_0= 'reset' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:4: enumLiteral_0= 'reset'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleHistoryType9849); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getHistoryTypeAccess().getRESETEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4698:6: (enumLiteral_1= 'shallow history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4698:6: (enumLiteral_1= 'shallow history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4698:8: enumLiteral_1= 'shallow history'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleHistoryType9866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getHistoryTypeAccess().getSHALLOWEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:6: (enumLiteral_2= 'history' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:6: (enumLiteral_2= 'history' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:8: enumLiteral_2= 'history'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleHistoryType9883); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4714:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4716:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt117=6;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt117=1;
                }
                break;
            case 69:
                {
                alt117=2;
                }
                break;
            case 70:
                {
                alt117=3;
                }
                break;
            case 71:
                {
                alt117=4;
                }
                break;
            case 72:
                {
                alt117=5;
                }
                break;
            case 73:
                {
                alt117=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleCompareOperator9928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4723:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4723:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4723:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleCompareOperator9945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4729:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4729:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4729:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleCompareOperator9962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4735:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4735:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4735:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleCompareOperator9979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4741:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4741:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4741:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleCompareOperator9996); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4747:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4747:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4747:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleCompareOperator10013); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4757:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4759:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4760:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4760:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4760:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,74,FollowSets000.FOLLOW_74_in_rulePreOperator10057); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4770:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4772:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4773:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4773:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4773:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleOrOperator10100); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4783:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4785:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4786:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4786:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4786:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleAndOperator10143); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4796:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4798:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4799:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4799:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4799:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleNotOperator10186); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4809:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4811:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4812:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4812:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4812:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleAddOperator10229); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4822:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4824:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4825:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4825:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4825:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleSubOperator10272); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4835:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4837:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4838:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4838:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4838:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleMultOperator10315); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4848:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= '%' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4850:28: ( (enumLiteral_0= '%' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4851:1: (enumLiteral_0= '%' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4851:1: (enumLiteral_0= '%' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4851:3: enumLiteral_0= '%'
            {
            enumLiteral_0=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleModOperator10358); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4861:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4863:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4864:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4864:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4864:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleValOperator10401); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4874:1: ruleLogicalOrOperator returns [Enumerator current=null] : (enumLiteral_0= '||' ) ;
    public final Enumerator ruleLogicalOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4876:28: ( (enumLiteral_0= '||' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4877:1: (enumLiteral_0= '||' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4877:1: (enumLiteral_0= '||' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4877:3: enumLiteral_0= '||'
            {
            enumLiteral_0=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleLogicalOrOperator10444); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4887:1: ruleLogicalAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&&' ) ;
    public final Enumerator ruleLogicalAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4889:28: ( (enumLiteral_0= '&&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4890:1: (enumLiteral_0= '&&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4890:1: (enumLiteral_0= '&&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4890:3: enumLiteral_0= '&&'
            {
            enumLiteral_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleLogicalAndOperator10487); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4900:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4902:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4903:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4903:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'string' ) | (enumLiteral_6= 'host' ) )
            int alt118=7;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt118=1;
                }
                break;
            case 85:
                {
                alt118=2;
                }
                break;
            case 86:
                {
                alt118=3;
                }
                break;
            case 87:
                {
                alt118=4;
                }
                break;
            case 88:
                {
                alt118=5;
                }
                break;
            case 89:
                {
                alt118=6;
                }
                break;
            case 90:
                {
                alt118=7;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4903:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4903:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4903:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleValueType10531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4909:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4909:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4909:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleValueType10548); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4915:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4915:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4915:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleValueType10565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4921:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4921:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4921:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleValueType10582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4927:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4927:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4927:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleValueType10599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4933:6: (enumLiteral_5= 'string' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4933:6: (enumLiteral_5= 'string' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4933:8: enumLiteral_5= 'string'
                    {
                    enumLiteral_5=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleValueType10616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4939:6: (enumLiteral_6= 'host' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4939:6: (enumLiteral_6= 'host' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4939:8: enumLiteral_6= 'host'
                    {
                    enumLiteral_6=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleValueType10633); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4949:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4951:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4952:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4952:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt119=8;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt119=1;
                }
                break;
            case 78:
                {
                alt119=2;
                }
                break;
            case 27:
                {
                alt119=3;
                }
                break;
            case 92:
                {
                alt119=4;
                }
                break;
            case 93:
                {
                alt119=5;
                }
                break;
            case 75:
                {
                alt119=6;
                }
                break;
            case 76:
                {
                alt119=7;
                }
                break;
            case 90:
                {
                alt119=8;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4952:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4952:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4952:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleCombineOperator10678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4958:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4958:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4958:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleCombineOperator10695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4964:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4964:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4964:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCombineOperator10712); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4970:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4970:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4970:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleCombineOperator10729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4976:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4976:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4976:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleCombineOperator10746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4982:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4982:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4982:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleCombineOperator10763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4988:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4988:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4988:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleCombineOperator10780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4994:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4994:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4994:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleCombineOperator10797); if (state.failed) return current;
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
        loop120:
        do {
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_COMMENT_ANNOTATION||LA120_0==54) ) {
                alt120=1;
            }


            switch (alt120) {
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
        	    break loop120;
            }
        } while (true);

        otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred5_InternalSct256); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:151:1: ( (lv_id_3_0= RULE_ID ) )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( (LA121_0==RULE_ID) ) {
            alt121=1;
        }
        switch (alt121) {
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
        int alt122=2;
        int LA122_0 = input.LA(1);

        if ( (LA122_0==RULE_STRING) ) {
            alt122=1;
        }
        switch (alt122) {
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
        loop123:
        do {
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_COMMENT_ANNOTATION||(LA123_0>=37 && LA123_0<=41)||LA123_0==54||(LA123_0>=84 && LA123_0<=90)) ) {
                alt123=1;
            }


            switch (alt123) {
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
        	    break loop123;
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

    // $ANTLR start synpred10_InternalSct
    public final void synpred10_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:320:1: ( (lv_declarations_6_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:320:1: (lv_declarations_6_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:320:1: (lv_declarations_6_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:321:3: lv_declarations_6_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRegionAccess().getDeclarationsDeclarationParserRuleCall_6_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred10_InternalSct556);
        lv_declarations_6_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred10_InternalSct

    // $ANTLR start synpred11_InternalSct
    public final void synpred11_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_7_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:338:1: ( (lv_states_7_0= ruleState ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:338:1: (lv_states_7_0= ruleState )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:338:1: (lv_states_7_0= ruleState )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:339:3: lv_states_7_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_7_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleState_in_synpred11_InternalSct578);
        lv_states_7_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSct

    // $ANTLR start synpred19_InternalSct
    public final void synpred19_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_14_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:3: ( ( (lv_declarations_14_0= ruleDeclaration ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:3: ( (lv_declarations_14_0= ruleDeclaration ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:3: ( (lv_declarations_14_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:544:1: (lv_declarations_14_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:544:1: (lv_declarations_14_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:545:3: lv_declarations_14_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCChartAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred19_InternalSct940);
        lv_declarations_14_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalSct

    // $ANTLR start synpred22_InternalSct
    public final void synpred22_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_16_0 = null;

        EObject lv_regions_17_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:580:5: ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:580:5: ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:580:5: ( (lv_regions_16_0= ruleSingleRegion ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:581:1: (lv_regions_16_0= ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:581:1: (lv_regions_16_0= ruleSingleRegion )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:582:3: lv_regions_16_0= ruleSingleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred22_InternalSct991);
        lv_regions_16_0=ruleSingleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:598:2: ( (lv_regions_17_0= ruleRegion ) )*
        loop127:
        do {
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_COMMENT_ANNOTATION||LA127_0==16||LA127_0==54) ) {
                alt127=1;
            }


            switch (alt127) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:599:1: (lv_regions_17_0= ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:599:1: (lv_regions_17_0= ruleRegion )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:600:3: lv_regions_17_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred22_InternalSct1012);
        	    lv_regions_17_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop127;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred22_InternalSct

    // $ANTLR start synpred36_InternalSct
    public final void synpred36_InternalSct_fragment() throws RecognitionException {   
        EObject lv_declarations_16_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:3: ( ( (lv_declarations_16_0= ruleDeclaration ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:3: ( (lv_declarations_16_0= ruleDeclaration ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:994:3: ( (lv_declarations_16_0= ruleDeclaration ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:995:1: (lv_declarations_16_0= ruleDeclaration )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:995:1: (lv_declarations_16_0= ruleDeclaration )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:996:3: lv_declarations_16_0= ruleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getDeclarationsDeclarationParserRuleCall_6_1_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDeclaration_in_synpred36_InternalSct1897);
        lv_declarations_16_0=ruleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36_InternalSct

    // $ANTLR start synpred39_InternalSct
    public final void synpred39_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_18_0 = null;

        EObject lv_regions_19_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1031:5: ( ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1031:5: ( (lv_regions_18_0= ruleSingleRegion ) ) ( (lv_regions_19_0= ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1031:5: ( (lv_regions_18_0= ruleSingleRegion ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1032:1: (lv_regions_18_0= ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1032:1: (lv_regions_18_0= ruleSingleRegion )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1033:3: lv_regions_18_0= ruleSingleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred39_InternalSct1948);
        lv_regions_18_0=ruleSingleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1049:2: ( (lv_regions_19_0= ruleRegion ) )*
        loop136:
        do {
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_COMMENT_ANNOTATION||LA136_0==16||LA136_0==54) ) {
                alt136=1;
            }


            switch (alt136) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1050:1: (lv_regions_19_0= ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1050:1: (lv_regions_19_0= ruleRegion )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1051:3: lv_regions_19_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred39_InternalSct1969);
        	    lv_regions_19_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop136;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred39_InternalSct

    // $ANTLR start synpred41_InternalSct
    public final void synpred41_InternalSct_fragment() throws RecognitionException {   
        EObject lv_outgoingTransitions_21_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1072:1: ( (lv_outgoingTransitions_21_0= ruleTransition ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1072:1: (lv_outgoingTransitions_21_0= ruleTransition )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1072:1: (lv_outgoingTransitions_21_0= ruleTransition )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:3: lv_outgoingTransitions_21_0= ruleTransition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleTransition_in_synpred41_InternalSct2009);
        lv_outgoingTransitions_21_0=ruleTransition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred41_InternalSct

    // $ANTLR start synpred51_InternalSct
    public final void synpred51_InternalSct_fragment() throws RecognitionException {   
        Token lv_delay_8_0=null;

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: ( (lv_delay_8_0= RULE_INT ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1311:3: lv_delay_8_0= RULE_INT
        {
        lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred51_InternalSct2497); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred51_InternalSct

    // $ANTLR start synpred57_InternalSct
    public final void synpred57_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token lv_delay_8_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_trigger_9_0 = null;

        EObject lv_effects_13_0 = null;

        EObject lv_effects_15_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )?
        int alt144=3;
        int LA144_0 = input.LA(1);

        if ( (LA144_0==34) ) {
            int LA144_1 = input.LA(2);

            if ( (LA144_1==EOF||(LA144_1>=35 && LA144_1<=36)) ) {
                alt144=2;
            }
            else if ( (LA144_1==RULE_ID||(LA144_1>=RULE_INT && LA144_1<=RULE_BOOLEAN)||LA144_1==52||LA144_1==74||LA144_1==77||LA144_1==79||LA144_1==81) ) {
                alt144=1;
            }
        }
        switch (alt144) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:8: otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                {
                otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_synpred57_InternalSct2480); if (state.failed) return ;
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1309:1: ( (lv_delay_8_0= RULE_INT ) )?
                int alt143=2;
                alt143 = dfa143.predict(input);
                switch (alt143) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1311:3: lv_delay_8_0= RULE_INT
                        {
                        lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred57_InternalSct2497); if (state.failed) return ;

                        }


                        }
                        break;

                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1327:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:1: (lv_trigger_9_0= ruleBoolExpression )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:1: (lv_trigger_9_0= ruleBoolExpression )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1329:3: lv_trigger_9_0= ruleBoolExpression
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_3_3_0_0_0_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred57_InternalSct2524);
                lv_trigger_9_0=ruleBoolExpression();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1346:7: otherlv_10= 'with'
                {
                otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_synpred57_InternalSct2543); if (state.failed) return ;

                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:3: ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
        int alt147=2;
        int LA147_0 = input.LA(1);

        if ( ((LA147_0>=35 && LA147_0<=36)) ) {
            alt147=1;
        }
        switch (alt147) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:4: (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:4: (otherlv_11= '/' | otherlv_12= 'do' )
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==35) ) {
                    alt145=1;
                }
                else if ( (LA145_0==36) ) {
                    alt145=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 145, 0, input);

                    throw nvae;
                }
                switch (alt145) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:6: otherlv_11= '/'
                        {
                        otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_synpred57_InternalSct2559); if (state.failed) return ;

                        }
                        break;
                    case 2 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1355:7: otherlv_12= 'do'
                        {
                        otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_synpred57_InternalSct2577); if (state.failed) return ;

                        }
                        break;

                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1359:2: ( (lv_effects_13_0= ruleEffect ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1360:1: (lv_effects_13_0= ruleEffect )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1360:1: (lv_effects_13_0= ruleEffect )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1361:3: lv_effects_13_0= ruleEffect
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred57_InternalSct2599);
                lv_effects_13_0=ruleEffect();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1377:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                loop146:
                do {
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==31) ) {
                        alt146=1;
                    }


                    switch (alt146) {
                	case 1 :
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1377:4: otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) )
                	    {
                	    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred57_InternalSct2612); if (state.failed) return ;
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1381:1: ( (lv_effects_15_0= ruleEffect ) )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1382:1: (lv_effects_15_0= ruleEffect )
                	    {
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1382:1: (lv_effects_15_0= ruleEffect )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1383:3: lv_effects_15_0= ruleEffect
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_2_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred57_InternalSct2633);
                	    lv_effects_15_0=ruleEffect();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop146;
                    }
                } while (true);


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred57_InternalSct

    // $ANTLR start synpred59_InternalSct
    public final void synpred59_InternalSct_fragment() throws RecognitionException {   
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


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1257:3: ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1257:3: ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1257:3: ( (lv_immediate_4_0= 'immediate' ) )?
        int alt148=2;
        int LA148_0 = input.LA(1);

        if ( (LA148_0==32) ) {
            alt148=1;
        }
        switch (alt148) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1258:1: (lv_immediate_4_0= 'immediate' )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1258:1: (lv_immediate_4_0= 'immediate' )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1259:3: lv_immediate_4_0= 'immediate'
                {
                lv_immediate_4_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_synpred59_InternalSct2396); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1272:3: ( (lv_deferred_5_0= 'deferred' ) )?
        int alt149=2;
        int LA149_0 = input.LA(1);

        if ( (LA149_0==33) ) {
            alt149=1;
        }
        switch (alt149) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1273:1: (lv_deferred_5_0= 'deferred' )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1273:1: (lv_deferred_5_0= 'deferred' )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1274:3: lv_deferred_5_0= 'deferred'
                {
                lv_deferred_5_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_synpred59_InternalSct2428); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1287:3: ( (lv_history_6_0= ruleHistoryType ) )?
        int alt150=2;
        int LA150_0 = input.LA(1);

        if ( ((LA150_0>=65 && LA150_0<=67)) ) {
            alt150=1;
        }
        switch (alt150) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1288:1: (lv_history_6_0= ruleHistoryType )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1288:1: (lv_history_6_0= ruleHistoryType )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1289:3: lv_history_6_0= ruleHistoryType
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getTransitionAccess().getHistoryHistoryTypeEnumRuleCall_3_2_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleHistoryType_in_synpred59_InternalSct2463);
                lv_history_6_0=ruleHistoryType();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:3: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?
        int alt156=3;
        switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
                {
                alt156=1;
                }
                break;
            case EOF:
                {
                int LA156_2 = input.LA(2);

                if ( (synpred57_InternalSct()) ) {
                    alt156=1;
                }
                }
                break;
            case RULE_STRING:
                {
                alt156=2;
                }
                break;
        }

        switch (alt156) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:4: ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:5: ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )?
                int alt152=3;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==34) ) {
                    int LA152_1 = input.LA(2);

                    if ( (LA152_1==EOF||(LA152_1>=35 && LA152_1<=36)) ) {
                        alt152=2;
                    }
                    else if ( (LA152_1==RULE_ID||(LA152_1>=RULE_INT && LA152_1<=RULE_BOOLEAN)||LA152_1==52||LA152_1==74||LA152_1==77||LA152_1==79||LA152_1==81) ) {
                        alt152=1;
                    }
                }
                switch (alt152) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:6: (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1305:8: otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) )
                        {
                        otherlv_7=(Token)match(input,34,FollowSets000.FOLLOW_34_in_synpred59_InternalSct2480); if (state.failed) return ;
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1309:1: ( (lv_delay_8_0= RULE_INT ) )?
                        int alt151=2;
                        alt151 = dfa151.predict(input);
                        switch (alt151) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
                                {
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1310:1: (lv_delay_8_0= RULE_INT )
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1311:3: lv_delay_8_0= RULE_INT
                                {
                                lv_delay_8_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred59_InternalSct2497); if (state.failed) return ;

                                }


                                }
                                break;

                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1327:3: ( (lv_trigger_9_0= ruleBoolExpression ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:1: (lv_trigger_9_0= ruleBoolExpression )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:1: (lv_trigger_9_0= ruleBoolExpression )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1329:3: lv_trigger_9_0= ruleBoolExpression
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_3_3_0_0_0_2_0()); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred59_InternalSct2524);
                        lv_trigger_9_0=ruleBoolExpression();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1346:7: otherlv_10= 'with'
                        {
                        otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_synpred59_InternalSct2543); if (state.failed) return ;

                        }
                        break;

                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:3: ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )?
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( ((LA155_0>=35 && LA155_0<=36)) ) {
                    alt155=1;
                }
                switch (alt155) {
                    case 1 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:4: (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:4: (otherlv_11= '/' | otherlv_12= 'do' )
                        int alt153=2;
                        int LA153_0 = input.LA(1);

                        if ( (LA153_0==35) ) {
                            alt153=1;
                        }
                        else if ( (LA153_0==36) ) {
                            alt153=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 153, 0, input);

                            throw nvae;
                        }
                        switch (alt153) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:6: otherlv_11= '/'
                                {
                                otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_synpred59_InternalSct2559); if (state.failed) return ;

                                }
                                break;
                            case 2 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1355:7: otherlv_12= 'do'
                                {
                                otherlv_12=(Token)match(input,36,FollowSets000.FOLLOW_36_in_synpred59_InternalSct2577); if (state.failed) return ;

                                }
                                break;

                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1359:2: ( (lv_effects_13_0= ruleEffect ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1360:1: (lv_effects_13_0= ruleEffect )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1360:1: (lv_effects_13_0= ruleEffect )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1361:3: lv_effects_13_0= ruleEffect
                        {
                        if ( state.backtracking==0 ) {
                           
                          	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_1_0()); 
                          	    
                        }
                        pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred59_InternalSct2599);
                        lv_effects_13_0=ruleEffect();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1377:2: (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )*
                        loop154:
                        do {
                            int alt154=2;
                            int LA154_0 = input.LA(1);

                            if ( (LA154_0==31) ) {
                                alt154=1;
                            }


                            switch (alt154) {
                        	case 1 :
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1377:4: otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) )
                        	    {
                        	    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred59_InternalSct2612); if (state.failed) return ;
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1381:1: ( (lv_effects_15_0= ruleEffect ) )
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1382:1: (lv_effects_15_0= ruleEffect )
                        	    {
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1382:1: (lv_effects_15_0= ruleEffect )
                        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1383:3: lv_effects_15_0= ruleEffect
                        	    {
                        	    if ( state.backtracking==0 ) {
                        	       
                        	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_3_3_0_1_2_1_0()); 
                        	      	    
                        	    }
                        	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred59_InternalSct2633);
                        	    lv_effects_15_0=ruleEffect();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop154;
                            }
                        } while (true);


                        }
                        break;

                }


                }


                }
                break;
            case 2 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:6: ( (lv_label_16_0= RULE_STRING ) )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1400:6: ( (lv_label_16_0= RULE_STRING ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1401:1: (lv_label_16_0= RULE_STRING )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1401:1: (lv_label_16_0= RULE_STRING )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1402:3: lv_label_16_0= RULE_STRING
                {
                lv_label_16_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred59_InternalSct2661); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred59_InternalSct

    // $ANTLR start synpred88_InternalSct
    public final void synpred88_InternalSct_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2405:2: (this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2405:2: this_BoolExpression_0= ruleBoolExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred88_InternalSct4807);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred88_InternalSct

    // $ANTLR start synpred91_InternalSct
    public final void synpred91_InternalSct_fragment() throws RecognitionException {   
        Enumerator lv_operator_2_1 = null;

        Enumerator lv_operator_2_2 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:2: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:2: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
        loop163:
        do {
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==75||LA163_0==82) ) {
                alt163=1;
            }


            switch (alt163) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:3: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2495:3: ()
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2496:2: 
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	  /* */ 
        	      	
        	    }

        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2504:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2505:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2505:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2506:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2506:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator )
        	    int alt162=2;
        	    int LA162_0 = input.LA(1);

        	    if ( (LA162_0==75) ) {
        	        alt162=1;
        	    }
        	    else if ( (LA162_0==82) ) {
        	        alt162=2;
        	    }
        	    else {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 162, 0, input);

        	        throw nvae;
        	    }
        	    switch (alt162) {
        	        case 1 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2507:3: lv_operator_2_1= ruleOrOperator
        	            {
        	            pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_synpred91_InternalSct5061);
        	            lv_operator_2_1=ruleOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2522:8: lv_operator_2_2= ruleLogicalOrOperator
        	            {
        	            if ( state.backtracking==0 ) {
        	               
        	              	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_0_1_0_1()); 
        	              	    
        	            }
        	            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrOperator_in_synpred91_InternalSct5080);
        	            lv_operator_2_2=ruleLogicalOrOperator();

        	            state._fsp--;
        	            if (state.failed) return ;

        	            }
        	            break;

        	    }


        	    }


        	    }

        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2540:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2541:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2541:1: (lv_subExpressions_3_0= ruleCompareOperation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2542:3: lv_subExpressions_3_0= ruleCompareOperation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getOrAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_0_2_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_synpred91_InternalSct5104);
        	    lv_subExpressions_3_0=ruleCompareOperation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop163;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred91_InternalSct

    // $ANTLR start synpred94_InternalSct
    public final void synpred94_InternalSct_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:2: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2643:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2644:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred94_InternalSct5291);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2655:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2655:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2655:2: ()
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2656:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2664:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2665:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2665:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2666:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred94_InternalSct5324);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2682:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2683:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2683:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2684:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred94_InternalSct5345);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred94_InternalSct

    // $ANTLR start synpred95_InternalSct
    public final void synpred95_InternalSct_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2735:2: (this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2735:2: this_ValuedExpression_0= ruleValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred95_InternalSct5473);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred95_InternalSct

    // $ANTLR start synpred108_InternalSct
    public final void synpred108_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_ValuedExpression_3 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:6: ( (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:6: (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3467:8: otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')'
        {
        otherlv_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_synpred108_InternalSct7024); if (state.failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred108_InternalSct7049);
        this_ValuedExpression_3=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_4=(Token)match(input,53,FollowSets000.FOLLOW_53_in_synpred108_InternalSct7060); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred108_InternalSct

    // Delegated rules

    public final boolean synpred59_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred91_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred94_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred10_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred41_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred95_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred22_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalSct_fragment(); // can never throw exception
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
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA98 dfa98 = new DFA98(this);
    protected DFA143 dfa143 = new DFA143(this);
    protected DFA151 dfa151 = new DFA151(this);
    static final String DFA5_eotS =
        "\16\uffff";
    static final String DFA5_eofS =
        "\1\4\15\uffff";
    static final String DFA5_minS =
        "\1\12\3\0\12\uffff";
    static final String DFA5_maxS =
        "\1\72\3\0\12\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\2\10\uffff\1\1";
    static final String DFA5_specialS =
        "\1\uffff\1\0\1\1\1\2\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\5\uffff\1\3\7\uffff\1\4\3\uffff\3\4\27\uffff\1\2\4\4",
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
                        if ( (synpred5_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index5_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_2 = input.LA(1);

                         
                        int index5_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index5_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_3 = input.LA(1);

                         
                        int index5_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalSct()) ) {s = 13;}

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
        "\31\uffff";
    static final String DFA4_eofS =
        "\1\3\30\uffff";
    static final String DFA4_minS =
        "\1\12\2\0\26\uffff";
    static final String DFA4_maxS =
        "\1\132\2\0\26\uffff";
    static final String DFA4_acceptS =
        "\3\uffff\1\2\11\uffff\1\1\13\uffff";
    static final String DFA4_specialS =
        "\1\uffff\1\0\1\1\26\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\5\uffff\1\3\7\uffff\1\3\3\uffff\3\3\6\uffff\5\15\14\uffff"+
            "\1\2\4\3\31\uffff\7\15",
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
                        if ( (synpred4_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSct()) ) {s = 13;}

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
        "\15\uffff";
    static final String DFA6_eofS =
        "\1\1\14\uffff";
    static final String DFA6_minS =
        "\1\12\1\uffff\2\0\11\uffff";
    static final String DFA6_maxS =
        "\1\72\1\uffff\2\0\11\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\4\uffff\1\1\6\uffff";
    static final String DFA6_specialS =
        "\2\uffff\1\0\1\1\11\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\5\uffff\1\1\7\uffff\1\1\3\uffff\3\6\27\uffff\1\3\4\6",
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
                        if ( (synpred6_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSct()) ) {s = 6;}

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
    static final String DFA10_eotS =
        "\26\uffff";
    static final String DFA10_eofS =
        "\26\uffff";
    static final String DFA10_minS =
        "\1\12\2\0\23\uffff";
    static final String DFA10_maxS =
        "\1\132\2\0\23\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\2\6\uffff\1\1\13\uffff";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\23\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\21\uffff\3\3\6\uffff\5\12\14\uffff\1\2\4\3\31\uffff\7"+
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 319:1: ( (lv_declarations_6_0= ruleDeclaration ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\1\1\14\uffff";
    static final String DFA11_minS =
        "\1\12\2\uffff\2\0\10\uffff";
    static final String DFA11_maxS =
        "\1\72\2\uffff\2\0\10\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\4\uffff\1\1\6\uffff";
    static final String DFA11_specialS =
        "\3\uffff\1\0\1\1\10\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\5\uffff\1\1\7\uffff\1\1\3\uffff\3\6\27\uffff\1\4\4\6",
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
            return "()+ loopback of 337:3: ( (lv_states_7_0= ruleState ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
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
    static final String DFA18_eotS =
        "\36\uffff";
    static final String DFA18_eofS =
        "\36\uffff";
    static final String DFA18_minS =
        "\1\12\2\0\33\uffff";
    static final String DFA18_maxS =
        "\1\132\2\0\33\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\10\uffff\1\1\13\uffff\1\2\5\uffff";
    static final String DFA18_specialS =
        "\1\uffff\1\0\1\1\33\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\5\uffff\1\3\7\uffff\1\3\3\uffff\3\3\1\uffff\1\30\4\uffff"+
            "\5\14\5\uffff\5\30\2\uffff\1\2\4\3\31\uffff\7\14",
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
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 543:2: ( ( (lv_declarations_14_0= ruleDeclaration ) ) | ( (lv_localActions_15_0= ruleLocalAction ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\6\uffff";
    static final String DFA22_eofS =
        "\1\uffff\1\3\3\uffff\1\3";
    static final String DFA22_minS =
        "\1\4\1\12\1\4\2\uffff\1\12";
    static final String DFA22_maxS =
        "\1\4\1\66\1\33\2\uffff\1\66";
    static final String DFA22_acceptS =
        "\3\uffff\1\1\1\2\1\uffff";
    static final String DFA22_specialS =
        "\6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1",
            "\1\3\10\uffff\1\3\5\uffff\1\3\1\2\33\uffff\1\3",
            "\1\5\26\uffff\1\4",
            "",
            "",
            "\1\3\10\uffff\1\3\5\uffff\1\3\1\2\33\uffff\1\3"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "645:1: ( ( ( ruleQualifiedName ) ) | ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) )";
        }
    }
    static final String DFA32_eotS =
        "\36\uffff";
    static final String DFA32_eofS =
        "\36\uffff";
    static final String DFA32_minS =
        "\1\12\2\0\33\uffff";
    static final String DFA32_maxS =
        "\1\132\2\0\33\uffff";
    static final String DFA32_acceptS =
        "\3\uffff\1\3\10\uffff\1\1\13\uffff\1\2\5\uffff";
    static final String DFA32_specialS =
        "\1\uffff\1\0\1\1\33\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\1\5\uffff\1\3\7\uffff\1\3\3\uffff\3\3\1\uffff\1\30\4\uffff"+
            "\5\14\5\uffff\5\30\2\uffff\1\2\4\3\31\uffff\7\14",
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
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 994:2: ( ( (lv_declarations_16_0= ruleDeclaration ) ) | ( (lv_localActions_17_0= ruleLocalAction ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_InternalSct()) ) {s = 12;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\24\uffff";
    static final String DFA36_eofS =
        "\1\1\23\uffff";
    static final String DFA36_minS =
        "\1\12\2\uffff\2\0\17\uffff";
    static final String DFA36_maxS =
        "\1\100\2\uffff\2\0\17\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\14\uffff\1\1\5\uffff";
    static final String DFA36_specialS =
        "\3\uffff\1\0\1\1\17\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\3\5\uffff\1\1\7\uffff\1\1\3\uffff\4\1\26\uffff\1\4\4\1\6"+
            "\16",
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
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "()* loopback of 1071:4: ( (lv_outgoingTransitions_21_0= ruleTransition ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_3 = input.LA(1);

                         
                        int index36_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_4 = input.LA(1);

                         
                        int index36_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index36_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\26\uffff";
    static final String DFA50_eofS =
        "\1\3\25\uffff";
    static final String DFA50_minS =
        "\1\5\1\uffff\23\0\1\uffff";
    static final String DFA50_maxS =
        "\1\103\1\uffff\23\0\1\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\23\uffff\1\2";
    static final String DFA50_specialS =
        "\2\uffff\1\14\1\15\1\16\1\11\1\3\1\6\1\2\1\20\1\4\1\7\1\22\1\1"+
        "\1\13\1\5\1\10\1\17\1\0\1\21\1\12\1\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\4\uffff\1\4\5\uffff\1\6\7\uffff\1\7\3\uffff\1\10\1\11"+
            "\1\16\1\2\5\1\21\uffff\1\5\1\12\1\13\1\14\1\15\1\22\1\23\1\24"+
            "\1\17\1\20\1\21\3\1",
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
            return "1257:2: ( ( (lv_immediate_4_0= 'immediate' ) )? ( (lv_deferred_5_0= 'deferred' ) )? ( (lv_history_6_0= ruleHistoryType ) )? ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_18 = input.LA(1);

                         
                        int index50_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_15 = input.LA(1);

                         
                        int index50_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_15);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_16 = input.LA(1);

                         
                        int index50_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA50_20 = input.LA(1);

                         
                        int index50_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_20);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_14);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA50_17 = input.LA(1);

                         
                        int index50_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA50_9 = input.LA(1);

                         
                        int index50_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_9);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA50_19 = input.LA(1);

                         
                        int index50_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_12);
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
    static final String DFA49_eotS =
        "\27\uffff";
    static final String DFA49_eofS =
        "\1\3\26\uffff";
    static final String DFA49_minS =
        "\1\5\1\uffff\23\0\2\uffff";
    static final String DFA49_maxS =
        "\1\100\1\uffff\23\0\2\uffff";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\23\uffff\1\2\1\3";
    static final String DFA49_specialS =
        "\2\uffff\1\3\1\2\1\21\1\10\1\16\1\1\1\12\1\14\1\15\1\17\1\6\1\13"+
        "\1\7\1\22\1\0\1\5\1\11\1\4\1\20\2\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\25\4\uffff\1\4\5\uffff\1\6\7\uffff\1\7\3\uffff\1\10\1\11"+
            "\1\16\1\2\2\uffff\3\1\21\uffff\1\5\1\12\1\13\1\14\1\15\1\22"+
            "\1\23\1\24\1\17\1\20\1\21",
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
            "",
            ""
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1305:3: ( ( ( (otherlv_7= 'with' ( (lv_delay_8_0= RULE_INT ) )? ( (lv_trigger_9_0= ruleBoolExpression ) ) ) | otherlv_10= 'with' )? ( (otherlv_11= '/' | otherlv_12= 'do' ) ( (lv_effects_13_0= ruleEffect ) ) (otherlv_14= ';' ( (lv_effects_15_0= ruleEffect ) ) )* )? ) | ( (lv_label_16_0= RULE_STRING ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_16 = input.LA(1);

                         
                        int index49_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA49_7 = input.LA(1);

                         
                        int index49_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA49_3 = input.LA(1);

                         
                        int index49_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA49_2 = input.LA(1);

                         
                        int index49_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA49_19 = input.LA(1);

                         
                        int index49_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_19);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA49_12 = input.LA(1);

                         
                        int index49_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA49_14 = input.LA(1);

                         
                        int index49_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_14);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA49_5 = input.LA(1);

                         
                        int index49_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_5);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA49_18 = input.LA(1);

                         
                        int index49_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_18);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA49_8 = input.LA(1);

                         
                        int index49_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_8);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA49_13 = input.LA(1);

                         
                        int index49_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA49_9 = input.LA(1);

                         
                        int index49_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_9);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_10);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA49_6 = input.LA(1);

                         
                        int index49_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_6);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_11);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA49_20 = input.LA(1);

                         
                        int index49_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_20);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA49_4 = input.LA(1);

                         
                        int index49_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_4);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA49_15 = input.LA(1);

                         
                        int index49_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index49_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\14\uffff";
    static final String DFA44_eofS =
        "\14\uffff";
    static final String DFA44_minS =
        "\1\4\1\0\12\uffff";
    static final String DFA44_maxS =
        "\1\121\1\0\12\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\2\1\uffff\1\1\3\2\52\uffff\1\2\25\uffff\1\2\2\uffff\1\2"+
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "1309:1: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA78_eotS =
        "\14\uffff";
    static final String DFA78_eofS =
        "\14\uffff";
    static final String DFA78_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA78_maxS =
        "\1\121\11\0\2\uffff";
    static final String DFA78_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA78_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\10\1\uffff\1\2\1\11\1\3\1\5\52\uffff\1\4\25\uffff\1\6\2"+
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

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "2404:1: (this_BoolExpression_0= ruleBoolExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA78_2 = input.LA(1);

                         
                        int index78_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA78_3 = input.LA(1);

                         
                        int index78_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA78_4 = input.LA(1);

                         
                        int index78_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA78_5 = input.LA(1);

                         
                        int index78_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA78_6 = input.LA(1);

                         
                        int index78_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA78_7 = input.LA(1);

                         
                        int index78_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA78_8 = input.LA(1);

                         
                        int index78_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA78_9 = input.LA(1);

                         
                        int index78_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index78_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\56\uffff";
    static final String DFA83_eofS =
        "\1\5\55\uffff";
    static final String DFA83_minS =
        "\1\4\1\uffff\53\0\1\uffff";
    static final String DFA83_maxS =
        "\1\132\1\uffff\53\0\1\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\53\uffff\1\2";
    static final String DFA83_specialS =
        "\2\uffff\1\50\1\22\1\20\1\47\1\35\1\15\1\2\1\34\1\21\1\4\1\51\1"+
        "\16\1\46\1\10\1\27\1\5\1\40\1\45\1\30\1\24\1\43\1\13\1\26\1\37\1"+
        "\52\1\1\1\0\1\17\1\36\1\25\1\33\1\14\1\7\1\3\1\6\1\11\1\41\1\32"+
        "\1\23\1\42\1\44\1\31\1\12\1\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\30\5\uffff\1\6\5\uffff\1\10\7\uffff\1\11\3\uffff\1\12\1"+
            "\13\1\20\1\4\1\46\2\uffff\1\2\1\3\1\31\1\32\1\33\1\34\1\35\1"+
            "\uffff\1\54\1\uffff\1\27\1\uffff\1\45\1\47\1\50\1\51\1\52\1"+
            "\uffff\1\53\1\7\1\14\1\15\1\16\1\17\1\24\1\25\1\26\1\21\1\22"+
            "\1\23\12\uffff\1\1\1\55\5\uffff\1\1\1\55\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\44",
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
            return "2495:1: ( ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleLogicalOrOperator ) ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* | ( () ( ( (lv_operator_5_1= ruleAndOperator | lv_operator_5_2= ruleLogicalAndOperator ) ) ) ( (lv_subExpressions_6_0= ruleCompareOperation ) ) )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_28 = input.LA(1);

                         
                        int index83_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_27 = input.LA(1);

                         
                        int index83_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_27);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_8 = input.LA(1);

                         
                        int index83_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_35 = input.LA(1);

                         
                        int index83_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_35);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_11 = input.LA(1);

                         
                        int index83_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_17 = input.LA(1);

                         
                        int index83_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA83_36 = input.LA(1);

                         
                        int index83_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_36);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA83_34 = input.LA(1);

                         
                        int index83_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA83_15 = input.LA(1);

                         
                        int index83_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA83_37 = input.LA(1);

                         
                        int index83_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_37);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA83_44 = input.LA(1);

                         
                        int index83_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_44);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA83_23 = input.LA(1);

                         
                        int index83_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_23);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA83_33 = input.LA(1);

                         
                        int index83_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_33);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA83_7 = input.LA(1);

                         
                        int index83_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_7);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA83_13 = input.LA(1);

                         
                        int index83_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_13);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA83_29 = input.LA(1);

                         
                        int index83_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_29);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA83_4 = input.LA(1);

                         
                        int index83_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_4);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA83_10 = input.LA(1);

                         
                        int index83_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_10);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA83_3 = input.LA(1);

                         
                        int index83_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_3);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA83_40 = input.LA(1);

                         
                        int index83_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_40);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA83_21 = input.LA(1);

                         
                        int index83_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA83_31 = input.LA(1);

                         
                        int index83_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_31);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA83_24 = input.LA(1);

                         
                        int index83_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA83_16 = input.LA(1);

                         
                        int index83_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_16);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA83_20 = input.LA(1);

                         
                        int index83_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_20);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA83_43 = input.LA(1);

                         
                        int index83_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_43);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA83_39 = input.LA(1);

                         
                        int index83_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_39);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA83_32 = input.LA(1);

                         
                        int index83_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_32);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA83_9 = input.LA(1);

                         
                        int index83_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_9);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA83_6 = input.LA(1);

                         
                        int index83_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_6);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA83_30 = input.LA(1);

                         
                        int index83_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_30);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA83_25 = input.LA(1);

                         
                        int index83_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_25);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA83_18 = input.LA(1);

                         
                        int index83_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_18);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA83_38 = input.LA(1);

                         
                        int index83_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_38);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA83_41 = input.LA(1);

                         
                        int index83_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_41);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA83_22 = input.LA(1);

                         
                        int index83_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_22);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA83_42 = input.LA(1);

                         
                        int index83_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_42);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA83_19 = input.LA(1);

                         
                        int index83_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_19);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA83_14 = input.LA(1);

                         
                        int index83_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_14);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA83_5 = input.LA(1);

                         
                        int index83_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_5);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA83_2 = input.LA(1);

                         
                        int index83_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_2);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA83_12 = input.LA(1);

                         
                        int index83_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_12);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA83_26 = input.LA(1);

                         
                        int index83_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred91_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 45;}

                         
                        input.seek(index83_26);
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
    static final String DFA84_eotS =
        "\14\uffff";
    static final String DFA84_eofS =
        "\14\uffff";
    static final String DFA84_minS =
        "\1\4\3\uffff\7\0\1\uffff";
    static final String DFA84_maxS =
        "\1\121\3\uffff\7\0\1\uffff";
    static final String DFA84_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA84_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\10\1\uffff\1\1\1\11\1\1\1\5\52\uffff\1\4\25\uffff\1\6\2"+
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

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "2643:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA84_4 = input.LA(1);

                         
                        int index84_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA84_5 = input.LA(1);

                         
                        int index84_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA84_6 = input.LA(1);

                         
                        int index84_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA84_7 = input.LA(1);

                         
                        int index84_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA84_8 = input.LA(1);

                         
                        int index84_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA84_9 = input.LA(1);

                         
                        int index84_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA84_10 = input.LA(1);

                         
                        int index84_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index84_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 84, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\13\uffff";
    static final String DFA85_eofS =
        "\13\uffff";
    static final String DFA85_minS =
        "\1\4\3\uffff\6\0\1\uffff";
    static final String DFA85_maxS =
        "\1\121\3\uffff\6\0\1\uffff";
    static final String DFA85_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA85_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\10\1\uffff\1\1\1\11\1\1\1\5\52\uffff\1\4\25\uffff\1\6\2"+
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

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "2734:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_4 = input.LA(1);

                         
                        int index85_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index85_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA85_5 = input.LA(1);

                         
                        int index85_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index85_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA85_6 = input.LA(1);

                         
                        int index85_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index85_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA85_7 = input.LA(1);

                         
                        int index85_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index85_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA85_8 = input.LA(1);

                         
                        int index85_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index85_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA85_9 = input.LA(1);

                         
                        int index85_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred95_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index85_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA94_eotS =
        "\12\uffff";
    static final String DFA94_eofS =
        "\12\uffff";
    static final String DFA94_minS =
        "\1\4\2\uffff\1\0\6\uffff";
    static final String DFA94_maxS =
        "\1\121\2\uffff\1\0\6\uffff";
    static final String DFA94_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\4\uffff\1\3";
    static final String DFA94_specialS =
        "\3\uffff\1\0\6\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\4\1\uffff\1\1\1\4\1\2\1\4\52\uffff\1\3\25\uffff\1\4\6\uffff"+
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

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "3441:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | (otherlv_2= '(' this_ValuedExpression_3= ruleValuedExpression otherlv_4= ')' ) | this_AtomicExpression_5= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_3 = input.LA(1);

                         
                        int index94_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalSct()) ) {s = 9;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index94_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA98_eotS =
        "\14\uffff";
    static final String DFA98_eofS =
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA98_minS =
        "\1\12\1\uffff\3\4\6\uffff\1\4";
    static final String DFA98_maxS =
        "\1\66\1\uffff\1\4\1\132\1\4\6\uffff\1\132";
    static final String DFA98_acceptS =
        "\1\uffff\1\1\3\uffff\1\6\1\7\1\5\1\4\1\3\1\2\1\uffff";
    static final String DFA98_specialS =
        "\14\uffff}>";
    static final String[] DFA98_transitionS = {
            "\1\1\53\uffff\1\2",
            "",
            "\1\3",
            "\2\11\1\5\1\uffff\1\6\1\7\1\12\5\uffff\1\12\2\uffff\1\12\6"+
            "\uffff\1\4\1\uffff\3\12\6\uffff\5\12\1\10\11\uffff\15\12\23"+
            "\uffff\7\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\11\1\5\1\uffff\1\6\1\7\1\12\5\uffff\1\12\2\uffff\1\12\6"+
            "\uffff\1\4\1\uffff\3\12\6\uffff\5\12\1\10\11\uffff\15\12\23"+
            "\uffff\7\12"
    };

    static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
    static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
    static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
    static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
    static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
    static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
    static final short[][] DFA98_transition;

    static {
        int numStates = DFA98_transitionS.length;
        DFA98_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = DFA98_eot;
            this.eof = DFA98_eof;
            this.min = DFA98_min;
            this.max = DFA98_max;
            this.accept = DFA98_accept;
            this.special = DFA98_special;
            this.transition = DFA98_transition;
        }
        public String getDescription() {
            return "3847:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
    static final String DFA143_eotS =
        "\14\uffff";
    static final String DFA143_eofS =
        "\14\uffff";
    static final String DFA143_minS =
        "\1\4\1\0\12\uffff";
    static final String DFA143_maxS =
        "\1\121\1\0\12\uffff";
    static final String DFA143_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA143_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA143_transitionS = {
            "\1\2\1\uffff\1\1\3\2\52\uffff\1\2\25\uffff\1\2\2\uffff\1\2"+
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

    static final short[] DFA143_eot = DFA.unpackEncodedString(DFA143_eotS);
    static final short[] DFA143_eof = DFA.unpackEncodedString(DFA143_eofS);
    static final char[] DFA143_min = DFA.unpackEncodedStringToUnsignedChars(DFA143_minS);
    static final char[] DFA143_max = DFA.unpackEncodedStringToUnsignedChars(DFA143_maxS);
    static final short[] DFA143_accept = DFA.unpackEncodedString(DFA143_acceptS);
    static final short[] DFA143_special = DFA.unpackEncodedString(DFA143_specialS);
    static final short[][] DFA143_transition;

    static {
        int numStates = DFA143_transitionS.length;
        DFA143_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA143_transition[i] = DFA.unpackEncodedString(DFA143_transitionS[i]);
        }
    }

    class DFA143 extends DFA {

        public DFA143(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 143;
            this.eot = DFA143_eot;
            this.eof = DFA143_eof;
            this.min = DFA143_min;
            this.max = DFA143_max;
            this.accept = DFA143_accept;
            this.special = DFA143_special;
            this.transition = DFA143_transition;
        }
        public String getDescription() {
            return "1309:1: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA143_1 = input.LA(1);

                         
                        int index143_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index143_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 143, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA151_eotS =
        "\14\uffff";
    static final String DFA151_eofS =
        "\14\uffff";
    static final String DFA151_minS =
        "\1\4\1\0\12\uffff";
    static final String DFA151_maxS =
        "\1\121\1\0\12\uffff";
    static final String DFA151_acceptS =
        "\2\uffff\1\2\10\uffff\1\1";
    static final String DFA151_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA151_transitionS = {
            "\1\2\1\uffff\1\1\3\2\52\uffff\1\2\25\uffff\1\2\2\uffff\1\2"+
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

    static final short[] DFA151_eot = DFA.unpackEncodedString(DFA151_eotS);
    static final short[] DFA151_eof = DFA.unpackEncodedString(DFA151_eofS);
    static final char[] DFA151_min = DFA.unpackEncodedStringToUnsignedChars(DFA151_minS);
    static final char[] DFA151_max = DFA.unpackEncodedStringToUnsignedChars(DFA151_maxS);
    static final short[] DFA151_accept = DFA.unpackEncodedString(DFA151_acceptS);
    static final short[] DFA151_special = DFA.unpackEncodedString(DFA151_specialS);
    static final short[][] DFA151_transition;

    static {
        int numStates = DFA151_transitionS.length;
        DFA151_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA151_transition[i] = DFA.unpackEncodedString(DFA151_transitionS[i]);
        }
    }

    class DFA151 extends DFA {

        public DFA151(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 151;
            this.eot = DFA151_eot;
            this.eof = DFA151_eof;
            this.min = DFA151_min;
            this.max = DFA151_max;
            this.accept = DFA151_accept;
            this.special = DFA151_special;
            this.transition = DFA151_transition;
        }
        public String getDescription() {
            return "1309:1: ( (lv_delay_8_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA151_1 = input.LA(1);

                         
                        int index151_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index151_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 151, _s, input);
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
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleSingleRegion243 = new BitSet(new long[]{0x0040000000010400L});
        public static final BitSet FOLLOW_16_in_ruleSingleRegion256 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRegion273 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRegion296 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSingleRegion314 = new BitSet(new long[]{0x07C003E070010402L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleSingleRegion335 = new BitSet(new long[]{0x07C003E070010402L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleState_in_ruleSingleRegion359 = new BitSet(new long[]{0x07C0000070010402L});
        public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegion406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleRegion464 = new BitSet(new long[]{0x0040000000010400L});
        public static final BitSet FOLLOW_16_in_ruleRegion477 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRegion494 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion517 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRegion535 = new BitSet(new long[]{0x07C003E070010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleRegion556 = new BitSet(new long[]{0x07C003E070010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleState_in_ruleRegion578 = new BitSet(new long[]{0x07C0000070010402L});
        public static final BitSet FOLLOW_ruleSCChart_in_entryRuleSCChart615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSCChart625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleSCChart663 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSCChart684 = new BitSet(new long[]{0x0040000002090400L});
        public static final BitSet FOLLOW_ruleImportDecl_in_ruleSCChart707 = new BitSet(new long[]{0x0040000002090400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleSCChart729 = new BitSet(new long[]{0x0040000000090400L});
        public static final BitSet FOLLOW_19_in_ruleSCChart742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSCChart759 = new BitSet(new long[]{0x0000000000900022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSCChart781 = new BitSet(new long[]{0x0000000000900002L});
        public static final BitSet FOLLOW_20_in_ruleSCChart801 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSCChart825 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleSCChart838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleSCChart859 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleSCChart872 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleSCChart893 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_23_in_ruleSCChart917 = new BitSet(new long[]{0x07CF83E171010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleSCChart940 = new BitSet(new long[]{0x07CF83E171010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleLocalAction_in_ruleSCChart967 = new BitSet(new long[]{0x07CF83E171010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleSCChart991 = new BitSet(new long[]{0x0040000001010400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleSCChart1012 = new BitSet(new long[]{0x0040000001010400L});
        public static final BitSet FOLLOW_24_in_ruleSCChart1028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportDecl_in_entryRuleImportDecl1067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportDecl1077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleImportDecl1114 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImportDecl1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDecl1169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1258 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleQualifiedName1277 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1292 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard1340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard1398 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleQualifiedNameWithWildcard1416 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleQualifiedNameWithWildcard1429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1469 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleState1525 = new BitSet(new long[]{0x07C0000070010400L});
        public static final BitSet FOLLOW_28_in_ruleState1546 = new BitSet(new long[]{0x0780000060000000L});
        public static final BitSet FOLLOW_29_in_ruleState1577 = new BitSet(new long[]{0x0780000040000000L});
        public static final BitSet FOLLOW_29_in_ruleState1617 = new BitSet(new long[]{0x0780000050000000L});
        public static final BitSet FOLLOW_28_in_ruleState1648 = new BitSet(new long[]{0x0780000040000000L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleState1686 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleState1699 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1716 = new BitSet(new long[]{0xF840000080910422L,0x0000000000000001L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleState1738 = new BitSet(new long[]{0xF840000080910402L,0x0000000000000001L});
        public static final BitSet FOLLOW_20_in_ruleState1758 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1782 = new BitSet(new long[]{0xF840000080210402L,0x0000000000000001L});
        public static final BitSet FOLLOW_21_in_ruleState1795 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleState1816 = new BitSet(new long[]{0xF840000080410402L,0x0000000000000001L});
        public static final BitSet FOLLOW_22_in_ruleState1829 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleBinding_in_ruleState1850 = new BitSet(new long[]{0xF840000080410402L,0x0000000000000001L});
        public static final BitSet FOLLOW_23_in_ruleState1874 = new BitSet(new long[]{0x07CF83E171010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_ruleState1897 = new BitSet(new long[]{0x07CF83E171010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleLocalAction_in_ruleState1924 = new BitSet(new long[]{0x07CF83E171010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleState1948 = new BitSet(new long[]{0x0040000001010400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleState1969 = new BitSet(new long[]{0x0040000001010400L});
        public static final BitSet FOLLOW_24_in_ruleState1985 = new BitSet(new long[]{0xF840000080010402L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState2009 = new BitSet(new long[]{0xF840000080010402L,0x0000000000000001L});
        public static final BitSet FOLLOW_31_in_ruleState2023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction2061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction2071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntryAction_in_ruleLocalAction2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuringAction_in_ruleLocalAction2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExitAction_in_ruleLocalAction2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuspendAction_in_ruleLocalAction2211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition2256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTransition2302 = new BitSet(new long[]{0xF840000000010400L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleTransitionTypeLegacy_in_ruleTransition2325 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition2352 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2377 = new BitSet(new long[]{0x0000001F00000022L,0x000000000000000EL});
        public static final BitSet FOLLOW_32_in_ruleTransition2396 = new BitSet(new long[]{0x0000001E00000022L,0x000000000000000EL});
        public static final BitSet FOLLOW_33_in_ruleTransition2428 = new BitSet(new long[]{0x0000001C00000022L,0x000000000000000EL});
        public static final BitSet FOLLOW_ruleHistoryType_in_ruleTransition2463 = new BitSet(new long[]{0x0000001C00000022L});
        public static final BitSet FOLLOW_34_in_ruleTransition2480 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition2497 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleTransition2524 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_34_in_ruleTransition2543 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_ruleTransition2559 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_36_in_ruleTransition2577 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2599 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleTransition2612 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2633 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleDeclaration2762 = new BitSet(new long[]{0x004003E000010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_37_in_ruleDeclaration2781 = new BitSet(new long[]{0x004003E000010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_38_in_ruleDeclaration2813 = new BitSet(new long[]{0x004003E000010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_39_in_ruleDeclaration2845 = new BitSet(new long[]{0x004003E000010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_40_in_ruleDeclaration2877 = new BitSet(new long[]{0x004003E000010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_41_in_ruleDeclaration2909 = new BitSet(new long[]{0x004003E000010400L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleDeclaration2944 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration2965 = new BitSet(new long[]{0x0000000080000012L});
        public static final BitSet FOLLOW_31_in_ruleDeclaration2979 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleDeclaration3002 = new BitSet(new long[]{0x0000000080000012L});
        public static final BitSet FOLLOW_31_in_ruleDeclaration3017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject3055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject3065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject3107 = new BitSet(new long[]{0x0000340000000002L});
        public static final BitSet FOLLOW_42_in_ruleValuedObject3125 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleValuedObject3142 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleValuedObject3159 = new BitSet(new long[]{0x0000340000000002L});
        public static final BitSet FOLLOW_44_in_ruleValuedObject3174 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject3195 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleValuedObject3210 = new BitSet(new long[]{0x0000000008000000L,0x000000003C005800L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject3231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinding_in_entryRuleBinding3271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinding3281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinding3330 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46_in_ruleBinding3342 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleBinding3366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction3402 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction3412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleEntryAction3461 = new BitSet(new long[]{0x00100008800003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleEntryAction3482 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_35_in_ruleEntryAction3496 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction3517 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleEntryAction3530 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction3551 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleEntryAction3567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuringAction_in_entryRuleDuringAction3603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDuringAction3613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDuringAction3668 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48_in_ruleDuringAction3694 = new BitSet(new long[]{0x00100008800003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleDuringAction3715 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_35_in_ruleDuringAction3729 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleDuringAction3750 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDuringAction3763 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleDuringAction3784 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleDuringAction3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction3836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExitAction3846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleExitAction3895 = new BitSet(new long[]{0x00100008800003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExitAction3916 = new BitSet(new long[]{0x0000000880000000L});
        public static final BitSet FOLLOW_35_in_ruleExitAction3930 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction3951 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleExitAction3964 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction3985 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleExitAction4001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuspendAction_in_entryRuleSuspendAction4037 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSuspendAction4047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSuspendAction4102 = new BitSet(new long[]{0x000C000000000000L});
        public static final BitSet FOLLOW_50_in_ruleSuspendAction4134 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleSuspendAction4160 = new BitSet(new long[]{0x00100000800003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleSuspendAction4181 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleSuspendAction4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect4230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect4240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect4320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect4350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission4385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission4395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission4444 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleEmission4457 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission4478 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleEmission4490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4587 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleAssignment4599 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment4620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect4656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect4666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect4707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4747 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression4757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression4807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression4837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression4882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_ruleBoolExpression4931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrAndExpression_in_entryRuleOrAndExpression4965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrAndExpression4975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5025 = new BitSet(new long[]{0x0000000000000002L,0x00000000000C1800L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrAndExpression5061 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_ruleOrAndExpression5080 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040800L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleOrAndExpression5148 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleLogicalAndOperator_in_ruleOrAndExpression5167 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleOrAndExpression5191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000081000L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation5230 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation5240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5291 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003F0L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation5324 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation5378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression5413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression5503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression5538 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression5548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression5607 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression5628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression5660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression5695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression5705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression5754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression5788 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression5798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression5848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression5881 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression5902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression5940 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression5950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression6000 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression6033 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression6054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression6092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression6102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression6152 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression6185 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression6206 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression6244 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression6254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression6304 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression6337 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression6358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression6396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression6406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression6456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression6489 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression6510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression6548 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression6558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression6617 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression6638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression6670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6705 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression6715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression6765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression6795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleAtomicExpression6813 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression6838 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleAtomicExpression6849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression6881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression6916 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression6926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression6976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression7006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleAtomicValuedExpression7024 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression7049 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleAtomicValuedExpression7060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression7092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression7127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression7137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression7198 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression7217 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleValuedObjectTestExpression7232 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020400L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression7253 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleValuedObjectTestExpression7265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression7297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference7332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference7342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference7391 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleValuedObjectReference7404 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObjectReference7425 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleValuedObjectReference7437 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression7475 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression7485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue7566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue7576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue7617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue7657 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue7667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue7708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue7748 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue7758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue7799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7841 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation7901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation7931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation7961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation7991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation8021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation8051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation8081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation8128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation8209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation8219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTagAnnotation8256 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation8277 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTagAnnotation8290 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation8311 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_53_in_ruleTagAnnotation8324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8362 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyStringValueAnnotation8409 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8430 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8451 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleKeyStringValueAnnotation8464 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation8485 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_53_in_ruleKeyStringValueAnnotation8498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8536 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypedKeyStringValueAnnotation8583 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8604 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleTypedKeyStringValueAnnotation8616 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8637 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleTypedKeyStringValueAnnotation8649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8670 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypedKeyStringValueAnnotation8683 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation8704 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_53_in_ruleTypedKeyStringValueAnnotation8717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation8755 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation8765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyBooleanValueAnnotation8802 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation8823 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation8840 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleKeyBooleanValueAnnotation8858 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation8879 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_53_in_ruleKeyBooleanValueAnnotation8892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation8930 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation8940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyIntValueAnnotation8977 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation8998 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation9015 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleKeyIntValueAnnotation9033 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation9054 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_53_in_ruleKeyIntValueAnnotation9067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation9105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation9115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleKeyFloatValueAnnotation9152 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation9173 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation9190 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_52_in_ruleKeyFloatValueAnnotation9208 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation9229 = new BitSet(new long[]{0x0060000000010400L});
        public static final BitSet FOLLOW_53_in_ruleKeyFloatValueAnnotation9242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString9283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString9294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString9334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString9360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID9406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID9417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9457 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleExtendedID9476 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9491 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_55_in_ruleStateType9552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleStateType9569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleStateType9586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleStateType9603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTransitionType9648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTransitionType9665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTransitionType9682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTransitionTypeLegacy9727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTransitionTypeLegacy9744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTransitionTypeLegacy9761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleDivOperator9805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleHistoryType9849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleHistoryType9866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleHistoryType9883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleCompareOperator9928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleCompareOperator9945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCompareOperator9962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleCompareOperator9979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleCompareOperator9996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleCompareOperator10013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_rulePreOperator10057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleOrOperator10100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleAndOperator10143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleNotOperator10186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleAddOperator10229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleSubOperator10272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleMultOperator10315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleModOperator10358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleValOperator10401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_82_in_ruleLogicalOrOperator10444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleLogicalAndOperator10487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_84_in_ruleValueType10531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleValueType10548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_86_in_ruleValueType10565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_87_in_ruleValueType10582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_88_in_ruleValueType10599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleValueType10616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleValueType10633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleCombineOperator10678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleCombineOperator10695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCombineOperator10712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_92_in_ruleCombineOperator10729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleCombineOperator10746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleCombineOperator10763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleCombineOperator10780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleCombineOperator10797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred4_InternalSct335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_synpred5_InternalSct243 = new BitSet(new long[]{0x0040000000010400L});
        public static final BitSet FOLLOW_16_in_synpred5_InternalSct256 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred5_InternalSct273 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred5_InternalSct296 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred5_InternalSct314 = new BitSet(new long[]{0x004003E000010402L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred5_InternalSct335 = new BitSet(new long[]{0x004003E000010402L,0x0000000007F00000L});
        public static final BitSet FOLLOW_ruleState_in_synpred6_InternalSct359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred10_InternalSct556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_synpred11_InternalSct578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred19_InternalSct940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred22_InternalSct991 = new BitSet(new long[]{0x0040000000010402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred22_InternalSct1012 = new BitSet(new long[]{0x0040000000010402L});
        public static final BitSet FOLLOW_ruleDeclaration_in_synpred36_InternalSct1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred39_InternalSct1948 = new BitSet(new long[]{0x0040000000010402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred39_InternalSct1969 = new BitSet(new long[]{0x0040000000010402L});
        public static final BitSet FOLLOW_ruleTransition_in_synpred41_InternalSct2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred51_InternalSct2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_synpred57_InternalSct2480 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred57_InternalSct2497 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred57_InternalSct2524 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_34_in_synpred57_InternalSct2543 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_synpred57_InternalSct2559 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_36_in_synpred57_InternalSct2577 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred57_InternalSct2599 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_synpred57_InternalSct2612 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred57_InternalSct2633 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_32_in_synpred59_InternalSct2396 = new BitSet(new long[]{0x0000001E00000022L,0x000000000000000EL});
        public static final BitSet FOLLOW_33_in_synpred59_InternalSct2428 = new BitSet(new long[]{0x0000001C00000022L,0x000000000000000EL});
        public static final BitSet FOLLOW_ruleHistoryType_in_synpred59_InternalSct2463 = new BitSet(new long[]{0x0000001C00000022L});
        public static final BitSet FOLLOW_34_in_synpred59_InternalSct2480 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred59_InternalSct2497 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred59_InternalSct2524 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_34_in_synpred59_InternalSct2543 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_35_in_synpred59_InternalSct2559 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_36_in_synpred59_InternalSct2577 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred59_InternalSct2599 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_synpred59_InternalSct2612 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred59_InternalSct2633 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred59_InternalSct2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred88_InternalSct4807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_synpred91_InternalSct5061 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleLogicalOrOperator_in_synpred91_InternalSct5080 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_synpred91_InternalSct5104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040800L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred94_InternalSct5291 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003F0L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred94_InternalSct5324 = new BitSet(new long[]{0x00100000000003D0L,0x000000000002A400L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred94_InternalSct5345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred95_InternalSct5473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_synpred108_InternalSct7024 = new BitSet(new long[]{0x00100000000003D0L,0x0000000000028400L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred108_InternalSct7049 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_synpred108_InternalSct7060 = new BitSet(new long[]{0x0000000000000002L});
    }


}