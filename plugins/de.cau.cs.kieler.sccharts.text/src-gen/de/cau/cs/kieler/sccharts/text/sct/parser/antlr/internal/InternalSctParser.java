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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'scchart'", "'@'", "'['", "','", "']'", "'{'", "'}'", "'initial'", "'final'", "'state'", "';'", "'immediate'", "'history'", "'with'", "'/'", "'input'", "'output'", "'static'", "'signal'", "'='", "'combine'", "'entry'", "'during'", "'exit'", "'suspend'", "'('", "')'", "'import'", "'.'", "'normal'", "'connector'", "'reference'", "'textual'", "'-->'", "'o->'", "'>->'", "'=='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'|'", "'&'", "'!'", "'+'", "'-'", "'*'", "'mod'", "'val'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'double'", "'string'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=9;
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
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int RULE_NUMBER=12;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=10;
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
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
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
    public static final int RULE_WS=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
        	return "RootRegion";	
       	}
       	
       	@Override
       	protected SctGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRootRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:74:1: entryRuleRootRegion returns [EObject current=null] : iv_ruleRootRegion= ruleRootRegion EOF ;
    public final EObject entryRuleRootRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootRegion = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:75:2: (iv_ruleRootRegion= ruleRootRegion EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:76:2: iv_ruleRootRegion= ruleRootRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRootRegion_in_entryRuleRootRegion81);
            iv_ruleRootRegion=ruleRootRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRootRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootRegion91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootRegion"


    // $ANTLR start "ruleRootRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:83:1: ruleRootRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleImportAnnotation ) )* ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleSCChart ) )* ) ;
    public final EObject ruleRootRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_2_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_bodyText_8_0 = null;

        EObject lv_states_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:86:28: ( ( () ( (lv_annotations_1_0= ruleImportAnnotation ) )* ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleSCChart ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:87:1: ( () ( (lv_annotations_1_0= ruleImportAnnotation ) )* ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleSCChart ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:87:1: ( () ( (lv_annotations_1_0= ruleImportAnnotation ) )* ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleSCChart ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:87:2: () ( (lv_annotations_1_0= ruleImportAnnotation ) )* ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleSCChart ) )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:87:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRootRegionAccess().getRegionAction_0(),
                          current);
                  
            }

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:96:2: ( (lv_annotations_1_0= ruleImportAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==45) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:97:1: (lv_annotations_1_0= ruleImportAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:97:1: (lv_annotations_1_0= ruleImportAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:98:3: lv_annotations_1_0= ruleImportAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsImportAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportAnnotation_in_ruleRootRegion149);
            	    lv_annotations_1_0=ruleImportAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"ImportAnnotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:114:3: ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:114:4: ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:114:4: ( (lv_annotations_2_0= ruleAnnotation ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:115:1: (lv_annotations_2_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:115:1: (lv_annotations_2_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:116:3: lv_annotations_2_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsAnnotationParserRuleCall_2_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleRootRegion172);
                    	    lv_annotations_2_0=ruleAnnotation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRootRegionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotations",
                    	              		lv_annotations_2_0, 
                    	              		"Annotation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRootRegion185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getRootRegionAccess().getRegionKeyword_2_1());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:136:1: ( (lv_id_4_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:137:1: (lv_id_4_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:137:1: (lv_id_4_0= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:138:3: lv_id_4_0= RULE_ID
                    {
                    lv_id_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRootRegion202); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_4_0, grammarAccess.getRootRegionAccess().getIdIDTerminalRuleCall_2_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRootRegionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_4_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:154:2: ( (lv_label_5_0= RULE_STRING ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_STRING) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:155:1: (lv_label_5_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:155:1: (lv_label_5_0= RULE_STRING )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:156:3: lv_label_5_0= RULE_STRING
                            {
                            lv_label_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRootRegion224); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_label_5_0, grammarAccess.getRootRegionAccess().getLabelSTRINGTerminalRuleCall_2_3_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRootRegionRule());
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

                    otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRootRegion242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRootRegionAccess().getColonKeyword_2_4());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:176:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )*
                    loop4:
                    do {
                        int alt4=2;
                        alt4 = dfa4.predict(input);
                        switch (alt4) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: (lv_valuedObjects_7_0= ruleValuedObject )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: (lv_valuedObjects_7_0= ruleValuedObject )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:178:3: lv_valuedObjects_7_0= ruleValuedObject
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getValuedObjectsValuedObjectParserRuleCall_2_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleRootRegion263);
                    	    lv_valuedObjects_7_0=ruleValuedObject();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRootRegionRule());
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
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:194:3: ( (lv_bodyText_8_0= ruleTextualCode ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_HOSTCODE) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:195:1: (lv_bodyText_8_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:195:1: (lv_bodyText_8_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:196:3: lv_bodyText_8_0= ruleTextualCode
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getBodyTextTextualCodeParserRuleCall_2_6_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleRootRegion285);
                    	    lv_bodyText_8_0=ruleTextualCode();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRootRegionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"bodyText",
                    	              		lv_bodyText_8_0, 
                    	              		"TextualCode");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:212:5: ( (lv_states_9_0= ruleSCChart ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT_ANNOTATION||(LA7_0>=18 && LA7_0<=19)||(LA7_0>=47 && LA7_0<=50)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:213:1: (lv_states_9_0= ruleSCChart )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:213:1: (lv_states_9_0= ruleSCChart )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:214:3: lv_states_9_0= ruleSCChart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getStatesSCChartParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSCChart_in_ruleRootRegion309);
            	    lv_states_9_0=ruleSCChart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRootRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"states",
            	              		lv_states_9_0, 
            	              		"SCChart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleRootRegion"


    // $ANTLR start "entryRuleSingleRegion"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:238:1: entryRuleSingleRegion returns [EObject current=null] : iv_ruleSingleRegion= ruleSingleRegion EOF ;
    public final EObject entryRuleSingleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRegion = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:239:2: (iv_ruleSingleRegion= ruleSingleRegion EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:240:2: iv_ruleSingleRegion= ruleSingleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSingleRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion346);
            iv_ruleSingleRegion=ruleSingleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSingleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRegion356); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:247:1: ruleSingleRegion returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* ) ;
    public final EObject ruleSingleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_valuedObjects_6_0 = null;

        EObject lv_bodyText_7_0 = null;

        EObject lv_states_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:250:28: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:251:1: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:251:1: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:251:2: () ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:251:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:252:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:260:2: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:260:3: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )*
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:260:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==19) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:261:1: (lv_annotations_1_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:261:1: (lv_annotations_1_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:262:3: lv_annotations_1_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleSingleRegion415);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleRegion428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSingleRegionAccess().getRegionKeyword_1_1());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:282:1: ( (lv_id_3_0= RULE_ID ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:283:1: (lv_id_3_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:283:1: (lv_id_3_0= RULE_ID )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:284:3: lv_id_3_0= RULE_ID
                            {
                            lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRegion445); if (state.failed) return current;
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:300:3: ( (lv_label_4_0= RULE_STRING ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_STRING) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:301:1: (lv_label_4_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:301:1: (lv_label_4_0= RULE_STRING )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:302:3: lv_label_4_0= RULE_STRING
                            {
                            lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingleRegion468); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSingleRegion486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSingleRegionAccess().getColonKeyword_1_4());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:322:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )*
                    loop11:
                    do {
                        int alt11=2;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: (lv_valuedObjects_6_0= ruleValuedObject )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: (lv_valuedObjects_6_0= ruleValuedObject )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:324:3: lv_valuedObjects_6_0= ruleValuedObject
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getValuedObjectsValuedObjectParserRuleCall_1_5_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleSingleRegion507);
                    	    lv_valuedObjects_6_0=ruleValuedObject();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSingleRegionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"valuedObjects",
                    	              		lv_valuedObjects_6_0, 
                    	              		"ValuedObject");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:340:3: ( (lv_bodyText_7_0= ruleTextualCode ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_HOSTCODE) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:341:1: (lv_bodyText_7_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:341:1: (lv_bodyText_7_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:342:3: lv_bodyText_7_0= ruleTextualCode
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getBodyTextTextualCodeParserRuleCall_1_6_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleSingleRegion529);
                    	    lv_bodyText_7_0=ruleTextualCode();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSingleRegionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"bodyText",
                    	              		lv_bodyText_7_0, 
                    	              		"TextualCode");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:358:5: ( (lv_states_8_0= ruleState ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:359:1: (lv_states_8_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:359:1: (lv_states_8_0= ruleState )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:360:3: lv_states_8_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getStatesStateParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleSingleRegion553);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSingleRegionRule());
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
            	    break loop14;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:384:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:385:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:386:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRegion_in_entryRuleRegion590);
            iv_ruleRegion=ruleRegion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegion600); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:393:1: ruleRegion returns [EObject current=null] : ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_valuedObjects_6_0 = null;

        EObject lv_bodyText_7_0 = null;

        EObject lv_states_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:396:28: ( ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:397:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:397:1: ( () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:397:2: () ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:397:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:398:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:406:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMENT_ANNOTATION||LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:407:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:407:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:408:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleRegion658);
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
            	    break loop15;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRegion671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getRegionKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:428:1: ( (lv_id_3_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:429:1: (lv_id_3_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:429:1: (lv_id_3_0= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:430:3: lv_id_3_0= RULE_ID
                    {
                    lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRegion688); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:446:3: ( (lv_label_4_0= RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:447:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:447:1: (lv_label_4_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:448:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRegion711); if (state.failed) return current;
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

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRegion729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRegionAccess().getColonKeyword_5());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:468:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:469:1: (lv_valuedObjects_6_0= ruleValuedObject )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:469:1: (lv_valuedObjects_6_0= ruleValuedObject )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:470:3: lv_valuedObjects_6_0= ruleValuedObject
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleRegion750);
            	    lv_valuedObjects_6_0=ruleValuedObject();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"valuedObjects",
            	              		lv_valuedObjects_6_0, 
            	              		"ValuedObject");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:486:3: ( (lv_bodyText_7_0= ruleTextualCode ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_HOSTCODE) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:487:1: (lv_bodyText_7_0= ruleTextualCode )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:487:1: (lv_bodyText_7_0= ruleTextualCode )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:488:3: lv_bodyText_7_0= ruleTextualCode
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getBodyTextTextualCodeParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleRegion772);
            	    lv_bodyText_7_0=ruleTextualCode();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRegionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"bodyText",
            	              		lv_bodyText_7_0, 
            	              		"TextualCode");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:504:3: ( (lv_states_8_0= ruleState ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:505:1: (lv_states_8_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:505:1: (lv_states_8_0= ruleState )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:506:3: lv_states_8_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRegion794);
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
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:530:1: entryRuleSCChart returns [EObject current=null] : iv_ruleSCChart= ruleSCChart EOF ;
    public final EObject entryRuleSCChart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSCChart = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:531:2: (iv_ruleSCChart= ruleSCChart EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:532:2: iv_ruleSCChart= ruleSCChart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSCChartRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSCChart_in_entryRuleSCChart831);
            iv_ruleSCChart=ruleSCChart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSCChart; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSCChart841); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:539:1: ruleSCChart returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleStateType ) )? otherlv_2= 'scchart' ( (lv_id_3_0= RULE_ID ) ) ( (lv_label_4_0= RULE_STRING ) )? ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) | (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? ) ;
    public final EObject ruleSCChart() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_18=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_renamings_8_0 = null;

        EObject lv_renamings_10_0 = null;

        EObject lv_valuedObjects_13_0 = null;

        EObject lv_localActions_14_0 = null;

        EObject lv_bodyText_15_0 = null;

        EObject lv_regions_16_0 = null;

        EObject lv_regions_17_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:542:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleStateType ) )? otherlv_2= 'scchart' ( (lv_id_3_0= RULE_ID ) ) ( (lv_label_4_0= RULE_STRING ) )? ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) | (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleStateType ) )? otherlv_2= 'scchart' ( (lv_id_3_0= RULE_ID ) ) ( (lv_label_4_0= RULE_STRING ) )? ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) | (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleStateType ) )? otherlv_2= 'scchart' ( (lv_id_3_0= RULE_ID ) ) ( (lv_label_4_0= RULE_STRING ) )? ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) | (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleStateType ) )? otherlv_2= 'scchart' ( (lv_id_3_0= RULE_ID ) ) ( (lv_label_4_0= RULE_STRING ) )? ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) | (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:543:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMENT_ANNOTATION||LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:544:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:544:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:545:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleSCChart887);
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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:561:3: ( (lv_type_1_0= ruleStateType ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=47 && LA22_0<=50)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:562:1: (lv_type_1_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:562:1: (lv_type_1_0= ruleStateType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:563:3: lv_type_1_0= ruleStateType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSCChartAccess().getTypeStateTypeEnumRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleSCChart909);
                    lv_type_1_0=ruleStateType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"StateType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSCChart922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSCChartAccess().getScchartKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:583:1: ( (lv_id_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:584:1: (lv_id_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:584:1: (lv_id_3_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:585:3: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSCChart939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_3_0, grammarAccess.getSCChartAccess().getIdIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSCChartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:601:2: ( (lv_label_4_0= RULE_STRING ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:602:1: (lv_label_4_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:602:1: (lv_label_4_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:603:3: lv_label_4_0= RULE_STRING
                    {
                    lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSCChart961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_4_0, grammarAccess.getSCChartAccess().getLabelSTRINGTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:3: ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) | (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_ID) ) {
                    int LA30_4 = input.LA(3);

                    if ( (synpred26_InternalSct()) ) {
                        alt30=1;
                    }
                }
            }
            else if ( (LA30_0==23) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:4: (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:4: (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:6: otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )?
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSCChart981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getSCChartAccess().getCommercialAtKeyword_5_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:623:1: ( (otherlv_6= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:624:1: (otherlv_6= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:624:1: (otherlv_6= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:625:3: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSCChartRule());
                      	        }
                              
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSCChart1005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_6, grammarAccess.getSCChartAccess().getBodyReferenceStateCrossReference_5_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:639:2: (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==20) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:639:4: otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']'
                            {
                            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSCChart1018); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getSCChartAccess().getLeftSquareBracketKeyword_5_0_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:643:1: ( (lv_renamings_8_0= ruleSubstitution ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:644:1: (lv_renamings_8_0= ruleSubstitution )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:644:1: (lv_renamings_8_0= ruleSubstitution )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:645:3: lv_renamings_8_0= ruleSubstitution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getRenamingsSubstitutionParserRuleCall_5_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleSCChart1039);
                            lv_renamings_8_0=ruleSubstitution();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"renamings",
                                      		lv_renamings_8_0, 
                                      		"Substitution");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:661:2: (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==21) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:661:4: otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) )
                            	    {
                            	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSCChart1052); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getSCChartAccess().getCommaKeyword_5_0_2_2_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:665:1: ( (lv_renamings_10_0= ruleSubstitution ) )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:666:1: (lv_renamings_10_0= ruleSubstitution )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:666:1: (lv_renamings_10_0= ruleSubstitution )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:667:3: lv_renamings_10_0= ruleSubstitution
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRenamingsSubstitutionParserRuleCall_5_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleSCChart1073);
                            	    lv_renamings_10_0=ruleSubstitution();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"renamings",
                            	              		lv_renamings_10_0, 
                            	              		"Substitution");
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

                            otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSCChart1087); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getSCChartAccess().getRightSquareBracketKeyword_5_0_2_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:688:6: (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:688:6: (otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:688:8: otherlv_12= '{' ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? ) otherlv_18= '}'
                    {
                    otherlv_12=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSCChart1109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSCChartAccess().getLeftCurlyBracketKeyword_5_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:1: ( ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:2: ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )* ( (lv_bodyText_15_0= ruleTextualCode ) )* ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:2: ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        alt26 = dfa26.predict(input);
                        switch (alt26) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:3: ( (lv_valuedObjects_13_0= ruleValuedObject ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:3: ( (lv_valuedObjects_13_0= ruleValuedObject ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_valuedObjects_13_0= ruleValuedObject )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_valuedObjects_13_0= ruleValuedObject )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:694:3: lv_valuedObjects_13_0= ruleValuedObject
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getValuedObjectsValuedObjectParserRuleCall_5_1_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleSCChart1132);
                    	    lv_valuedObjects_13_0=ruleValuedObject();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"valuedObjects",
                    	              		lv_valuedObjects_13_0, 
                    	              		"ValuedObject");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:6: ( (lv_localActions_14_0= ruleLocalAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:711:6: ( (lv_localActions_14_0= ruleLocalAction ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:712:1: (lv_localActions_14_0= ruleLocalAction )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:712:1: (lv_localActions_14_0= ruleLocalAction )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:713:3: lv_localActions_14_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getLocalActionsLocalActionParserRuleCall_5_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_ruleSCChart1159);
                    	    lv_localActions_14_0=ruleLocalAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"localActions",
                    	              		lv_localActions_14_0, 
                    	              		"LocalAction");
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:729:4: ( (lv_bodyText_15_0= ruleTextualCode ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_HOSTCODE) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:730:1: (lv_bodyText_15_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:730:1: (lv_bodyText_15_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:731:3: lv_bodyText_15_0= ruleTextualCode
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSCChartAccess().getBodyTextTextualCodeParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleSCChart1182);
                    	    lv_bodyText_15_0=ruleTextualCode();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSCChartRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"bodyText",
                    	              		lv_bodyText_15_0, 
                    	              		"TextualCode");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:747:3: ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==16||LA29_0==19||(LA29_0>=25 && LA29_0<=27)||(LA29_0>=47 && LA29_0<=50)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==24) ) {
                        int LA29_2 = input.LA(2);

                        if ( (synpred31_InternalSct()) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:747:4: ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:747:4: ( (lv_regions_16_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:748:1: (lv_regions_16_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:748:1: (lv_regions_16_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:749:3: lv_regions_16_0= ruleSingleRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleRegionParserRuleCall_5_1_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleSCChart1205);
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

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:765:2: ( (lv_regions_17_0= ruleRegion ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==16||LA28_0==19) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:766:1: (lv_regions_17_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:766:1: (lv_regions_17_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:767:3: lv_regions_17_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_5_1_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleSCChart1226);
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
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }

                    otherlv_18=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSCChart1242); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getSCChartAccess().getRightCurlyBracketKeyword_5_1_2());
                          
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


    // $ANTLR start "entryRuleState"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:795:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:796:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:797:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1281);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1291); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:804:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) | (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' ) )? ( (lv_outgoingTransitions_23_0= ruleTransition ) )* otherlv_24= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_isFinal_3_0=null;
        Token lv_isInitial_4_0=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token lv_label_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_renamings_12_0 = null;

        EObject lv_renamings_14_0 = null;

        EObject lv_valuedObjects_17_0 = null;

        EObject lv_localActions_18_0 = null;

        EObject lv_bodyText_19_0 = null;

        EObject lv_regions_20_0 = null;

        EObject lv_regions_21_0 = null;

        EObject lv_outgoingTransitions_23_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:807:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) | (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' ) )? ( (lv_outgoingTransitions_23_0= ruleTransition ) )* otherlv_24= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:808:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) | (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' ) )? ( (lv_outgoingTransitions_23_0= ruleTransition ) )* otherlv_24= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:808:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) | (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' ) )? ( (lv_outgoingTransitions_23_0= ruleTransition ) )* otherlv_24= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:808:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? otherlv_6= 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) | (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' ) )? ( (lv_outgoingTransitions_23_0= ruleTransition ) )* otherlv_24= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:808:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMENT_ANNOTATION||LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:809:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:809:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:810:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleState1337);
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
            	    break loop31;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:826:3: ( ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? ) )?
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) ) {
                alt34=1;
            }
            else if ( (LA34_0==26) ) {
                alt34=2;
            }
            switch (alt34) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:826:4: ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:826:4: ( ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:826:5: ( (lv_isInitial_1_0= 'initial' ) ) ( (lv_isFinal_2_0= 'final' ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:826:5: ( (lv_isInitial_1_0= 'initial' ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:827:1: (lv_isInitial_1_0= 'initial' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:827:1: (lv_isInitial_1_0= 'initial' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:828:3: lv_isInitial_1_0= 'initial'
                    {
                    lv_isInitial_1_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isInitial_1_0, grammarAccess.getStateAccess().getIsInitialInitialKeyword_1_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(current, "isInitial", true, "initial");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:841:2: ( (lv_isFinal_2_0= 'final' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==26) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:842:1: (lv_isFinal_2_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:842:1: (lv_isFinal_2_0= 'final' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:843:3: lv_isFinal_2_0= 'final'
                            {
                            lv_isFinal_2_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleState1389); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isFinal_2_0, grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStateRule());
                              	        }
                                     		setWithLastConsumed(current, "isFinal", true, "final");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:857:6: ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:857:6: ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:857:7: ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'initial' ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:857:7: ( (lv_isFinal_3_0= 'final' ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:858:1: (lv_isFinal_3_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:858:1: (lv_isFinal_3_0= 'final' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:859:3: lv_isFinal_3_0= 'final'
                    {
                    lv_isFinal_3_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleState1429); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isFinal_3_0, grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(current, "isFinal", true, "final");
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:872:2: ( (lv_isInitial_4_0= 'initial' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==25) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:873:1: (lv_isInitial_4_0= 'initial' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:873:1: (lv_isInitial_4_0= 'initial' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:874:3: lv_isInitial_4_0= 'initial'
                            {
                            lv_isInitial_4_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleState1460); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isInitial_4_0, grammarAccess.getStateAccess().getIsInitialInitialKeyword_1_1_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getStateRule());
                              	        }
                                     		setWithLastConsumed(current, "isInitial", true, "initial");
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:887:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=47 && LA35_0<=50)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:888:1: (lv_type_5_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:888:1: (lv_type_5_0= ruleStateType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:889:3: lv_type_5_0= ruleStateType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleState1498);
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

            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleState1511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getStateKeyword_3());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:909:1: ( (lv_id_7_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:910:1: (lv_id_7_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:910:1: (lv_id_7_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:911:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1528); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:927:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:928:1: (lv_label_8_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:928:1: (lv_label_8_0= RULE_STRING )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:929:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleState1550); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:3: ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) | (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' ) )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_ID) ) {
                    int LA43_4 = input.LA(3);

                    if ( (synpred42_InternalSct()) ) {
                        alt43=1;
                    }
                }
            }
            else if ( (LA43_0==23) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:4: (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:4: (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:6: otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )?
                    {
                    otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleState1570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getCommercialAtKeyword_6_0_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:1: ( (otherlv_10= RULE_ID ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (otherlv_10= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (otherlv_10= RULE_ID )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:951:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getStateAccess().getBodyReferenceStateCrossReference_6_0_1_0()); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:965:2: (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==20) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:965:4: otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']'
                            {
                            otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleState1607); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getLeftSquareBracketKeyword_6_0_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:969:1: ( (lv_renamings_12_0= ruleSubstitution ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:970:1: (lv_renamings_12_0= ruleSubstitution )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:970:1: (lv_renamings_12_0= ruleSubstitution )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:971:3: lv_renamings_12_0= ruleSubstitution
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleState1628);
                            lv_renamings_12_0=ruleSubstitution();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getStateRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"renamings",
                                      		lv_renamings_12_0, 
                                      		"Substitution");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:987:2: (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==21) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:987:4: otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) )
                            	    {
                            	    otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleState1641); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0());
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:991:1: ( (lv_renamings_14_0= ruleSubstitution ) )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:992:1: (lv_renamings_14_0= ruleSubstitution )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:992:1: (lv_renamings_14_0= ruleSubstitution )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:993:3: lv_renamings_14_0= ruleSubstitution
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleState1662);
                            	    lv_renamings_14_0=ruleSubstitution();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"renamings",
                            	              		lv_renamings_14_0, 
                            	              		"Substitution");
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

                            otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleState1676); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightSquareBracketKeyword_6_0_2_3());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1014:6: (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1014:6: (otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1014:8: otherlv_16= '{' ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? ) otherlv_22= '}'
                    {
                    otherlv_16=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleState1698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:1: ( ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:2: ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )* ( (lv_bodyText_19_0= ruleTextualCode ) )* ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:2: ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )*
                    loop39:
                    do {
                        int alt39=3;
                        alt39 = dfa39.predict(input);
                        switch (alt39) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:3: ( (lv_valuedObjects_17_0= ruleValuedObject ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:3: ( (lv_valuedObjects_17_0= ruleValuedObject ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1019:1: (lv_valuedObjects_17_0= ruleValuedObject )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1019:1: (lv_valuedObjects_17_0= ruleValuedObject )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1020:3: lv_valuedObjects_17_0= ruleValuedObject
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_1_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_ruleState1721);
                    	    lv_valuedObjects_17_0=ruleValuedObject();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"valuedObjects",
                    	              		lv_valuedObjects_17_0, 
                    	              		"ValuedObject");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1037:6: ( (lv_localActions_18_0= ruleLocalAction ) )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1037:6: ( (lv_localActions_18_0= ruleLocalAction ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1038:1: (lv_localActions_18_0= ruleLocalAction )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1038:1: (lv_localActions_18_0= ruleLocalAction )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1039:3: lv_localActions_18_0= ruleLocalAction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getLocalActionsLocalActionParserRuleCall_6_1_1_0_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_ruleState1748);
                    	    lv_localActions_18_0=ruleLocalAction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"localActions",
                    	              		lv_localActions_18_0, 
                    	              		"LocalAction");
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1055:4: ( (lv_bodyText_19_0= ruleTextualCode ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==RULE_HOSTCODE) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1056:1: (lv_bodyText_19_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1056:1: (lv_bodyText_19_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1057:3: lv_bodyText_19_0= ruleTextualCode
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getBodyTextTextualCodeParserRuleCall_6_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleState1771);
                    	    lv_bodyText_19_0=ruleTextualCode();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"bodyText",
                    	              		lv_bodyText_19_0, 
                    	              		"TextualCode");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:3: ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_COMMENT_ANNOTATION||LA42_0==16||LA42_0==19||(LA42_0>=25 && LA42_0<=27)||(LA42_0>=47 && LA42_0<=50)) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==24) ) {
                        int LA42_2 = input.LA(2);

                        if ( (synpred47_InternalSct()) ) {
                            alt42=1;
                        }
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:4: ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:4: ( (lv_regions_20_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1074:1: (lv_regions_20_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1074:1: (lv_regions_20_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1075:3: lv_regions_20_0= ruleSingleRegion
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_2_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleState1794);
                            lv_regions_20_0=ruleSingleRegion();

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
                                      		"SingleRegion");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1091:2: ( (lv_regions_21_0= ruleRegion ) )*
                            loop41:
                            do {
                                int alt41=2;
                                int LA41_0 = input.LA(1);

                                if ( (LA41_0==RULE_COMMENT_ANNOTATION||LA41_0==16||LA41_0==19) ) {
                                    alt41=1;
                                }


                                switch (alt41) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1092:1: (lv_regions_21_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1092:1: (lv_regions_21_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1093:3: lv_regions_21_0= ruleRegion
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleState1815);
                            	    lv_regions_21_0=ruleRegion();

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
                            	              		"Region");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop41;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }

                    otherlv_22=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleState1831); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1113:4: ( (lv_outgoingTransitions_23_0= ruleTransition ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_COMMENT_ANNOTATION||LA44_0==19||(LA44_0>=51 && LA44_0<=53)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1114:1: (lv_outgoingTransitions_23_0= ruleTransition )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1114:1: (lv_outgoingTransitions_23_0= ruleTransition )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1115:3: lv_outgoingTransitions_23_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState1855);
            	    lv_outgoingTransitions_23_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"outgoingTransitions",
            	              		lv_outgoingTransitions_23_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_24=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleState1868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_24, grammarAccess.getStateAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1143:1: entryRuleLocalAction returns [EObject current=null] : iv_ruleLocalAction= ruleLocalAction EOF ;
    public final EObject entryRuleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1144:2: (iv_ruleLocalAction= ruleLocalAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1145:2: iv_ruleLocalAction= ruleLocalAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocalAction_in_entryRuleLocalAction1904);
            iv_ruleLocalAction=ruleLocalAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalAction1914); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1152:1: ruleLocalAction returns [EObject current=null] : (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction ) ;
    public final EObject ruleLocalAction() throws RecognitionException {
        EObject current = null;

        EObject this_EntryAction_0 = null;

        EObject this_DuringAction_1 = null;

        EObject this_ExitAction_2 = null;

        EObject this_SuspendAction_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1155:28: ( (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1156:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1156:1: (this_EntryAction_0= ruleEntryAction | this_DuringAction_1= ruleDuringAction | this_ExitAction_2= ruleExitAction | this_SuspendAction_3= ruleSuspendAction )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt45=1;
                }
                break;
            case 29:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==40) ) {
                    alt45=2;
                }
                else if ( (LA45_2==42) ) {
                    alt45=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt45=2;
                }
                break;
            case 41:
                {
                alt45=3;
                }
                break;
            case 42:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1157:2: this_EntryAction_0= ruleEntryAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getEntryActionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntryAction_in_ruleLocalAction1964);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1170:2: this_DuringAction_1= ruleDuringAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getDuringActionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDuringAction_in_ruleLocalAction1994);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1183:2: this_ExitAction_2= ruleExitAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getExitActionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExitAction_in_ruleLocalAction2024);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1196:2: this_SuspendAction_3= ruleSuspendAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLocalActionAccess().getSuspendActionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSuspendAction_in_ruleLocalAction2054);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1215:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1216:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1217:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition2089);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition2099); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1224:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_priority_2_0=null;
        Token otherlv_3=null;
        Token lv_isImmediate_4_0=null;
        Token lv_isHistory_5_0=null;
        Token otherlv_6=null;
        Token lv_delay_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_label_13_0=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_trigger_8_0 = null;

        EObject lv_effects_10_0 = null;

        EObject lv_effects_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1227:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1228:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1228:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1228:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( (otherlv_3= RULE_ID ) ) ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1228:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_COMMENT_ANNOTATION||LA46_0==19) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1229:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1229:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1230:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTransition2145);
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
            	    break loop46;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1246:3: ( (lv_type_1_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1247:1: (lv_type_1_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1247:1: (lv_type_1_0= ruleTransitionType )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1248:3: lv_type_1_0= ruleTransitionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionType_in_ruleTransition2167);
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
                      		"TransitionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1264:2: ( (lv_priority_2_0= RULE_INT ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1265:1: (lv_priority_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1265:1: (lv_priority_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1266:3: lv_priority_2_0= RULE_INT
                    {
                    lv_priority_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition2184); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_priority_2_0, grammarAccess.getTransitionAccess().getPriorityINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"priority",
                              		lv_priority_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1282:3: ( (otherlv_3= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1283:1: (otherlv_3= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1283:1: (otherlv_3= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1284:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition2214); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_3_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:2: ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:3: ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )?
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:3: ( (lv_isImmediate_4_0= 'immediate' ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==29) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1299:1: (lv_isImmediate_4_0= 'immediate' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1299:1: (lv_isImmediate_4_0= 'immediate' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1300:3: lv_isImmediate_4_0= 'immediate'
                            {
                            lv_isImmediate_4_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTransition2233); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isImmediate_4_0, grammarAccess.getTransitionAccess().getIsImmediateImmediateKeyword_4_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTransitionRule());
                              	        }
                                     		setWithLastConsumed(current, "isImmediate", true, "immediate");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1313:3: ( (lv_isHistory_5_0= 'history' ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==30) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1314:1: (lv_isHistory_5_0= 'history' )
                            {
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1314:1: (lv_isHistory_5_0= 'history' )
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1315:3: lv_isHistory_5_0= 'history'
                            {
                            lv_isHistory_5_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleTransition2265); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_isHistory_5_0, grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_4_1_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getTransitionRule());
                              	        }
                                     		setWithLastConsumed(current, "isHistory", true, "history");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:3: (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==31) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:5: otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) )
                            {
                            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleTransition2292); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getWithKeyword_4_2_0());
                                  
                            }
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:1: ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) )
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==EOF||LA54_0==RULE_ID||(LA54_0>=RULE_INT && LA54_0<=RULE_COMMENT_ANNOTATION)||LA54_0==19||LA54_0==28||LA54_0==32||LA54_0==43||(LA54_0>=51 && LA54_0<=53)||LA54_0==60||LA54_0==63||LA54_0==65||LA54_0==68) ) {
                                alt54=1;
                            }
                            else if ( (LA54_0==RULE_STRING) ) {
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
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:2: ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:2: ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:3: ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:3: ( (lv_delay_7_0= RULE_INT ) )?
                                    int alt50=2;
                                    alt50 = dfa50.predict(input);
                                    switch (alt50) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: (lv_delay_7_0= RULE_INT )
                                            {
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: (lv_delay_7_0= RULE_INT )
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1334:3: lv_delay_7_0= RULE_INT
                                            {
                                            lv_delay_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition2311); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                              			newLeafNode(lv_delay_7_0, grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_4_2_1_0_0_0()); 
                                              		
                                            }
                                            if ( state.backtracking==0 ) {

                                              	        if (current==null) {
                                              	            current = createModelElement(grammarAccess.getTransitionRule());
                                              	        }
                                                     		setWithLastConsumed(
                                                     			current, 
                                                     			"delay",
                                                      		lv_delay_7_0, 
                                                      		"INT");
                                              	    
                                            }

                                            }


                                            }
                                            break;

                                    }

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:3: ( (lv_trigger_8_0= ruleBoolExpression ) )?
                                    int alt51=2;
                                    int LA51_0 = input.LA(1);

                                    if ( (LA51_0==RULE_ID||(LA51_0>=RULE_INT && LA51_0<=RULE_BOOLEAN)||LA51_0==43||LA51_0==60||LA51_0==63||LA51_0==65||LA51_0==68) ) {
                                        alt51=1;
                                    }
                                    switch (alt51) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1351:1: (lv_trigger_8_0= ruleBoolExpression )
                                            {
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1351:1: (lv_trigger_8_0= ruleBoolExpression )
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1352:3: lv_trigger_8_0= ruleBoolExpression
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_4_2_1_0_1_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleTransition2338);
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
                                                      		"BoolExpression");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }
                                            break;

                                    }

                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1368:3: (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
                                    int alt53=2;
                                    int LA53_0 = input.LA(1);

                                    if ( (LA53_0==32) ) {
                                        alt53=1;
                                    }
                                    switch (alt53) {
                                        case 1 :
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1368:5: otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                                            {
                                            otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTransition2352); if (state.failed) return current;
                                            if ( state.backtracking==0 ) {

                                                  	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getSolidusKeyword_4_2_1_0_2_0());
                                                  
                                            }
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1372:1: ( (lv_effects_10_0= ruleEffect ) )
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1373:1: (lv_effects_10_0= ruleEffect )
                                            {
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1373:1: (lv_effects_10_0= ruleEffect )
                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1374:3: lv_effects_10_0= ruleEffect
                                            {
                                            if ( state.backtracking==0 ) {
                                               
                                              	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0_2_1_0()); 
                                              	    
                                            }
                                            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2373);
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
                                                      		"Effect");
                                              	        afterParserOrEnumRuleCall();
                                              	    
                                            }

                                            }


                                            }

                                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1390:2: (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                                            loop52:
                                            do {
                                                int alt52=2;
                                                int LA52_0 = input.LA(1);

                                                if ( (LA52_0==28) ) {
                                                    int LA52_1 = input.LA(2);

                                                    if ( (LA52_1==RULE_ID||LA52_1==RULE_HOSTCODE) ) {
                                                        alt52=1;
                                                    }


                                                }


                                                switch (alt52) {
                                            	case 1 :
                                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1390:4: otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) )
                                            	    {
                                            	    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTransition2386); if (state.failed) return current;
                                            	    if ( state.backtracking==0 ) {

                                            	          	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getSemicolonKeyword_4_2_1_0_2_2_0());
                                            	          
                                            	    }
                                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1394:1: ( (lv_effects_12_0= ruleEffect ) )
                                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1395:1: (lv_effects_12_0= ruleEffect )
                                            	    {
                                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1395:1: (lv_effects_12_0= ruleEffect )
                                            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1396:3: lv_effects_12_0= ruleEffect
                                            	    {
                                            	    if ( state.backtracking==0 ) {
                                            	       
                                            	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0_2_2_1_0()); 
                                            	      	    
                                            	    }
                                            	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2407);
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
                                            	              		"Effect");
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


                                    }
                                    break;
                                case 2 :
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1413:6: ( (lv_label_13_0= RULE_STRING ) )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1413:6: ( (lv_label_13_0= RULE_STRING ) )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1414:1: (lv_label_13_0= RULE_STRING )
                                    {
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1414:1: (lv_label_13_0= RULE_STRING )
                                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1415:3: lv_label_13_0= RULE_STRING
                                    {
                                    lv_label_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTransition2435); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      			newLeafNode(lv_label_13_0, grammarAccess.getTransitionAccess().getLabelSTRINGTerminalRuleCall_4_2_1_1_0()); 
                                      		
                                    }
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElement(grammarAccess.getTransitionRule());
                                      	        }
                                             		setWithLastConsumed(
                                             			current, 
                                             			"label",
                                              		lv_label_13_0, 
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


    // $ANTLR start "entryRuleValuedObject"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1439:1: entryRuleValuedObject returns [EObject current=null] : iv_ruleValuedObject= ruleValuedObject EOF ;
    public final EObject entryRuleValuedObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObject = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1440:2: (iv_ruleValuedObject= ruleValuedObject EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1441:2: iv_ruleValuedObject= ruleValuedObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_entryRuleValuedObject2481);
            iv_ruleValuedObject=ruleValuedObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObject; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObject2491); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1448:1: ruleValuedObject returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( (lv_isSignal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' ) ;
    public final EObject ruleValuedObject() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_1_0=null;
        Token lv_isOutput_2_0=null;
        Token lv_isStatic_3_0=null;
        Token lv_isSignal_4_0=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_initialValue_8_0 = null;

        Enumerator lv_combineOperator_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1451:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( (lv_isSignal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1452:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( (lv_isSignal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1452:1: ( ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( (lv_isSignal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1452:2: ( (lv_annotations_0_0= ruleAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? ( (lv_isStatic_3_0= 'static' ) )? ( (lv_isSignal_4_0= 'signal' ) )? ( (lv_type_5_0= ruleValueType ) )? ( (lv_name_6_0= RULE_ID ) ) (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )? (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )? otherlv_11= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1452:2: ( (lv_annotations_0_0= ruleAnnotation ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_COMMENT_ANNOTATION||LA57_0==19) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1453:1: (lv_annotations_0_0= ruleAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1453:1: (lv_annotations_0_0= ruleAnnotation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1454:3: lv_annotations_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleValuedObject2537);
            	    lv_annotations_0_0=ruleAnnotation();

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
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1470:3: ( (lv_isInput_1_0= 'input' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==33) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1471:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1471:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1472:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleValuedObject2556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isInput_1_0, grammarAccess.getValuedObjectAccess().getIsInputInputKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "isInput", true, "input");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1485:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==34) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1486:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1486:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1487:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleValuedObject2588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isOutput_2_0, grammarAccess.getValuedObjectAccess().getIsOutputOutputKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "isOutput", true, "output");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1500:3: ( (lv_isStatic_3_0= 'static' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1501:1: (lv_isStatic_3_0= 'static' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1501:1: (lv_isStatic_3_0= 'static' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1502:3: lv_isStatic_3_0= 'static'
                    {
                    lv_isStatic_3_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleValuedObject2620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isStatic_3_0, grammarAccess.getValuedObjectAccess().getIsStaticStaticKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "isStatic", true, "static");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1515:3: ( (lv_isSignal_4_0= 'signal' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==36) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1516:1: (lv_isSignal_4_0= 'signal' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1516:1: (lv_isSignal_4_0= 'signal' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1517:3: lv_isSignal_4_0= 'signal'
                    {
                    lv_isSignal_4_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleValuedObject2652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isSignal_4_0, grammarAccess.getValuedObjectAccess().getIsSignalSignalKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getValuedObjectRule());
                      	        }
                             		setWithLastConsumed(current, "isSignal", true, "signal");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1530:3: ( (lv_type_5_0= ruleValueType ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=69 && LA62_0<=76)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1531:1: (lv_type_5_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1531:1: (lv_type_5_0= ruleValueType )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1532:3: lv_type_5_0= ruleValueType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getTypeValueTypeEnumRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleValuedObject2687);
                    lv_type_5_0=ruleValueType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_5_0, 
                              		"ValueType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1548:3: ( (lv_name_6_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1549:1: (lv_name_6_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1549:1: (lv_name_6_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1550:3: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObject2705); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_6_0, grammarAccess.getValuedObjectAccess().getNameIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1566:2: (otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1566:4: otherlv_7= '=' ( (lv_initialValue_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleValuedObject2723); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValuedObjectAccess().getEqualsSignKeyword_7_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1570:1: ( (lv_initialValue_8_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1571:1: (lv_initialValue_8_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1571:1: (lv_initialValue_8_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1572:3: lv_initialValue_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getInitialValueExpressionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleValuedObject2744);
                    lv_initialValue_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_8_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1588:4: (otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==38) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1588:6: otherlv_9= 'combine' ( (lv_combineOperator_10_0= ruleCombineOperator ) )
                    {
                    otherlv_9=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleValuedObject2759); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getValuedObjectAccess().getCombineKeyword_8_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1592:1: ( (lv_combineOperator_10_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1593:1: (lv_combineOperator_10_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1593:1: (lv_combineOperator_10_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1594:3: lv_combineOperator_10_0= ruleCombineOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectAccess().getCombineOperatorCombineOperatorEnumRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleValuedObject2780);
                    lv_combineOperator_10_0=ruleCombineOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValuedObjectRule());
                      	        }
                             		set(
                             			current, 
                             			"combineOperator",
                              		lv_combineOperator_10_0, 
                              		"CombineOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleValuedObject2794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getValuedObjectAccess().getSemicolonKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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


    // $ANTLR start "entryRuleTextualCode"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1622:1: entryRuleTextualCode returns [EObject current=null] : iv_ruleTextualCode= ruleTextualCode EOF ;
    public final EObject entryRuleTextualCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualCode = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1623:2: (iv_ruleTextualCode= ruleTextualCode EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1624:2: iv_ruleTextualCode= ruleTextualCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextualCodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_entryRuleTextualCode2830);
            iv_ruleTextualCode=ruleTextualCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextualCode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextualCode2840); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextualCode"


    // $ANTLR start "ruleTextualCode"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1631:1: ruleTextualCode returns [EObject current=null] : ( ( (lv_text_0_0= RULE_HOSTCODE ) ) otherlv_1= ';' ) ;
    public final EObject ruleTextualCode() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1634:28: ( ( ( (lv_text_0_0= RULE_HOSTCODE ) ) otherlv_1= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1635:1: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) otherlv_1= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1635:1: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) otherlv_1= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1635:2: ( (lv_text_0_0= RULE_HOSTCODE ) ) otherlv_1= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1635:2: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1636:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1636:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1637:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextualCode2882); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_text_0_0, grammarAccess.getTextualCodeAccess().getTextHOSTCODETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextualCodeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"text",
                      		lv_text_0_0, 
                      		"HOSTCODE");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTextualCode2899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTextualCodeAccess().getSemicolonKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextualCode"


    // $ANTLR start "entryRuleSubstitution"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1665:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1666:2: (iv_ruleSubstitution= ruleSubstitution EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1667:2: iv_ruleSubstitution= ruleSubstitution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstitutionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_entryRuleSubstitution2935);
            iv_ruleSubstitution=ruleSubstitution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstitution; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstitution2945); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubstitution"


    // $ANTLR start "ruleSubstitution"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1674:1: ruleSubstitution returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token otherlv_1=null;
        Token lv_formal_2_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1677:28: ( ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1678:1: ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1678:1: ( ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1678:2: ( (lv_actual_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1678:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1679:1: (lv_actual_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1679:1: (lv_actual_0_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1680:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubstitution2987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_actual_0_0, grammarAccess.getSubstitutionAccess().getActualIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstitutionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"actual",
                      		lv_actual_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSubstitution3004); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubstitutionAccess().getSolidusKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1700:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1701:1: (lv_formal_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1701:1: (lv_formal_2_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1702:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubstitution3021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_formal_2_0, grammarAccess.getSubstitutionAccess().getFormalIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubstitutionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"formal",
                      		lv_formal_2_0, 
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
    // $ANTLR end "ruleSubstitution"


    // $ANTLR start "entryRuleEntryAction"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1726:1: entryRuleEntryAction returns [EObject current=null] : iv_ruleEntryAction= ruleEntryAction EOF ;
    public final EObject entryRuleEntryAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntryAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1727:2: (iv_ruleEntryAction= ruleEntryAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1728:2: iv_ruleEntryAction= ruleEntryAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntryActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntryAction_in_entryRuleEntryAction3062);
            iv_ruleEntryAction=ruleEntryAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntryAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntryAction3072); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1735:1: ruleEntryAction returns [EObject current=null] : ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1738:28: ( ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1739:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1739:1: ( () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1739:2: () otherlv_1= 'entry' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1739:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1740:2: 
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

            otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEntryAction3121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEntryActionAccess().getEntryKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1752:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID||(LA65_0>=RULE_INT && LA65_0<=RULE_BOOLEAN)||LA65_0==43||LA65_0==60||LA65_0==63||LA65_0==65||LA65_0==68) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1753:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1753:1: (lv_trigger_2_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1754:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleEntryAction3142);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1770:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==32) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1770:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEntryAction3156); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEntryActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1774:1: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1775:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1775:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1776:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleEntryAction3177);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1792:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==28) ) {
                            int LA66_1 = input.LA(2);

                            if ( (synpred73_InternalSct()) ) {
                                alt66=1;
                            }


                        }


                        switch (alt66) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1792:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEntryAction3190); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEntryActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1796:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1798:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleEntryAction3211);
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
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEntryAction3227); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1826:1: entryRuleDuringAction returns [EObject current=null] : iv_ruleDuringAction= ruleDuringAction EOF ;
    public final EObject entryRuleDuringAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDuringAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1827:2: (iv_ruleDuringAction= ruleDuringAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1828:2: iv_ruleDuringAction= ruleDuringAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDuringActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDuringAction_in_entryRuleDuringAction3263);
            iv_ruleDuringAction=ruleDuringAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDuringAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDuringAction3273); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1835:1: ruleDuringAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' ) ;
    public final EObject ruleDuringAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1838:28: ( ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1839:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1839:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1839:2: () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'during' ( (lv_trigger_3_0= ruleBoolExpression ) )? (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )? otherlv_8= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1839:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1840:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1848:2: ( (lv_isImmediate_1_0= 'immediate' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==29) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1849:1: (lv_isImmediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1849:1: (lv_isImmediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1850:3: lv_isImmediate_1_0= 'immediate'
                    {
                    lv_isImmediate_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDuringAction3328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_1_0, grammarAccess.getDuringActionAccess().getIsImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDuringActionRule());
                      	        }
                             		setWithLastConsumed(current, "isImmediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDuringAction3354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDuringActionAccess().getDuringKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1867:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID||(LA69_0>=RULE_INT && LA69_0<=RULE_BOOLEAN)||LA69_0==43||LA69_0==60||LA69_0==63||LA69_0==65||LA69_0==68) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1868:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1868:1: (lv_trigger_3_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1869:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleDuringAction3375);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1885:3: (otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==32) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1885:5: otherlv_4= '/' ( (lv_effects_5_0= ruleEffect ) ) (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDuringAction3389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDuringActionAccess().getSolidusKeyword_4_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1889:1: ( (lv_effects_5_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1890:1: (lv_effects_5_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1890:1: (lv_effects_5_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1891:3: lv_effects_5_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleDuringAction3410);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1907:2: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==28) ) {
                            int LA70_1 = input.LA(2);

                            if ( (synpred77_InternalSct()) ) {
                                alt70=1;
                            }


                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1907:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDuringAction3423); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getDuringActionAccess().getSemicolonKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1911:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1912:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1912:1: (lv_effects_7_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1913:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleDuringAction3444);
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
                    	    break loop70;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDuringAction3460); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1941:1: entryRuleExitAction returns [EObject current=null] : iv_ruleExitAction= ruleExitAction EOF ;
    public final EObject entryRuleExitAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExitAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1942:2: (iv_ruleExitAction= ruleExitAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1943:2: iv_ruleExitAction= ruleExitAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExitActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExitAction_in_entryRuleExitAction3496);
            iv_ruleExitAction=ruleExitAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExitAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExitAction3506); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1950:1: ruleExitAction returns [EObject current=null] : ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1953:28: ( ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1954:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1954:1: ( () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1954:2: () otherlv_1= 'exit' ( (lv_trigger_2_0= ruleBoolExpression ) )? (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )? otherlv_7= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1954:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1955:2: 
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

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleExitAction3555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExitActionAccess().getExitKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1967:1: ( (lv_trigger_2_0= ruleBoolExpression ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID||(LA72_0>=RULE_INT && LA72_0<=RULE_BOOLEAN)||LA72_0==43||LA72_0==60||LA72_0==63||LA72_0==65||LA72_0==68) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1968:1: (lv_trigger_2_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1968:1: (lv_trigger_2_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1969:3: lv_trigger_2_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getTriggerBoolExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExitAction3576);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1985:3: (otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )* )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==32) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1985:5: otherlv_3= '/' ( (lv_effects_4_0= ruleEffect ) ) (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleExitAction3590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExitActionAccess().getSolidusKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1989:1: ( (lv_effects_4_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1990:1: (lv_effects_4_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1990:1: (lv_effects_4_0= ruleEffect )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1991:3: lv_effects_4_0= ruleEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleExitAction3611);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2007:2: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )*
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==28) ) {
                            int LA73_1 = input.LA(2);

                            if ( (synpred80_InternalSct()) ) {
                                alt73=1;
                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2007:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
                    	    {
                    	    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExitAction3624); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getExitActionAccess().getSemicolonKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2011:1: ( (lv_effects_6_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2012:1: (lv_effects_6_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2012:1: (lv_effects_6_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2013:3: lv_effects_6_0= ruleEffect
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleExitAction3645);
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

            otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleExitAction3661); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2041:1: entryRuleSuspendAction returns [EObject current=null] : iv_ruleSuspendAction= ruleSuspendAction EOF ;
    public final EObject entryRuleSuspendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspendAction = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2042:2: (iv_ruleSuspendAction= ruleSuspendAction EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2043:2: iv_ruleSuspendAction= ruleSuspendAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuspendActionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSuspendAction_in_entryRuleSuspendAction3697);
            iv_ruleSuspendAction=ruleSuspendAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuspendAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSuspendAction3707); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2050:1: ruleSuspendAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' ( (lv_trigger_3_0= ruleBoolExpression ) )? otherlv_4= ';' ) ;
    public final EObject ruleSuspendAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_trigger_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2053:28: ( ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' ( (lv_trigger_3_0= ruleBoolExpression ) )? otherlv_4= ';' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2054:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' ( (lv_trigger_3_0= ruleBoolExpression ) )? otherlv_4= ';' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2054:1: ( () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' ( (lv_trigger_3_0= ruleBoolExpression ) )? otherlv_4= ';' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2054:2: () ( (lv_isImmediate_1_0= 'immediate' ) )? otherlv_2= 'suspend' ( (lv_trigger_3_0= ruleBoolExpression ) )? otherlv_4= ';'
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2054:2: ()
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2055:2: 
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2063:2: ( (lv_isImmediate_1_0= 'immediate' ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==29) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2064:1: (lv_isImmediate_1_0= 'immediate' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2064:1: (lv_isImmediate_1_0= 'immediate' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2065:3: lv_isImmediate_1_0= 'immediate'
                    {
                    lv_isImmediate_1_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSuspendAction3762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isImmediate_1_0, grammarAccess.getSuspendActionAccess().getIsImmediateImmediateKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getSuspendActionRule());
                      	        }
                             		setWithLastConsumed(current, "isImmediate", true, "immediate");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleSuspendAction3788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSuspendActionAccess().getSuspendKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2082:1: ( (lv_trigger_3_0= ruleBoolExpression ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID||(LA76_0>=RULE_INT && LA76_0<=RULE_BOOLEAN)||LA76_0==43||LA76_0==60||LA76_0==63||LA76_0==65||LA76_0==68) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2083:1: (lv_trigger_3_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2083:1: (lv_trigger_3_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2084:3: lv_trigger_3_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSuspendActionAccess().getTriggerBoolExpressionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleSuspendAction3809);
                    lv_trigger_3_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSuspendActionRule());
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

            otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleSuspendAction3822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSuspendActionAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2112:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2113:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2114:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect3858);
            iv_ruleEffect=ruleEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect3868); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2121:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2124:28: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2125:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2125:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==37) ) {
                    alt77=2;
                }
                else if ( (LA77_1==EOF||LA77_1==RULE_COMMENT_ANNOTATION||LA77_1==19||LA77_1==28||LA77_1==43||(LA77_1>=51 && LA77_1<=53)) ) {
                    alt77=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA77_0==RULE_HOSTCODE) ) {
                alt77=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2126:2: this_Emission_0= ruleEmission
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect3918);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2139:2: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect3948);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2152:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect3978);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2171:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2172:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2173:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmissionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission4013);
            iv_ruleEmission=ruleEmission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission4023); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2180:1: ruleEmission returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_newValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2183:28: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2184:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2184:1: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2184:2: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2184:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2185:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2185:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2186:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEmissionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission4072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getEmissionAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2200:2: (otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==43) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2200:4: otherlv_1= '(' ( (lv_newValue_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleEmission4085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2204:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2205:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2205:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2206:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission4106);
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

                    otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleEmission4118); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2234:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2235:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2236:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment4156);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment4166); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2243:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2246:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2247:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2247:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2247:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2247:2: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2248:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2248:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2249:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment4215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getValuedObjectValuedObjectCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAssignment4227); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2267:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2268:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2268:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2269:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment4248);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2293:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2294:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2295:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextEffectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect4284);
            iv_ruleTextEffect=ruleTextEffect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect4294); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2302:1: ruleTextEffect returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2305:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2306:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2306:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2307:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2307:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2308:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect4335); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2334:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2335:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2336:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression4377);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression4387); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2343:1: ruleExpression returns [EObject current=null] : ( ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression ) | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BoolExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2346:28: ( ( ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression ) | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:1: ( ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression ) | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:1: ( ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression ) | this_ValuedExpression_1= ruleValuedExpression )
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:2: ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:2: ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:3: ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getBoolExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleExpression4443);
                    this_BoolExpression_0=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2361:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression4474);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2380:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2381:2: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2382:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4509);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolExpression4519); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2389:1: ruleBoolExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2392:28: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2394:2: this_OrExpression_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBoolExpressionAccess().getOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBoolExpression4568);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
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


    // $ANTLR start "entryRuleOrExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2413:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2414:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2415:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression4602);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression4612); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2422:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2425:28: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2426:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2426:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2427:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression4662);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2438:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==61) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2438:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2438:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2439:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2447:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2448:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2448:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2449:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrExpression4695);
            	    lv_operator_2_0=ruleOrOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"OrOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2465:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2466:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2466:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2467:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression4716);
            	    lv_subExpressions_3_0=ruleAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subExpressions",
            	              		lv_subExpressions_3_0, 
            	              		"AndExpression");
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


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2491:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2492:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2493:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression4754);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression4764); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2500:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2503:28: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2504:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2504:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2505:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression4814);
            this_CompareOperation_0=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2516:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==62) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2516:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2516:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2517:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2525:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2526:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2526:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2527:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleAndExpression4847);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2543:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2544:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2544:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2545:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression4868);
            	    lv_subExpressions_3_0=ruleCompareOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
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
            	    break loop81;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleCompareOperation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2569:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2570:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2571:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOperationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4906);
            iv_ruleCompareOperation=ruleCompareOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation4916); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2578:1: ruleCompareOperation returns [EObject current=null] : ( ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2581:28: ( ( ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:1: ( ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:1: ( ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt82=2;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:2: ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:2: ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:3: ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:3: ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:4: ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4973);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2594:2: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2594:3: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2594:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2595:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2603:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2604:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2604:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2605:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation5007);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2621:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2622:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2622:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2623:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5028);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2641:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation5061);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2660:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2661:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2662:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOrValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression5096);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression5106); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2669:1: ruleNotOrValuedExpression returns [EObject current=null] : ( ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression ) | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2672:28: ( ( ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression ) | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:1: ( ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression ) | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:1: ( ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression ) | this_NotExpression_1= ruleNotExpression )
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:2: ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:2: ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:3: ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression5162);
                    this_ValuedExpression_0=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2687:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression5193);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2706:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2707:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2708:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression5228);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression5238); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2715:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2718:28: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2719:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2719:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==63) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_ID||LA84_0==RULE_HOSTCODE||LA84_0==RULE_BOOLEAN||LA84_0==43||LA84_0==60||LA84_0==68) ) {
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2719:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2719:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2719:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2719:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2720:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2728:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2729:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2729:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2730:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression5297);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2746:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2747:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2747:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2748:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression5318);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2766:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression5350);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2785:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2786:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2787:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression5385);
            iv_ruleValuedExpression=ruleValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression5395); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2794:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2797:28: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2799:2: this_AddExpression_0= ruleAddExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression5444);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2818:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2819:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2820:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAddExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression5478);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression5488); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2827:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2830:28: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2831:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2831:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2832:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression5538);
            this_SubExpression_0=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2843:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==64) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2843:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2843:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2844:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2852:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2853:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2853:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2854:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression5571);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2870:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2871:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2871:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2872:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression5592);
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
            	    break loop85;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2896:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2897:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2898:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression5630);
            iv_ruleSubExpression=ruleSubExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression5640); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2905:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2908:28: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2909:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2909:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2910:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression5690);
            this_MultExpression_0=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2921:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==65) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2921:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2921:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2922:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2930:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2931:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2931:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2932:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression5723);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2948:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2949:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2949:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2950:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression5744);
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
            	    break loop86;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2974:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2975:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2976:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression5782);
            iv_ruleMultExpression=ruleMultExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression5792); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2983:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2986:28: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2987:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2987:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2988:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression5842);
            this_DivExpression_0=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2999:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==66) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2999:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2999:2: ()
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3000:2: 
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3008:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3009:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3009:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3010:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression5875);
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

            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3026:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3027:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3027:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3028:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression5896);
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
    // $ANTLR end "ruleMultExpression"


    // $ANTLR start "entryRuleDivExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3052:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3053:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3054:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression5934);
            iv_ruleDivExpression=ruleDivExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression5944); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3061:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3064:28: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3065:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3065:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3066:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression5994);
            this_ModExpression_0=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3077:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==17) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3077:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3077:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3078:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3086:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3087:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3087:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3088:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression6027);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3104:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3105:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3105:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3106:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression6048);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3130:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3131:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3132:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression6086);
            iv_ruleModExpression=ruleModExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression6096); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3139:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3142:28: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3143:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3143:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3144:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression6146);
            this_NegExpression_0=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3155:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==67) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3155:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3155:2: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3156:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3164:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3165:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3165:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3166:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression6179);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3182:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3183:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3183:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3184:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression6200);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3208:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3209:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3210:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression6238);
            iv_ruleNegExpression=ruleNegExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression6248); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3217:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3220:28: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3221:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3221:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==65) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_ID||(LA90_0>=RULE_INT && LA90_0<=RULE_BOOLEAN)||LA90_0==43||LA90_0==60||LA90_0==68) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3221:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3221:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3221:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3221:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3222:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3230:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3231:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3231:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3232:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression6307);
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3248:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3249:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3249:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3250:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression6328);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3268:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression6360);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3287:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3288:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3289:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6395);
            iv_ruleAtomicExpression=ruleAtomicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression6405); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3296:1: ruleAtomicExpression returns [EObject current=null] : (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3299:28: ( (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3300:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3300:1: (this_BoolValue_0= ruleBoolValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt91=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt91=1;
                }
                break;
            case RULE_ID:
            case 60:
            case 68:
                {
                alt91=2;
                }
                break;
            case 43:
                {
                alt91=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt91=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3301:2: this_BoolValue_0= ruleBoolValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_ruleAtomicExpression6455);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3314:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression6485);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3326:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3326:6: (otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3326:8: otherlv_2= '(' this_BoolExpression_3= ruleBoolExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAtomicExpression6503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getBoolExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_ruleAtomicExpression6528);
                    this_BoolExpression_3=ruleBoolExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAtomicExpression6539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3348:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression6571);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3367:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3368:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3369:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicValuedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression6606);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression6616); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3376:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_DoubleValue_2 = null;

        EObject this_ValuedExpression_4 = null;

        EObject this_AtomicExpression_6 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3379:28: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3380:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3380:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )
            int alt92=5;
            alt92 = dfa92.predict(input);
            switch (alt92) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3381:2: this_IntValue_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression6666);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3394:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression6696);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3407:2: this_DoubleValue_2= ruleDoubleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getDoubleValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_ruleAtomicValuedExpression6726);
                    this_DoubleValue_2=ruleDoubleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DoubleValue_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:6: ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:6: ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:7: ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:7: ( ( '(' )=>otherlv_3= '(' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:8: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAtomicValuedExpression6752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression6778);
                    this_ValuedExpression_4=ruleValuedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValuedExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleAtomicValuedExpression6789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3442:2: this_AtomicExpression_6= ruleAtomicExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression6821);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3461:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3462:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3463:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectTestExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression6856);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression6866); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3470:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3473:28: ( ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3474:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3474:1: ( ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' ) | this_ValuedObjectReference_5= ruleValuedObjectReference )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==60||LA94_0==68) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ID) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3474:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3474:2: ( () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3474:3: () ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) ) otherlv_2= '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) otherlv_4= ')'
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3474:3: ()
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3475:2: 
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

                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3483:2: ( ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3484:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3484:1: ( (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3485:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3485:1: (lv_operator_1_1= rulePreOperator | lv_operator_1_2= ruleValOperator )
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==60) ) {
                        alt93=1;
                    }
                    else if ( (LA93_0==68) ) {
                        alt93=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3486:3: lv_operator_1_1= rulePreOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression6927);
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
                            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3501:8: lv_operator_1_2= ruleValOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValOperatorEnumRuleCall_0_1_0_1()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression6946);
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

                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleValuedObjectTestExpression6961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3523:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3524:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3524:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3525:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression6982);
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

                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleValuedObjectTestExpression6994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3547:2: this_ValuedObjectReference_5= ruleValuedObjectReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression7026);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3566:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3567:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3568:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuedObjectReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference7061);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference7071); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3575:1: ruleValuedObjectReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3578:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3579:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3579:1: ( (otherlv_0= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3580:1: (otherlv_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3580:1: (otherlv_0= RULE_ID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3581:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getValuedObjectReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference7119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0()); 
              	
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
    // $ANTLR end "ruleValuedObjectReference"


    // $ANTLR start "entryRuleTextExpression"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3603:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3604:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3605:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression7154);
            iv_ruleTextExpression=ruleTextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression7164); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3612:1: ruleTextExpression returns [EObject current=null] : ( (lv_text_0_0= RULE_HOSTCODE ) ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3615:28: ( ( (lv_text_0_0= RULE_HOSTCODE ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3616:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3616:1: ( (lv_text_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3617:1: (lv_text_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3617:1: (lv_text_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3618:3: lv_text_0_0= RULE_HOSTCODE
            {
            lv_text_0_0=(Token)match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7205); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3642:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3643:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3644:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue7245);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue7255); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3651:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3654:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3655:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3655:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3656:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3656:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3657:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue7296); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3681:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3682:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3683:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue7336);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue7346); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3690:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3693:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3694:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3694:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3695:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3695:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3696:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue7387); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3720:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3721:2: (iv_ruleBoolValue= ruleBoolValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3722:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBoolValue_in_entryRuleBoolValue7427);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBoolValue7437); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3729:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3732:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3733:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3733:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3734:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3734:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3735:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBoolValue7478); if (state.failed) return current;
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


    // $ANTLR start "entryRuleDoubleValue"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3759:1: entryRuleDoubleValue returns [EObject current=null] : iv_ruleDoubleValue= ruleDoubleValue EOF ;
    public final EObject entryRuleDoubleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleValue = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3760:2: (iv_ruleDoubleValue= ruleDoubleValue EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3761:2: iv_ruleDoubleValue= ruleDoubleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue7518);
            iv_ruleDoubleValue=ruleDoubleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDoubleValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDoubleValue7528); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleValue"


    // $ANTLR start "ruleDoubleValue"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3768:1: ruleDoubleValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleDoubleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3771:28: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3772:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3772:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3773:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3773:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3774:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleDoubleValue7569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getDoubleValueAccess().getValueFLOATTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDoubleValueRule());
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
    // $ANTLR end "ruleDoubleValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3800:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3801:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3802:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation7611);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation7621); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3809:1: ruleAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3812:28: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3813:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3813:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )
            int alt95=7;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3814:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleAnnotation7671);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3827:2: this_TagAnnotation_1= ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_ruleAnnotation7701);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3840:2: this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation7731);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3853:2: this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation7761);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3866:2: this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation7791);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3879:2: this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation7821);
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3892:2: this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation7851);
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3913:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3914:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3915:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation7888);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation7898); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3922:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3925:28: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3926:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3926:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3927:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3927:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3928:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation7939); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3952:1: entryRuleTagAnnotation returns [EObject current=null] : iv_ruleTagAnnotation= ruleTagAnnotation EOF ;
    public final EObject entryRuleTagAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3953:2: (iv_ruleTagAnnotation= ruleTagAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3954:2: iv_ruleTagAnnotation= ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation7979);
            iv_ruleTagAnnotation=ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTagAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTagAnnotation7989); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3961:1: ruleTagAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) ;
    public final EObject ruleTagAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotations_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3964:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3965:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3965:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3965:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTagAnnotation8026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3969:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3970:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3970:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3971:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTagAnnotation8047);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3987:2: (otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==43) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3987:4: otherlv_2= '(' ( (lv_annotations_3_0= ruleAnnotation ) )* otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTagAnnotation8060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3991:1: ( (lv_annotations_3_0= ruleAnnotation ) )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==RULE_COMMENT_ANNOTATION||LA96_0==19) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3992:1: (lv_annotations_3_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3992:1: (lv_annotations_3_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3993:3: lv_annotations_3_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTagAnnotation8081);
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
                    	    break loop96;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTagAnnotation8094); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4021:1: entryRuleKeyStringValueAnnotation returns [EObject current=null] : iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF ;
    public final EObject entryRuleKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4022:2: (iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4023:2: iv_ruleKeyStringValueAnnotation= ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8132);
            iv_ruleKeyStringValueAnnotation=ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8142); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4030:1: ruleKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4033:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4034:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4034:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4034:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= ruleEString ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKeyStringValueAnnotation8179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4038:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4039:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4039:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4040:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8200);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4056:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4057:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4057:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4058:3: lv_value_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8221);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4074:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==43) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4074:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleKeyStringValueAnnotation8234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4078:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==RULE_COMMENT_ANNOTATION||LA98_0==19) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4079:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4079:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4080:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation8255);
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
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleKeyStringValueAnnotation8268); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4108:1: entryRuleTypedKeyStringValueAnnotation returns [EObject current=null] : iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF ;
    public final EObject entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedKeyStringValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4109:2: (iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4110:2: iv_ruleTypedKeyStringValueAnnotation= ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8306);
            iv_ruleTypedKeyStringValueAnnotation=ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedKeyStringValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8316); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4117:1: ruleTypedKeyStringValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4120:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4121:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4121:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4121:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) otherlv_2= '[' ( (lv_type_3_0= ruleExtendedID ) ) otherlv_4= ']' ( (lv_value_5_0= ruleEString ) ) (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedKeyStringValueAnnotation8353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4125:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4126:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4126:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4127:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8374);
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTypedKeyStringValueAnnotation8386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4147:1: ( (lv_type_3_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4148:1: (lv_type_3_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4148:1: (lv_type_3_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4149:3: lv_type_3_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8407);
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

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleTypedKeyStringValueAnnotation8419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4169:1: ( (lv_value_5_0= ruleEString ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4170:1: (lv_value_5_0= ruleEString )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4170:1: (lv_value_5_0= ruleEString )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4171:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8440);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4187:2: (otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==43) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4187:4: otherlv_6= '(' ( (lv_annotations_7_0= ruleAnnotation ) )* otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTypedKeyStringValueAnnotation8453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4191:1: ( (lv_annotations_7_0= ruleAnnotation ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==RULE_COMMENT_ANNOTATION||LA100_0==19) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4192:1: (lv_annotations_7_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4192:1: (lv_annotations_7_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4193:3: lv_annotations_7_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation8474);
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
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTypedKeyStringValueAnnotation8487); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4221:1: entryRuleKeyBooleanValueAnnotation returns [EObject current=null] : iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF ;
    public final EObject entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyBooleanValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4222:2: (iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4223:2: iv_ruleKeyBooleanValueAnnotation= ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation8525);
            iv_ruleKeyBooleanValueAnnotation=ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyBooleanValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation8535); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4230:1: ruleKeyBooleanValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4233:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4234:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4234:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4234:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_BOOLEAN ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKeyBooleanValueAnnotation8572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4238:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4239:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4239:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4240:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation8593);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4256:2: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4257:1: (lv_value_2_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4257:1: (lv_value_2_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4258:3: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation8610); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4274:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==43) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4274:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleKeyBooleanValueAnnotation8628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4278:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==RULE_COMMENT_ANNOTATION||LA102_0==19) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4279:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4279:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4280:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation8649);
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
                    	    break loop102;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleKeyBooleanValueAnnotation8662); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4308:1: entryRuleKeyIntValueAnnotation returns [EObject current=null] : iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF ;
    public final EObject entryRuleKeyIntValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyIntValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4309:2: (iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4310:2: iv_ruleKeyIntValueAnnotation= ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation8700);
            iv_ruleKeyIntValueAnnotation=ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyIntValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation8710); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4317:1: ruleKeyIntValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4320:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4321:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4321:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4321:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_INT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKeyIntValueAnnotation8747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4325:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4326:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4326:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4327:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation8768);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4343:2: ( (lv_value_2_0= RULE_INT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4344:1: (lv_value_2_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4344:1: (lv_value_2_0= RULE_INT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4345:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation8785); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4361:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==43) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4361:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleKeyIntValueAnnotation8803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4365:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop104:
                    do {
                        int alt104=2;
                        int LA104_0 = input.LA(1);

                        if ( (LA104_0==RULE_COMMENT_ANNOTATION||LA104_0==19) ) {
                            alt104=1;
                        }


                        switch (alt104) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4366:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4366:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4367:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation8824);
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
                    	    break loop104;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleKeyIntValueAnnotation8837); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4395:1: entryRuleKeyFloatValueAnnotation returns [EObject current=null] : iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF ;
    public final EObject entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyFloatValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4396:2: (iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4397:2: iv_ruleKeyFloatValueAnnotation= ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation8875);
            iv_ruleKeyFloatValueAnnotation=ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKeyFloatValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation8885); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4404:1: ruleKeyFloatValueAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4407:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4408:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4408:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )? )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4408:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( (lv_value_2_0= RULE_FLOAT ) ) (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleKeyFloatValueAnnotation8922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4412:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4413:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4413:1: (lv_name_1_0= ruleExtendedID )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4414:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation8943);
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4430:2: ( (lv_value_2_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4431:1: (lv_value_2_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4431:1: (lv_value_2_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4432:3: lv_value_2_0= RULE_FLOAT
            {
            lv_value_2_0=(Token)match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation8960); if (state.failed) return current;
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

            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4448:2: (otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==43) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4448:4: otherlv_3= '(' ( (lv_annotations_4_0= ruleAnnotation ) )* otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleKeyFloatValueAnnotation8978); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4452:1: ( (lv_annotations_4_0= ruleAnnotation ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==RULE_COMMENT_ANNOTATION||LA106_0==19) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4453:1: (lv_annotations_4_0= ruleAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4453:1: (lv_annotations_4_0= ruleAnnotation )
                    	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4454:3: lv_annotations_4_0= ruleAnnotation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation8999);
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
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleKeyFloatValueAnnotation9012); if (state.failed) return current;
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


    // $ANTLR start "entryRuleImportAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4482:1: entryRuleImportAnnotation returns [EObject current=null] : iv_ruleImportAnnotation= ruleImportAnnotation EOF ;
    public final EObject entryRuleImportAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportAnnotation = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4483:2: (iv_ruleImportAnnotation= ruleImportAnnotation EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4484:2: iv_ruleImportAnnotation= ruleImportAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportAnnotation_in_entryRuleImportAnnotation9050);
            iv_ruleImportAnnotation=ruleImportAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportAnnotation9060); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportAnnotation"


    // $ANTLR start "ruleImportAnnotation"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4491:1: ruleImportAnnotation returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4494:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4495:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4495:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4495:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleImportAnnotation9097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAnnotationAccess().getImportKeyword_0());
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4499:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4500:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4500:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4501:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportAnnotation9114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAnnotationAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportAnnotationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
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
    // $ANTLR end "ruleImportAnnotation"


    // $ANTLR start "entryRuleEString"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4525:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4526:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4527:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString9156);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString9167); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4534:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4537:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4538:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4538:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_STRING) ) {
                alt108=1;
            }
            else if ( (LA108_0==RULE_ID) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4538:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString9207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4546:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString9233); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4561:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4562:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4563:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExtendedID_in_entryRuleExtendedID9279);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExtendedID9290); if (state.failed) return current;

            }

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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4570:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4573:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4574:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4574:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4574:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID9330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4581:1: (kw= '.' this_ID_2= RULE_ID )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==46) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4582:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleExtendedID9349); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleExtendedID9364); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop109;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4602:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4604:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4605:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4605:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'connector' ) | (enumLiteral_2= 'reference' ) | (enumLiteral_3= 'textual' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt110=1;
                }
                break;
            case 48:
                {
                alt110=2;
                }
                break;
            case 49:
                {
                alt110=3;
                }
                break;
            case 50:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4605:2: (enumLiteral_0= 'normal' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4605:2: (enumLiteral_0= 'normal' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4605:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleStateType9425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4611:6: (enumLiteral_1= 'connector' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4611:6: (enumLiteral_1= 'connector' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4611:8: enumLiteral_1= 'connector'
                    {
                    enumLiteral_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleStateType9442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getCONNECTOREnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4617:6: (enumLiteral_2= 'reference' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4617:6: (enumLiteral_2= 'reference' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4617:8: enumLiteral_2= 'reference'
                    {
                    enumLiteral_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleStateType9459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4623:6: (enumLiteral_3= 'textual' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4623:6: (enumLiteral_3= 'textual' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4623:8: enumLiteral_3= 'textual'
                    {
                    enumLiteral_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleStateType9476); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4633:1: ruleTransitionType returns [Enumerator current=null] : ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4635:28: ( ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4636:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4636:1: ( (enumLiteral_0= '-->' ) | (enumLiteral_1= 'o->' ) | (enumLiteral_2= '>->' ) )
            int alt111=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt111=1;
                }
                break;
            case 52:
                {
                alt111=2;
                }
                break;
            case 53:
                {
                alt111=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4636:2: (enumLiteral_0= '-->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4636:2: (enumLiteral_0= '-->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4636:4: enumLiteral_0= '-->'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTransitionType9521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4642:6: (enumLiteral_1= 'o->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4642:6: (enumLiteral_1= 'o->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4642:8: enumLiteral_1= 'o->'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTransitionType9538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4648:6: (enumLiteral_2= '>->' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4648:6: (enumLiteral_2= '>->' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4648:8: enumLiteral_2= '>->'
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTransitionType9555); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2()); 
                          
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4658:1: ruleDivOperator returns [Enumerator current=null] : (enumLiteral_0= ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4660:28: ( (enumLiteral_0= ':' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4661:1: (enumLiteral_0= ':' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4661:1: (enumLiteral_0= ':' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4661:3: enumLiteral_0= ':'
            {
            enumLiteral_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleDivOperator9599); if (state.failed) return current;
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


    // $ANTLR start "ruleCompareOperator"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4671:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4673:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4674:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4674:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<>' ) )
            int alt112=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt112=1;
                }
                break;
            case 55:
                {
                alt112=2;
                }
                break;
            case 56:
                {
                alt112=3;
                }
                break;
            case 57:
                {
                alt112=4;
                }
                break;
            case 58:
                {
                alt112=5;
                }
                break;
            case 59:
                {
                alt112=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4674:2: (enumLiteral_0= '==' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4674:2: (enumLiteral_0= '==' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4674:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCompareOperator9643); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4680:6: (enumLiteral_1= '<' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4680:6: (enumLiteral_1= '<' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4680:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleCompareOperator9660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4686:6: (enumLiteral_2= '<=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4686:6: (enumLiteral_2= '<=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4686:8: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleCompareOperator9677); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:6: (enumLiteral_3= '>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:6: (enumLiteral_3= '>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4692:8: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleCompareOperator9694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4698:6: (enumLiteral_4= '>=' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4698:6: (enumLiteral_4= '>=' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4698:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleCompareOperator9711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:6: (enumLiteral_5= '<>' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:6: (enumLiteral_5= '<>' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4704:8: enumLiteral_5= '<>'
                    {
                    enumLiteral_5=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleCompareOperator9728); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4714:1: rulePreOperator returns [Enumerator current=null] : (enumLiteral_0= 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4716:28: ( (enumLiteral_0= 'pre' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:1: (enumLiteral_0= 'pre' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:1: (enumLiteral_0= 'pre' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4717:3: enumLiteral_0= 'pre'
            {
            enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_rulePreOperator9772); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4727:1: ruleOrOperator returns [Enumerator current=null] : (enumLiteral_0= '|' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4729:28: ( (enumLiteral_0= '|' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4730:1: (enumLiteral_0= '|' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4730:1: (enumLiteral_0= '|' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4730:3: enumLiteral_0= '|'
            {
            enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleOrOperator9815); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4740:1: ruleAndOperator returns [Enumerator current=null] : (enumLiteral_0= '&' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4742:28: ( (enumLiteral_0= '&' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4743:1: (enumLiteral_0= '&' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4743:1: (enumLiteral_0= '&' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4743:3: enumLiteral_0= '&'
            {
            enumLiteral_0=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleAndOperator9858); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4753:1: ruleNotOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4755:28: ( (enumLiteral_0= '!' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4756:1: (enumLiteral_0= '!' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4756:1: (enumLiteral_0= '!' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4756:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleNotOperator9901); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4766:1: ruleAddOperator returns [Enumerator current=null] : (enumLiteral_0= '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4768:28: ( (enumLiteral_0= '+' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4769:1: (enumLiteral_0= '+' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4769:1: (enumLiteral_0= '+' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4769:3: enumLiteral_0= '+'
            {
            enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleAddOperator9944); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4779:1: ruleSubOperator returns [Enumerator current=null] : (enumLiteral_0= '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4781:28: ( (enumLiteral_0= '-' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4782:1: (enumLiteral_0= '-' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4782:1: (enumLiteral_0= '-' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4782:3: enumLiteral_0= '-'
            {
            enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleSubOperator9987); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4792:1: ruleMultOperator returns [Enumerator current=null] : (enumLiteral_0= '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4794:28: ( (enumLiteral_0= '*' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4795:1: (enumLiteral_0= '*' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4795:1: (enumLiteral_0= '*' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4795:3: enumLiteral_0= '*'
            {
            enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMultOperator10030); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4805:1: ruleModOperator returns [Enumerator current=null] : (enumLiteral_0= 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4807:28: ( (enumLiteral_0= 'mod' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4808:1: (enumLiteral_0= 'mod' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4808:1: (enumLiteral_0= 'mod' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4808:3: enumLiteral_0= 'mod'
            {
            enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleModOperator10073); if (state.failed) return current;
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4818:1: ruleValOperator returns [Enumerator current=null] : (enumLiteral_0= 'val' ) ;
    public final Enumerator ruleValOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4820:28: ( (enumLiteral_0= 'val' ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4821:1: (enumLiteral_0= 'val' )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4821:1: (enumLiteral_0= 'val' )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4821:3: enumLiteral_0= 'val'
            {
            enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleValOperator10116); if (state.failed) return current;
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


    // $ANTLR start "ruleValueType"
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4831:1: ruleValueType returns [Enumerator current=null] : ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4833:28: ( ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4834:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4834:1: ( (enumLiteral_0= 'pure' ) | (enumLiteral_1= 'bool' ) | (enumLiteral_2= 'unsigned' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'double' ) | (enumLiteral_6= 'string' ) | (enumLiteral_7= 'host' ) )
            int alt113=8;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt113=1;
                }
                break;
            case 70:
                {
                alt113=2;
                }
                break;
            case 71:
                {
                alt113=3;
                }
                break;
            case 72:
                {
                alt113=4;
                }
                break;
            case 73:
                {
                alt113=5;
                }
                break;
            case 74:
                {
                alt113=6;
                }
                break;
            case 75:
                {
                alt113=7;
                }
                break;
            case 76:
                {
                alt113=8;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4834:2: (enumLiteral_0= 'pure' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4834:2: (enumLiteral_0= 'pure' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4834:4: enumLiteral_0= 'pure'
                    {
                    enumLiteral_0=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleValueType10160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4840:6: (enumLiteral_1= 'bool' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4840:6: (enumLiteral_1= 'bool' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4840:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleValueType10177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4846:6: (enumLiteral_2= 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4846:6: (enumLiteral_2= 'unsigned' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4846:8: enumLiteral_2= 'unsigned'
                    {
                    enumLiteral_2=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleValueType10194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4852:6: (enumLiteral_3= 'int' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4852:6: (enumLiteral_3= 'int' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4852:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleValueType10211); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4858:6: (enumLiteral_4= 'float' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4858:6: (enumLiteral_4= 'float' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4858:8: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleValueType10228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4864:6: (enumLiteral_5= 'double' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4864:6: (enumLiteral_5= 'double' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4864:8: enumLiteral_5= 'double'
                    {
                    enumLiteral_5=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleValueType10245); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getValueTypeAccess().getDOUBLEEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4870:6: (enumLiteral_6= 'string' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4870:6: (enumLiteral_6= 'string' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4870:8: enumLiteral_6= 'string'
                    {
                    enumLiteral_6=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleValueType10262); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getValueTypeAccess().getSTRINGEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4876:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4876:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4876:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleValueType10279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_7()); 
                          
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
    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4886:1: ruleCombineOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) ;
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
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4888:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) ) )
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4889:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            {
            // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4889:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= '+' ) | (enumLiteral_2= '*' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'min' ) | (enumLiteral_5= '|' ) | (enumLiteral_6= '&' ) | (enumLiteral_7= 'host' ) )
            int alt114=8;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt114=1;
                }
                break;
            case 64:
                {
                alt114=2;
                }
                break;
            case 66:
                {
                alt114=3;
                }
                break;
            case 78:
                {
                alt114=4;
                }
                break;
            case 79:
                {
                alt114=5;
                }
                break;
            case 61:
                {
                alt114=6;
                }
                break;
            case 62:
                {
                alt114=7;
                }
                break;
            case 76:
                {
                alt114=8;
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
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4889:2: (enumLiteral_0= 'none' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4889:2: (enumLiteral_0= 'none' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4889:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleCombineOperator10324); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4895:6: (enumLiteral_1= '+' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4895:6: (enumLiteral_1= '+' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4895:8: enumLiteral_1= '+'
                    {
                    enumLiteral_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleCombineOperator10341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4901:6: (enumLiteral_2= '*' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4901:6: (enumLiteral_2= '*' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4901:8: enumLiteral_2= '*'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleCombineOperator10358); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4907:6: (enumLiteral_3= 'max' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4907:6: (enumLiteral_3= 'max' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4907:8: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleCombineOperator10375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4913:6: (enumLiteral_4= 'min' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4913:6: (enumLiteral_4= 'min' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4913:8: enumLiteral_4= 'min'
                    {
                    enumLiteral_4=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleCombineOperator10392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4919:6: (enumLiteral_5= '|' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4919:6: (enumLiteral_5= '|' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4919:8: enumLiteral_5= '|'
                    {
                    enumLiteral_5=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleCombineOperator10409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4925:6: (enumLiteral_6= '&' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4925:6: (enumLiteral_6= '&' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4925:8: enumLiteral_6= '&'
                    {
                    enumLiteral_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleCombineOperator10426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4931:6: (enumLiteral_7= 'host' )
                    {
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4931:6: (enumLiteral_7= 'host' )
                    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:4931:8: enumLiteral_7= 'host'
                    {
                    enumLiteral_7=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleCombineOperator10443); if (state.failed) return current;
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
        EObject lv_valuedObjects_7_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: (lv_valuedObjects_7_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: (lv_valuedObjects_7_0= ruleValuedObject )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:178:3: lv_valuedObjects_7_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRootRegionAccess().getValuedObjectsValuedObjectParserRuleCall_2_5_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred4_InternalSct263);
        lv_valuedObjects_7_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalSct

    // $ANTLR start synpred6_InternalSct
    public final void synpred6_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token lv_label_5_0=null;
        Token otherlv_6=null;
        EObject lv_annotations_2_0 = null;

        EObject lv_valuedObjects_7_0 = null;

        EObject lv_bodyText_8_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:114:4: ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:114:4: ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:114:4: ( (lv_annotations_2_0= ruleAnnotation ) )*
        loop115:
        do {
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_COMMENT_ANNOTATION||LA115_0==19) ) {
                alt115=1;
            }


            switch (alt115) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:115:1: (lv_annotations_2_0= ruleAnnotation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:115:1: (lv_annotations_2_0= ruleAnnotation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:116:3: lv_annotations_2_0= ruleAnnotation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsAnnotationParserRuleCall_2_0_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_synpred6_InternalSct172);
        	    lv_annotations_2_0=ruleAnnotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop115;
            }
        } while (true);

        otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred6_InternalSct185); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:136:1: ( (lv_id_4_0= RULE_ID ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:137:1: (lv_id_4_0= RULE_ID )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:137:1: (lv_id_4_0= RULE_ID )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:138:3: lv_id_4_0= RULE_ID
        {
        lv_id_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred6_InternalSct202); if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:154:2: ( (lv_label_5_0= RULE_STRING ) )?
        int alt116=2;
        int LA116_0 = input.LA(1);

        if ( (LA116_0==RULE_STRING) ) {
            alt116=1;
        }
        switch (alt116) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:155:1: (lv_label_5_0= RULE_STRING )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:155:1: (lv_label_5_0= RULE_STRING )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:156:3: lv_label_5_0= RULE_STRING
                {
                lv_label_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred6_InternalSct224); if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_6=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred6_InternalSct242); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:176:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )*
        loop117:
        do {
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==RULE_ID||LA117_0==RULE_COMMENT_ANNOTATION||LA117_0==19||(LA117_0>=33 && LA117_0<=36)||(LA117_0>=69 && LA117_0<=76)) ) {
                alt117=1;
            }


            switch (alt117) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: (lv_valuedObjects_7_0= ruleValuedObject )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:177:1: (lv_valuedObjects_7_0= ruleValuedObject )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:178:3: lv_valuedObjects_7_0= ruleValuedObject
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getValuedObjectsValuedObjectParserRuleCall_2_5_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred6_InternalSct263);
        	    lv_valuedObjects_7_0=ruleValuedObject();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop117;
            }
        } while (true);

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:194:3: ( (lv_bodyText_8_0= ruleTextualCode ) )*
        loop118:
        do {
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_HOSTCODE) ) {
                alt118=1;
            }


            switch (alt118) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:195:1: (lv_bodyText_8_0= ruleTextualCode )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:195:1: (lv_bodyText_8_0= ruleTextualCode )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:196:3: lv_bodyText_8_0= ruleTextualCode
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getRootRegionAccess().getBodyTextTextualCodeParserRuleCall_2_6_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_synpred6_InternalSct285);
        	    lv_bodyText_8_0=ruleTextualCode();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop118;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred6_InternalSct

    // $ANTLR start synpred11_InternalSct
    public final void synpred11_InternalSct_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: (lv_valuedObjects_6_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: (lv_valuedObjects_6_0= ruleValuedObject )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:324:3: lv_valuedObjects_6_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSingleRegionAccess().getValuedObjectsValuedObjectParserRuleCall_1_5_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred11_InternalSct507);
        lv_valuedObjects_6_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalSct

    // $ANTLR start synpred13_InternalSct
    public final void synpred13_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        Token otherlv_5=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_valuedObjects_6_0 = null;

        EObject lv_bodyText_7_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:260:3: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:260:3: ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:260:3: ( (lv_annotations_1_0= ruleAnnotation ) )*
        loop119:
        do {
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==RULE_COMMENT_ANNOTATION||LA119_0==19) ) {
                alt119=1;
            }


            switch (alt119) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:261:1: (lv_annotations_1_0= ruleAnnotation )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:261:1: (lv_annotations_1_0= ruleAnnotation )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:262:3: lv_annotations_1_0= ruleAnnotation
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_synpred13_InternalSct415);
        	    lv_annotations_1_0=ruleAnnotation();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop119;
            }
        } while (true);

        otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_synpred13_InternalSct428); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:282:1: ( (lv_id_3_0= RULE_ID ) )?
        int alt120=2;
        int LA120_0 = input.LA(1);

        if ( (LA120_0==RULE_ID) ) {
            alt120=1;
        }
        switch (alt120) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:283:1: (lv_id_3_0= RULE_ID )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:283:1: (lv_id_3_0= RULE_ID )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:284:3: lv_id_3_0= RULE_ID
                {
                lv_id_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred13_InternalSct445); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:300:3: ( (lv_label_4_0= RULE_STRING ) )?
        int alt121=2;
        int LA121_0 = input.LA(1);

        if ( (LA121_0==RULE_STRING) ) {
            alt121=1;
        }
        switch (alt121) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:301:1: (lv_label_4_0= RULE_STRING )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:301:1: (lv_label_4_0= RULE_STRING )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:302:3: lv_label_4_0= RULE_STRING
                {
                lv_label_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred13_InternalSct468); if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_synpred13_InternalSct486); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:322:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )*
        loop122:
        do {
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==RULE_ID||LA122_0==RULE_COMMENT_ANNOTATION||LA122_0==19||(LA122_0>=33 && LA122_0<=36)||(LA122_0>=69 && LA122_0<=76)) ) {
                alt122=1;
            }


            switch (alt122) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: (lv_valuedObjects_6_0= ruleValuedObject )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:323:1: (lv_valuedObjects_6_0= ruleValuedObject )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:324:3: lv_valuedObjects_6_0= ruleValuedObject
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getValuedObjectsValuedObjectParserRuleCall_1_5_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred13_InternalSct507);
        	    lv_valuedObjects_6_0=ruleValuedObject();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop122;
            }
        } while (true);

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:340:3: ( (lv_bodyText_7_0= ruleTextualCode ) )*
        loop123:
        do {
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_HOSTCODE) ) {
                alt123=1;
            }


            switch (alt123) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:341:1: (lv_bodyText_7_0= ruleTextualCode )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:341:1: (lv_bodyText_7_0= ruleTextualCode )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:342:3: lv_bodyText_7_0= ruleTextualCode
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSingleRegionAccess().getBodyTextTextualCodeParserRuleCall_1_6_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_synpred13_InternalSct529);
        	    lv_bodyText_7_0=ruleTextualCode();

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
    // $ANTLR end synpred13_InternalSct

    // $ANTLR start synpred14_InternalSct
    public final void synpred14_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_8_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:359:1: ( (lv_states_8_0= ruleState ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:359:1: (lv_states_8_0= ruleState )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:359:1: (lv_states_8_0= ruleState )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:360:3: lv_states_8_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSingleRegionAccess().getStatesStateParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleState_in_synpred14_InternalSct553);
        lv_states_8_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalSct

    // $ANTLR start synpred18_InternalSct
    public final void synpred18_InternalSct_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:469:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:469:1: (lv_valuedObjects_6_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:469:1: (lv_valuedObjects_6_0= ruleValuedObject )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:470:3: lv_valuedObjects_6_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRegionAccess().getValuedObjectsValuedObjectParserRuleCall_6_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred18_InternalSct750);
        lv_valuedObjects_6_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalSct

    // $ANTLR start synpred20_InternalSct
    public final void synpred20_InternalSct_fragment() throws RecognitionException {   
        EObject lv_states_8_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:505:1: ( (lv_states_8_0= ruleState ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:505:1: (lv_states_8_0= ruleState )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:505:1: (lv_states_8_0= ruleState )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:506:3: lv_states_8_0= ruleState
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_8_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleState_in_synpred20_InternalSct794);
        lv_states_8_0=ruleState();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalSct

    // $ANTLR start synpred26_InternalSct
    public final void synpred26_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_renamings_8_0 = null;

        EObject lv_renamings_10_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:4: ( (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:4: (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:4: (otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:619:6: otherlv_5= '@' ( (otherlv_6= RULE_ID ) ) (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )?
        {
        otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred26_InternalSct981); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:623:1: ( (otherlv_6= RULE_ID ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:624:1: (otherlv_6= RULE_ID )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:624:1: (otherlv_6= RULE_ID )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:625:3: otherlv_6= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred26_InternalSct1005); if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:639:2: (otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']' )?
        int alt126=2;
        int LA126_0 = input.LA(1);

        if ( (LA126_0==20) ) {
            alt126=1;
        }
        switch (alt126) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:639:4: otherlv_7= '[' ( (lv_renamings_8_0= ruleSubstitution ) ) (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )* otherlv_11= ']'
                {
                otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_synpred26_InternalSct1018); if (state.failed) return ;
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:643:1: ( (lv_renamings_8_0= ruleSubstitution ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:644:1: (lv_renamings_8_0= ruleSubstitution )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:644:1: (lv_renamings_8_0= ruleSubstitution )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:645:3: lv_renamings_8_0= ruleSubstitution
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getSCChartAccess().getRenamingsSubstitutionParserRuleCall_5_0_2_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_synpred26_InternalSct1039);
                lv_renamings_8_0=ruleSubstitution();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:661:2: (otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) ) )*
                loop125:
                do {
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==21) ) {
                        alt125=1;
                    }


                    switch (alt125) {
                	case 1 :
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:661:4: otherlv_9= ',' ( (lv_renamings_10_0= ruleSubstitution ) )
                	    {
                	    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred26_InternalSct1052); if (state.failed) return ;
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:665:1: ( (lv_renamings_10_0= ruleSubstitution ) )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:666:1: (lv_renamings_10_0= ruleSubstitution )
                	    {
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:666:1: (lv_renamings_10_0= ruleSubstitution )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:667:3: lv_renamings_10_0= ruleSubstitution
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRenamingsSubstitutionParserRuleCall_5_0_2_2_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_synpred26_InternalSct1073);
                	    lv_renamings_10_0=ruleSubstitution();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop125;
                    }
                } while (true);

                otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred26_InternalSct1087); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred26_InternalSct

    // $ANTLR start synpred27_InternalSct
    public final void synpred27_InternalSct_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_13_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:3: ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:3: ( (lv_valuedObjects_13_0= ruleValuedObject ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:692:3: ( (lv_valuedObjects_13_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_valuedObjects_13_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:693:1: (lv_valuedObjects_13_0= ruleValuedObject )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:694:3: lv_valuedObjects_13_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCChartAccess().getValuedObjectsValuedObjectParserRuleCall_5_1_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred27_InternalSct1132);
        lv_valuedObjects_13_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalSct

    // $ANTLR start synpred31_InternalSct
    public final void synpred31_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_16_0 = null;

        EObject lv_regions_17_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:747:4: ( ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:747:4: ( (lv_regions_16_0= ruleSingleRegion ) ) ( (lv_regions_17_0= ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:747:4: ( (lv_regions_16_0= ruleSingleRegion ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:748:1: (lv_regions_16_0= ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:748:1: (lv_regions_16_0= ruleSingleRegion )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:749:3: lv_regions_16_0= ruleSingleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsSingleRegionParserRuleCall_5_1_1_2_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred31_InternalSct1205);
        lv_regions_16_0=ruleSingleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:765:2: ( (lv_regions_17_0= ruleRegion ) )*
        loop127:
        do {
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==RULE_COMMENT_ANNOTATION||LA127_0==16||LA127_0==19) ) {
                alt127=1;
            }


            switch (alt127) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:766:1: (lv_regions_17_0= ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:766:1: (lv_regions_17_0= ruleRegion )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:767:3: lv_regions_17_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getSCChartAccess().getRegionsRegionParserRuleCall_5_1_1_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred31_InternalSct1226);
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
    // $ANTLR end synpred31_InternalSct

    // $ANTLR start synpred42_InternalSct
    public final void synpred42_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_renamings_12_0 = null;

        EObject lv_renamings_14_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:4: ( (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:4: (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:4: (otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:945:6: otherlv_9= '@' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )?
        {
        otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_19_in_synpred42_InternalSct1570); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:949:1: ( (otherlv_10= RULE_ID ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (otherlv_10= RULE_ID )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:950:1: (otherlv_10= RULE_ID )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:951:3: otherlv_10= RULE_ID
        {
        if ( state.backtracking==0 ) {
           
          		  /* */ 
          		
        }
        otherlv_10=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred42_InternalSct1594); if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:965:2: (otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']' )?
        int alt136=2;
        int LA136_0 = input.LA(1);

        if ( (LA136_0==20) ) {
            alt136=1;
        }
        switch (alt136) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:965:4: otherlv_11= '[' ( (lv_renamings_12_0= ruleSubstitution ) ) (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* otherlv_15= ']'
                {
                otherlv_11=(Token)match(input,20,FollowSets000.FOLLOW_20_in_synpred42_InternalSct1607); if (state.failed) return ;
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:969:1: ( (lv_renamings_12_0= ruleSubstitution ) )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:970:1: (lv_renamings_12_0= ruleSubstitution )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:970:1: (lv_renamings_12_0= ruleSubstitution )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:971:3: lv_renamings_12_0= ruleSubstitution
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_1_0()); 
                  	    
                }
                pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_synpred42_InternalSct1628);
                lv_renamings_12_0=ruleSubstitution();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:987:2: (otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )*
                loop135:
                do {
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==21) ) {
                        alt135=1;
                    }


                    switch (alt135) {
                	case 1 :
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:987:4: otherlv_13= ',' ( (lv_renamings_14_0= ruleSubstitution ) )
                	    {
                	    otherlv_13=(Token)match(input,21,FollowSets000.FOLLOW_21_in_synpred42_InternalSct1641); if (state.failed) return ;
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:991:1: ( (lv_renamings_14_0= ruleSubstitution ) )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:992:1: (lv_renamings_14_0= ruleSubstitution )
                	    {
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:992:1: (lv_renamings_14_0= ruleSubstitution )
                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:993:3: lv_renamings_14_0= ruleSubstitution
                	    {
                	    if ( state.backtracking==0 ) {
                	       
                	      	        newCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_2_1_0()); 
                	      	    
                	    }
                	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_synpred42_InternalSct1662);
                	    lv_renamings_14_0=ruleSubstitution();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop135;
                    }
                } while (true);

                otherlv_15=(Token)match(input,22,FollowSets000.FOLLOW_22_in_synpred42_InternalSct1676); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred42_InternalSct

    // $ANTLR start synpred43_InternalSct
    public final void synpred43_InternalSct_fragment() throws RecognitionException {   
        EObject lv_valuedObjects_17_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:3: ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:3: ( (lv_valuedObjects_17_0= ruleValuedObject ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1018:3: ( (lv_valuedObjects_17_0= ruleValuedObject ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1019:1: (lv_valuedObjects_17_0= ruleValuedObject )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1019:1: (lv_valuedObjects_17_0= ruleValuedObject )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1020:3: lv_valuedObjects_17_0= ruleValuedObject
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getValuedObjectsValuedObjectParserRuleCall_6_1_1_0_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedObject_in_synpred43_InternalSct1721);
        lv_valuedObjects_17_0=ruleValuedObject();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred43_InternalSct

    // $ANTLR start synpred47_InternalSct
    public final void synpred47_InternalSct_fragment() throws RecognitionException {   
        EObject lv_regions_20_0 = null;

        EObject lv_regions_21_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:4: ( ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )* )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:4: ( (lv_regions_20_0= ruleSingleRegion ) ) ( (lv_regions_21_0= ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1073:4: ( (lv_regions_20_0= ruleSingleRegion ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1074:1: (lv_regions_20_0= ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1074:1: (lv_regions_20_0= ruleSingleRegion )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1075:3: lv_regions_20_0= ruleSingleRegion
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_2_0_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred47_InternalSct1794);
        lv_regions_20_0=ruleSingleRegion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1091:2: ( (lv_regions_21_0= ruleRegion ) )*
        loop137:
        do {
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_COMMENT_ANNOTATION||LA137_0==16||LA137_0==19) ) {
                alt137=1;
            }


            switch (alt137) {
        	case 1 :
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1092:1: (lv_regions_21_0= ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1092:1: (lv_regions_21_0= ruleRegion )
        	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1093:3: lv_regions_21_0= ruleRegion
        	    {
        	    if ( state.backtracking==0 ) {
        	       
        	      	        newCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0()); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred47_InternalSct1815);
        	    lv_regions_21_0=ruleRegion();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop137;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred47_InternalSct

    // $ANTLR start synpred57_InternalSct
    public final void synpred57_InternalSct_fragment() throws RecognitionException {   
        Token lv_delay_7_0=null;

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: ( (lv_delay_7_0= RULE_INT ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: (lv_delay_7_0= RULE_INT )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: (lv_delay_7_0= RULE_INT )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1334:3: lv_delay_7_0= RULE_INT
        {
        lv_delay_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred57_InternalSct2311); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred57_InternalSct

    // $ANTLR start synpred63_InternalSct
    public final void synpred63_InternalSct_fragment() throws RecognitionException {   
        Token lv_isImmediate_4_0=null;
        Token lv_isHistory_5_0=null;
        Token otherlv_6=null;
        Token lv_delay_7_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_label_13_0=null;
        EObject lv_trigger_8_0 = null;

        EObject lv_effects_10_0 = null;

        EObject lv_effects_12_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:3: ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:3: ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )?
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1298:3: ( (lv_isImmediate_4_0= 'immediate' ) )?
        int alt152=2;
        int LA152_0 = input.LA(1);

        if ( (LA152_0==29) ) {
            alt152=1;
        }
        switch (alt152) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1299:1: (lv_isImmediate_4_0= 'immediate' )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1299:1: (lv_isImmediate_4_0= 'immediate' )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1300:3: lv_isImmediate_4_0= 'immediate'
                {
                lv_isImmediate_4_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_synpred63_InternalSct2233); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1313:3: ( (lv_isHistory_5_0= 'history' ) )?
        int alt153=2;
        int LA153_0 = input.LA(1);

        if ( (LA153_0==30) ) {
            alt153=1;
        }
        switch (alt153) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1314:1: (lv_isHistory_5_0= 'history' )
                {
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1314:1: (lv_isHistory_5_0= 'history' )
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1315:3: lv_isHistory_5_0= 'history'
                {
                lv_isHistory_5_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_synpred63_InternalSct2265); if (state.failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:3: (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )?
        int alt159=2;
        int LA159_0 = input.LA(1);

        if ( (LA159_0==31) ) {
            alt159=1;
        }
        switch (alt159) {
            case 1 :
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1328:5: otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) )
                {
                otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred63_InternalSct2292); if (state.failed) return ;
                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:1: ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) )
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==EOF||LA158_0==RULE_ID||(LA158_0>=RULE_INT && LA158_0<=RULE_BOOLEAN)||LA158_0==32||LA158_0==43||LA158_0==60||LA158_0==63||LA158_0==65||LA158_0==68) ) {
                    alt158=1;
                }
                else if ( (LA158_0==RULE_STRING) ) {
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
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:2: ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:2: ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:3: ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1332:3: ( (lv_delay_7_0= RULE_INT ) )?
                        int alt154=2;
                        alt154 = dfa154.predict(input);
                        switch (alt154) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: (lv_delay_7_0= RULE_INT )
                                {
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1333:1: (lv_delay_7_0= RULE_INT )
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1334:3: lv_delay_7_0= RULE_INT
                                {
                                lv_delay_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred63_InternalSct2311); if (state.failed) return ;

                                }


                                }
                                break;

                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1350:3: ( (lv_trigger_8_0= ruleBoolExpression ) )?
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==RULE_ID||(LA155_0>=RULE_INT && LA155_0<=RULE_BOOLEAN)||LA155_0==43||LA155_0==60||LA155_0==63||LA155_0==65||LA155_0==68) ) {
                            alt155=1;
                        }
                        switch (alt155) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1351:1: (lv_trigger_8_0= ruleBoolExpression )
                                {
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1351:1: (lv_trigger_8_0= ruleBoolExpression )
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1352:3: lv_trigger_8_0= ruleBoolExpression
                                {
                                if ( state.backtracking==0 ) {
                                   
                                  	        newCompositeNode(grammarAccess.getTransitionAccess().getTriggerBoolExpressionParserRuleCall_4_2_1_0_1_0()); 
                                  	    
                                }
                                pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred63_InternalSct2338);
                                lv_trigger_8_0=ruleBoolExpression();

                                state._fsp--;
                                if (state.failed) return ;

                                }


                                }
                                break;

                        }

                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1368:3: (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )?
                        int alt157=2;
                        int LA157_0 = input.LA(1);

                        if ( (LA157_0==32) ) {
                            alt157=1;
                        }
                        switch (alt157) {
                            case 1 :
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1368:5: otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                                {
                                otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_synpred63_InternalSct2352); if (state.failed) return ;
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1372:1: ( (lv_effects_10_0= ruleEffect ) )
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1373:1: (lv_effects_10_0= ruleEffect )
                                {
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1373:1: (lv_effects_10_0= ruleEffect )
                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1374:3: lv_effects_10_0= ruleEffect
                                {
                                if ( state.backtracking==0 ) {
                                   
                                  	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0_2_1_0()); 
                                  	    
                                }
                                pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred63_InternalSct2373);
                                lv_effects_10_0=ruleEffect();

                                state._fsp--;
                                if (state.failed) return ;

                                }


                                }

                                // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1390:2: (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )*
                                loop156:
                                do {
                                    int alt156=2;
                                    int LA156_0 = input.LA(1);

                                    if ( (LA156_0==28) ) {
                                        alt156=1;
                                    }


                                    switch (alt156) {
                                	case 1 :
                                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1390:4: otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) )
                                	    {
                                	    otherlv_11=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred63_InternalSct2386); if (state.failed) return ;
                                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1394:1: ( (lv_effects_12_0= ruleEffect ) )
                                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1395:1: (lv_effects_12_0= ruleEffect )
                                	    {
                                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1395:1: (lv_effects_12_0= ruleEffect )
                                	    // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1396:3: lv_effects_12_0= ruleEffect
                                	    {
                                	    if ( state.backtracking==0 ) {
                                	       
                                	      	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_2_1_0_2_2_1_0()); 
                                	      	    
                                	    }
                                	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred63_InternalSct2407);
                                	    lv_effects_12_0=ruleEffect();

                                	    state._fsp--;
                                	    if (state.failed) return ;

                                	    }


                                	    }


                                	    }
                                	    break;

                                	default :
                                	    break loop156;
                                    }
                                } while (true);


                                }
                                break;

                        }


                        }


                        }
                        break;
                    case 2 :
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1413:6: ( (lv_label_13_0= RULE_STRING ) )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1413:6: ( (lv_label_13_0= RULE_STRING ) )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1414:1: (lv_label_13_0= RULE_STRING )
                        {
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1414:1: (lv_label_13_0= RULE_STRING )
                        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1415:3: lv_label_13_0= RULE_STRING
                        {
                        lv_label_13_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred63_InternalSct2435); if (state.failed) return ;

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
    // $ANTLR end synpred63_InternalSct

    // $ANTLR start synpred73_InternalSct
    public final void synpred73_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1792:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1792:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred73_InternalSct3190); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1796:1: ( (lv_effects_6_0= ruleEffect ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: (lv_effects_6_0= ruleEffect )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1797:1: (lv_effects_6_0= ruleEffect )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1798:3: lv_effects_6_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEntryActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred73_InternalSct3211);
        lv_effects_6_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred73_InternalSct

    // $ANTLR start synpred77_InternalSct
    public final void synpred77_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_6=null;
        EObject lv_effects_7_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1907:4: (otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1907:4: otherlv_6= ';' ( (lv_effects_7_0= ruleEffect ) )
        {
        otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred77_InternalSct3423); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1911:1: ( (lv_effects_7_0= ruleEffect ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1912:1: (lv_effects_7_0= ruleEffect )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1912:1: (lv_effects_7_0= ruleEffect )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:1913:3: lv_effects_7_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getDuringActionAccess().getEffectsEffectParserRuleCall_4_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred77_InternalSct3444);
        lv_effects_7_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred77_InternalSct

    // $ANTLR start synpred80_InternalSct
    public final void synpred80_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_effects_6_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2007:4: (otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2007:4: otherlv_5= ';' ( (lv_effects_6_0= ruleEffect ) )
        {
        otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_28_in_synpred80_InternalSct3624); if (state.failed) return ;
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2011:1: ( (lv_effects_6_0= ruleEffect ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2012:1: (lv_effects_6_0= ruleEffect )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2012:1: (lv_effects_6_0= ruleEffect )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2013:3: lv_effects_6_0= ruleEffect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExitActionAccess().getEffectsEffectParserRuleCall_3_2_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleEffect_in_synpred80_InternalSct3645);
        lv_effects_6_0=ruleEffect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred80_InternalSct

    // $ANTLR start synpred88_InternalSct
    public final void synpred88_InternalSct_fragment() throws RecognitionException {   
        EObject this_BoolExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:2: ( ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:2: ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:2: ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2347:3: ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleBoolExpression_in_synpred88_InternalSct4443);
        this_BoolExpression_0=ruleBoolExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred88_InternalSct

    // $ANTLR start synpred92_InternalSct
    public final void synpred92_InternalSct_fragment() throws RecognitionException {   
        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:2: ( ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:2: ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:2: ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:3: ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:3: ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2582:4: ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred92_InternalSct4973);
        this_NotOrValuedExpression_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2594:2: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2594:3: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2594:3: ()
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2595:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2603:2: ( (lv_operator_2_0= ruleCompareOperator ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2604:1: (lv_operator_2_0= ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2604:1: (lv_operator_2_0= ruleCompareOperator )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2605:3: lv_operator_2_0= ruleCompareOperator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred92_InternalSct5007);
        lv_operator_2_0=ruleCompareOperator();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2621:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2622:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2622:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2623:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred92_InternalSct5028);
        lv_subExpressions_3_0=ruleNotOrValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred92_InternalSct

    // $ANTLR start synpred94_InternalSct
    public final void synpred94_InternalSct_fragment() throws RecognitionException {   
        EObject this_ValuedExpression_0 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:2: ( ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:2: ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:2: ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:2673:3: ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred94_InternalSct5162);
        this_ValuedExpression_0=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred94_InternalSct

    // $ANTLR start synpred106_InternalSct
    public final void synpred106_InternalSct_fragment() throws RecognitionException {   
        EObject this_FloatValue_1 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3394:2: (this_FloatValue_1= ruleFloatValue )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3394:2: this_FloatValue_1= ruleFloatValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_synpred106_InternalSct6696);
        this_FloatValue_1=ruleFloatValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_InternalSct

    // $ANTLR start synpred107_InternalSct
    public final void synpred107_InternalSct_fragment() throws RecognitionException {   
        EObject this_DoubleValue_2 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3407:2: (this_DoubleValue_2= ruleDoubleValue )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3407:2: this_DoubleValue_2= ruleDoubleValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleDoubleValue_in_synpred107_InternalSct6726);
        this_DoubleValue_2=ruleDoubleValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred107_InternalSct

    // $ANTLR start synpred109_InternalSct
    public final void synpred109_InternalSct_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_ValuedExpression_4 = null;


        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:6: ( ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:6: ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:6: ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:7: ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')'
        {
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:7: ( ( '(' )=>otherlv_3= '(' )
        // ../de.cau.cs.kieler.sccharts.text/src-gen/de/cau/cs/kieler/sccharts/text/sct/parser/antlr/internal/InternalSct.g:3419:8: ( '(' )=>otherlv_3= '('
        {
        otherlv_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_synpred109_InternalSct6752); if (state.failed) return ;

        }

        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred109_InternalSct6778);
        this_ValuedExpression_4=ruleValuedExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_5=(Token)match(input,44,FollowSets000.FOLLOW_44_in_synpred109_InternalSct6789); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred109_InternalSct

    // Delegated rules

    public final boolean synpred18_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalSct_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred80_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred27_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalSct_fragment(); // can never throw exception
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
    public final boolean synpred43_InternalSct() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_InternalSct_fragment(); // can never throw exception
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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA92 dfa92 = new DFA92(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA154 dfa154 = new DFA154(this);
    static final String DFA6_eotS =
        "\12\uffff";
    static final String DFA6_eofS =
        "\1\4\11\uffff";
    static final String DFA6_minS =
        "\1\12\2\0\7\uffff";
    static final String DFA6_maxS =
        "\1\62\2\0\7\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\1\1\2\5\uffff";
    static final String DFA6_specialS =
        "\1\uffff\1\0\1\1\7\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\5\uffff\1\3\1\uffff\1\4\1\2\33\uffff\4\4",
            "\1\uffff",
            "\1\uffff",
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
            return "114:3: ( ( (lv_annotations_2_0= ruleAnnotation ) )* otherlv_3= 'region' ( (lv_id_4_0= RULE_ID ) ) ( (lv_label_5_0= RULE_STRING ) )? otherlv_6= ':' ( (lv_valuedObjects_7_0= ruleValuedObject ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSct()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_2 = input.LA(1);

                         
                        int index6_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalSct()) ) {s = 3;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index6_2);
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
    static final String DFA4_eotS =
        "\27\uffff";
    static final String DFA4_eofS =
        "\1\1\26\uffff";
    static final String DFA4_minS =
        "\1\4\1\uffff\2\0\23\uffff";
    static final String DFA4_maxS =
        "\1\114\1\uffff\2\0\23\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\14\uffff";
    static final String DFA4_specialS =
        "\2\uffff\1\0\1\1\23\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\12\2\uffff\1\1\2\uffff\1\2\7\uffff\1\1\1\3\15\uffff\4\12"+
            "\12\uffff\4\1\22\uffff\10\12",
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
            return "()* loopback of 176:1: ( (lv_valuedObjects_7_0= ruleValuedObject ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index4_3);
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
    static final String DFA13_eotS =
        "\16\uffff";
    static final String DFA13_eofS =
        "\1\4\15\uffff";
    static final String DFA13_minS =
        "\1\12\3\0\12\uffff";
    static final String DFA13_maxS =
        "\1\62\3\0\12\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\2\10\uffff\1\1";
    static final String DFA13_specialS =
        "\1\uffff\1\0\1\1\1\2\12\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\5\uffff\1\3\2\uffff\1\2\4\uffff\4\4\23\uffff\4\4",
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "260:2: ( ( (lv_annotations_1_0= ruleAnnotation ) )* otherlv_2= 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? otherlv_5= ':' ( (lv_valuedObjects_6_0= ruleValuedObject ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_1 = input.LA(1);

                         
                        int index13_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index13_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_2 = input.LA(1);

                         
                        int index13_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index13_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\33\uffff";
    static final String DFA11_eofS =
        "\1\1\32\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\2\0\27\uffff";
    static final String DFA11_maxS =
        "\1\114\1\uffff\2\0\27\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\14\uffff\1\1\14\uffff";
    static final String DFA11_specialS =
        "\2\uffff\1\0\1\1\27\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\16\2\uffff\1\1\2\uffff\1\2\5\uffff\1\1\2\uffff\1\3\4\uffff"+
            "\4\1\5\uffff\4\16\12\uffff\4\1\22\uffff\10\16",
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
            return "()* loopback of 322:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_InternalSct()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
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
    static final String DFA14_eotS =
        "\15\uffff";
    static final String DFA14_eofS =
        "\1\1\14\uffff";
    static final String DFA14_minS =
        "\1\12\1\uffff\2\0\11\uffff";
    static final String DFA14_maxS =
        "\1\62\1\uffff\2\0\11\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\4\uffff\1\1\6\uffff";
    static final String DFA14_specialS =
        "\2\uffff\1\0\1\1\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\5\uffff\1\1\2\uffff\1\3\4\uffff\1\1\3\6\23\uffff\4\6",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 358:5: ( (lv_states_8_0= ruleState ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\30\uffff";
    static final String DFA18_eofS =
        "\30\uffff";
    static final String DFA18_minS =
        "\1\4\1\uffff\2\0\24\uffff";
    static final String DFA18_maxS =
        "\1\114\1\uffff\2\0\24\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\11\uffff\1\1\14\uffff";
    static final String DFA18_specialS =
        "\2\uffff\1\0\1\1\24\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\13\2\uffff\1\1\2\uffff\1\2\10\uffff\1\3\5\uffff\3\1\5\uffff"+
            "\4\13\12\uffff\4\1\22\uffff\10\13",
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
            return "()* loopback of 468:1: ( (lv_valuedObjects_6_0= ruleValuedObject ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index18_3);
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
    static final String DFA20_eotS =
        "\15\uffff";
    static final String DFA20_eofS =
        "\1\1\14\uffff";
    static final String DFA20_minS =
        "\1\12\2\uffff\2\0\10\uffff";
    static final String DFA20_maxS =
        "\1\62\2\uffff\2\0\10\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\4\uffff\1\1\6\uffff";
    static final String DFA20_specialS =
        "\3\uffff\1\0\1\1\10\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\3\5\uffff\1\1\2\uffff\1\4\4\uffff\1\1\3\6\23\uffff\4\6",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()+ loopback of 504:3: ( (lv_states_8_0= ruleState ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_3 = input.LA(1);

                         
                        int index20_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_4 = input.LA(1);

                         
                        int index20_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalSct()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index20_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA26_eotS =
        "\37\uffff";
    static final String DFA26_eofS =
        "\37\uffff";
    static final String DFA26_minS =
        "\1\4\1\uffff\2\0\33\uffff";
    static final String DFA26_maxS =
        "\1\114\1\uffff\2\0\33\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\3\13\uffff\1\1\14\uffff\1\2\4\uffff";
    static final String DFA26_specialS =
        "\2\uffff\1\0\1\1\33\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\15\2\uffff\1\1\2\uffff\1\2\5\uffff\1\1\2\uffff\1\3\4\uffff"+
            "\4\1\1\uffff\1\32\3\uffff\4\15\2\uffff\4\32\4\uffff\4\1\22\uffff"+
            "\10\15",
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
            "",
            "",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 692:2: ( ( (lv_valuedObjects_13_0= ruleValuedObject ) ) | ( (lv_localActions_14_0= ruleLocalAction ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_2 = input.LA(1);

                         
                        int index26_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_3 = input.LA(1);

                         
                        int index26_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index26_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\37\uffff";
    static final String DFA39_eofS =
        "\37\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\2\0\33\uffff";
    static final String DFA39_maxS =
        "\1\114\1\uffff\2\0\33\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\3\13\uffff\1\1\14\uffff\1\2\4\uffff";
    static final String DFA39_specialS =
        "\2\uffff\1\0\1\1\33\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\15\2\uffff\1\1\2\uffff\1\2\5\uffff\1\1\2\uffff\1\3\4\uffff"+
            "\4\1\1\uffff\1\32\3\uffff\4\15\2\uffff\4\32\4\uffff\4\1\22\uffff"+
            "\10\15",
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
            "",
            "",
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

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 1018:2: ( ( (lv_valuedObjects_17_0= ruleValuedObject ) ) | ( (lv_localActions_18_0= ruleLocalAction ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_3 = input.LA(1);

                         
                        int index39_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index39_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\12\uffff";
    static final String DFA56_eofS =
        "\1\10\11\uffff";
    static final String DFA56_minS =
        "\1\12\1\uffff\7\0\1\uffff";
    static final String DFA56_maxS =
        "\1\65\1\uffff\7\0\1\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\7\uffff\1\2";
    static final String DFA56_specialS =
        "\2\uffff\1\1\1\4\1\0\1\3\1\5\1\2\1\6\1\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\3\10\uffff\1\4\10\uffff\1\2\3\1\23\uffff\1\5\1\6\1\7",
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

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "1298:2: ( ( (lv_isImmediate_4_0= 'immediate' ) )? ( (lv_isHistory_5_0= 'history' ) )? (otherlv_6= 'with' ( ( ( (lv_delay_7_0= RULE_INT ) )? ( (lv_trigger_8_0= ruleBoolExpression ) )? (otherlv_9= '/' ( (lv_effects_10_0= ruleEffect ) ) (otherlv_11= ';' ( (lv_effects_12_0= ruleEffect ) ) )* )? ) | ( (lv_label_13_0= RULE_STRING ) ) ) )? )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\24\uffff";
    static final String DFA50_eofS =
        "\1\2\23\uffff";
    static final String DFA50_minS =
        "\1\4\1\0\22\uffff";
    static final String DFA50_maxS =
        "\1\104\1\0\22\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA50_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\1\uffff\1\1\4\2\10\uffff\1\2\10\uffff\1\2\3\uffff\1\2"+
            "\12\uffff\1\2\7\uffff\3\2\6\uffff\1\2\2\uffff\1\2\1\uffff\1"+
            "\2\2\uffff\1\2",
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
            return "1332:3: ( (lv_delay_7_0= RULE_INT ) )?";
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
                        if ( (synpred57_InternalSct()) ) {s = 19;}

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
    static final String DFA79_eotS =
        "\14\uffff";
    static final String DFA79_eofS =
        "\14\uffff";
    static final String DFA79_minS =
        "\1\4\11\0\2\uffff";
    static final String DFA79_maxS =
        "\1\104\11\0\2\uffff";
    static final String DFA79_acceptS =
        "\12\uffff\1\1\1\2";
    static final String DFA79_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\10\1\uffff\1\2\1\11\1\3\1\5\41\uffff\1\4\20\uffff\1\6\2"+
            "\uffff\1\12\1\uffff\1\1\2\uffff\1\7",
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

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "2347:1: ( ( ( ruleBoolExpression )=>this_BoolExpression_0= ruleBoolExpression ) | this_ValuedExpression_1= ruleValuedExpression )";
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
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA79_2 = input.LA(1);

                         
                        int index79_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA79_3 = input.LA(1);

                         
                        int index79_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA79_4 = input.LA(1);

                         
                        int index79_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA79_5 = input.LA(1);

                         
                        int index79_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA79_6 = input.LA(1);

                         
                        int index79_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA79_7 = input.LA(1);

                         
                        int index79_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA79_8 = input.LA(1);

                         
                        int index79_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA79_9 = input.LA(1);

                         
                        int index79_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalSct()) ) {s = 10;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index79_9);
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
    static final String DFA82_eotS =
        "\14\uffff";
    static final String DFA82_eofS =
        "\14\uffff";
    static final String DFA82_minS =
        "\1\4\3\uffff\7\0\1\uffff";
    static final String DFA82_maxS =
        "\1\104\3\uffff\7\0\1\uffff";
    static final String DFA82_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA82_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\10\1\uffff\1\1\1\11\1\1\1\5\41\uffff\1\4\20\uffff\1\6\2"+
            "\uffff\1\12\1\uffff\1\1\2\uffff\1\7",
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "2582:1: ( ( ( ( ruleNotOrValuedExpression )=>this_NotOrValuedExpression_0= ruleNotOrValuedExpression ) ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_4 = input.LA(1);

                         
                        int index82_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_5 = input.LA(1);

                         
                        int index82_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_6 = input.LA(1);

                         
                        int index82_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_7 = input.LA(1);

                         
                        int index82_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_8 = input.LA(1);

                         
                        int index82_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_9 = input.LA(1);

                         
                        int index82_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_10 = input.LA(1);

                         
                        int index82_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 11;}

                         
                        input.seek(index82_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA83_eotS =
        "\13\uffff";
    static final String DFA83_eofS =
        "\13\uffff";
    static final String DFA83_minS =
        "\1\4\3\uffff\6\0\1\uffff";
    static final String DFA83_maxS =
        "\1\104\3\uffff\6\0\1\uffff";
    static final String DFA83_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA83_specialS =
        "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\10\1\uffff\1\1\1\11\1\1\1\5\41\uffff\1\4\20\uffff\1\6\2"+
            "\uffff\1\12\1\uffff\1\1\2\uffff\1\7",
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
            return "2673:1: ( ( ( ruleValuedExpression )=>this_ValuedExpression_0= ruleValuedExpression ) | this_NotExpression_1= ruleNotExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_4 = input.LA(1);

                         
                        int index83_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index83_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA83_5 = input.LA(1);

                         
                        int index83_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index83_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA83_6 = input.LA(1);

                         
                        int index83_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index83_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA83_7 = input.LA(1);

                         
                        int index83_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index83_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA83_8 = input.LA(1);

                         
                        int index83_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index83_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA83_9 = input.LA(1);

                         
                        int index83_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred94_InternalSct()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
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
    static final String DFA92_eotS =
        "\14\uffff";
    static final String DFA92_eofS =
        "\14\uffff";
    static final String DFA92_minS =
        "\1\4\1\uffff\2\0\10\uffff";
    static final String DFA92_maxS =
        "\1\104\1\uffff\2\0\10\uffff";
    static final String DFA92_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\4\uffff\1\2\1\3\1\4";
    static final String DFA92_specialS =
        "\2\uffff\1\0\1\1\10\uffff}>";
    static final String[] DFA92_transitionS = {
            "\1\4\1\uffff\1\1\1\4\1\2\1\4\41\uffff\1\3\20\uffff\1\4\7\uffff"+
            "\1\4",
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

    static final short[] DFA92_eot = DFA.unpackEncodedString(DFA92_eotS);
    static final short[] DFA92_eof = DFA.unpackEncodedString(DFA92_eofS);
    static final char[] DFA92_min = DFA.unpackEncodedStringToUnsignedChars(DFA92_minS);
    static final char[] DFA92_max = DFA.unpackEncodedStringToUnsignedChars(DFA92_maxS);
    static final short[] DFA92_accept = DFA.unpackEncodedString(DFA92_acceptS);
    static final short[] DFA92_special = DFA.unpackEncodedString(DFA92_specialS);
    static final short[][] DFA92_transition;

    static {
        int numStates = DFA92_transitionS.length;
        DFA92_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA92_transition[i] = DFA.unpackEncodedString(DFA92_transitionS[i]);
        }
    }

    class DFA92 extends DFA {

        public DFA92(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 92;
            this.eot = DFA92_eot;
            this.eof = DFA92_eof;
            this.min = DFA92_min;
            this.max = DFA92_max;
            this.accept = DFA92_accept;
            this.special = DFA92_special;
            this.transition = DFA92_transition;
        }
        public String getDescription() {
            return "3380:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | this_DoubleValue_2= ruleDoubleValue | ( ( ( '(' )=>otherlv_3= '(' ) this_ValuedExpression_4= ruleValuedExpression otherlv_5= ')' ) | this_AtomicExpression_6= ruleAtomicExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA92_2 = input.LA(1);

                         
                        int index92_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred106_InternalSct()) ) {s = 9;}

                        else if ( (synpred107_InternalSct()) ) {s = 10;}

                         
                        input.seek(index92_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA92_3 = input.LA(1);

                         
                        int index92_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalSct()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index92_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 92, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA95_eotS =
        "\15\uffff";
    static final String DFA95_eofS =
        "\3\uffff\1\6\3\uffff\1\13\4\uffff\1\6";
    static final String DFA95_minS =
        "\1\12\1\uffff\3\4\2\uffff\1\4\4\uffff\1\4";
    static final String DFA95_maxS =
        "\1\23\1\uffff\1\4\1\114\1\4\2\uffff\1\114\4\uffff\1\114";
    static final String DFA95_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\2\1\uffff\1\6\1\7\1\4\1\3\1\uffff";
    static final String DFA95_specialS =
        "\15\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\10\uffff\1\2",
            "",
            "\1\3",
            "\1\7\1\13\1\10\1\uffff\1\11\1\5\1\6\5\uffff\1\6\1\uffff\2"+
            "\6\1\12\4\uffff\3\6\5\uffff\4\6\6\uffff\2\6\1\uffff\1\4\7\6"+
            "\17\uffff\10\6",
            "\1\14",
            "",
            "",
            "\1\13\5\uffff\1\13\5\uffff\1\13\1\uffff\2\13\5\uffff\3\13"+
            "\1\6\4\uffff\4\13\2\6\4\uffff\2\13\2\uffff\7\13\17\uffff\10"+
            "\13",
            "",
            "",
            "",
            "",
            "\1\7\1\13\1\10\1\uffff\1\11\1\5\1\6\5\uffff\1\6\1\uffff\2"+
            "\6\1\12\4\uffff\3\6\5\uffff\4\6\6\uffff\2\6\1\uffff\1\4\7\6"+
            "\17\uffff\10\6"
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "3813:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_TagAnnotation_1= ruleTagAnnotation | this_KeyStringValueAnnotation_2= ruleKeyStringValueAnnotation | this_TypedKeyStringValueAnnotation_3= ruleTypedKeyStringValueAnnotation | this_KeyBooleanValueAnnotation_4= ruleKeyBooleanValueAnnotation | this_KeyIntValueAnnotation_5= ruleKeyIntValueAnnotation | this_KeyFloatValueAnnotation_6= ruleKeyFloatValueAnnotation )";
        }
    }
    static final String DFA154_eotS =
        "\16\uffff";
    static final String DFA154_eofS =
        "\1\2\15\uffff";
    static final String DFA154_minS =
        "\1\4\1\0\14\uffff";
    static final String DFA154_maxS =
        "\1\104\1\0\14\uffff";
    static final String DFA154_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA154_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA154_transitionS = {
            "\1\2\1\uffff\1\1\3\2\26\uffff\1\2\12\uffff\1\2\20\uffff\1\2"+
            "\2\uffff\1\2\1\uffff\1\2\2\uffff\1\2",
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

    static final short[] DFA154_eot = DFA.unpackEncodedString(DFA154_eotS);
    static final short[] DFA154_eof = DFA.unpackEncodedString(DFA154_eofS);
    static final char[] DFA154_min = DFA.unpackEncodedStringToUnsignedChars(DFA154_minS);
    static final char[] DFA154_max = DFA.unpackEncodedStringToUnsignedChars(DFA154_maxS);
    static final short[] DFA154_accept = DFA.unpackEncodedString(DFA154_acceptS);
    static final short[] DFA154_special = DFA.unpackEncodedString(DFA154_specialS);
    static final short[][] DFA154_transition;

    static {
        int numStates = DFA154_transitionS.length;
        DFA154_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA154_transition[i] = DFA.unpackEncodedString(DFA154_transitionS[i]);
        }
    }

    class DFA154 extends DFA {

        public DFA154(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 154;
            this.eot = DFA154_eot;
            this.eof = DFA154_eof;
            this.min = DFA154_min;
            this.max = DFA154_max;
            this.accept = DFA154_accept;
            this.special = DFA154_special;
            this.transition = DFA154_transition;
        }
        public String getDescription() {
            return "1332:3: ( (lv_delay_7_0= RULE_INT ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA154_1 = input.LA(1);

                         
                        int index154_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalSct()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index154_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 154, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootRegion_in_entryRuleRootRegion81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootRegion91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportAnnotation_in_ruleRootRegion149 = new BitSet(new long[]{0x0007A000000D0402L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleRootRegion172 = new BitSet(new long[]{0x0000000000090400L});
        public static final BitSet FOLLOW_16_in_ruleRootRegion185 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRootRegion202 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRootRegion224 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRootRegion242 = new BitSet(new long[]{0x0007801E000C0492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleRootRegion263 = new BitSet(new long[]{0x0007801E000C0492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleRootRegion285 = new BitSet(new long[]{0x00078000000C0482L});
        public static final BitSet FOLLOW_ruleSCChart_in_ruleRootRegion309 = new BitSet(new long[]{0x00078000000C0402L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion346 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRegion356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleSingleRegion415 = new BitSet(new long[]{0x0000000000090400L});
        public static final BitSet FOLLOW_16_in_ruleSingleRegion428 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRegion445 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRegion468 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSingleRegion486 = new BitSet(new long[]{0x0007801E0E080492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleSingleRegion507 = new BitSet(new long[]{0x0007801E0E080492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleSingleRegion529 = new BitSet(new long[]{0x000780000E080482L});
        public static final BitSet FOLLOW_ruleState_in_ruleSingleRegion553 = new BitSet(new long[]{0x000780000E080402L});
        public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion590 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegion600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleRegion658 = new BitSet(new long[]{0x0000000000090400L});
        public static final BitSet FOLLOW_16_in_ruleRegion671 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRegion688 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion711 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRegion729 = new BitSet(new long[]{0x0007801E0E080490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleRegion750 = new BitSet(new long[]{0x0007801E0E080490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleRegion772 = new BitSet(new long[]{0x000780000E080480L});
        public static final BitSet FOLLOW_ruleState_in_ruleRegion794 = new BitSet(new long[]{0x000780000E080402L});
        public static final BitSet FOLLOW_ruleSCChart_in_entryRuleSCChart831 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSCChart841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleSCChart887 = new BitSet(new long[]{0x00078000000C0400L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleSCChart909 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSCChart922 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSCChart939 = new BitSet(new long[]{0x0000000000880022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSCChart961 = new BitSet(new long[]{0x0000000000880002L});
        public static final BitSet FOLLOW_19_in_ruleSCChart981 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSCChart1005 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleSCChart1018 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleSCChart1039 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleSCChart1052 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleSCChart1073 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleSCChart1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSCChart1109 = new BitSet(new long[]{0x0007879E2F090490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleSCChart1132 = new BitSet(new long[]{0x0007879E2F090490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleLocalAction_in_ruleSCChart1159 = new BitSet(new long[]{0x0007879E2F090490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleSCChart1182 = new BitSet(new long[]{0x000780000F090480L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleSCChart1205 = new BitSet(new long[]{0x0000000001090400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleSCChart1226 = new BitSet(new long[]{0x0000000001090400L});
        public static final BitSet FOLLOW_24_in_ruleSCChart1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1281 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleState1337 = new BitSet(new long[]{0x000780000E080400L});
        public static final BitSet FOLLOW_25_in_ruleState1358 = new BitSet(new long[]{0x000780000C000000L});
        public static final BitSet FOLLOW_26_in_ruleState1389 = new BitSet(new long[]{0x0007800008000000L});
        public static final BitSet FOLLOW_26_in_ruleState1429 = new BitSet(new long[]{0x000780000A000000L});
        public static final BitSet FOLLOW_25_in_ruleState1460 = new BitSet(new long[]{0x0007800008000000L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleState1498 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleState1511 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1528 = new BitSet(new long[]{0x0038000010880420L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleState1550 = new BitSet(new long[]{0x0038000010880400L});
        public static final BitSet FOLLOW_19_in_ruleState1570 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1594 = new BitSet(new long[]{0x0038000010180400L});
        public static final BitSet FOLLOW_20_in_ruleState1607 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleState1628 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_ruleState1641 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleState1662 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_ruleState1676 = new BitSet(new long[]{0x0038000010080400L});
        public static final BitSet FOLLOW_23_in_ruleState1698 = new BitSet(new long[]{0x0007879E2F090490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_ruleState1721 = new BitSet(new long[]{0x0007879E2F090490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleLocalAction_in_ruleState1748 = new BitSet(new long[]{0x0007879E2F090490L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleState1771 = new BitSet(new long[]{0x000780000F090480L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleState1794 = new BitSet(new long[]{0x0000000001090400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleState1815 = new BitSet(new long[]{0x0000000001090400L});
        public static final BitSet FOLLOW_24_in_ruleState1831 = new BitSet(new long[]{0x0038000010080400L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState1855 = new BitSet(new long[]{0x0038000010080400L});
        public static final BitSet FOLLOW_28_in_ruleState1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalAction_in_entryRuleLocalAction1904 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalAction1914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntryAction_in_ruleLocalAction1964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuringAction_in_ruleLocalAction1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExitAction_in_ruleLocalAction2024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuspendAction_in_ruleLocalAction2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTransition2145 = new BitSet(new long[]{0x0038000000080400L});
        public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition2167 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition2184 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2214 = new BitSet(new long[]{0x00000000E0000002L});
        public static final BitSet FOLLOW_29_in_ruleTransition2233 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_30_in_ruleTransition2265 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleTransition2292 = new BitSet(new long[]{0x90000801000003F2L,0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition2311 = new BitSet(new long[]{0x90000801000003D2L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleTransition2338 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleTransition2352 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2373 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleTransition2386 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2407 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_entryRuleValuedObject2481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObject2491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleValuedObject2537 = new BitSet(new long[]{0x0000001E00080410L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_33_in_ruleValuedObject2556 = new BitSet(new long[]{0x0000001C00000010L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_34_in_ruleValuedObject2588 = new BitSet(new long[]{0x0000001800000010L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_35_in_ruleValuedObject2620 = new BitSet(new long[]{0x0000001000000010L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_36_in_ruleValuedObject2652 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleValuedObject2687 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObject2705 = new BitSet(new long[]{0x0000006010000000L});
        public static final BitSet FOLLOW_37_in_ruleValuedObject2723 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleValuedObject2744 = new BitSet(new long[]{0x0000004010000000L});
        public static final BitSet FOLLOW_38_in_ruleValuedObject2759 = new BitSet(new long[]{0x6000000000000000L,0x000000000000F005L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleValuedObject2780 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleValuedObject2794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextualCode_in_entryRuleTextualCode2830 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextualCode2840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextualCode2882 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleTextualCode2899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstitution_in_entryRuleSubstitution2935 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution2987 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubstitution3004 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution3021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntryAction_in_entryRuleEntryAction3062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntryAction3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleEntryAction3121 = new BitSet(new long[]{0x90000801100003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleEntryAction3142 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_32_in_ruleEntryAction3156 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction3177 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEntryAction3190 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleEntryAction3211 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleEntryAction3227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDuringAction_in_entryRuleDuringAction3263 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDuringAction3273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDuringAction3328 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleDuringAction3354 = new BitSet(new long[]{0x90000801100003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleDuringAction3375 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_32_in_ruleDuringAction3389 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleDuringAction3410 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleDuringAction3423 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleDuringAction3444 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleDuringAction3460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExitAction_in_entryRuleExitAction3496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExitAction3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleExitAction3555 = new BitSet(new long[]{0x90000801100003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExitAction3576 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_32_in_ruleExitAction3590 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction3611 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleExitAction3624 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleExitAction3645 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleExitAction3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSuspendAction_in_entryRuleSuspendAction3697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSuspendAction3707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSuspendAction3762 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleSuspendAction3788 = new BitSet(new long[]{0x90000800100003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleSuspendAction3809 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleSuspendAction3822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect3858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect3868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect3918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect3978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission4013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission4023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission4072 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleEmission4085 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission4106 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleEmission4118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment4156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment4166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment4215 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAssignment4227 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment4248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect4284 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect4294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect4335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4377 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression4387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleExpression4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression4474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_entryRuleBoolExpression4509 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpression4519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBoolExpression4568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4662 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression4695 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4716 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression4754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression4764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression4814 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression4847 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression4868 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation4916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4973 = new BitSet(new long[]{0x0FC0000000000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation5007 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression5096 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression5162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression5193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression5228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression5238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression5297 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression5318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression5350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression5385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression5395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression5444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression5478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression5488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression5538 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression5571 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression5592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression5630 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression5640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression5690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression5723 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression5744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression5782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression5792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression5842 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression5875 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression5896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression5934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression5944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5994 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression6027 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression6048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression6086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression6096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression6146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression6179 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression6200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression6238 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression6248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression6307 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression6328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression6360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression6395 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression6405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_ruleAtomicExpression6455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression6485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAtomicExpression6503 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_ruleAtomicExpression6528 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleAtomicExpression6539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression6571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression6606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression6616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression6666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression6696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_ruleAtomicValuedExpression6726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAtomicValuedExpression6752 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression6778 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleAtomicValuedExpression6789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression6821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression6856 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression6866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression6927 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_ruleValOperator_in_ruleValuedObjectTestExpression6946 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleValuedObjectTestExpression6961 = new BitSet(new long[]{0x1000000000000010L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression6982 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleValuedObjectTestExpression6994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression7026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference7061 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference7071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference7119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression7154 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression7164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression7205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue7245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue7255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue7296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue7336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue7346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue7387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolValue_in_entryRuleBoolValue7427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBoolValue7437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBoolValue7478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_entryRuleDoubleValue7518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDoubleValue7528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleDoubleValue7569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation7611 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation7621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleAnnotation7671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_ruleAnnotation7701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_ruleAnnotation7731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_ruleAnnotation7761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_ruleAnnotation7791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_ruleAnnotation7821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_ruleAnnotation7851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation7888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation7898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation7939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation7979 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation7989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTagAnnotation8026 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTagAnnotation8047 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleTagAnnotation8060 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTagAnnotation8081 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_44_in_ruleTagAnnotation8094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation8132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation8142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleKeyStringValueAnnotation8179 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyStringValueAnnotation8200 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyStringValueAnnotation8221 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleKeyStringValueAnnotation8234 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyStringValueAnnotation8255 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_44_in_ruleKeyStringValueAnnotation8268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation8306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation8316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTypedKeyStringValueAnnotation8353 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8374 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTypedKeyStringValueAnnotation8386 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleTypedKeyStringValueAnnotation8407 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleTypedKeyStringValueAnnotation8419 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTypedKeyStringValueAnnotation8440 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleTypedKeyStringValueAnnotation8453 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleTypedKeyStringValueAnnotation8474 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_44_in_ruleTypedKeyStringValueAnnotation8487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation8525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation8535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleKeyBooleanValueAnnotation8572 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyBooleanValueAnnotation8593 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleKeyBooleanValueAnnotation8610 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleKeyBooleanValueAnnotation8628 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyBooleanValueAnnotation8649 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_44_in_ruleKeyBooleanValueAnnotation8662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation8700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation8710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleKeyIntValueAnnotation8747 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyIntValueAnnotation8768 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleKeyIntValueAnnotation8785 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleKeyIntValueAnnotation8803 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyIntValueAnnotation8824 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_44_in_ruleKeyIntValueAnnotation8837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation8875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation8885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleKeyFloatValueAnnotation8922 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleExtendedID_in_ruleKeyFloatValueAnnotation8943 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleKeyFloatValueAnnotation8960 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleKeyFloatValueAnnotation8978 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleKeyFloatValueAnnotation8999 = new BitSet(new long[]{0x0000100000080400L});
        public static final BitSet FOLLOW_44_in_ruleKeyFloatValueAnnotation9012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportAnnotation_in_entryRuleImportAnnotation9050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportAnnotation9060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleImportAnnotation9097 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportAnnotation9114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString9156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString9167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString9207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString9233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID9279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID9290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9330 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleExtendedID9349 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID9364 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_47_in_ruleStateType9425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleStateType9442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStateType9459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleStateType9476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTransitionType9521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTransitionType9538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTransitionType9555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleDivOperator9599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCompareOperator9643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleCompareOperator9660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleCompareOperator9677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleCompareOperator9694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleCompareOperator9711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleCompareOperator9728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePreOperator9772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleOrOperator9815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAndOperator9858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleNotOperator9901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleAddOperator9944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleSubOperator9987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMultOperator10030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleModOperator10073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleValOperator10116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleValueType10160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleValueType10177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleValueType10194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleValueType10211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleValueType10228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleValueType10245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleValueType10262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleValueType10279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleCombineOperator10324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCombineOperator10341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCombineOperator10358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleCombineOperator10375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_79_in_ruleCombineOperator10392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCombineOperator10409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCombineOperator10426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleCombineOperator10443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred4_InternalSct263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_synpred6_InternalSct172 = new BitSet(new long[]{0x0000000000090400L});
        public static final BitSet FOLLOW_16_in_synpred6_InternalSct185 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred6_InternalSct202 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred6_InternalSct224 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred6_InternalSct242 = new BitSet(new long[]{0x0000001E00080492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred6_InternalSct263 = new BitSet(new long[]{0x0000001E00080492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_synpred6_InternalSct285 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred11_InternalSct507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_synpred13_InternalSct415 = new BitSet(new long[]{0x0000000000090400L});
        public static final BitSet FOLLOW_16_in_synpred13_InternalSct428 = new BitSet(new long[]{0x0000000000020030L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred13_InternalSct445 = new BitSet(new long[]{0x0000000000020020L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred13_InternalSct468 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_synpred13_InternalSct486 = new BitSet(new long[]{0x0000001E00080492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred13_InternalSct507 = new BitSet(new long[]{0x0000001E00080492L,0x0000000000001FE0L});
        public static final BitSet FOLLOW_ruleTextualCode_in_synpred13_InternalSct529 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_ruleState_in_synpred14_InternalSct553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred18_InternalSct750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_synpred20_InternalSct794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_synpred26_InternalSct981 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred26_InternalSct1005 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_synpred26_InternalSct1018 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_synpred26_InternalSct1039 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_synpred26_InternalSct1052 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_synpred26_InternalSct1073 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_synpred26_InternalSct1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred27_InternalSct1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred31_InternalSct1205 = new BitSet(new long[]{0x0000000000090402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred31_InternalSct1226 = new BitSet(new long[]{0x0000000000090402L});
        public static final BitSet FOLLOW_19_in_synpred42_InternalSct1570 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred42_InternalSct1594 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_synpred42_InternalSct1607 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_synpred42_InternalSct1628 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_21_in_synpred42_InternalSct1641 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_synpred42_InternalSct1662 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_22_in_synpred42_InternalSct1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObject_in_synpred43_InternalSct1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred47_InternalSct1794 = new BitSet(new long[]{0x0000000000090402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred47_InternalSct1815 = new BitSet(new long[]{0x0000000000090402L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred57_InternalSct2311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_synpred63_InternalSct2233 = new BitSet(new long[]{0x00000000C0000002L});
        public static final BitSet FOLLOW_30_in_synpred63_InternalSct2265 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_synpred63_InternalSct2292 = new BitSet(new long[]{0x90000801000003F2L,0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred63_InternalSct2311 = new BitSet(new long[]{0x90000801000003D2L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred63_InternalSct2338 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_synpred63_InternalSct2352 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred63_InternalSct2373 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_synpred63_InternalSct2386 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred63_InternalSct2407 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred63_InternalSct2435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred73_InternalSct3190 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred73_InternalSct3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred77_InternalSct3423 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred77_InternalSct3444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred80_InternalSct3624 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_synpred80_InternalSct3645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBoolExpression_in_synpred88_InternalSct4443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred92_InternalSct4973 = new BitSet(new long[]{0x0FC0000000000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred92_InternalSct5007 = new BitSet(new long[]{0x90000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred92_InternalSct5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred94_InternalSct5162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_synpred106_InternalSct6696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDoubleValue_in_synpred107_InternalSct6726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_synpred109_InternalSct6752 = new BitSet(new long[]{0x10000800000003D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred109_InternalSct6778 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_synpred109_InternalSct6789 = new BitSet(new long[]{0x0000000000000002L});
    }


}