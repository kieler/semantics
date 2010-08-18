package de.cau.cs.kieler.synccharts.text.kits.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.synccharts.text.kits.services.KitsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalKitsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'init'", "'final'", "'state'", "'@'", "'['", "','", "']'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'}'", "'with'", "'#'", "'/'", "'history'", "'input'", "'output'", "'signal'", "':='", "'combine'", "'var'", "'('", "')'", "'import'", "'normal'", "'conditional'", "'reference'", "'textual'", "'-->'", "'o->'", "'>->'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'?'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=6;
    public static final int RULE_WS=13;
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int EOF=-1;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_HOSTCODE=7;
    public static final int RULE_ML_COMMENT=11;

        public InternalKitsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[216+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private KitsGrammarAccess grammarAccess;
     	
        public InternalKitsParser(TokenStream input, IAstFactory factory, KitsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RootRegion";	
       	}
       	
       	@Override
       	protected KitsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleRootRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:84:1: entryRuleRootRegion returns [EObject current=null] : iv_ruleRootRegion= ruleRootRegion EOF ;
    public final EObject entryRuleRootRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:85:2: (iv_ruleRootRegion= ruleRootRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:86:2: iv_ruleRootRegion= ruleRootRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRootRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRootRegion_in_entryRuleRootRegion81);
            iv_ruleRootRegion=ruleRootRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRootRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRootRegion91); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRootRegion


    // $ANTLR start ruleRootRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:93:1: ruleRootRegion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( (lv_annotations_1_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' )? ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_states_8_0= ruleState ) )* ) ;
    public final EObject ruleRootRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_signals_7_0 = null;

        EObject lv_states_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:98:6: ( ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( (lv_annotations_1_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' )? ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_states_8_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:1: ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( (lv_annotations_1_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' )? ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_states_8_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:1: ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( (lv_annotations_1_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' )? ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_states_8_0= ruleState ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:2: ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( (lv_annotations_1_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' )? ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_states_8_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:2: ( (lv_annotations_0_0= ruleImportAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:100:1: (lv_annotations_0_0= ruleImportAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:100:1: (lv_annotations_0_0= ruleImportAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:101:3: lv_annotations_0_0= ruleImportAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsImportAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleImportAnnotation_in_ruleRootRegion137);
            	    lv_annotations_0_0=ruleImportAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"ImportAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:123:3: ( (lv_annotations_1_0= ruleStringAnnotation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_COMMENT_ANNOTATION) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2()) ) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0==20) ) {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==RULE_ID) ) {
                        int LA2_5 = input.LA(3);

                        if ( (LA2_5==RULE_STRING) ) {
                            int LA2_6 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_5==RULE_ID) ) {
                            int LA2_7 = input.LA(4);

                            if ( (synpred2()) ) {
                                alt2=1;
                            }


                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: (lv_annotations_1_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: (lv_annotations_1_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:125:3: lv_annotations_1_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsStringAnnotationParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleRootRegion159);
            	    lv_annotations_1_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_1_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:147:3: ( 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:147:5: 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleRootRegion171); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRootRegionAccess().getRegionKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:151:1: ( (lv_id_3_0= RULE_ID ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_ID) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:152:1: (lv_id_3_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:152:1: (lv_id_3_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:153:3: lv_id_3_0= RULE_ID
                            {
                            lv_id_3_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRootRegion188); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getRootRegionAccess().getIdIDTerminalRuleCall_2_1_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_3_0, 
                              	        		"ID", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:175:3: ( (lv_label_4_0= RULE_STRING ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_STRING) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:176:1: (lv_label_4_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:176:1: (lv_label_4_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:177:3: lv_label_4_0= RULE_STRING
                            {
                            lv_label_4_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRootRegion211); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getRootRegionAccess().getLabelSTRINGTerminalRuleCall_2_2_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_4_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleRootRegion227); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRootRegionAccess().getColonKeyword_2_3(), null); 
                          
                    }

                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:3: ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )*
            loop6:
            do {
                int alt6=3;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:4: ( (lv_variables_6_0= ruleVariable ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:4: ( (lv_variables_6_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:204:1: (lv_variables_6_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:204:1: (lv_variables_6_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:205:3: lv_variables_6_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getVariablesVariableParserRuleCall_3_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRootRegion251);
            	    lv_variables_6_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_6_0, 
            	      	        		"Variable", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:228:6: ( (lv_signals_7_0= ruleSignal ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:228:6: ( (lv_signals_7_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:229:1: (lv_signals_7_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:229:1: (lv_signals_7_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:230:3: lv_signals_7_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getSignalsSignalParserRuleCall_3_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleRootRegion278);
            	    lv_signals_7_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_7_0, 
            	      	        		"Signal", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:252:4: ( (lv_states_8_0= ruleState ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_COMMENT_ANNOTATION||(LA7_0>=17 && LA7_0<=20)||(LA7_0>=43 && LA7_0<=46)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:253:1: (lv_states_8_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:253:1: (lv_states_8_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:254:3: lv_states_8_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getStatesStateParserRuleCall_4_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRootRegion301);
            	    lv_states_8_0=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRootRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"states",
            	      	        		lv_states_8_0, 
            	      	        		"State", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRootRegion


    // $ANTLR start entryRuleSingleRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:284:1: entryRuleSingleRegion returns [EObject current=null] : iv_ruleSingleRegion= ruleSingleRegion EOF ;
    public final EObject entryRuleSingleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:285:2: (iv_ruleSingleRegion= ruleSingleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:286:2: iv_ruleSingleRegion= ruleSingleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSingleRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion338);
            iv_ruleSingleRegion=ruleSingleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSingleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRegion348); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSingleRegion


    // $ANTLR start ruleSingleRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:293:1: ruleSingleRegion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )? ( (lv_states_7_0= ruleState ) )* ) ;
    public final EObject ruleSingleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_signals_6_0 = null;

        EObject lv_states_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:298:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )? ( (lv_states_7_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:299:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )? ( (lv_states_7_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:299:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )? ( (lv_states_7_0= ruleState ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:299:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )? ( (lv_states_7_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:299:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==20) ) {
                    int LA8_3 = input.LA(2);

                    if ( (LA8_3==RULE_ID) ) {
                        int LA8_5 = input.LA(3);

                        if ( (LA8_5==RULE_STRING) ) {
                            int LA8_6 = input.LA(4);

                            if ( (synpred9()) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_5==RULE_ID) ) {
                            int LA8_7 = input.LA(4);

                            if ( (synpred9()) ) {
                                alt8=1;
                            }


                        }


                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:300:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:300:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:301:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleSingleRegion394);
            	    lv_annotations_0_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSingleRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:3: ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:5: 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleRegion406); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSingleRegionAccess().getRegionKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:327:1: ( (lv_id_2_0= RULE_ID ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:328:1: (lv_id_2_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:328:1: (lv_id_2_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:329:3: lv_id_2_0= RULE_ID
                            {
                            lv_id_2_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRegion423); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSingleRegionAccess().getIdIDTerminalRuleCall_1_1_0(), "id"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSingleRegionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"id",
                              	        		lv_id_2_0, 
                              	        		"ID", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:351:3: ( (lv_label_3_0= RULE_STRING ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_STRING) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: (lv_label_3_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: (lv_label_3_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:353:3: lv_label_3_0= RULE_STRING
                            {
                            lv_label_3_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingleRegion446); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSingleRegionAccess().getLabelSTRINGTerminalRuleCall_1_2_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSingleRegionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_3_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleRegion462); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSingleRegionAccess().getColonKeyword_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:379:1: ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        alt11 = dfa11.predict(input);
                        switch (alt11) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:379:2: ( (lv_variables_5_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:379:2: ( (lv_variables_5_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:380:1: (lv_variables_5_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:380:1: (lv_variables_5_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:381:3: lv_variables_5_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getVariablesVariableParserRuleCall_1_4_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleSingleRegion484);
                    	    lv_variables_5_0=ruleVariable();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSingleRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"variables",
                    	      	        		lv_variables_5_0, 
                    	      	        		"Variable", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:6: ( (lv_signals_6_0= ruleSignal ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:6: ( (lv_signals_6_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:405:1: (lv_signals_6_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:405:1: (lv_signals_6_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:406:3: lv_signals_6_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getSignalsSignalParserRuleCall_1_4_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleSingleRegion511);
                    	    lv_signals_6_0=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getSingleRegionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_6_0, 
                    	      	        		"Signal", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:428:6: ( (lv_states_7_0= ruleState ) )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:429:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:429:1: (lv_states_7_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:430:3: lv_states_7_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getStatesStateParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleSingleRegion536);
            	    lv_states_7_0=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSingleRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"states",
            	      	        		lv_states_7_0, 
            	      	        		"State", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSingleRegion


    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:460:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:461:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:462:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRegion_in_entryRuleRegion573);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegion583); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRegion


    // $ANTLR start ruleRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:469:1: ruleRegion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_states_7_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_signals_6_0 = null;

        EObject lv_states_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:474:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_states_7_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:475:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_states_7_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:475:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_states_7_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:475:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_states_7_0= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:475:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMENT_ANNOTATION||LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:476:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:476:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:477:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleRegion629);
            	    lv_annotations_0_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,15,FollowSets000.FOLLOW_15_in_ruleRegion640); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:503:1: ( (lv_id_2_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:504:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:504:1: (lv_id_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:505:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRegion657); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getRegionAccess().getIdIDTerminalRuleCall_2_0(), "id"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"id",
                      	        		lv_id_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:527:3: ( (lv_label_3_0= RULE_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:528:1: (lv_label_3_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:528:1: (lv_label_3_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:529:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRegion680); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getRegionAccess().getLabelSTRINGTerminalRuleCall_3_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_3_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleRegion696); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionAccess().getColonKeyword_4(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:555:1: ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*
            loop17:
            do {
                int alt17=3;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:555:2: ( (lv_variables_5_0= ruleVariable ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:555:2: ( (lv_variables_5_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:556:1: (lv_variables_5_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:556:1: (lv_variables_5_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:557:3: lv_variables_5_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_5_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRegion718);
            	    lv_variables_5_0=ruleVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_5_0, 
            	      	        		"Variable", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:580:6: ( (lv_signals_6_0= ruleSignal ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:580:6: ( (lv_signals_6_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:581:1: (lv_signals_6_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:581:1: (lv_signals_6_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:582:3: lv_signals_6_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleRegion745);
            	    lv_signals_6_0=ruleSignal();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"signals",
            	      	        		lv_signals_6_0, 
            	      	        		"Signal", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:604:4: ( (lv_states_7_0= ruleState ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:605:1: (lv_states_7_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:605:1: (lv_states_7_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:606:3: lv_states_7_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRegion768);
            	    lv_states_7_0=ruleState();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRegionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"states",
            	      	        		lv_states_7_0, 
            	      	        		"State", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRegion


    // $ANTLR start entryRuleState
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:636:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:637:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:638:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState805);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState815); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleState


    // $ANTLR start ruleState
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:645:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_30_0= ruleTransition ) )* ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_isInitial_1_0=null;
        Token lv_isFinal_2_0=null;
        Token lv_isFinal_3_0=null;
        Token lv_isInitial_4_0=null;
        Token lv_id_7_0=null;
        Token lv_label_8_0=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_5_0 = null;

        EObject lv_renamings_12_0 = null;

        EObject lv_renamings_14_0 = null;

        EObject lv_signals_17_0 = null;

        EObject lv_variables_18_0 = null;

        EObject lv_entryActions_20_0 = null;

        EObject lv_innerActions_22_0 = null;

        EObject lv_exitActions_24_0 = null;

        EObject lv_suspensionTrigger_26_0 = null;

        EObject lv_regions_27_0 = null;

        EObject lv_regions_28_0 = null;

        EObject lv_outgoingTransitions_30_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:650:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_30_0= ruleTransition ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:651:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_30_0= ruleTransition ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:651:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_30_0= ruleTransition ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:651:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_30_0= ruleTransition ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:651:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_COMMENT_ANNOTATION||LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:652:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:652:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:653:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleState861);
            	    lv_annotations_0_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:675:3: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            else if ( (LA22_0==18) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:675:4: ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:675:4: ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:675:5: ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:675:5: ( (lv_isInitial_1_0= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:676:1: (lv_isInitial_1_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:676:1: (lv_isInitial_1_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:677:3: lv_isInitial_1_0= 'init'
                    {
                    lv_isInitial_1_0=(Token)input.LT(1);
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleState882); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_0_0_0(), "isInitial"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInitial", true, "init", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:696:2: ( (lv_isFinal_2_0= 'final' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==18) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:697:1: (lv_isFinal_2_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:697:1: (lv_isFinal_2_0= 'final' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:698:3: lv_isFinal_2_0= 'final'
                            {
                            lv_isFinal_2_0=(Token)input.LT(1);
                            match(input,18,FollowSets000.FOLLOW_18_in_ruleState913); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_0_1_0(), "isFinal"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isFinal", true, "final", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:718:6: ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:718:6: ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:718:7: ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:718:7: ( (lv_isFinal_3_0= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:719:1: (lv_isFinal_3_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:719:1: (lv_isFinal_3_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:720:3: lv_isFinal_3_0= 'final'
                    {
                    lv_isFinal_3_0=(Token)input.LT(1);
                    match(input,18,FollowSets000.FOLLOW_18_in_ruleState953); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getIsFinalFinalKeyword_1_1_0_0(), "isFinal"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isFinal", true, "final", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:739:2: ( (lv_isInitial_4_0= 'init' ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==17) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:740:1: (lv_isInitial_4_0= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:740:1: (lv_isInitial_4_0= 'init' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:741:3: lv_isInitial_4_0= 'init'
                            {
                            lv_isInitial_4_0=(Token)input.LT(1);
                            match(input,17,FollowSets000.FOLLOW_17_in_ruleState984); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getIsInitialInitKeyword_1_1_1_0(), "isInitial"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "isInitial", true, "init", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:760:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=43 && LA23_0<=46)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:761:1: (lv_type_5_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:761:1: (lv_type_5_0= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:762:3: lv_type_5_0= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleState1022);
                    lv_type_5_0=ruleStateType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_5_0, 
                      	        		"StateType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,19,FollowSets000.FOLLOW_19_in_ruleState1033); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateAccess().getStateKeyword_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:788:1: ( (lv_id_7_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:789:1: (lv_id_7_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:789:1: (lv_id_7_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:790:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1050); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStateAccess().getIdIDTerminalRuleCall_4_0(), "id"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"id",
              	        		lv_id_7_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:812:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:813:1: (lv_label_8_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:813:1: (lv_label_8_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:814:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleState1072); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getStateAccess().getLabelSTRINGTerminalRuleCall_5_0(), "label"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"label",
                      	        		lv_label_8_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:836:3: ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' ) )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_ID) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==EOF||LA30_4==RULE_COMMENT_ANNOTATION||LA30_4==15||(LA30_4>=17 && LA30_4<=21)||LA30_4==29||(LA30_4>=43 && LA30_4<=49)) ) {
                        alt30=1;
                    }
                }
            }
            else if ( (LA30_0==24) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:836:4: ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:836:4: ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:836:6: '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )?
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleState1090); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getCommercialAtKeyword_6_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:840:1: ( ( RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:841:1: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:841:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:842:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1112); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getBodyReferenceStateCrossReference_6_0_1_0(), "bodyReference"); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:857:2: ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==21) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:857:4: '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']'
                            {
                            match(input,21,FollowSets000.FOLLOW_21_in_ruleState1123); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_6_0_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:861:1: ( (lv_renamings_12_0= ruleSubstitution ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:862:1: (lv_renamings_12_0= ruleSubstitution )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:862:1: (lv_renamings_12_0= ruleSubstitution )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:863:3: lv_renamings_12_0= ruleSubstitution
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleState1144);
                            lv_renamings_12_0=ruleSubstitution();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"renamings",
                              	        		lv_renamings_12_0, 
                              	        		"Substitution", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:885:2: ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==22) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:885:4: ',' ( (lv_renamings_14_0= ruleSubstitution ) )
                            	    {
                            	    match(input,22,FollowSets000.FOLLOW_22_in_ruleState1155); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:889:1: ( (lv_renamings_14_0= ruleSubstitution ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:890:1: (lv_renamings_14_0= ruleSubstitution )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:890:1: (lv_renamings_14_0= ruleSubstitution )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:891:3: lv_renamings_14_0= ruleSubstitution
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleState1176);
                            	    lv_renamings_14_0=ruleSubstitution();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"renamings",
                            	      	        		lv_renamings_14_0, 
                            	      	        		"Substitution", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            match(input,23,FollowSets000.FOLLOW_23_in_ruleState1188); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getRightSquareBracketKeyword_6_0_2_3(), null); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:918:6: ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:918:6: ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:918:8: '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? ) '}'
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleState1208); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:922:1: ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:922:2: ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:922:2: ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )*
                    loop27:
                    do {
                        int alt27=7;
                        alt27 = dfa27.predict(input);
                        switch (alt27) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:922:3: ( (lv_signals_17_0= ruleSignal ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:922:3: ( (lv_signals_17_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:923:1: (lv_signals_17_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:923:1: (lv_signals_17_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:924:3: lv_signals_17_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_6_1_1_0_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleState1231);
                    	    lv_signals_17_0=ruleSignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_17_0, 
                    	      	        		"Signal", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:947:6: ( (lv_variables_18_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:947:6: ( (lv_variables_18_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:948:1: (lv_variables_18_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:948:1: (lv_variables_18_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:949:3: lv_variables_18_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getVariablesVariableParserRuleCall_6_1_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleState1258);
                    	    lv_variables_18_0=ruleVariable();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"variables",
                    	      	        		lv_variables_18_0, 
                    	      	        		"Variable", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:972:6: ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:972:6: ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:972:8: 'onentry' ( (lv_entryActions_20_0= ruleAction ) )
                    	    {
                    	    match(input,25,FollowSets000.FOLLOW_25_in_ruleState1275); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_6_1_1_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:976:1: ( (lv_entryActions_20_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:977:1: (lv_entryActions_20_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:977:1: (lv_entryActions_20_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:978:3: lv_entryActions_20_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_6_1_1_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1296);
                    	    lv_entryActions_20_0=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"entryActions",
                    	      	        		lv_entryActions_20_0, 
                    	      	        		"Action", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1001:6: ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1001:6: ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1001:8: 'oninner' ( (lv_innerActions_22_0= ruleAction ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleState1314); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_6_1_1_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1005:1: ( (lv_innerActions_22_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1006:1: (lv_innerActions_22_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1006:1: (lv_innerActions_22_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1007:3: lv_innerActions_22_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_6_1_1_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1335);
                    	    lv_innerActions_22_0=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"innerActions",
                    	      	        		lv_innerActions_22_0, 
                    	      	        		"Action", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1030:6: ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1030:6: ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1030:8: 'onexit' ( (lv_exitActions_24_0= ruleAction ) )
                    	    {
                    	    match(input,27,FollowSets000.FOLLOW_27_in_ruleState1353); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_6_1_1_0_4_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1034:1: ( (lv_exitActions_24_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1035:1: (lv_exitActions_24_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1035:1: (lv_exitActions_24_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1036:3: lv_exitActions_24_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_6_1_1_0_4_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1374);
                    	    lv_exitActions_24_0=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"exitActions",
                    	      	        		lv_exitActions_24_0, 
                    	      	        		"Action", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1059:6: ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1059:6: ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1059:8: 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) )
                    	    {
                    	    match(input,28,FollowSets000.FOLLOW_28_in_ruleState1392); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_6_1_1_0_5_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1063:1: ( (lv_suspensionTrigger_26_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1064:1: (lv_suspensionTrigger_26_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1064:1: (lv_suspensionTrigger_26_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1065:3: lv_suspensionTrigger_26_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_6_1_1_0_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1413);
                    	    lv_suspensionTrigger_26_0=ruleAction();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		set(
                    	      	       			current, 
                    	      	       			"suspensionTrigger",
                    	      	        		lv_suspensionTrigger_26_0, 
                    	      	        		"Action", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:5: ( ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_COMMENT_ANNOTATION||LA29_0==15||(LA29_0>=17 && LA29_0<=20)||(LA29_0>=43 && LA29_0<=46)) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==29) ) {
                        int LA29_2 = input.LA(2);

                        if ( (synpred39()) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:6: ( (lv_regions_27_0= ruleSingleRegion ) ) ( (lv_regions_28_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:6: ( (lv_regions_27_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1088:1: (lv_regions_27_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1088:1: (lv_regions_27_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1089:3: lv_regions_27_0= ruleSingleRegion
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleState1438);
                            lv_regions_27_0=ruleSingleRegion();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"regions",
                              	        		lv_regions_27_0, 
                              	        		"SingleRegion", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1111:2: ( (lv_regions_28_0= ruleRegion ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==15||LA28_0==20) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1112:1: (lv_regions_28_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1112:1: (lv_regions_28_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1113:3: lv_regions_28_0= ruleRegion
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleState1459);
                            	    lv_regions_28_0=ruleRegion();
                            	    _fsp--;
                            	    if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
                            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	      	        }
                            	      	        try {
                            	      	       		add(
                            	      	       			current, 
                            	      	       			"regions",
                            	      	        		lv_regions_28_0, 
                            	      	        		"Region", 
                            	      	        		currentNode);
                            	      	        } catch (ValueConverterException vce) {
                            	      				handleValueConverterException(vce);
                            	      	        }
                            	      	        currentNode = currentNode.getParent();
                            	      	    
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

                    match(input,29,FollowSets000.FOLLOW_29_in_ruleState1473); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1139:4: ( (lv_outgoingTransitions_30_0= ruleTransition ) )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1140:1: (lv_outgoingTransitions_30_0= ruleTransition )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1140:1: (lv_outgoingTransitions_30_0= ruleTransition )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1141:3: lv_outgoingTransitions_30_0= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState1497);
            	    lv_outgoingTransitions_30_0=ruleTransition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getStateRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"outgoingTransitions",
            	      	        		lv_outgoingTransitions_30_0, 
            	      	        		"Transition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleState


    // $ANTLR start entryRuleTransition
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1171:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1172:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1173:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1534);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1544); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTransition


    // $ANTLR start ruleTransition
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1180:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_priority_2_0=null;
        Token lv_isImmediate_5_0=null;
        Token lv_delay_6_0=null;
        Token lv_label_12_0=null;
        Token lv_isHistory_13_0=null;
        EObject lv_annotations_0_0 = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_trigger_7_0 = null;

        EObject lv_effects_9_0 = null;

        EObject lv_effects_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1185:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1186:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1186:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1186:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1186:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==20) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1187:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1187:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1188:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleTransition1590);
            	    lv_annotations_0_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1210:3: ( (lv_type_1_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1211:1: (lv_type_1_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1211:1: (lv_type_1_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1212:3: lv_type_1_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionType_in_ruleTransition1612);
            lv_type_1_0=ruleTransitionType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_1_0, 
              	        		"TransitionType", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1234:2: ( (lv_priority_2_0= RULE_INT ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1235:1: (lv_priority_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1235:1: (lv_priority_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1236:3: lv_priority_2_0= RULE_INT
                    {
                    lv_priority_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition1629); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTransitionAccess().getPriorityINTTerminalRuleCall_2_0(), "priority"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"priority",
                      	        		lv_priority_2_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1258:3: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1259:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1259:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1260:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition1657); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_3_0(), "targetState"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1275:2: ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1275:4: 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) )
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_ruleTransition1668); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1279:1: ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==EOF||LA39_0==RULE_ID||(LA39_0>=RULE_INT && LA39_0<=RULE_COMMENT_ANNOTATION)||LA39_0==15||(LA39_0>=17 && LA39_0<=20)||LA39_0==29||(LA39_0>=31 && LA39_0<=33)||LA39_0==40||(LA39_0>=43 && LA39_0<=49)||LA39_0==56||LA39_0==59||LA39_0==64) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_STRING) ) {
                        alt39=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1279:1: ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1279:2: ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1279:2: ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1279:3: ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )?
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1279:3: ( (lv_isImmediate_5_0= '#' ) )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==31) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1280:1: (lv_isImmediate_5_0= '#' )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1280:1: (lv_isImmediate_5_0= '#' )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1281:3: lv_isImmediate_5_0= '#'
                                    {
                                    lv_isImmediate_5_0=(Token)input.LT(1);
                                    match(input,31,FollowSets000.FOLLOW_31_in_ruleTransition1688); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getTransitionAccess().getIsImmediateNumberSignKeyword_4_1_0_0_0(), "isImmediate"); 
                                          
                                    }
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode, current);
                                      	        }
                                      	        
                                      	        try {
                                      	       		set(current, "isImmediate", true, "#", lastConsumedNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1300:3: ( (lv_delay_6_0= RULE_INT ) )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==RULE_INT) ) {
                                int LA35_1 = input.LA(2);

                                if ( (LA35_1==EOF||LA35_1==RULE_ID||(LA35_1>=RULE_INT && LA35_1<=RULE_COMMENT_ANNOTATION)||LA35_1==15||(LA35_1>=17 && LA35_1<=20)||LA35_1==29||(LA35_1>=32 && LA35_1<=33)||LA35_1==40||(LA35_1>=43 && LA35_1<=49)||LA35_1==56||LA35_1==59||LA35_1==64) ) {
                                    alt35=1;
                                }
                            }
                            switch (alt35) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1301:1: (lv_delay_6_0= RULE_INT )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1301:1: (lv_delay_6_0= RULE_INT )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1302:3: lv_delay_6_0= RULE_INT
                                    {
                                    lv_delay_6_0=(Token)input.LT(1);
                                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition1719); if (failed) return current;
                                    if ( backtracking==0 ) {

                                      			createLeafNode(grammarAccess.getTransitionAccess().getDelayINTTerminalRuleCall_4_1_0_1_0(), "delay"); 
                                      		
                                    }
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode, current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"delay",
                                      	        		lv_delay_6_0, 
                                      	        		"INT", 
                                      	        		lastConsumedNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1324:3: ( (lv_trigger_7_0= ruleBooleanExpression ) )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==RULE_ID||(LA36_0>=RULE_INT && LA36_0<=RULE_BOOLEAN)||LA36_0==40||LA36_0==56||LA36_0==59||LA36_0==64) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1325:1: (lv_trigger_7_0= ruleBooleanExpression )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1325:1: (lv_trigger_7_0= ruleBooleanExpression )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1326:3: lv_trigger_7_0= ruleBooleanExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_4_1_0_2_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleTransition1746);
                                    lv_trigger_7_0=ruleBooleanExpression();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		set(
                                      	       			current, 
                                      	       			"trigger",
                                      	        		lv_trigger_7_0, 
                                      	        		"BooleanExpression", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }
                                    break;

                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1348:3: ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==32) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1348:5: '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )*
                                    {
                                    match(input,32,FollowSets000.FOLLOW_32_in_ruleTransition1758); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getTransitionAccess().getSolidusKeyword_4_1_0_3_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1352:1: ( (lv_effects_9_0= ruleEffect ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1353:1: (lv_effects_9_0= ruleEffect )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1353:1: (lv_effects_9_0= ruleEffect )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1354:3: lv_effects_9_0= ruleEffect
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0_3_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition1779);
                                    lv_effects_9_0=ruleEffect();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		add(
                                      	       			current, 
                                      	       			"effects",
                                      	        		lv_effects_9_0, 
                                      	        		"Effect", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }

                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1376:2: ( ',' ( (lv_effects_11_0= ruleEffect ) ) )*
                                    loop37:
                                    do {
                                        int alt37=2;
                                        int LA37_0 = input.LA(1);

                                        if ( (LA37_0==22) ) {
                                            alt37=1;
                                        }


                                        switch (alt37) {
                                    	case 1 :
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1376:4: ',' ( (lv_effects_11_0= ruleEffect ) )
                                    	    {
                                    	    match(input,22,FollowSets000.FOLLOW_22_in_ruleTransition1790); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_4_1_0_3_2_0(), null); 
                                    	          
                                    	    }
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1380:1: ( (lv_effects_11_0= ruleEffect ) )
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1381:1: (lv_effects_11_0= ruleEffect )
                                    	    {
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1381:1: (lv_effects_11_0= ruleEffect )
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1382:3: lv_effects_11_0= ruleEffect
                                    	    {
                                    	    if ( backtracking==0 ) {
                                    	       
                                    	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0_3_2_1_0(), currentNode); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition1811);
                                    	    lv_effects_11_0=ruleEffect();
                                    	    _fsp--;
                                    	    if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                    	      	        }
                                    	      	        try {
                                    	      	       		add(
                                    	      	       			current, 
                                    	      	       			"effects",
                                    	      	        		lv_effects_11_0, 
                                    	      	        		"Effect", 
                                    	      	        		currentNode);
                                    	      	        } catch (ValueConverterException vce) {
                                    	      				handleValueConverterException(vce);
                                    	      	        }
                                    	      	        currentNode = currentNode.getParent();
                                    	      	    
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
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1405:6: ( (lv_label_12_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1405:6: ( (lv_label_12_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1406:1: (lv_label_12_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1406:1: (lv_label_12_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1407:3: lv_label_12_0= RULE_STRING
                            {
                            lv_label_12_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTransition1839); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTransitionAccess().getLabelSTRINGTerminalRuleCall_4_1_1_0(), "label"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"label",
                              	        		lv_label_12_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1429:5: ( (lv_isHistory_13_0= 'history' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1430:1: (lv_isHistory_13_0= 'history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1430:1: (lv_isHistory_13_0= 'history' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1431:3: lv_isHistory_13_0= 'history'
                    {
                    lv_isHistory_13_0=(Token)input.LT(1);
                    match(input,33,FollowSets000.FOLLOW_33_in_ruleTransition1865); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getIsHistoryHistoryKeyword_5_0(), "isHistory"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTransitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isHistory", true, "history", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransition


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1458:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1459:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1460:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_entryRuleSignal1915);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal1925); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignal


    // $ANTLR start ruleSignal
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1467:1: ruleSignal returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? 'signal' ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) ) )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_1_0=null;
        Token lv_isOutput_2_0=null;
        Token lv_name_4_0=null;
        Token lv_hostType_9_0=null;
        Token lv_hostType_13_0=null;
        Token lv_hostCombineOperator_16_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_6_0 = null;

        Enumerator lv_type_8_0 = null;

        Enumerator lv_type_12_0 = null;

        Enumerator lv_combineOperator_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1472:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? 'signal' ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1473:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? 'signal' ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1473:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? 'signal' ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1473:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_isInput_1_0= 'input' ) )? ( (lv_isOutput_2_0= 'output' ) )? 'signal' ( (lv_name_4_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_6_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1473:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_COMMENT_ANNOTATION||LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1474:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1474:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1475:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleSignal1971);
            	    lv_annotations_0_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1497:3: ( (lv_isInput_1_0= 'input' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1498:1: (lv_isInput_1_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1498:1: (lv_isInput_1_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1499:3: lv_isInput_1_0= 'input'
                    {
                    lv_isInput_1_0=(Token)input.LT(1);
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleSignal1990); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_1_0(), "isInput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isInput", true, "input", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1518:3: ( (lv_isOutput_2_0= 'output' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1519:1: (lv_isOutput_2_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1519:1: (lv_isOutput_2_0= 'output' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1520:3: lv_isOutput_2_0= 'output'
                    {
                    lv_isOutput_2_0=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleSignal2022); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_2_0(), "isOutput"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isOutput", true, "output", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,36,FollowSets000.FOLLOW_36_in_ruleSignal2046); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getSignalKeyword_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1543:1: ( (lv_name_4_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1544:1: (lv_name_4_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1544:1: (lv_name_4_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1545:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSignal2063); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_4_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_4_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1567:2: ( ':=' ( (lv_initialValue_6_0= ruleAnyType ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==37) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1567:4: ':=' ( (lv_initialValue_6_0= ruleAnyType ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleSignal2079); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_5_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1571:1: ( (lv_initialValue_6_0= ruleAnyType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1572:1: (lv_initialValue_6_0= ruleAnyType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1572:1: (lv_initialValue_6_0= ruleAnyType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1573:3: lv_initialValue_6_0= ruleAnyType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getInitialValueAnyTypeParserRuleCall_5_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnyType_in_ruleSignal2100);
                    lv_initialValue_6_0=ruleAnyType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_6_0, 
                      	        		"AnyType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1595:4: ( ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==38) ) {
                    alt49=2;
                }
                else if ( (LA49_1==RULE_STRING||(LA49_1>=65 && LA49_1<=70)) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1595:5: ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1595:5: ( ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1595:7: ':' ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSignal2114); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_6_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1599:1: ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=65 && LA46_0<=70)) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_STRING) ) {
                        alt46=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1599:1: ( ( (lv_type_8_0= ruleValueType ) ) | ( (lv_hostType_9_0= RULE_STRING ) ) )", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1599:2: ( (lv_type_8_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1599:2: ( (lv_type_8_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1600:1: (lv_type_8_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1600:1: (lv_type_8_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1601:3: lv_type_8_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_6_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleSignal2136);
                            lv_type_8_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_8_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1624:6: ( (lv_hostType_9_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1624:6: ( (lv_hostType_9_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1625:1: (lv_hostType_9_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1625:1: (lv_hostType_9_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1626:3: lv_hostType_9_0= RULE_STRING
                            {
                            lv_hostType_9_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSignal2159); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_6_0_1_1_0(), "hostType"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"hostType",
                              	        		lv_hostType_9_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1649:6: ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1649:6: ( ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1649:8: ':' 'combine' ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSignal2183); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_6_1_0(), null); 
                          
                    }
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleSignal2193); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_6_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1657:1: ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=65 && LA47_0<=70)) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==RULE_STRING) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1657:1: ( ( (lv_type_12_0= ruleValueType ) ) | ( (lv_hostType_13_0= RULE_STRING ) ) )", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1657:2: ( (lv_type_12_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1657:2: ( (lv_type_12_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1658:1: (lv_type_12_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1658:1: (lv_type_12_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1659:3: lv_type_12_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_6_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleSignal2215);
                            lv_type_12_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_12_0, 
                              	        		"ValueType", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1682:6: ( (lv_hostType_13_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1682:6: ( (lv_hostType_13_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1683:1: (lv_hostType_13_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1683:1: (lv_hostType_13_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1684:3: lv_hostType_13_0= RULE_STRING
                            {
                            lv_hostType_13_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSignal2238); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_6_1_2_1_0(), "hostType"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"hostType",
                              	        		lv_hostType_13_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    match(input,30,FollowSets000.FOLLOW_30_in_ruleSignal2254); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_6_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1710:1: ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=57 && LA48_0<=58)||LA48_0==60||LA48_0==62||(LA48_0>=70 && LA48_0<=73)) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RULE_STRING) ) {
                        alt48=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1710:1: ( ( (lv_combineOperator_15_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_16_0= RULE_STRING ) ) )", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1710:2: ( (lv_combineOperator_15_0= ruleCombineOperator ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1710:2: ( (lv_combineOperator_15_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1711:1: (lv_combineOperator_15_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1711:1: (lv_combineOperator_15_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1712:3: lv_combineOperator_15_0= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_6_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleSignal2276);
                            lv_combineOperator_15_0=ruleCombineOperator();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"combineOperator",
                              	        		lv_combineOperator_15_0, 
                              	        		"CombineOperator", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1735:6: ( (lv_hostCombineOperator_16_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1735:6: ( (lv_hostCombineOperator_16_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1736:1: (lv_hostCombineOperator_16_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1736:1: (lv_hostCombineOperator_16_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1737:3: lv_hostCombineOperator_16_0= RULE_STRING
                            {
                            lv_hostCombineOperator_16_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSignal2299); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_6_1_4_1_0(), "hostCombineOperator"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"hostCombineOperator",
                              	        		lv_hostCombineOperator_16_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1767:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1768:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1769:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable2344);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable2354); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1776:1: ruleVariable returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'var' ( (lv_name_2_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_4_0= ruleAnyType ) ) )? ':' ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_hostType_7_0=null;
        EObject lv_annotations_0_0 = null;

        AntlrDatatypeRuleToken lv_initialValue_4_0 = null;

        Enumerator lv_type_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1781:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'var' ( (lv_name_2_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_4_0= ruleAnyType ) ) )? ':' ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1782:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'var' ( (lv_name_2_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_4_0= ruleAnyType ) ) )? ':' ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1782:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'var' ( (lv_name_2_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_4_0= ruleAnyType ) ) )? ':' ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1782:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'var' ( (lv_name_2_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_4_0= ruleAnyType ) ) )? ':' ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1782:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_COMMENT_ANNOTATION||LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1783:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1783:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1784:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleVariable2400);
            	    lv_annotations_0_0=ruleStringAnnotation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"annotations",
            	      	        		lv_annotations_0_0, 
            	      	        		"StringAnnotation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            match(input,39,FollowSets000.FOLLOW_39_in_ruleVariable2411); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1810:1: ( (lv_name_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1811:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1811:1: (lv_name_2_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1812:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariable2428); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1834:2: ( ':=' ( (lv_initialValue_4_0= ruleAnyType ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1834:4: ':=' ( (lv_initialValue_4_0= ruleAnyType ) )
                    {
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleVariable2444); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_3_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1838:1: ( (lv_initialValue_4_0= ruleAnyType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1839:1: (lv_initialValue_4_0= ruleAnyType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1839:1: (lv_initialValue_4_0= ruleAnyType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1840:3: lv_initialValue_4_0= ruleAnyType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getInitialValueAnyTypeParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnyType_in_ruleVariable2465);
                    lv_initialValue_4_0=ruleAnyType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"initialValue",
                      	        		lv_initialValue_4_0, 
                      	        		"AnyType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleVariable2477); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_4(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1866:1: ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=65 && LA52_0<=70)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_STRING) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1866:1: ( ( (lv_type_6_0= ruleValueType ) ) | ( (lv_hostType_7_0= RULE_STRING ) ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1866:2: ( (lv_type_6_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1866:2: ( (lv_type_6_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1867:1: (lv_type_6_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1867:1: (lv_type_6_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1868:3: lv_type_6_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_5_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleVariable2499);
                    lv_type_6_0=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_6_0, 
                      	        		"ValueType", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1891:6: ( (lv_hostType_7_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1891:6: ( (lv_hostType_7_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1892:1: (lv_hostType_7_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1892:1: (lv_hostType_7_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1893:3: lv_hostType_7_0= RULE_STRING
                    {
                    lv_hostType_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVariable2522); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getHostTypeSTRINGTerminalRuleCall_5_1_0(), "hostType"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"hostType",
                      	        		lv_hostType_7_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleSubstitution
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1923:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1924:2: (iv_ruleSubstitution= ruleSubstitution EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1925:2: iv_ruleSubstitution= ruleSubstitution EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubstitutionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_entryRuleSubstitution2564);
            iv_ruleSubstitution=ruleSubstitution();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubstitution; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstitution2574); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubstitution


    // $ANTLR start ruleSubstitution
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1932:1: ruleSubstitution returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token lv_formal_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1937:6: ( ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1938:1: ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1938:1: ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1938:2: ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1938:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1939:1: (lv_actual_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1939:1: (lv_actual_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1940:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubstitution2616); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSubstitutionAccess().getActualIDTerminalRuleCall_0_0(), "actual"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubstitutionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"actual",
              	        		lv_actual_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,32,FollowSets000.FOLLOW_32_in_ruleSubstitution2631); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubstitutionAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1966:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1967:1: (lv_formal_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1967:1: (lv_formal_2_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1968:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubstitution2648); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSubstitutionAccess().getFormalIDTerminalRuleCall_2_0(), "formal"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getSubstitutionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"formal",
              	        		lv_formal_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubstitution


    // $ANTLR start entryRuleAction
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1998:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1999:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2000:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2689);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2699); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2007:1: ruleAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2012:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2013:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2013:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2013:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2013:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2014:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getActionAccess().getActionAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getActionAccess().getActionAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2027:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==31) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2028:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2028:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2029:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)input.LT(1);
                    match(input,31,FollowSets000.FOLLOW_31_in_ruleAction2754); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getIsImmediateNumberSignKeyword_1_0(), "isImmediate"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "isImmediate", true, "#", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2048:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==EOF||LA54_1==RULE_ID||(LA54_1>=RULE_INT && LA54_1<=RULE_COMMENT_ANNOTATION)||LA54_1==15||(LA54_1>=17 && LA54_1<=20)||(LA54_1>=25 && LA54_1<=29)||LA54_1==32||(LA54_1>=34 && LA54_1<=36)||(LA54_1>=39 && LA54_1<=40)||(LA54_1>=43 && LA54_1<=46)||LA54_1==56||LA54_1==59||LA54_1==64) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2049:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2049:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2050:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAction2785); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getActionAccess().getDelayINTTerminalRuleCall_2_0(), "delay"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"delay",
                      	        		lv_delay_2_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2072:3: ( (lv_trigger_3_0= ruleBooleanExpression ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||(LA55_0>=RULE_INT && LA55_0<=RULE_BOOLEAN)||LA55_0==40||LA55_0==56||LA55_0==59||LA55_0==64) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2073:1: (lv_trigger_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2073:1: (lv_trigger_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2074:3: lv_trigger_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAction2812);
                    lv_trigger_3_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"trigger",
                      	        		lv_trigger_3_0, 
                      	        		"BooleanExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2096:3: ( '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==32) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2096:5: '/' ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_ruleAction2824); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2100:1: ( ( (lv_effects_5_0= ruleEffect ) ) ( ',' )? )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ID||LA57_0==RULE_HOSTCODE) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2100:2: ( (lv_effects_5_0= ruleEffect ) ) ( ',' )?
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2100:2: ( (lv_effects_5_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2101:1: (lv_effects_5_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2101:1: (lv_effects_5_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2102:3: lv_effects_5_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleAction2846);
                    	    lv_effects_5_0=ruleEffect();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getActionRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"effects",
                    	      	        		lv_effects_5_0, 
                    	      	        		"Effect", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }

                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2124:2: ( ',' )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==22) ) {
                    	        alt56=1;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2124:4: ','
                    	            {
                    	            match(input,22,FollowSets000.FOLLOW_22_in_ruleAction2857); if (failed) return current;
                    	            if ( backtracking==0 ) {

                    	                      createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_4_1_1(), null); 
                    	                  
                    	            }

                    	            }
                    	            break;

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


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2136:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2137:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2138:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect2899);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect2909); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEffect


    // $ANTLR start ruleEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2145:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2150:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2151:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2151:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1==37) ) {
                    alt59=2;
                }
                else if ( (LA59_1==EOF||LA59_1==RULE_ID||LA59_1==RULE_HOSTCODE||LA59_1==RULE_COMMENT_ANNOTATION||LA59_1==15||(LA59_1>=17 && LA59_1<=20)||LA59_1==22||(LA59_1>=25 && LA59_1<=29)||(LA59_1>=33 && LA59_1<=36)||(LA59_1>=39 && LA59_1<=40)||(LA59_1>=43 && LA59_1<=49)) ) {
                    alt59=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2151:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 59, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA59_0==RULE_HOSTCODE) ) {
                alt59=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2151:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2152:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect2959);
                    this_Emission_0=ruleEmission();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Emission_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2165:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect2989);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Assignment_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2178:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect3019);
                    this_TextEffect_2=ruleTextEffect();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextEffect_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEffect


    // $ANTLR start entryRuleEmission
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2197:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2198:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2199:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission3054);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission3064); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmission


    // $ANTLR start ruleEmission
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2206:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2211:6: ( ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2212:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2212:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2212:2: ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2212:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2213:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2213:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2214:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission3111); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2229:2: ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==40) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2229:4: '(' ( (lv_newValue_2_0= ruleExpression ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleEmission3122); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2233:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2234:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2234:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2235:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission3143);
                    lv_newValue_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEmissionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"newValue",
                      	        		lv_newValue_2_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleEmission3153); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEmission


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2269:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2270:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2271:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment3191);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment3201); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAssignment


    // $ANTLR start ruleAssignment
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2278:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2283:6: ( ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2284:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2284:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2284:2: ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2284:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2285:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2285:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2286:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment3248); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,37,FollowSets000.FOLLOW_37_in_ruleAssignment3258); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2305:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2306:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2306:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2307:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment3279);
            lv_expression_2_0=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"expression",
              	        		lv_expression_2_0, 
              	        		"Expression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleTextEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2337:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2338:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2339:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect3315);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect3325); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTextEffect


    // $ANTLR start ruleTextEffect
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2346:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2351:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2352:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2352:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2352:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2352:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2353:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2353:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2354:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3367); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextEffectAccess().getCodeHOSTCODETerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextEffectRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"code",
              	        		lv_code_0_0, 
              	        		"HOSTCODE", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2376:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==40) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2376:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleTextEffect3383); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2380:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2381:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2381:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2382:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextEffect3400); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextEffectAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextEffectRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleTextEffect3415); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTextEffect


    // $ANTLR start entryRuleExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2416:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2417:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2418:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression3453);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression3463); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2425:1: ruleExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2430:6: ( (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2431:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2431:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2432:2: this_BooleanExpression_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExpression3513);
                    this_BooleanExpression_0=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2445:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression3543);
                    this_ValuedExpression_1=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2464:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2465:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2466:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3578);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression3588); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanExpression


    // $ANTLR start ruleBooleanExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2473:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2478:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2480:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression3637);
            this_OrExpression_0=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanExpression


    // $ANTLR start entryRuleOrExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2499:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2500:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2501:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression3671);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression3681); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOrExpression


    // $ANTLR start ruleOrExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2508:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2513:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2514:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2514:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2515:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression3731);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2526:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==57) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2526:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2526:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2527:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2545:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2546:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2546:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2547:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrExpression3764);
            	    lv_operator_2_0=ruleOrOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"OrOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2569:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2570:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2570:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2571:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression3785);
            	    lv_subExpressions_3_0=ruleAndExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getOrExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"AndExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrExpression


    // $ANTLR start entryRuleAndExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2601:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2602:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2603:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression3823);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression3833); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAndExpression


    // $ANTLR start ruleAndExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2610:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2615:6: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2616:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2616:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2617:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression3883);
            this_CompareOperation_0=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2628:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==58) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2628:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2628:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2629:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2647:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2648:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2648:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2649:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleAndExpression3916);
            	    lv_operator_2_0=ruleAndOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"AndOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2671:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2672:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2672:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2673:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression3937);
            	    lv_subExpressions_3_0=ruleCompareOperation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"CompareOperation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAndExpression


    // $ANTLR start entryRuleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2703:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2704:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2705:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3975);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation3985); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCompareOperation


    // $ANTLR start ruleCompareOperation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2712:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2717:6: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt65=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt65=1;
                }
                break;
            case 40:
                {
                int LA65_2 = input.LA(2);

                if ( (synpred77()) ) {
                    alt65=1;
                }
                else if ( (true) ) {
                    alt65=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA65_3 = input.LA(2);

                if ( (LA65_3==EOF||LA65_3==RULE_ID||LA65_3==RULE_HOSTCODE||LA65_3==RULE_COMMENT_ANNOTATION||LA65_3==15||(LA65_3>=17 && LA65_3<=20)||LA65_3==22||(LA65_3>=25 && LA65_3<=29)||(LA65_3>=32 && LA65_3<=36)||LA65_3==39||LA65_3==41||(LA65_3>=43 && LA65_3<=49)||(LA65_3>=57 && LA65_3<=58)) ) {
                    alt65=2;
                }
                else if ( ((LA65_3>=50 && LA65_3<=55)||(LA65_3>=60 && LA65_3<=63)) ) {
                    alt65=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 3, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA65_4 = input.LA(2);

                if ( (LA65_4==40) ) {
                    switch ( input.LA(3) ) {
                    case 56:
                        {
                        int LA65_21 = input.LA(4);

                        if ( (LA65_21==40) ) {
                            int LA65_28 = input.LA(5);

                            if ( (synpred77()) ) {
                                alt65=1;
                            }
                            else if ( (true) ) {
                                alt65=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 28, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                        {
                        int LA65_22 = input.LA(4);

                        if ( (LA65_22==RULE_ID) ) {
                            int LA65_29 = input.LA(5);

                            if ( (LA65_29==41) ) {
                                int LA65_30 = input.LA(6);

                                if ( (LA65_30==EOF||LA65_30==RULE_ID||LA65_30==RULE_HOSTCODE||LA65_30==RULE_COMMENT_ANNOTATION||LA65_30==15||(LA65_30>=17 && LA65_30<=20)||LA65_30==22||(LA65_30>=25 && LA65_30<=29)||(LA65_30>=32 && LA65_30<=36)||LA65_30==39||LA65_30==41||(LA65_30>=43 && LA65_30<=49)||(LA65_30>=57 && LA65_30<=58)) ) {
                                    alt65=2;
                                }
                                else if ( ((LA65_30>=50 && LA65_30<=55)||(LA65_30>=60 && LA65_30<=63)) ) {
                                    alt65=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 30, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 29, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA65_23 = input.LA(4);

                        if ( (LA65_23==41) ) {
                            int LA65_30 = input.LA(5);

                            if ( (LA65_30==EOF||LA65_30==RULE_ID||LA65_30==RULE_HOSTCODE||LA65_30==RULE_COMMENT_ANNOTATION||LA65_30==15||(LA65_30>=17 && LA65_30<=20)||LA65_30==22||(LA65_30>=25 && LA65_30<=29)||(LA65_30>=32 && LA65_30<=36)||LA65_30==39||LA65_30==41||(LA65_30>=43 && LA65_30<=49)||(LA65_30>=57 && LA65_30<=58)) ) {
                                alt65=2;
                            }
                            else if ( ((LA65_30>=50 && LA65_30<=55)||(LA65_30>=60 && LA65_30<=63)) ) {
                                alt65=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 11, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 4, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA65_5 = input.LA(2);

                if ( (LA65_5==RULE_ID) ) {
                    int LA65_12 = input.LA(3);

                    if ( ((LA65_12>=50 && LA65_12<=55)||(LA65_12>=60 && LA65_12<=63)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_12==EOF||LA65_12==RULE_ID||LA65_12==RULE_HOSTCODE||LA65_12==RULE_COMMENT_ANNOTATION||LA65_12==15||(LA65_12>=17 && LA65_12<=20)||LA65_12==22||(LA65_12>=25 && LA65_12<=29)||(LA65_12>=32 && LA65_12<=36)||LA65_12==39||LA65_12==41||(LA65_12>=43 && LA65_12<=49)||(LA65_12>=57 && LA65_12<=58)) ) {
                        alt65=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 12, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA65_6 = input.LA(2);

                if ( (LA65_6==EOF||LA65_6==RULE_ID||LA65_6==RULE_HOSTCODE||LA65_6==RULE_COMMENT_ANNOTATION||LA65_6==15||(LA65_6>=17 && LA65_6<=20)||LA65_6==22||(LA65_6>=25 && LA65_6<=29)||(LA65_6>=32 && LA65_6<=36)||LA65_6==39||LA65_6==41||(LA65_6>=43 && LA65_6<=49)||(LA65_6>=57 && LA65_6<=58)) ) {
                    alt65=2;
                }
                else if ( ((LA65_6>=50 && LA65_6<=55)||(LA65_6>=60 && LA65_6<=63)) ) {
                    alt65=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    int LA65_13 = input.LA(3);

                    if ( (LA65_13==RULE_ID) ) {
                        int LA65_24 = input.LA(4);

                        if ( (LA65_24==41) ) {
                            int LA65_31 = input.LA(5);

                            if ( ((LA65_31>=50 && LA65_31<=55)||(LA65_31>=60 && LA65_31<=63)) ) {
                                alt65=1;
                            }
                            else if ( (LA65_31==EOF||LA65_31==RULE_ID||LA65_31==RULE_HOSTCODE||LA65_31==RULE_COMMENT_ANNOTATION||LA65_31==15||(LA65_31>=17 && LA65_31<=20)||LA65_31==22||(LA65_31>=25 && LA65_31<=29)||(LA65_31>=32 && LA65_31<=36)||LA65_31==39||LA65_31==41||(LA65_31>=43 && LA65_31<=49)||(LA65_31>=57 && LA65_31<=58)) ) {
                                alt65=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 31, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case RULE_ID:
                case RULE_HOSTCODE:
                case RULE_COMMENT_ANNOTATION:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20:
                case 22:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 39:
                case 41:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 57:
                case 58:
                    {
                    alt65=2;
                    }
                    break;
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 60:
                case 61:
                case 62:
                case 63:
                    {
                    alt65=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 7, input);

                    throw nvae;
                }

                }
                break;
            case 59:
                {
                switch ( input.LA(2) ) {
                case 59:
                    {
                    int LA65_14 = input.LA(3);

                    if ( (synpred77()) ) {
                        alt65=1;
                    }
                    else if ( (true) ) {
                        alt65=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    int LA65_15 = input.LA(3);

                    if ( ((LA65_15>=50 && LA65_15<=55)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_15==EOF||LA65_15==RULE_ID||LA65_15==RULE_HOSTCODE||LA65_15==RULE_COMMENT_ANNOTATION||LA65_15==15||(LA65_15>=17 && LA65_15<=20)||LA65_15==22||(LA65_15>=25 && LA65_15<=29)||(LA65_15>=32 && LA65_15<=36)||LA65_15==39||LA65_15==41||(LA65_15>=43 && LA65_15<=49)||(LA65_15>=57 && LA65_15<=58)) ) {
                        alt65=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case 56:
                    {
                    int LA65_16 = input.LA(3);

                    if ( (LA65_16==40) ) {
                        switch ( input.LA(4) ) {
                        case 56:
                            {
                            int LA65_32 = input.LA(5);

                            if ( (LA65_32==40) ) {
                                int LA65_36 = input.LA(6);

                                if ( (synpred77()) ) {
                                    alt65=1;
                                }
                                else if ( (true) ) {
                                    alt65=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 36, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 32, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 64:
                            {
                            int LA65_33 = input.LA(5);

                            if ( (LA65_33==RULE_ID) ) {
                                int LA65_37 = input.LA(6);

                                if ( (LA65_37==41) ) {
                                    int LA65_38 = input.LA(7);

                                    if ( (LA65_38==EOF||LA65_38==RULE_ID||LA65_38==RULE_HOSTCODE||LA65_38==RULE_COMMENT_ANNOTATION||LA65_38==15||(LA65_38>=17 && LA65_38<=20)||LA65_38==22||(LA65_38>=25 && LA65_38<=29)||(LA65_38>=32 && LA65_38<=36)||LA65_38==39||LA65_38==41||(LA65_38>=43 && LA65_38<=49)||(LA65_38>=57 && LA65_38<=58)) ) {
                                        alt65=2;
                                    }
                                    else if ( ((LA65_38>=50 && LA65_38<=55)) ) {
                                        alt65=1;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 38, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 37, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 33, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA65_34 = input.LA(5);

                            if ( (LA65_34==41) ) {
                                int LA65_38 = input.LA(6);

                                if ( (LA65_38==EOF||LA65_38==RULE_ID||LA65_38==RULE_HOSTCODE||LA65_38==RULE_COMMENT_ANNOTATION||LA65_38==15||(LA65_38>=17 && LA65_38<=20)||LA65_38==22||(LA65_38>=25 && LA65_38<=29)||(LA65_38>=32 && LA65_38<=36)||LA65_38==39||LA65_38==41||(LA65_38>=43 && LA65_38<=49)||(LA65_38>=57 && LA65_38<=58)) ) {
                                    alt65=2;
                                }
                                else if ( ((LA65_38>=50 && LA65_38<=55)) ) {
                                    alt65=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 38, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 25, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 64:
                    {
                    int LA65_17 = input.LA(3);

                    if ( (LA65_17==RULE_ID) ) {
                        int LA65_26 = input.LA(4);

                        if ( ((LA65_26>=50 && LA65_26<=55)) ) {
                            alt65=1;
                        }
                        else if ( (LA65_26==EOF||LA65_26==RULE_ID||LA65_26==RULE_HOSTCODE||LA65_26==RULE_COMMENT_ANNOTATION||LA65_26==15||(LA65_26>=17 && LA65_26<=20)||LA65_26==22||(LA65_26>=25 && LA65_26<=29)||(LA65_26>=32 && LA65_26<=36)||LA65_26==39||LA65_26==41||(LA65_26>=43 && LA65_26<=49)||(LA65_26>=57 && LA65_26<=58)) ) {
                            alt65=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 26, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA65_18 = input.LA(3);

                    if ( (LA65_18==EOF||LA65_18==RULE_ID||LA65_18==RULE_HOSTCODE||LA65_18==RULE_COMMENT_ANNOTATION||LA65_18==15||(LA65_18>=17 && LA65_18<=20)||LA65_18==22||(LA65_18>=25 && LA65_18<=29)||(LA65_18>=32 && LA65_18<=36)||LA65_18==39||LA65_18==41||(LA65_18>=43 && LA65_18<=49)||(LA65_18>=57 && LA65_18<=58)) ) {
                        alt65=2;
                    }
                    else if ( ((LA65_18>=50 && LA65_18<=55)) ) {
                        alt65=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA65_19 = input.LA(3);

                    if ( (synpred77()) ) {
                        alt65=1;
                    }
                    else if ( (true) ) {
                        alt65=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HOSTCODE:
                    {
                    switch ( input.LA(3) ) {
                    case 40:
                        {
                        int LA65_27 = input.LA(4);

                        if ( (LA65_27==RULE_ID) ) {
                            int LA65_35 = input.LA(5);

                            if ( (LA65_35==41) ) {
                                int LA65_39 = input.LA(6);

                                if ( ((LA65_39>=50 && LA65_39<=55)) ) {
                                    alt65=1;
                                }
                                else if ( (LA65_39==EOF||LA65_39==RULE_ID||LA65_39==RULE_HOSTCODE||LA65_39==RULE_COMMENT_ANNOTATION||LA65_39==15||(LA65_39>=17 && LA65_39<=20)||LA65_39==22||(LA65_39>=25 && LA65_39<=29)||(LA65_39>=32 && LA65_39<=36)||LA65_39==39||LA65_39==41||(LA65_39>=43 && LA65_39<=49)||(LA65_39>=57 && LA65_39<=58)) ) {
                                    alt65=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 39, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 35, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 27, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_ID:
                    case RULE_HOSTCODE:
                    case RULE_COMMENT_ANNOTATION:
                    case 15:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 22:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 39:
                    case 41:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 57:
                    case 58:
                        {
                        alt65=2;
                        }
                        break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt65=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 20, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2718:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2719:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4036);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2730:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2730:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2730:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2731:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2749:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2750:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2750:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2751:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation4069);
                    lv_operator_2_0=ruleCompareOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"CompareOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2773:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2774:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2774:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2775:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4090);
                    lv_subExpressions_3_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCompareOperationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"NotOrValuedExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2799:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation4123);
                    this_NotExpression_4=ruleNotExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotExpression_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperation


    // $ANTLR start entryRuleNotOrValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2818:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2819:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2820:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4158);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression4168); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotOrValuedExpression


    // $ANTLR start ruleNotOrValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2827:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2832:6: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt66=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
                {
                alt66=1;
                }
                break;
            case 40:
                {
                int LA66_2 = input.LA(2);

                if ( (synpred78()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA66_3 = input.LA(2);

                if ( (synpred78()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 3, input);

                    throw nvae;
                }
                }
                break;
            case 56:
                {
                int LA66_4 = input.LA(2);

                if ( (LA66_4==40) ) {
                    switch ( input.LA(3) ) {
                    case 56:
                        {
                        int LA66_11 = input.LA(4);

                        if ( (LA66_11==40) ) {
                            int LA66_14 = input.LA(5);

                            if ( (synpred78()) ) {
                                alt66=1;
                            }
                            else if ( (true) ) {
                                alt66=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                        {
                        int LA66_12 = input.LA(4);

                        if ( (LA66_12==RULE_ID) ) {
                            int LA66_15 = input.LA(5);

                            if ( (LA66_15==41) ) {
                                int LA66_16 = input.LA(6);

                                if ( (synpred78()) ) {
                                    alt66=1;
                                }
                                else if ( (true) ) {
                                    alt66=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA66_13 = input.LA(4);

                        if ( (LA66_13==41) ) {
                            int LA66_16 = input.LA(5);

                            if ( (synpred78()) ) {
                                alt66=1;
                            }
                            else if ( (true) ) {
                                alt66=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 9, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 4, input);

                    throw nvae;
                }
                }
                break;
            case 64:
                {
                int LA66_5 = input.LA(2);

                if ( (LA66_5==RULE_ID) ) {
                    int LA66_10 = input.LA(3);

                    if ( (synpred78()) ) {
                        alt66=1;
                    }
                    else if ( (true) ) {
                        alt66=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA66_6 = input.LA(2);

                if ( (synpred78()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                int LA66_7 = input.LA(2);

                if ( (synpred78()) ) {
                    alt66=1;
                }
                else if ( (true) ) {
                    alt66=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 7, input);

                    throw nvae;
                }
                }
                break;
            case 59:
                {
                alt66=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2833:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2834:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4218);
                    this_ValuedExpression_0=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2847:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4248);
                    this_NotExpression_1=ruleNotExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOrValuedExpression


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2866:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2867:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2868:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4283);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression4293); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedExpression


    // $ANTLR start ruleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2875:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2880:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2882:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression4342);
            this_AddExpression_0=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AddExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValuedExpression


    // $ANTLR start entryRuleAddExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2901:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2902:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2903:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression4376);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression4386); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAddExpression


    // $ANTLR start ruleAddExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2910:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2915:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2916:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2916:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2917:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression4436);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2928:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==60) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2928:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2928:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2929:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2947:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2948:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2948:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2949:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression4469);
            	    lv_operator_2_0=ruleAddOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"AddOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2971:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2972:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2972:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2973:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression4490);
            	    lv_subExpressions_3_0=ruleSubExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"SubExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddExpression


    // $ANTLR start entryRuleSubExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3003:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3004:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3005:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression4528);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression4538); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSubExpression


    // $ANTLR start ruleSubExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3012:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3017:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3018:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3018:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3019:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression4588);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3030:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==61) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3030:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3030:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3031:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3049:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3050:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3050:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3051:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression4621);
            	    lv_operator_2_0=ruleSubOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"SubOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3073:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3074:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3074:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3075:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression4642);
            	    lv_subExpressions_3_0=ruleMultExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getSubExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"MultExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubExpression


    // $ANTLR start entryRuleMultExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3105:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3106:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3107:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression4680);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression4690); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMultExpression


    // $ANTLR start ruleMultExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3114:1: ruleMultExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3119:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3120:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3120:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3121:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleMultExpression4740);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3132:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==62) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3132:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3132:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3133:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
            	              try {
            	              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3151:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3152:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3152:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3153:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression4773);
            	    lv_operator_2_0=ruleMultOperator();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"operator",
            	      	        		lv_operator_2_0, 
            	      	        		"MultOperator", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3175:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3176:1: (lv_subExpressions_3_0= ruleModExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3176:1: (lv_subExpressions_3_0= ruleModExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3177:3: lv_subExpressions_3_0= ruleModExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleMultExpression4794);
            	    lv_subExpressions_3_0=ruleModExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultExpressionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"subExpressions",
            	      	        		lv_subExpressions_3_0, 
            	      	        		"ModExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
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


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultExpression


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3207:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3208:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3209:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression4832);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression4842); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModExpression


    // $ANTLR start ruleModExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3216:1: ruleModExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3221:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3222:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3222:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3223:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4892);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3234:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==63) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3234:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3234:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3235:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3253:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3254:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3254:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3255:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression4925);
                    lv_operator_2_0=ruleModOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_2_0, 
                      	        		"ModOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3277:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3278:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3278:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3279:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4946);
                    lv_subExpressions_3_0=ruleAtomicValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getModExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"AtomicValuedExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModExpression


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3309:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3310:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3311:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression4984);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression4994); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNotExpression


    // $ANTLR start ruleNotExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3318:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3323:6: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3324:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3324:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==59) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID||LA71_0==RULE_HOSTCODE||LA71_0==RULE_BOOLEAN||LA71_0==40||LA71_0==56||LA71_0==64) ) {
                alt71=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3324:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3324:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3324:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3324:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3324:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3325:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3338:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3339:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3339:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3340:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression5053);
                    lv_operator_1_0=ruleNotOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNotExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"NotOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3362:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3363:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3363:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3364:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression5074);
                    lv_subExpressions_2_0=ruleNotExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNotExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_2_0, 
                      	        		"NotExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3388:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression5106);
                    this_AtomicExpression_3=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3407:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3408:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3409:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression5141);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression5151); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicExpression


    // $ANTLR start ruleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3416:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_TextExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3421:6: ( (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3422:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt72=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt72=1;
                }
                break;
            case RULE_ID:
            case 56:
            case 64:
                {
                alt72=2;
                }
                break;
            case 40:
                {
                alt72=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt72=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3422:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3423:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleAtomicExpression5201);
                    this_BooleanValue_0=ruleBooleanValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3436:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression5231);
                    this_ValuedObjectTestExpression_1=ruleValuedObjectTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedObjectTestExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3448:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3448:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3448:8: '(' this_BooleanExpression_3= ruleBooleanExpression ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicExpression5247); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression5272);
                    this_BooleanExpression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicExpression5281); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3470:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression5313);
                    this_TextExpression_5=ruleTextExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_TextExpression_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicExpression


    // $ANTLR start entryRuleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3489:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3490:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3491:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5348);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression5358); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicValuedExpression


    // $ANTLR start ruleAtomicValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3498:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_DivExpression_3= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_6= ruleValuedExpression ')' ) | this_AtomicExpression_8= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_DivExpression_3 = null;

        EObject this_ValuedExpression_6 = null;

        EObject this_AtomicExpression_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3503:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_DivExpression_3= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_6= ruleValuedExpression ')' ) | this_AtomicExpression_8= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3504:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_DivExpression_3= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_6= ruleValuedExpression ')' ) | this_AtomicExpression_8= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3504:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_DivExpression_3= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_6= ruleValuedExpression ')' ) | this_AtomicExpression_8= ruleAtomicExpression )
            int alt73=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt73=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt73=2;
                }
                break;
            case 40:
                {
                int LA73_3 = input.LA(2);

                if ( (synpred89()) ) {
                    alt73=3;
                }
                else if ( (synpred90()) ) {
                    alt73=4;
                }
                else if ( (true) ) {
                    alt73=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3504:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_DivExpression_3= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_6= ruleValuedExpression ')' ) | this_AtomicExpression_8= ruleAtomicExpression )", 73, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_HOSTCODE:
            case RULE_BOOLEAN:
            case 56:
            case 64:
                {
                alt73=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3504:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_DivExpression_3= ruleDivExpression ')' ) | ( '(' this_ValuedExpression_6= ruleValuedExpression ')' ) | this_AtomicExpression_8= ruleAtomicExpression )", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3505:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5408);
                    this_IntValue_0=ruleIntValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_IntValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3518:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5438);
                    this_FloatValue_1=ruleFloatValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_FloatValue_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:6: ( '(' this_DivExpression_3= ruleDivExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:6: ( '(' this_DivExpression_3= ruleDivExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:8: '(' this_DivExpression_3= ruleDivExpression ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicValuedExpression5454); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getDivExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression5479);
                    this_DivExpression_3=ruleDivExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_DivExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicValuedExpression5488); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:6: ( '(' this_ValuedExpression_6= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:6: ( '(' this_ValuedExpression_6= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:8: '(' this_ValuedExpression_6= ruleValuedExpression ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleAtomicValuedExpression5506); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5531);
                    this_ValuedExpression_6=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_6; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleAtomicValuedExpression5540); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3573:2: this_AtomicExpression_8= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression5572);
                    this_AtomicExpression_8=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicValuedExpression


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3592:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3593:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3594:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression5607);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression5617); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDivExpression


    // $ANTLR start ruleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3601:1: ruleDivExpression returns [EObject current=null] : (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3606:6: ( (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3607:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3607:1: (this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3608:2: this_AtomicValuedExpression_0= ruleAtomicValuedExpression () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getAtomicValuedExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5667);
            this_AtomicValuedExpression_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AtomicValuedExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3619:1: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3620:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1().getType().getClassifier());
                      try {
                      	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                      } catch(ValueConverterException vce) {
                      	handleValueConverterException(vce);
                      }
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3638:2: ( (lv_operator_2_0= ruleDivOperator ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3639:1: (lv_operator_2_0= ruleDivOperator )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3639:1: (lv_operator_2_0= ruleDivOperator )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3640:3: lv_operator_2_0= ruleDivOperator
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression5699);
            lv_operator_2_0=ruleDivOperator();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDivExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"operator",
              	        		lv_operator_2_0, 
              	        		"DivOperator", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3662:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3663:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3663:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3664:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5720);
            lv_subExpressions_3_0=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDivExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"subExpressions",
              	        		lv_subExpressions_3_0, 
              	        		"AtomicValuedExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDivExpression


    // $ANTLR start entryRuleValuedObjectTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3694:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3695:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3696:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression5756);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression5766); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedObjectTestExpression


    // $ANTLR start ruleValuedObjectTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3703:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        EObject lv_subExpressions_7_0 = null;

        EObject this_ValuedObjectReference_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3708:6: ( ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            int alt74=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt74=1;
                }
                break;
            case 64:
                {
                alt74=2;
                }
                break;
            case RULE_ID:
                {
                alt74=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3709:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:3: () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3709:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3710:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3723:2: ( (lv_operator_1_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3724:1: (lv_operator_1_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3724:1: (lv_operator_1_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3725:3: lv_operator_1_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression5825);
                    lv_operator_1_0=rulePreOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"PreOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,40,FollowSets000.FOLLOW_40_in_ruleValuedObjectTestExpression5835); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3751:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3752:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3752:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3753:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression5856);
                    lv_subExpressions_3_0=ruleValuedObjectTestExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_3_0, 
                      	        		"ValuedObjectTestExpression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleValuedObjectTestExpression5866); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3780:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3780:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3780:7: () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3780:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3781:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorExpressionAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3794:2: ( (lv_operator_6_0= ruleValueTestOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3795:1: (lv_operator_6_0= ruleValueTestOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3795:1: (lv_operator_6_0= ruleValueTestOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3796:3: lv_operator_6_0= ruleValueTestOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression5907);
                    lv_operator_6_0=ruleValueTestOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_6_0, 
                      	        		"ValueTestOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3818:2: ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3819:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3819:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3820:3: lv_subExpressions_7_0= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5928);
                    lv_subExpressions_7_0=ruleValuedObjectReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getValuedObjectTestExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_7_0, 
                      	        		"ValuedObjectReference", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3844:2: this_ValuedObjectReference_8= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5960);
                    this_ValuedObjectReference_8=ruleValuedObjectReference();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedObjectReference_8; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValuedObjectTestExpression


    // $ANTLR start entryRuleValuedObjectReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3863:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3864:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3865:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference5995);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference6005); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleValuedObjectReference


    // $ANTLR start ruleValuedObjectReference
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3872:1: ruleValuedObjectReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3877:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3878:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3878:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3879:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3879:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3880:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getValuedObjectReferenceRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference6051); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getValuedObjectReferenceAccess().getValuedObjectValuedObjectCrossReference_0(), "valuedObject"); 
              	
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValuedObjectReference


    // $ANTLR start entryRuleTextExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3903:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3904:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3905:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression6086);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression6096); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTextExpression


    // $ANTLR start ruleTextExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3912:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3917:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3918:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3918:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3918:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3918:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3919:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3919:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3920:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression6138); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextExpressionAccess().getCodeHOSTCODETerminalRuleCall_0_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextExpressionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"code",
              	        		lv_code_0_0, 
              	        		"HOSTCODE", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3942:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==40) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3942:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_ruleTextExpression6154); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3946:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3947:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3947:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3948:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextExpression6171); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextExpressionAccess().getTypeIDTerminalRuleCall_1_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_2_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,41,FollowSets000.FOLLOW_41_in_ruleTextExpression6186); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTextExpression


    // $ANTLR start entryRuleIntValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3982:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3983:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3984:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue6224);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue6234); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIntValue


    // $ANTLR start ruleIntValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3991:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3996:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3997:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3997:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3998:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3998:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3999:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue6275); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIntValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleIntValue


    // $ANTLR start entryRuleFloatValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4029:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4030:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4031:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue6315);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue6325); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFloatValue


    // $ANTLR start ruleFloatValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4038:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4043:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4044:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4044:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4045:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4045:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4046:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue6366); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFloatValueAccess().getValueFloatTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFloatValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"Float", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFloatValue


    // $ANTLR start entryRuleBooleanValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4076:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4077:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4078:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6406);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue6416); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4085:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4090:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4091:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4091:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4092:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4092:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4093:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue6457); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBooleanValueAccess().getValueBooleanTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"Boolean", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleAnyType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4123:1: entryRuleAnyType returns [String current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final String entryRuleAnyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyType = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4124:2: (iv_ruleAnyType= ruleAnyType EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4125:2: iv_ruleAnyType= ruleAnyType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnyTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnyType_in_entryRuleAnyType6498);
            iv_ruleAnyType=ruleAnyType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnyType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyType6509); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAnyType


    // $ANTLR start ruleAnyType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4132:1: ruleAnyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleAnyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Boolean_0=null;
        Token this_INT_1=null;
        Token this_Float_2=null;
        Token this_ID_3=null;
        Token this_STRING_4=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4137:6: ( (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4138:1: (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4138:1: (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING )
            int alt76=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt76=1;
                }
                break;
            case RULE_INT:
                {
                alt76=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt76=3;
                }
                break;
            case RULE_ID:
                {
                alt76=4;
                }
                break;
            case RULE_STRING:
                {
                alt76=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4138:1: (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4138:6: this_Boolean_0= RULE_BOOLEAN
                    {
                    this_Boolean_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnyType6549); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Boolean_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getBooleanTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4146:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAnyType6575); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getINTTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4154:10: this_Float_2= RULE_FLOAT
                    {
                    this_Float_2=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleAnyType6601); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Float_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getFloatTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4162:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnyType6627); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getIDTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4170:10: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyType6653); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getSTRINGTerminalRuleCall_4(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAnyType


    // $ANTLR start entryRuleStringAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4185:1: entryRuleStringAnnotation returns [EObject current=null] : iv_ruleStringAnnotation= ruleStringAnnotation EOF ;
    public final EObject entryRuleStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4186:2: (iv_ruleStringAnnotation= ruleStringAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4187:2: iv_ruleStringAnnotation= ruleStringAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_entryRuleStringAnnotation6698);
            iv_ruleStringAnnotation=ruleStringAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringAnnotation6708); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStringAnnotation


    // $ANTLR start ruleStringAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4194:1: ruleStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation ) ;
    public final EObject ruleStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyValueAnnotation_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4199:6: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4200:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4200:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_COMMENT_ANNOTATION) ) {
                alt77=1;
            }
            else if ( (LA77_0==20) ) {
                alt77=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4200:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4201:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStringAnnotationAccess().getCommentAnnotationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleStringAnnotation6758);
                    this_CommentAnnotation_0=ruleCommentAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CommentAnnotation_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4214:2: this_KeyValueAnnotation_1= ruleKeyValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStringAnnotationAccess().getKeyValueAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_ruleStringAnnotation6788);
                    this_KeyValueAnnotation_1=ruleKeyValueAnnotation();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_KeyValueAnnotation_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStringAnnotation


    // $ANTLR start entryRuleCommentAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4233:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4234:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4235:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommentAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6823);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation6833); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleCommentAnnotation


    // $ANTLR start ruleCommentAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4242:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4247:6: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4248:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4248:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4249:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4249:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4250:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6874); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCommentAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"COMMENT_ANNOTATION", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCommentAnnotation


    // $ANTLR start entryRuleKeyValueAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4280:1: entryRuleKeyValueAnnotation returns [EObject current=null] : iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF ;
    public final EObject entryRuleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4281:2: (iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4282:2: iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation6914);
            iv_ruleKeyValueAnnotation=ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValueAnnotation6924); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleKeyValueAnnotation


    // $ANTLR start ruleKeyValueAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4289:1: ruleKeyValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4294:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4295:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4295:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4295:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            match(input,20,FollowSets000.FOLLOW_20_in_ruleKeyValueAnnotation6959); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4299:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4300:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4300:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyValueAnnotation6976); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4323:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4324:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4324:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4325:3: lv_value_2_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyValueAnnotation7002);
            lv_value_2_0=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getKeyValueAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_2_0, 
              	        		"EString", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleKeyValueAnnotation


    // $ANTLR start entryRuleImportAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4355:1: entryRuleImportAnnotation returns [EObject current=null] : iv_ruleImportAnnotation= ruleImportAnnotation EOF ;
    public final EObject entryRuleImportAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4356:2: (iv_ruleImportAnnotation= ruleImportAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4357:2: iv_ruleImportAnnotation= ruleImportAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportAnnotation_in_entryRuleImportAnnotation7038);
            iv_ruleImportAnnotation=ruleImportAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImportAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportAnnotation7048); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImportAnnotation


    // $ANTLR start ruleImportAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4364:1: ruleImportAnnotation returns [EObject current=null] : ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4369:6: ( ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4370:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4370:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4370:3: 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,42,FollowSets000.FOLLOW_42_in_ruleImportAnnotation7083); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAnnotationAccess().getImportKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4374:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4375:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4375:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4376:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportAnnotation7100); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getImportAnnotationAccess().getImportURISTRINGTerminalRuleCall_1_0(), "importURI"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getImportAnnotationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"importURI",
              	        		lv_importURI_1_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImportAnnotation


    // $ANTLR start entryRuleEString
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4406:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4407:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4408:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString7142);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString7153); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEString


    // $ANTLR start ruleEString
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4415:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4420:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4421:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4421:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_STRING) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_ID) ) {
                alt78=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4421:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4421:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString7193); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4429:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString7219); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEString


    // $ANTLR start ruleStateType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4444:1: ruleStateType returns [Enumerator current=null] : ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4448:6: ( ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4449:1: ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4449:1: ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt79=1;
                }
                break;
            case 44:
                {
                alt79=2;
                }
                break;
            case 45:
                {
                alt79=3;
                }
                break;
            case 46:
                {
                alt79=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4449:1: ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) )", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4449:2: ( 'normal' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4449:2: ( 'normal' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4449:4: 'normal'
                    {
                    match(input,43,FollowSets000.FOLLOW_43_in_ruleStateType7276); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4455:6: ( 'conditional' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4455:6: ( 'conditional' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4455:8: 'conditional'
                    {
                    match(input,44,FollowSets000.FOLLOW_44_in_ruleStateType7291); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4461:6: ( 'reference' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4461:6: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4461:8: 'reference'
                    {
                    match(input,45,FollowSets000.FOLLOW_45_in_ruleStateType7306); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4467:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4467:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4467:8: 'textual'
                    {
                    match(input,46,FollowSets000.FOLLOW_46_in_ruleStateType7321); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getTEXTUALEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStateType


    // $ANTLR start ruleTransitionType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4477:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4481:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4482:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4482:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt80=1;
                }
                break;
            case 48:
                {
                alt80=2;
                }
                break;
            case 49:
                {
                alt80=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4482:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4482:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4482:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4482:4: '-->'
                    {
                    match(input,47,FollowSets000.FOLLOW_47_in_ruleTransitionType7364); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4488:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4488:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4488:8: 'o->'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleTransitionType7379); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4494:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4494:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4494:8: '>->'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleTransitionType7394); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getNORMALTERMINATIONEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTransitionType


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4504:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4508:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4509:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4509:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt81=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt81=1;
                }
                break;
            case 51:
                {
                alt81=2;
                }
                break;
            case 52:
                {
                alt81=3;
                }
                break;
            case 53:
                {
                alt81=4;
                }
                break;
            case 54:
                {
                alt81=5;
                }
                break;
            case 55:
                {
                alt81=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4509:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4509:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4509:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4509:4: '='
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleCompareOperator7437); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4515:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4515:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4515:8: '<'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleCompareOperator7452); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4521:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4521:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4521:8: '<='
                    {
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleCompareOperator7467); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4527:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4527:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4527:8: '>'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleCompareOperator7482); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4533:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4533:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4533:8: '>='
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleCompareOperator7497); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4539:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4539:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4539:8: '<>'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleCompareOperator7512); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCompareOperator


    // $ANTLR start rulePreOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4549:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4553:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4554:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4554:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4554:3: 'pre'
            {
            match(input,56,FollowSets000.FOLLOW_56_in_rulePreOperator7554); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getPreOperatorAccess().getPREEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePreOperator


    // $ANTLR start ruleOrOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4564:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4568:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4569:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4569:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4569:3: 'or'
            {
            match(input,57,FollowSets000.FOLLOW_57_in_ruleOrOperator7595); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOrOperator


    // $ANTLR start ruleAndOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4579:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4583:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4584:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4584:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4584:3: 'and'
            {
            match(input,58,FollowSets000.FOLLOW_58_in_ruleAndOperator7636); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAndOperator


    // $ANTLR start ruleNotOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4594:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4598:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4599:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4599:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4599:3: 'not'
            {
            match(input,59,FollowSets000.FOLLOW_59_in_ruleNotOperator7677); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNotOperator


    // $ANTLR start ruleAddOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4609:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4613:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4614:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4614:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4614:3: '+'
            {
            match(input,60,FollowSets000.FOLLOW_60_in_ruleAddOperator7718); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getAddOperatorAccess().getADDEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAddOperator


    // $ANTLR start ruleSubOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4624:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4628:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4629:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4629:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4629:3: '-'
            {
            match(input,61,FollowSets000.FOLLOW_61_in_ruleSubOperator7759); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getSubOperatorAccess().getSUBEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSubOperator


    // $ANTLR start ruleMultOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4639:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4643:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4644:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4644:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4644:3: '*'
            {
            match(input,62,FollowSets000.FOLLOW_62_in_ruleMultOperator7800); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getMultOperatorAccess().getMULTEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMultOperator


    // $ANTLR start ruleModOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4654:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4658:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4659:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4659:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4659:3: 'mod'
            {
            match(input,63,FollowSets000.FOLLOW_63_in_ruleModOperator7841); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getModOperatorAccess().getMODEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModOperator


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4669:1: ruleDivOperator returns [Enumerator current=null] : ( '/' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4673:6: ( ( '/' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4674:1: ( '/' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4674:1: ( '/' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4674:3: '/'
            {
            match(input,32,FollowSets000.FOLLOW_32_in_ruleDivOperator7882); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getDivOperatorAccess().getDIVEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDivOperator


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4684:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4688:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4689:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4689:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4689:3: '?'
            {
            match(input,64,FollowSets000.FOLLOW_64_in_ruleValueTestOperator7923); if (failed) return current;
            if ( backtracking==0 ) {

                      current = grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration().getEnumLiteral().getInstance();
                      createLeafNode(grammarAccess.getValueTestOperatorAccess().getVALEnumLiteralDeclaration(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueTestOperator


    // $ANTLR start ruleValueType
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4699:1: ruleValueType returns [Enumerator current=null] : ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4703:6: ( ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4704:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4704:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )
            int alt82=6;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt82=1;
                }
                break;
            case 66:
                {
                alt82=2;
                }
                break;
            case 67:
                {
                alt82=3;
                }
                break;
            case 68:
                {
                alt82=4;
                }
                break;
            case 69:
                {
                alt82=5;
                }
                break;
            case 70:
                {
                alt82=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4704:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4704:2: ( 'pure' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4704:2: ( 'pure' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4704:4: 'pure'
                    {
                    match(input,65,FollowSets000.FOLLOW_65_in_ruleValueType7965); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4710:6: ( 'bool' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4710:6: ( 'bool' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4710:8: 'bool'
                    {
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleValueType7980); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4716:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4716:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4716:8: 'unsigned'
                    {
                    match(input,67,FollowSets000.FOLLOW_67_in_ruleValueType7995); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4722:6: ( 'int' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4722:6: ( 'int' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4722:8: 'int'
                    {
                    match(input,68,FollowSets000.FOLLOW_68_in_ruleValueType8010); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4728:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4728:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4728:8: 'float'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleValueType8025); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4734:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4734:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4734:8: 'host'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleValueType8040); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getHOSTEnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleValueType


    // $ANTLR start ruleCombineOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4744:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4748:6: ( ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4749:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4749:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt83=8;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt83=1;
                }
                break;
            case 60:
                {
                alt83=2;
                }
                break;
            case 62:
                {
                alt83=3;
                }
                break;
            case 72:
                {
                alt83=4;
                }
                break;
            case 73:
                {
                alt83=5;
                }
                break;
            case 57:
                {
                alt83=6;
                }
                break;
            case 58:
                {
                alt83=7;
                }
                break;
            case 70:
                {
                alt83=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4749:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4749:2: ( 'none' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4749:2: ( 'none' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4749:4: 'none'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleCombineOperator8083); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4755:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4755:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4755:8: '+'
                    {
                    match(input,60,FollowSets000.FOLLOW_60_in_ruleCombineOperator8098); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4761:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4761:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4761:8: '*'
                    {
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleCombineOperator8113); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4767:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4767:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4767:8: 'max'
                    {
                    match(input,72,FollowSets000.FOLLOW_72_in_ruleCombineOperator8128); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4773:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4773:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4773:8: 'min'
                    {
                    match(input,73,FollowSets000.FOLLOW_73_in_ruleCombineOperator8143); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4779:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4779:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4779:8: 'or'
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleCombineOperator8158); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4785:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4785:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4785:8: 'and'
                    {
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleCombineOperator8173); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4791:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4791:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4791:8: 'host'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleCombineOperator8188); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getHOSTEnumLiteralDeclaration_7(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleCombineOperator

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: ( ( ruleStringAnnotation ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: ( ruleStringAnnotation )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: ( ruleStringAnnotation )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:125:3: ruleStringAnnotation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsStringAnnotationParserRuleCall_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_synpred2159);
        ruleStringAnnotation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:300:1: ( ( ruleStringAnnotation ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:300:1: ( ruleStringAnnotation )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:300:1: ( ruleStringAnnotation )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:301:3: ruleStringAnnotation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_synpred9394);
        ruleStringAnnotation();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:5: ( 'region' ( ( RULE_ID ) )? ( ( RULE_STRING ) )? ':' ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:5: 'region' ( ( RULE_ID ) )? ( ( RULE_STRING ) )? ':' ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )*
        {
        match(input,15,FollowSets000.FOLLOW_15_in_synpred14406); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:327:1: ( ( RULE_ID ) )?
        int alt86=2;
        int LA86_0 = input.LA(1);

        if ( (LA86_0==RULE_ID) ) {
            alt86=1;
        }
        switch (alt86) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:328:1: ( RULE_ID )
                {
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:328:1: ( RULE_ID )
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:329:3: RULE_ID
                {
                match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred14423); if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:351:3: ( ( RULE_STRING ) )?
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==RULE_STRING) ) {
            alt87=1;
        }
        switch (alt87) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: ( RULE_STRING )
                {
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: ( RULE_STRING )
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:353:3: RULE_STRING
                {
                match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred14446); if (failed) return ;

                }


                }
                break;

        }

        match(input,16,FollowSets000.FOLLOW_16_in_synpred14462); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:379:1: ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )*
        loop88:
        do {
            int alt88=3;
            alt88 = dfa88.predict(input);
            switch (alt88) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:379:2: ( ( ruleVariable ) )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:379:2: ( ( ruleVariable ) )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:380:1: ( ruleVariable )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:380:1: ( ruleVariable )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:381:3: ruleVariable
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getVariablesVariableParserRuleCall_1_4_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_synpred14484);
        	    ruleVariable();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:6: ( ( ruleSignal ) )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:6: ( ( ruleSignal ) )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:405:1: ( ruleSignal )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:405:1: ( ruleSignal )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:406:3: ruleSignal
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getSignalsSignalParserRuleCall_1_4_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_synpred14511);
        	    ruleSignal();
        	    _fsp--;
        	    if (failed) return ;

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
    // $ANTLR end synpred14

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:6: ( ( ( ruleSingleRegion ) ) ( ( ruleRegion ) )* )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:6: ( ( ruleSingleRegion ) ) ( ( ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:6: ( ( ruleSingleRegion ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1088:1: ( ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1088:1: ( ruleSingleRegion )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1089:3: ruleSingleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_1_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred391438);
        ruleSingleRegion();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1111:2: ( ( ruleRegion ) )*
        loop94:
        do {
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_COMMENT_ANNOTATION||LA94_0==15||LA94_0==20) ) {
                alt94=1;
            }


            switch (alt94) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1112:1: ( ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1112:1: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1113:3: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_1_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred391459);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop94;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred39

    // $ANTLR start synpred74
    public final void synpred74_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2432:2: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2432:2: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred743513);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred74

    // $ANTLR start synpred77
    public final void synpred77_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:2: ( ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2718:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2719:2: ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred774036);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2730:1: ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2730:2: () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2730:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2731:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2749:2: ( ( ruleCompareOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2750:1: ( ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2750:1: ( ruleCompareOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2751:3: ruleCompareOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred774069);
        ruleCompareOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2773:2: ( ( ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2774:1: ( ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2774:1: ( ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2775:3: ruleNotOrValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred774090);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred77

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2834:2: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2834:2: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred784218);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred89
    public final void synpred89_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:6: ( ( '(' ruleDivExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:6: ( '(' ruleDivExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:6: ( '(' ruleDivExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3530:8: '(' ruleDivExpression ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred895454); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_synpred895479);
        ruleDivExpression();
        _fsp--;
        if (failed) return ;
        match(input,41,FollowSets000.FOLLOW_41_in_synpred895488); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred89

    // $ANTLR start synpred90
    public final void synpred90_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3551:8: '(' ruleValuedExpression ')'
        {
        match(input,40,FollowSets000.FOLLOW_40_in_synpred905506); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred905531);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,41,FollowSets000.FOLLOW_41_in_synpred905540); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred90

    public final boolean synpred74() {
        backtracking++;
        int start = input.mark();
        try {
            synpred74_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred90() {
        backtracking++;
        int start = input.mark();
        try {
            synpred90_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred78() {
        backtracking++;
        int start = input.mark();
        try {
            synpred78_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred89() {
        backtracking++;
        int start = input.mark();
        try {
            synpred89_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred77() {
        backtracking++;
        int start = input.mark();
        try {
            synpred77_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA6_eotS =
        "\11\uffff";
    static final String DFA6_eofS =
        "\1\3\10\uffff";
    static final String DFA6_minS =
        "\2\12\1\4\3\uffff\1\4\2\12";
    static final String DFA6_maxS =
        "\2\56\1\4\3\uffff\1\5\2\56";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\1\1\1\2\3\uffff";
    static final String DFA6_specialS =
        "\11\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3",
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3",
            "\1\6",
            "",
            "",
            "",
            "\1\10\1\7",
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3",
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3"
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
            return "()* loopback of 203:3: ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )*";
        }
    }
    static final String DFA12_eotS =
        "\112\uffff";
    static final String DFA12_eofS =
        "\1\2\4\uffff\1\23\20\uffff\1\23\16\uffff\14\23\1\uffff\7\23\10\uffff"+
        "\11\23";
    static final String DFA12_minS =
        "\1\12\1\4\1\uffff\1\5\1\20\2\12\2\4\1\43\1\44\1\4\1\22\1\21\4\23"+
        "\1\4\1\uffff\1\4\1\20\1\12\2\23\1\0\2\12\1\4\1\5\1\4\1\5\5\20\14"+
        "\12\1\5\7\12\7\36\1\5\11\12";
    static final String DFA12_maxS =
        "\1\56\1\20\1\uffff\2\20\2\56\2\4\2\44\1\4\2\56\4\23\1\4\1\uffff"+
        "\1\5\1\45\3\56\1\0\2\56\1\11\1\106\1\11\1\106\5\20\14\56\1\106\7"+
        "\56\7\36\1\111\11\56";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\20\uffff\1\1\66\uffff";
    static final String DFA12_specialS =
        "\31\uffff\1\0\60\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\4\2\10\uffff\1\2\15\uffff\4\2",
            "\1\3\1\4\12\uffff\1\5",
            "",
            "\1\4\12\uffff\1\5",
            "\1\5",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\15\uffff\1\11\1"+
            "\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\24",
            "\1\25",
            "\1\12\1\13",
            "\1\13",
            "\1\26",
            "\1\27\1\22\27\uffff\1\16\1\17\1\20\1\21",
            "\1\30\1\uffff\1\22\27\uffff\1\16\1\17\1\20\1\21",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\22",
            "\1\31",
            "",
            "\1\33\1\32",
            "\1\35\24\uffff\1\34",
            "\1\6\4\uffff\1\23\1\37\1\14\1\15\1\22\1\7\10\uffff\1\23\4\uffff"+
            "\1\11\1\12\1\13\1\36\1\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\22\27\uffff\1\16\1\17\1\20\1\21",
            "\1\22\27\uffff\1\16\1\17\1\20\1\21",
            "\1\uffff",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\15\uffff\1\11\1"+
            "\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\15\uffff\1\11\1"+
            "\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\43\1\44\1\41\1\uffff\1\42\1\40",
            "\1\53\73\uffff\1\45\1\46\1\47\1\50\1\51\1\52",
            "\1\57\1\60\1\55\1\uffff\1\56\1\54",
            "\1\70\40\uffff\1\61\32\uffff\1\62\1\63\1\64\1\65\1\66\1\67",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\37\1\14\1\15\1\22\1\7\10\uffff\1\23\4\uffff"+
            "\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\6\4\uffff\1\23\1\37\1\14\1\15\1\22\1\7\10\uffff\1\23\4\uffff"+
            "\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\6\4\uffff\1\23\1\37\1\14\1\15\1\22\1\7\10\uffff\1\23\4\uffff"+
            "\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\6\4\uffff\1\23\1\37\1\14\1\15\1\22\1\7\10\uffff\1\23\4\uffff"+
            "\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\6\4\uffff\1\23\1\37\1\14\1\15\1\22\1\7\10\uffff\1\23\4\uffff"+
            "\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1\21",
            "\1\77\73\uffff\1\71\1\72\1\73\1\74\1\75\1\76",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\100",
            "\1\111\63\uffff\1\106\1\107\1\uffff\1\102\1\uffff\1\103\7\uffff"+
            "\1\110\1\101\1\104\1\105",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21",
            "\1\6\4\uffff\1\23\1\uffff\1\14\1\15\1\22\1\7\10\uffff\1\23\4"+
            "\uffff\1\11\1\12\1\13\2\uffff\1\10\3\uffff\1\16\1\17\1\20\1"+
            "\21"
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
            return "323:3: ( 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* )?";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_25 = input.LA(1);

                         
                        int index12_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index12_25);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\11\uffff";
    static final String DFA11_eofS =
        "\1\3\10\uffff";
    static final String DFA11_minS =
        "\2\12\1\4\3\uffff\1\4\2\12";
    static final String DFA11_maxS =
        "\2\56\1\4\3\uffff\1\5\2\56";
    static final String DFA11_acceptS =
        "\3\uffff\1\3\1\1\1\2\3\uffff";
    static final String DFA11_specialS =
        "\11\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\10\uffff\1\3\4\uffff\3\5\2"+
            "\uffff\1\4\3\uffff\4\3",
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3"+
            "\uffff\4\3",
            "\1\6",
            "",
            "",
            "",
            "\1\10\1\7",
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3"+
            "\uffff\4\3",
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3"+
            "\uffff\4\3"
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
            return "()* loopback of 379:1: ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*";
        }
    }
    static final String DFA13_eotS =
        "\10\uffff";
    static final String DFA13_eofS =
        "\1\1\7\uffff";
    static final String DFA13_minS =
        "\1\12\1\uffff\1\12\1\4\1\uffff\1\4\2\12";
    static final String DFA13_maxS =
        "\1\56\1\uffff\1\56\1\4\1\uffff\1\5\2\56";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String DFA13_specialS =
        "\10\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\10\uffff\1\1\15\uffff\4\4",
            "",
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\26\uffff\4\4",
            "\1\5",
            "",
            "\1\7\1\6",
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\26\uffff\4\4",
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\26\uffff\4\4"
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
            return "()* loopback of 428:6: ( (lv_states_7_0= ruleState ) )*";
        }
    }
    static final String DFA17_eotS =
        "\11\uffff";
    static final String DFA17_eofS =
        "\11\uffff";
    static final String DFA17_minS =
        "\2\12\1\4\3\uffff\1\4\2\12";
    static final String DFA17_maxS =
        "\2\56\1\4\3\uffff\1\5\2\56";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\1\1\2\3\uffff";
    static final String DFA17_specialS =
        "\11\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3",
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3",
            "\1\6",
            "",
            "",
            "",
            "\1\10\1\7",
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3",
            "\1\1\6\uffff\3\3\1\2\15\uffff\3\5\2\uffff\1\4\3\uffff\4\3"
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 555:1: ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*";
        }
    }
    static final String DFA18_eotS =
        "\10\uffff";
    static final String DFA18_eofS =
        "\1\1\7\uffff";
    static final String DFA18_minS =
        "\1\12\1\uffff\1\12\1\4\1\uffff\1\4\2\12";
    static final String DFA18_maxS =
        "\1\56\1\uffff\1\56\1\4\1\uffff\1\5\2\56";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String DFA18_specialS =
        "\10\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\10\uffff\1\1\15\uffff\4\4",
            "",
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\26\uffff\4\4",
            "\1\5",
            "",
            "\1\7\1\6",
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\26\uffff\4\4",
            "\1\2\4\uffff\1\1\1\uffff\3\4\1\3\26\uffff\4\4"
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
            return "()+ loopback of 604:4: ( (lv_states_7_0= ruleState ) )+";
        }
    }
    static final String DFA27_eotS =
        "\15\uffff";
    static final String DFA27_eofS =
        "\15\uffff";
    static final String DFA27_minS =
        "\2\12\1\4\7\uffff\1\4\2\12";
    static final String DFA27_maxS =
        "\2\56\1\4\7\uffff\1\5\2\56";
    static final String DFA27_acceptS =
        "\3\uffff\1\7\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff";
    static final String DFA27_specialS =
        "\15\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\4\uffff\1\6\1\7\1\10\1\11\1"+
            "\3\4\uffff\3\4\2\uffff\1\5\3\uffff\4\3",
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\10\uffff\1\3\4\uffff\3\4\2"+
            "\uffff\1\5\3\uffff\4\3",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\13",
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\10\uffff\1\3\4\uffff\3\4\2"+
            "\uffff\1\5\3\uffff\4\3",
            "\1\1\4\uffff\1\3\1\uffff\3\3\1\2\10\uffff\1\3\4\uffff\3\4\2"+
            "\uffff\1\5\3\uffff\4\3"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 922:2: ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )*";
        }
    }
    static final String DFA31_eotS =
        "\10\uffff";
    static final String DFA31_eofS =
        "\1\1\7\uffff";
    static final String DFA31_minS =
        "\1\12\1\uffff\1\12\1\4\1\uffff\1\4\2\12";
    static final String DFA31_maxS =
        "\1\61\1\uffff\1\61\1\4\1\uffff\1\5\2\61";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String DFA31_specialS =
        "\10\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\3\1\1\3\10\uffff\1\1\15\uffff\4\1\3"+
            "\4",
            "",
            "\1\2\4\uffff\1\1\1\uffff\3\1\1\3\26\uffff\4\1\3\4",
            "\1\5",
            "",
            "\1\7\1\6",
            "\1\2\4\uffff\1\1\1\uffff\3\1\1\3\26\uffff\4\1\3\4",
            "\1\2\4\uffff\1\1\1\uffff\3\1\1\3\26\uffff\4\1\3\4"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 1139:4: ( (lv_outgoingTransitions_30_0= ruleTransition ) )*";
        }
    }
    static final String DFA62_eotS =
        "\u013f\uffff";
    static final String DFA62_eofS =
        "\1\uffff\2\16\16\uffff\2\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1"+
        "\16\2\uffff\4\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1\16\2\uffff"+
        "\2\16\4\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16\10\uffff"+
        "\2\16\1\uffff\1\16\2\uffff\2\16\4\uffff\2\16\1\uffff\1\16\2\uffff"+
        "\4\16\1\uffff\1\16\2\uffff\2\16\4\uffff\2\16\1\uffff\1\16\2\uffff"+
        "\4\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1\16\2\uffff\2\16\6\uffff"+
        "\2\16\1\uffff\1\16\3\uffff\2\16\1\uffff\1\16\3\uffff\1\16\3\uffff"+
        "\2\16\1\uffff\1\16\3\uffff\1\16\4\uffff\1\16\3\uffff\2\16\10\uffff"+
        "\2\16\1\uffff\1\16\2\uffff\2\16\10\uffff\2\16\1\uffff\1\16\2\uffff"+
        "\2\16\4\uffff\2\16\1\uffff\1\16\2\uffff\4\16\1\uffff\1\16\2\uffff"+
        "\2\16\6\uffff\2\16\2\uffff\2\16\1\uffff\1\16\3\uffff\2\16\2\uffff"+
        "\2\16\1\uffff\1\16\3\uffff\2\16\1\uffff\1\16\3\uffff\1\16\3\uffff"+
        "\2\16\14\uffff\2\16\1\uffff\1\16\2\uffff\2\16\6\uffff\2\16\2\uffff"+
        "\2\16\2\uffff\2\16\1\uffff\1\16\3\uffff\2\16\6\uffff\2\16";
    static final String DFA62_minS =
        "\3\4\2\0\1\50\1\4\2\0\1\uffff\4\4\1\uffff\1\4\1\0\2\4\1\0\1\4\1"+
        "\50\5\4\1\0\1\4\1\50\5\4\1\0\1\4\1\50\5\4\1\0\1\4\1\50\3\4\1\50"+
        "\1\4\1\51\22\4\1\0\1\51\1\0\1\50\1\4\2\51\2\4\1\0\1\4\1\50\3\4\1"+
        "\50\1\4\2\51\2\4\1\0\1\4\1\50\5\4\1\0\1\4\1\50\3\4\1\50\1\4\2\51"+
        "\2\4\1\0\1\4\1\50\5\4\1\0\1\4\1\50\5\4\1\0\1\4\1\50\3\4\1\50\1\4"+
        "\2\51\1\0\1\51\5\4\1\0\1\51\11\4\1\0\1\51\16\4\1\0\1\51\2\4\1\50"+
        "\1\4\2\51\1\50\1\4\2\51\2\4\1\0\1\4\1\50\3\4\1\50\1\4\2\51\1\50"+
        "\1\4\2\51\2\4\1\0\1\4\1\50\3\4\1\50\1\4\2\51\2\4\1\0\1\4\1\50\5"+
        "\4\1\0\1\4\1\50\3\4\1\50\1\4\2\51\1\0\1\51\2\4\1\0\1\51\5\4\1\0"+
        "\1\51\2\4\1\0\1\51\5\4\1\0\1\51\11\4\1\0\1\51\2\4\1\50\1\4\2\51"+
        "\1\50\1\4\2\51\1\50\1\4\2\51\2\4\1\0\1\4\1\50\3\4\1\50\1\4\2\51"+
        "\1\0\1\51\2\4\1\0\1\51\2\4\1\0\1\51\5\4\1\0\1\51\2\4\1\50\1\4\2"+
        "\51\1\0\1\51\2\4";
    static final String DFA62_maxS =
        "\1\100\2\77\2\0\1\50\1\4\2\0\1\uffff\4\100\1\uffff\1\100\1\0\2\76"+
        "\1\0\1\76\1\50\1\4\2\76\2\77\1\0\1\77\1\50\1\4\4\77\1\0\1\77\1\50"+
        "\1\4\4\77\1\0\1\77\1\50\1\4\2\77\1\50\1\4\1\51\1\100\1\76\1\4\2"+
        "\100\1\77\1\4\3\100\1\77\1\4\4\100\1\77\1\4\1\0\1\51\1\0\1\50\1"+
        "\4\2\51\2\76\1\0\1\76\1\50\1\4\2\76\1\50\1\4\2\51\2\76\1\0\1\76"+
        "\1\50\1\4\2\76\2\77\1\0\1\77\1\50\1\4\2\77\1\50\1\4\2\51\2\76\1"+
        "\0\1\76\1\50\1\4\2\76\2\77\1\0\1\77\1\50\1\4\4\77\1\0\1\77\1\50"+
        "\1\4\2\77\1\50\1\4\2\51\1\0\1\51\2\76\1\100\1\76\1\4\1\0\1\51\2"+
        "\77\1\100\1\76\1\4\2\100\1\77\1\4\1\0\1\51\2\77\1\100\1\76\1\4\2"+
        "\100\1\77\1\4\3\100\1\77\1\4\1\0\1\51\2\77\1\50\1\4\2\51\1\50\1"+
        "\4\2\51\2\76\1\0\1\76\1\50\1\4\2\76\1\50\1\4\2\51\1\50\1\4\2\51"+
        "\2\76\1\0\1\76\1\50\1\4\2\76\1\50\1\4\2\51\2\76\1\0\1\76\1\50\1"+
        "\4\2\76\2\77\1\0\1\77\1\50\1\4\2\77\1\50\1\4\2\51\1\0\1\51\2\76"+
        "\1\0\1\51\2\76\1\100\1\76\1\4\1\0\1\51\2\77\1\0\1\51\2\76\1\100"+
        "\1\76\1\4\1\0\1\51\2\77\1\100\1\76\1\4\2\100\1\77\1\4\1\0\1\51\2"+
        "\77\1\50\1\4\2\51\1\50\1\4\2\51\1\50\1\4\2\51\2\76\1\0\1\76\1\50"+
        "\1\4\2\76\1\50\1\4\2\51\1\0\1\51\2\76\1\0\1\51\2\76\1\0\1\51\2\76"+
        "\1\100\1\76\1\4\1\0\1\51\2\77\1\50\1\4\2\51\1\0\1\51\2\76";
    static final String DFA62_acceptS =
        "\11\uffff\1\1\4\uffff\1\2\u0130\uffff";
    static final String DFA62_specialS =
        "\3\uffff\1\24\1\6\2\uffff\1\10\1\20\7\uffff\1\7\2\uffff\1\1\7\uffff"+
        "\1\12\7\uffff\1\13\7\uffff\1\14\32\uffff\1\25\1\uffff\1\11\6\uffff"+
        "\1\4\13\uffff\1\3\7\uffff\1\15\13\uffff\1\5\7\uffff\1\16\7\uffff"+
        "\1\17\11\uffff\1\41\6\uffff\1\42\12\uffff\1\43\17\uffff\1\44\15"+
        "\uffff\1\23\17\uffff\1\22\13\uffff\1\21\7\uffff\1\0\11\uffff\1\40"+
        "\3\uffff\1\37\6\uffff\1\36\3\uffff\1\35\6\uffff\1\34\12\uffff\1"+
        "\33\21\uffff\1\2\11\uffff\1\32\3\uffff\1\31\3\uffff\1\30\6\uffff"+
        "\1\27\7\uffff\1\26\3\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\7\1\uffff\1\1\1\10\1\2\1\4\36\uffff\1\3\17\uffff\1\5\2\uffff"+
            "\1\11\4\uffff\1\6",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\12",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\12",
            "\1\uffff",
            "\1\uffff",
            "\1\17",
            "\1\20",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\27\1\uffff\1\21\1\30\1\22\1\24\36\uffff\1\23\17\uffff\1\25"+
            "\7\uffff\1\26",
            "\1\37\1\uffff\1\31\1\40\1\32\1\34\36\uffff\1\33\17\uffff\1\35"+
            "\7\uffff\1\36",
            "\1\47\1\uffff\1\41\1\50\1\42\1\44\36\uffff\1\43\17\uffff\1\45"+
            "\7\uffff\1\46",
            "\1\57\1\uffff\1\51\1\60\1\52\1\54\36\uffff\1\53\17\uffff\1\55"+
            "\7\uffff\1\56",
            "",
            "\1\63\63\uffff\1\61\7\uffff\1\62",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\64",
            "\1\65",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\66\1\16"+
            "\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\70",
            "\1\71",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\72\1\16"+
            "\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\75",
            "\1\76",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\77\1\16"+
            "\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\103",
            "\1\104",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\105\1\16"+
            "\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\113\63\uffff\1\111\7\uffff\1\112",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\114",
            "\1\123\1\uffff\1\115\1\124\1\116\1\120\36\uffff\1\117\17\uffff"+
            "\1\121\7\uffff\1\122",
            "\1\127\63\uffff\1\125\7\uffff\1\126",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\130",
            "\1\137\1\uffff\1\131\1\140\1\132\1\134\36\uffff\1\133\17\uffff"+
            "\1\135\7\uffff\1\136",
            "\1\147\1\uffff\1\141\1\150\1\142\1\144\36\uffff\1\143\17\uffff"+
            "\1\145\7\uffff\1\146",
            "\1\153\63\uffff\1\151\7\uffff\1\152",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\154",
            "\1\163\1\uffff\1\155\1\164\1\156\1\160\36\uffff\1\157\17\uffff"+
            "\1\161\7\uffff\1\162",
            "\1\173\1\uffff\1\165\1\174\1\166\1\170\36\uffff\1\167\17\uffff"+
            "\1\171\7\uffff\1\172",
            "\1\u0083\1\uffff\1\175\1\u0084\1\176\1\u0080\36\uffff\1\177"+
            "\17\uffff\1\u0081\7\uffff\1\u0082",
            "\1\u0087\63\uffff\1\u0085\7\uffff\1\u0086",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\u0088",
            "\1\uffff",
            "\1\110",
            "\1\uffff",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\u008d",
            "\1\u008e",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u008f\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\u0094",
            "\1\u0095",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u0096\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u009a\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\u009f",
            "\1\u00a0",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u00a1\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u00a5\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u00aa\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\uffff",
            "\1\u008b",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\u00b1\63\uffff\1\u00af\7\uffff\1\u00b0",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\u00b2",
            "\1\uffff",
            "\1\u0092",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13\1\67",
            "\1\u00b5\63\uffff\1\u00b3\7\uffff\1\u00b4",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\u00b6",
            "\1\u00bd\1\uffff\1\u00b7\1\u00be\1\u00b8\1\u00ba\36\uffff\1"+
            "\u00b9\17\uffff\1\u00bb\7\uffff\1\u00bc",
            "\1\u00c1\63\uffff\1\u00bf\7\uffff\1\u00c0",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\u00c2",
            "\1\uffff",
            "\1\u009d",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\73",
            "\1\u00c5\63\uffff\1\u00c3\7\uffff\1\u00c4",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\u00c6",
            "\1\u00cd\1\uffff\1\u00c7\1\u00ce\1\u00c8\1\u00ca\36\uffff\1"+
            "\u00c9\17\uffff\1\u00cb\7\uffff\1\u00cc",
            "\1\u00d1\63\uffff\1\u00cf\7\uffff\1\u00d0",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\u00d2",
            "\1\u00d9\1\uffff\1\u00d3\1\u00da\1\u00d4\1\u00d6\36\uffff\1"+
            "\u00d5\17\uffff\1\u00d7\7\uffff\1\u00d8",
            "\1\u00e1\1\uffff\1\u00db\1\u00e2\1\u00dc\1\u00de\36\uffff\1"+
            "\u00dd\17\uffff\1\u00df\7\uffff\1\u00e0",
            "\1\u00e5\63\uffff\1\u00e3\7\uffff\1\u00e4",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\u00e6",
            "\1\uffff",
            "\1\u00ad",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\100",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\u00ef",
            "\1\u00f0",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u00f1\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\u00fa",
            "\1\u00fb",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u00fc\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\u0101",
            "\1\u0102",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u0103\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u0107\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\uffff",
            "\1\u00e9",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\13",
            "\1\uffff",
            "\1\u00ed",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\u010e\63\uffff\1\u010c\7\uffff\1\u010d",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\u010f",
            "\1\uffff",
            "\1\u00f4",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74\1\u0097",
            "\1\uffff",
            "\1\u00f8",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\u0112\63\uffff\1\u0110\7\uffff\1\u0111",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\u0113",
            "\1\uffff",
            "\1\u00ff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101\1\u00a2",
            "\1\u0116\63\uffff\1\u0114\7\uffff\1\u0115",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\u0117",
            "\1\u011e\1\uffff\1\u0118\1\u011f\1\u0119\1\u011b\36\uffff\1"+
            "\u011a\17\uffff\1\u011c\7\uffff\1\u011d",
            "\1\u0122\63\uffff\1\u0120\7\uffff\1\u0121",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\u0123",
            "\1\uffff",
            "\1\u010a",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u00a6",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\uffff",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\u0130",
            "\1\u0131",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\u0132\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\uffff",
            "\1\u0126",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\14\1\74",
            "\1\uffff",
            "\1\u012a",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\101",
            "\1\uffff",
            "\1\u012e",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\u0139\63\uffff\1\u0137\7\uffff\1\u0138",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\u013a",
            "\1\uffff",
            "\1\u0135",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7\1\u0104",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\uffff",
            "\1\u013d",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7",
            "\1\16\2\uffff\1\16\2\uffff\1\16\4\uffff\1\16\1\uffff\4\16\1"+
            "\uffff\1\16\2\uffff\5\16\3\uffff\4\16\2\uffff\1\16\1\uffff\1"+
            "\16\1\uffff\7\16\6\11\4\uffff\1\15\1\102\1\u00a7"
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "2431:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_221 = input.LA(1);

                         
                        int index62_221 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_221);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_19 = input.LA(1);

                         
                        int index62_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_282 = input.LA(1);

                         
                        int index62_282 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_282);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA62_91 = input.LA(1);

                         
                        int index62_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_91);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA62_79 = input.LA(1);

                         
                        int index62_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_79);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA62_111 = input.LA(1);

                         
                        int index62_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_111);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA62_4 = input.LA(1);

                         
                        int index62_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_4);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA62_16 = input.LA(1);

                         
                        int index62_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_16);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA62_72 = input.LA(1);

                         
                        int index62_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_72);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA62_27 = input.LA(1);

                         
                        int index62_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_27);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA62_35 = input.LA(1);

                         
                        int index62_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_35);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA62_43 = input.LA(1);

                         
                        int index62_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_43);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA62_99 = input.LA(1);

                         
                        int index62_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_99);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA62_119 = input.LA(1);

                         
                        int index62_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_119);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA62_127 = input.LA(1);

                         
                        int index62_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_127);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA62_213 = input.LA(1);

                         
                        int index62_213 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_213);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA62_201 = input.LA(1);

                         
                        int index62_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_201);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA62_185 = input.LA(1);

                         
                        int index62_185 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_185);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA62_3 = input.LA(1);

                         
                        int index62_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_3);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA62_70 = input.LA(1);

                         
                        int index62_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_70);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA62_315 = input.LA(1);

                         
                        int index62_315 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_315);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA62_307 = input.LA(1);

                         
                        int index62_307 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_307);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA62_300 = input.LA(1);

                         
                        int index62_300 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_300);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA62_296 = input.LA(1);

                         
                        int index62_296 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_296);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA62_292 = input.LA(1);

                         
                        int index62_292 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_292);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA62_264 = input.LA(1);

                         
                        int index62_264 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_264);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA62_253 = input.LA(1);

                         
                        int index62_253 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_253);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA62_246 = input.LA(1);

                         
                        int index62_246 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_246);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA62_242 = input.LA(1);

                         
                        int index62_242 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_242);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA62_235 = input.LA(1);

                         
                        int index62_235 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_235);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA62_231 = input.LA(1);

                         
                        int index62_231 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_231);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA62_137 = input.LA(1);

                         
                        int index62_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_137);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA62_144 = input.LA(1);

                         
                        int index62_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_144);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA62_155 = input.LA(1);

                         
                        int index62_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_155);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA62_171 = input.LA(1);

                         
                        int index62_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74()) ) {s = 9;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index62_171);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\11\uffff";
    static final String DFA88_eofS =
        "\1\1\10\uffff";
    static final String DFA88_minS =
        "\1\12\1\uffff\1\12\1\4\2\uffff\1\4\2\12";
    static final String DFA88_maxS =
        "\1\47\1\uffff\1\47\1\4\2\uffff\1\5\2\47";
    static final String DFA88_acceptS =
        "\1\uffff\1\3\2\uffff\1\1\1\2\3\uffff";
    static final String DFA88_specialS =
        "\11\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\2\11\uffff\1\3\15\uffff\3\5\2\uffff\1\4",
            "",
            "\1\2\11\uffff\1\3\15\uffff\3\5\2\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\10\1\7",
            "\1\2\11\uffff\1\3\15\uffff\3\5\2\uffff\1\4",
            "\1\2\11\uffff\1\3\15\uffff\3\5\2\uffff\1\4"
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
            return "()* loopback of 379:1: ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootRegion_in_entryRuleRootRegion81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootRegion91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportAnnotation_in_ruleRootRegion137 = new BitSet(new long[]{0x00007C9C001E8402L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleRootRegion159 = new BitSet(new long[]{0x0000789C001E8402L});
        public static final BitSet FOLLOW_15_in_ruleRootRegion171 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRootRegion188 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRootRegion211 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRootRegion227 = new BitSet(new long[]{0x0000789C001E0402L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRootRegion251 = new BitSet(new long[]{0x0000789C001E0402L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleRootRegion278 = new BitSet(new long[]{0x0000789C001E0402L});
        public static final BitSet FOLLOW_ruleState_in_ruleRootRegion301 = new BitSet(new long[]{0x00007800001E0402L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRegion348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleSingleRegion394 = new BitSet(new long[]{0x00007800001E8402L});
        public static final BitSet FOLLOW_15_in_ruleSingleRegion406 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRegion423 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRegion446 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSingleRegion462 = new BitSet(new long[]{0x0000789C001E0402L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleSingleRegion484 = new BitSet(new long[]{0x0000789C001E0402L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleSingleRegion511 = new BitSet(new long[]{0x0000789C001E0402L});
        public static final BitSet FOLLOW_ruleState_in_ruleSingleRegion536 = new BitSet(new long[]{0x00007800001E0402L});
        public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion573 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegion583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleRegion629 = new BitSet(new long[]{0x0000000000108400L});
        public static final BitSet FOLLOW_15_in_ruleRegion640 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRegion657 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion680 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRegion696 = new BitSet(new long[]{0x0000789C001E0400L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRegion718 = new BitSet(new long[]{0x0000789C001E0400L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleRegion745 = new BitSet(new long[]{0x0000789C001E0400L});
        public static final BitSet FOLLOW_ruleState_in_ruleRegion768 = new BitSet(new long[]{0x00007800001E0402L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState805 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleState861 = new BitSet(new long[]{0x00007800001E0400L});
        public static final BitSet FOLLOW_17_in_ruleState882 = new BitSet(new long[]{0x00007800000C0000L});
        public static final BitSet FOLLOW_18_in_ruleState913 = new BitSet(new long[]{0x0000780000080000L});
        public static final BitSet FOLLOW_18_in_ruleState953 = new BitSet(new long[]{0x00007800000A0000L});
        public static final BitSet FOLLOW_17_in_ruleState984 = new BitSet(new long[]{0x0000780000080000L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleState1022 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleState1033 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1050 = new BitSet(new long[]{0x0003800001100422L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleState1072 = new BitSet(new long[]{0x0003800001100402L});
        public static final BitSet FOLLOW_20_in_ruleState1090 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1112 = new BitSet(new long[]{0x0003800000300402L});
        public static final BitSet FOLLOW_21_in_ruleState1123 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleState1144 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_ruleState1155 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleState1176 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_23_in_ruleState1188 = new BitSet(new long[]{0x0003800000100402L});
        public static final BitSet FOLLOW_24_in_ruleState1208 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleState1231 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleState1258 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_25_in_ruleState1275 = new BitSet(new long[]{0x0900799DBE1E87D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1296 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_26_in_ruleState1314 = new BitSet(new long[]{0x0900799DBE1E87D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1335 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_27_in_ruleState1353 = new BitSet(new long[]{0x0900799DBE1E87D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1374 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_28_in_ruleState1392 = new BitSet(new long[]{0x0900799DBE1E87D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1413 = new BitSet(new long[]{0x0000789C3E1E8400L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleState1438 = new BitSet(new long[]{0x0000000020108400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleState1459 = new BitSet(new long[]{0x0000000020108400L});
        public static final BitSet FOLLOW_29_in_ruleState1473 = new BitSet(new long[]{0x0003800000100402L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState1497 = new BitSet(new long[]{0x0003800000100402L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1534 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleTransition1590 = new BitSet(new long[]{0x0003800000100400L});
        public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition1612 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition1629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1657 = new BitSet(new long[]{0x0000000240000002L});
        public static final BitSet FOLLOW_30_in_ruleTransition1668 = new BitSet(new long[]{0x09000103800003F2L,0x0000000000000001L});
        public static final BitSet FOLLOW_31_in_ruleTransition1688 = new BitSet(new long[]{0x09000103000003D2L,0x0000000000000001L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition1719 = new BitSet(new long[]{0x09000103000003D2L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTransition1746 = new BitSet(new long[]{0x0000000300000002L});
        public static final BitSet FOLLOW_32_in_ruleTransition1758 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition1779 = new BitSet(new long[]{0x0000000200400002L});
        public static final BitSet FOLLOW_22_in_ruleTransition1790 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition1811 = new BitSet(new long[]{0x0000000200400002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition1839 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleTransition1865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal1915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal1925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleSignal1971 = new BitSet(new long[]{0x0000001C00100400L});
        public static final BitSet FOLLOW_34_in_ruleSignal1990 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_35_in_ruleSignal2022 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleSignal2046 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2063 = new BitSet(new long[]{0x0000002000010002L});
        public static final BitSet FOLLOW_37_in_ruleSignal2079 = new BitSet(new long[]{0x0000000000000370L});
        public static final BitSet FOLLOW_ruleAnyType_in_ruleSignal2100 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleSignal2114 = new BitSet(new long[]{0x0000000000000020L,0x000000000000007EL});
        public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSignal2183 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleSignal2193 = new BitSet(new long[]{0x0000000000000020L,0x000000000000007EL});
        public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2215 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2238 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleSignal2254 = new BitSet(new long[]{0x5600000000000020L,0x00000000000003C0L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2344 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable2354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleVariable2400 = new BitSet(new long[]{0x0000008000100400L});
        public static final BitSet FOLLOW_39_in_ruleVariable2411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2428 = new BitSet(new long[]{0x0000002000010000L});
        public static final BitSet FOLLOW_37_in_ruleVariable2444 = new BitSet(new long[]{0x0000000000000370L});
        public static final BitSet FOLLOW_ruleAnyType_in_ruleVariable2465 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVariable2477 = new BitSet(new long[]{0x0000000000000020L,0x000000000000007EL});
        public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstitution_in_entryRuleSubstitution2564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution2574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution2616 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleSubstitution2631 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution2648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAction2754 = new BitSet(new long[]{0x09000101000003D2L,0x0000000000000001L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAction2785 = new BitSet(new long[]{0x09000101000003D2L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction2812 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_32_in_ruleAction2824 = new BitSet(new long[]{0x0000000000000092L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleAction2846 = new BitSet(new long[]{0x0000000000400092L});
        public static final BitSet FOLLOW_22_in_ruleAction2857 = new BitSet(new long[]{0x0000000000000092L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect2899 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect2909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect2989 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect3019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission3054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission3111 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleEmission3122 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission3143 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleEmission3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3191 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3248 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAssignment3258 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment3279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3367 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleTextEffect3383 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect3400 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTextEffect3415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3453 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression3463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression3513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression3543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression3637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression3671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression3681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3731 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression3764 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3785 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression3823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression3833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression3883 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression3916 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression3937 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation3975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4036 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4069 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation4123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression4342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression4376 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression4386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4436 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression4469 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4490 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression4528 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression4538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4588 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression4621 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4642 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression4680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression4690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression4740 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression4773 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleMultExpression4794 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression4832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression4842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4892 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression4925 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression4946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression4984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression4994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression5053 = new BitSet(new long[]{0x0900010000000290L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression5074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression5106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression5141 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression5151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression5201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression5231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicExpression5247 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression5272 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicExpression5281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression5313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression5358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicValuedExpression5454 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleAtomicValuedExpression5479 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicValuedExpression5488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAtomicValuedExpression5506 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression5531 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAtomicValuedExpression5540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression5572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression5607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression5617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5667 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression5699 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleDivExpression5720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression5756 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression5766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression5825 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleValuedObjectTestExpression5835 = new BitSet(new long[]{0x0100000000000010L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression5856 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleValuedObjectTestExpression5866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression5907 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression5960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference5995 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference6005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference6051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6086 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression6138 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_40_in_ruleTextExpression6154 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression6171 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleTextExpression6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue6224 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue6234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue6275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue6315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue6325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue6366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue6416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue6457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyType_in_entryRuleAnyType6498 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyType6509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnyType6549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAnyType6575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAnyType6601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnyType6627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyType6653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_entryRuleStringAnnotation6698 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringAnnotation6708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleStringAnnotation6758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_ruleStringAnnotation6788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation6823 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation6833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation6914 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation6924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleKeyValueAnnotation6959 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValueAnnotation6976 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyValueAnnotation7002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportAnnotation_in_entryRuleImportAnnotation7038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportAnnotation7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleImportAnnotation7083 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportAnnotation7100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString7142 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString7153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString7193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString7219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleStateType7276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleStateType7291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleStateType7306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleStateType7321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTransitionType7364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTransitionType7379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTransitionType7394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleCompareOperator7437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleCompareOperator7452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleCompareOperator7467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCompareOperator7482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCompareOperator7497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleCompareOperator7512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_rulePreOperator7554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleOrOperator7595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleAndOperator7636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleNotOperator7677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleAddOperator7718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleSubOperator7759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleMultOperator7800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleModOperator7841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleDivOperator7882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleValueTestOperator7923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleValueType7965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleValueType7980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleValueType7995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleValueType8010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleValueType8025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleValueType8040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleCombineOperator8083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleCombineOperator8098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCombineOperator8113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleCombineOperator8128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleCombineOperator8143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleCombineOperator8158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleCombineOperator8173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleCombineOperator8188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_synpred2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_synpred9394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_synpred14406 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred14423 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred14446 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_synpred14462 = new BitSet(new long[]{0x0000009C00100402L});
        public static final BitSet FOLLOW_ruleVariable_in_synpred14484 = new BitSet(new long[]{0x0000009C00100402L});
        public static final BitSet FOLLOW_ruleSignal_in_synpred14511 = new BitSet(new long[]{0x0000009C00100402L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred391438 = new BitSet(new long[]{0x0000000000108402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred391459 = new BitSet(new long[]{0x0000000000108402L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred743513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred774036 = new BitSet(new long[]{0x00FC000000000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred774069 = new BitSet(new long[]{0x09000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred774090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred784218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred895454 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleDivExpression_in_synpred895479 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred895488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_synpred905506 = new BitSet(new long[]{0x01000100000003D0L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred905531 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_synpred905540 = new BitSet(new long[]{0x0000000000000002L});
    }


}