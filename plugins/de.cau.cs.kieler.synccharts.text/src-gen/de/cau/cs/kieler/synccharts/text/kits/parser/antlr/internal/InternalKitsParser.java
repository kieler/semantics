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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_HOSTCODE", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_COMMENT_ANNOTATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'region'", "':'", "'textual'", "'code'", "'('", "')'", "'init'", "'final'", "'state'", "'@'", "'['", "','", "']'", "'{'", "'onentry'", "'oninner'", "'onexit'", "'suspension'", "'}'", "'with'", "'#'", "'/'", "'history'", "'input'", "'output'", "'signal'", "':='", "'combine'", "'var'", "';'", "'inputoutput'", "'return'", "'import'", "'normal'", "'conditional'", "'reference'", "'-->'", "'o->'", "'>->'", "'='", "'<'", "'<='", "'>'", "'>='", "'<>'", "'pre'", "'or'", "'and'", "'not'", "'+'", "'-'", "'*'", "'mod'", "'?'", "'pure'", "'bool'", "'unsigned'", "'int'", "'float'", "'host'", "'none'", "'max'", "'min'"
    };
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_ID=4;
    public static final int RULE_WS=13;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_COMMENT_ANNOTATION=10;
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_FLOAT=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_HOSTCODE=7;

        public InternalKitsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[256+1];
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:93:1: ruleRootRegion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleState ) )* ) ;
    public final EObject ruleRootRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_3_0=null;
        Token lv_label_4_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_variables_6_0 = null;

        EObject lv_signals_7_0 = null;

        EObject lv_bodyText_8_0 = null;

        EObject lv_states_9_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:98:6: ( ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:1: ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:1: ( ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleState ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:2: ( (lv_annotations_0_0= ruleImportAnnotation ) )* ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )? ( (lv_states_9_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:99:2: ( (lv_annotations_0_0= ruleImportAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==47) ) {
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:123:3: ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:123:4: ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )*
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:123:4: ( (lv_annotations_1_0= ruleStringAnnotation ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_COMMENT_ANNOTATION||LA2_0==24) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: (lv_annotations_1_0= ruleStringAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:124:1: (lv_annotations_1_0= ruleStringAnnotation )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:125:3: lv_annotations_1_0= ruleStringAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getAnnotationsStringAnnotationParserRuleCall_1_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleRootRegion160);
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

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleRootRegion171); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getRootRegionAccess().getRegionKeyword_1_1(), null); 
                          
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

                              			createLeafNode(grammarAccess.getRootRegionAccess().getIdIDTerminalRuleCall_1_2_0(), "id"); 
                              		
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

                              			createLeafNode(grammarAccess.getRootRegionAccess().getLabelSTRINGTerminalRuleCall_1_3_0(), "label"); 
                              		
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

                              createLeafNode(grammarAccess.getRootRegionAccess().getColonKeyword_1_4(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:1: ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==43) ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>=38 && LA5_0<=40)) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:2: ( (lv_variables_6_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:203:2: ( (lv_variables_6_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:204:1: (lv_variables_6_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:204:1: (lv_variables_6_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:205:3: lv_variables_6_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getVariablesVariableParserRuleCall_1_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRootRegion249);
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
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getSignalsSignalParserRuleCall_1_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleRootRegion276);
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
                    	    break loop5;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:252:4: ( (lv_bodyText_8_0= ruleTextualCode ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            int LA6_2 = input.LA(2);

                            if ( (LA6_2==18) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:253:1: (lv_bodyText_8_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:253:1: (lv_bodyText_8_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:254:3: lv_bodyText_8_0= ruleTextualCode
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getBodyTextTextualCodeParserRuleCall_1_6_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleRootRegion299);
                    	    lv_bodyText_8_0=ruleTextualCode();
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
                    	      	       			"bodyText",
                    	      	        		lv_bodyText_8_0, 
                    	      	        		"TextualCode", 
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
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:276:5: ( (lv_states_9_0= ruleState ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMENT_ANNOTATION||LA8_0==17||(LA8_0>=21 && LA8_0<=24)||(LA8_0>=48 && LA8_0<=50)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:277:1: (lv_states_9_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:277:1: (lv_states_9_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:278:3: lv_states_9_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRootRegionAccess().getStatesStateParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRootRegion323);
            	    lv_states_9_0=ruleState();
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
            	      	        		lv_states_9_0, 
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
            	    break loop8;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:308:1: entryRuleSingleRegion returns [EObject current=null] : iv_ruleSingleRegion= ruleSingleRegion EOF ;
    public final EObject entryRuleSingleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:309:2: (iv_ruleSingleRegion= ruleSingleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:310:2: iv_ruleSingleRegion= ruleSingleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSingleRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion360);
            iv_ruleSingleRegion=ruleSingleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSingleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleRegion370); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:317:1: ruleSingleRegion returns [EObject current=null] : ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* ) ;
    public final EObject ruleSingleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_signals_6_0 = null;

        EObject lv_bodyText_7_0 = null;

        EObject lv_states_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:322:6: ( ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:1: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:1: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:2: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )? ( (lv_states_8_0= ruleState ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:2: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:3: ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )*
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:3: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_COMMENT_ANNOTATION||LA9_0==24) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:324:1: (lv_annotations_0_0= ruleStringAnnotation )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:324:1: (lv_annotations_0_0= ruleStringAnnotation )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:325:3: lv_annotations_0_0= ruleStringAnnotation
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleSingleRegion417);
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
                    	    break loop9;
                        }
                    } while (true);

                    match(input,15,FollowSets000.FOLLOW_15_in_ruleSingleRegion428); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSingleRegionAccess().getRegionKeyword_0_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:351:1: ( (lv_id_2_0= RULE_ID ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: (lv_id_2_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: (lv_id_2_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:353:3: lv_id_2_0= RULE_ID
                            {
                            lv_id_2_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSingleRegion445); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSingleRegionAccess().getIdIDTerminalRuleCall_0_2_0(), "id"); 
                              		
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:375:3: ( (lv_label_3_0= RULE_STRING ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_STRING) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:376:1: (lv_label_3_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:376:1: (lv_label_3_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:377:3: lv_label_3_0= RULE_STRING
                            {
                            lv_label_3_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSingleRegion468); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSingleRegionAccess().getLabelSTRINGTerminalRuleCall_0_3_0(), "label"); 
                              		
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

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSingleRegion484); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSingleRegionAccess().getColonKeyword_0_4(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:403:1: ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==43) ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>=38 && LA12_0<=40)) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:403:2: ( (lv_variables_5_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:403:2: ( (lv_variables_5_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:1: (lv_variables_5_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:1: (lv_variables_5_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:405:3: lv_variables_5_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getVariablesVariableParserRuleCall_0_5_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleSingleRegion506);
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:428:6: ( (lv_signals_6_0= ruleSignal ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:428:6: ( (lv_signals_6_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:429:1: (lv_signals_6_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:429:1: (lv_signals_6_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:430:3: lv_signals_6_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getSignalsSignalParserRuleCall_0_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleSingleRegion533);
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
                    	    break loop12;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:452:4: ( (lv_bodyText_7_0= ruleTextualCode ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==17) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==18) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:453:1: (lv_bodyText_7_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:453:1: (lv_bodyText_7_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:454:3: lv_bodyText_7_0= ruleTextualCode
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getBodyTextTextualCodeParserRuleCall_0_6_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleSingleRegion556);
                    	    lv_bodyText_7_0=ruleTextualCode();
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
                    	      	       			"bodyText",
                    	      	        		lv_bodyText_7_0, 
                    	      	        		"TextualCode", 
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
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:476:5: ( (lv_states_8_0= ruleState ) )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:477:1: (lv_states_8_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:477:1: (lv_states_8_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:478:3: lv_states_8_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getStatesStateParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleSingleRegion580);
            	    lv_states_8_0=ruleState();
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
            	    break loop15;
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


    // $ANTLR start entryRuleTextualCode
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:508:1: entryRuleTextualCode returns [EObject current=null] : iv_ruleTextualCode= ruleTextualCode EOF ;
    public final EObject entryRuleTextualCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextualCode = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:509:2: (iv_ruleTextualCode= ruleTextualCode EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:510:2: iv_ruleTextualCode= ruleTextualCode EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextualCodeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_entryRuleTextualCode617);
            iv_ruleTextualCode=ruleTextualCode();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextualCode; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextualCode627); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTextualCode


    // $ANTLR start ruleTextualCode
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:517:1: ruleTextualCode returns [EObject current=null] : ( 'textual' 'code' ( '(' ( (lv_type_3_0= RULE_ID ) ) ')' )? ':' ( (lv_code_6_0= RULE_STRING ) ) ) ;
    public final EObject ruleTextualCode() throws RecognitionException {
        EObject current = null;

        Token lv_type_3_0=null;
        Token lv_code_6_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:522:6: ( ( 'textual' 'code' ( '(' ( (lv_type_3_0= RULE_ID ) ) ')' )? ':' ( (lv_code_6_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:523:1: ( 'textual' 'code' ( '(' ( (lv_type_3_0= RULE_ID ) ) ')' )? ':' ( (lv_code_6_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:523:1: ( 'textual' 'code' ( '(' ( (lv_type_3_0= RULE_ID ) ) ')' )? ':' ( (lv_code_6_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:523:3: 'textual' 'code' ( '(' ( (lv_type_3_0= RULE_ID ) ) ')' )? ':' ( (lv_code_6_0= RULE_STRING ) )
            {
            match(input,17,FollowSets000.FOLLOW_17_in_ruleTextualCode662); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTextualCodeAccess().getTextualKeyword_0(), null); 
                  
            }
            match(input,18,FollowSets000.FOLLOW_18_in_ruleTextualCode672); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTextualCodeAccess().getCodeKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:531:1: ( '(' ( (lv_type_3_0= RULE_ID ) ) ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:531:3: '(' ( (lv_type_3_0= RULE_ID ) ) ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleTextualCode683); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualCodeAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:535:1: ( (lv_type_3_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:536:1: (lv_type_3_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:536:1: (lv_type_3_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:537:3: lv_type_3_0= RULE_ID
                    {
                    lv_type_3_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextualCode700); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTextualCodeAccess().getTypeIDTerminalRuleCall_2_1_0(), "type"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTextualCodeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_3_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleTextualCode715); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextualCodeAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }
                    break;

            }

            match(input,16,FollowSets000.FOLLOW_16_in_ruleTextualCode727); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getTextualCodeAccess().getColonKeyword_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:567:1: ( (lv_code_6_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:568:1: (lv_code_6_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:568:1: (lv_code_6_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:569:3: lv_code_6_0= RULE_STRING
            {
            lv_code_6_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextualCode744); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getTextualCodeAccess().getCodeSTRINGTerminalRuleCall_4_0(), "code"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getTextualCodeRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"code",
              	        		lv_code_6_0, 
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
    // $ANTLR end ruleTextualCode


    // $ANTLR start entryRuleRegion
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:599:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:600:2: (iv_ruleRegion= ruleRegion EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:601:2: iv_ruleRegion= ruleRegion EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRegionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRegion_in_entryRuleRegion785);
            iv_ruleRegion=ruleRegion();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRegion; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRegion795); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:608:1: ruleRegion returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token lv_label_3_0=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_signals_6_0 = null;

        EObject lv_bodyText_7_0 = null;

        EObject lv_states_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:613:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:614:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:614:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+ )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:614:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* ( (lv_states_8_0= ruleState ) )+
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:614:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMENT_ANNOTATION||LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:615:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:615:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:616:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleRegion841);
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
            	    break loop17;
                }
            } while (true);

            match(input,15,FollowSets000.FOLLOW_15_in_ruleRegion852); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionAccess().getRegionKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:642:1: ( (lv_id_2_0= RULE_ID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:643:1: (lv_id_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:643:1: (lv_id_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:644:3: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRegion869); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:666:3: ( (lv_label_3_0= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:667:1: (lv_label_3_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:667:1: (lv_label_3_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:668:3: lv_label_3_0= RULE_STRING
                    {
                    lv_label_3_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleRegion892); if (failed) return current;
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

            match(input,16,FollowSets000.FOLLOW_16_in_ruleRegion908); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRegionAccess().getColonKeyword_4(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:694:1: ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43) ) {
                    alt20=1;
                }
                else if ( ((LA20_0>=38 && LA20_0<=40)) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:694:2: ( (lv_variables_5_0= ruleVariable ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:694:2: ( (lv_variables_5_0= ruleVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:695:1: (lv_variables_5_0= ruleVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:695:1: (lv_variables_5_0= ruleVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:696:3: lv_variables_5_0= ruleVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getVariablesVariableParserRuleCall_5_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleRegion930);
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
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:719:6: ( (lv_signals_6_0= ruleSignal ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:719:6: ( (lv_signals_6_0= ruleSignal ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:720:1: (lv_signals_6_0= ruleSignal )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:720:1: (lv_signals_6_0= ruleSignal )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:721:3: lv_signals_6_0= ruleSignal
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getSignalsSignalParserRuleCall_5_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleRegion957);
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
            	    break loop20;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:743:4: ( (lv_bodyText_7_0= ruleTextualCode ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==17) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==18) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:744:1: (lv_bodyText_7_0= ruleTextualCode )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:744:1: (lv_bodyText_7_0= ruleTextualCode )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:745:3: lv_bodyText_7_0= ruleTextualCode
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getBodyTextTextualCodeParserRuleCall_6_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleRegion980);
            	    lv_bodyText_7_0=ruleTextualCode();
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
            	      	       			"bodyText",
            	      	        		lv_bodyText_7_0, 
            	      	        		"TextualCode", 
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
            	    break loop21;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:767:3: ( (lv_states_8_0= ruleState ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:768:1: (lv_states_8_0= ruleState )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:768:1: (lv_states_8_0= ruleState )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:769:3: lv_states_8_0= ruleState
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRegionAccess().getStatesStateParserRuleCall_7_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleRegion1002);
            	    lv_states_8_0=ruleState();
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:799:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:800:2: (iv_ruleState= ruleState EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:801:2: iv_ruleState= ruleState EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStateRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState1039);
            iv_ruleState=ruleState();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState1049); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:808:1: ruleState returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_31_0= ruleTransition ) )* ) ;
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

        EObject lv_bodyText_27_0 = null;

        EObject lv_regions_28_0 = null;

        EObject lv_regions_29_0 = null;

        EObject lv_outgoingTransitions_31_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:813:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_31_0= ruleTransition ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:814:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_31_0= ruleTransition ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:814:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_31_0= ruleTransition ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:814:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )? ( (lv_type_5_0= ruleStateType ) )? 'state' ( (lv_id_7_0= RULE_ID ) ) ( (lv_label_8_0= RULE_STRING ) )? ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' ) )? ( (lv_outgoingTransitions_31_0= ruleTransition ) )*
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:814:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_COMMENT_ANNOTATION||LA23_0==24) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:815:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:815:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:816:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleState1095);
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
            	    break loop23;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:838:3: ( ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? ) | ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            else if ( (LA26_0==22) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:838:4: ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:838:4: ( ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:838:5: ( (lv_isInitial_1_0= 'init' ) ) ( (lv_isFinal_2_0= 'final' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:838:5: ( (lv_isInitial_1_0= 'init' ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:839:1: (lv_isInitial_1_0= 'init' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:839:1: (lv_isInitial_1_0= 'init' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:840:3: lv_isInitial_1_0= 'init'
                    {
                    lv_isInitial_1_0=(Token)input.LT(1);
                    match(input,21,FollowSets000.FOLLOW_21_in_ruleState1116); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:859:2: ( (lv_isFinal_2_0= 'final' ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==22) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:860:1: (lv_isFinal_2_0= 'final' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:860:1: (lv_isFinal_2_0= 'final' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:861:3: lv_isFinal_2_0= 'final'
                            {
                            lv_isFinal_2_0=(Token)input.LT(1);
                            match(input,22,FollowSets000.FOLLOW_22_in_ruleState1147); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:881:6: ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:881:6: ( ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:881:7: ( (lv_isFinal_3_0= 'final' ) ) ( (lv_isInitial_4_0= 'init' ) )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:881:7: ( (lv_isFinal_3_0= 'final' ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:882:1: (lv_isFinal_3_0= 'final' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:882:1: (lv_isFinal_3_0= 'final' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:883:3: lv_isFinal_3_0= 'final'
                    {
                    lv_isFinal_3_0=(Token)input.LT(1);
                    match(input,22,FollowSets000.FOLLOW_22_in_ruleState1187); if (failed) return current;
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:902:2: ( (lv_isInitial_4_0= 'init' ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==21) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:903:1: (lv_isInitial_4_0= 'init' )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:903:1: (lv_isInitial_4_0= 'init' )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:904:3: lv_isInitial_4_0= 'init'
                            {
                            lv_isInitial_4_0=(Token)input.LT(1);
                            match(input,21,FollowSets000.FOLLOW_21_in_ruleState1218); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:923:6: ( (lv_type_5_0= ruleStateType ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17||(LA27_0>=48 && LA27_0<=50)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:924:1: (lv_type_5_0= ruleStateType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:924:1: (lv_type_5_0= ruleStateType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:925:3: lv_type_5_0= ruleStateType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStateType_in_ruleState1256);
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

            match(input,23,FollowSets000.FOLLOW_23_in_ruleState1267); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getStateAccess().getStateKeyword_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:951:1: ( (lv_id_7_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:952:1: (lv_id_7_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:952:1: (lv_id_7_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:953:3: lv_id_7_0= RULE_ID
            {
            lv_id_7_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1284); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:975:2: ( (lv_label_8_0= RULE_STRING ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:976:1: (lv_label_8_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:976:1: (lv_label_8_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:977:3: lv_label_8_0= RULE_STRING
                    {
                    lv_label_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleState1306); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:999:3: ( ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? ) | ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' ) )?
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_ID) ) {
                    int LA35_4 = input.LA(3);

                    if ( (LA35_4==EOF||LA35_4==RULE_COMMENT_ANNOTATION||LA35_4==15||LA35_4==17||(LA35_4>=21 && LA35_4<=25)||LA35_4==33||(LA35_4>=48 && LA35_4<=53)) ) {
                        alt35=1;
                    }
                }
            }
            else if ( (LA35_0==28) ) {
                alt35=2;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:999:4: ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:999:4: ( '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:999:6: '@' ( ( RULE_ID ) ) ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )?
                    {
                    match(input,24,FollowSets000.FOLLOW_24_in_ruleState1324); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getCommercialAtKeyword_6_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1003:1: ( ( RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1004:1: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1004:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1005:3: RULE_ID
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
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleState1346); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getStateAccess().getBodyReferenceStateCrossReference_6_0_1_0(), "bodyReference"); 
                      	
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1020:2: ( '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==25) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1020:4: '[' ( (lv_renamings_12_0= ruleSubstitution ) ) ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )* ']'
                            {
                            match(input,25,FollowSets000.FOLLOW_25_in_ruleState1357); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStateAccess().getLeftSquareBracketKeyword_6_0_2_0(), null); 
                                  
                            }
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1024:1: ( (lv_renamings_12_0= ruleSubstitution ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1025:1: (lv_renamings_12_0= ruleSubstitution )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1025:1: (lv_renamings_12_0= ruleSubstitution )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1026:3: lv_renamings_12_0= ruleSubstitution
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleState1378);
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

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1048:2: ( ',' ( (lv_renamings_14_0= ruleSubstitution ) ) )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==26) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1048:4: ',' ( (lv_renamings_14_0= ruleSubstitution ) )
                            	    {
                            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleState1389); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getStateAccess().getCommaKeyword_6_0_2_2_0(), null); 
                            	          
                            	    }
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1052:1: ( (lv_renamings_14_0= ruleSubstitution ) )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1053:1: (lv_renamings_14_0= ruleSubstitution )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1053:1: (lv_renamings_14_0= ruleSubstitution )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1054:3: lv_renamings_14_0= ruleSubstitution
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRenamingsSubstitutionParserRuleCall_6_0_2_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleState1410);
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
                            	    break loop29;
                                }
                            } while (true);

                            match(input,27,FollowSets000.FOLLOW_27_in_ruleState1422); if (failed) return current;
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1081:6: ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1081:6: ( '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1081:8: '{' ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? ) '}'
                    {
                    match(input,28,FollowSets000.FOLLOW_28_in_ruleState1442); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_6_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1085:1: ( ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )? )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1085:2: ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )* ( (lv_bodyText_27_0= ruleTextualCode ) )* ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )?
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1085:2: ( ( (lv_signals_17_0= ruleSignal ) ) | ( (lv_variables_18_0= ruleVariable ) ) | ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) ) | ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) ) | ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) ) | ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) ) )*
                    loop31:
                    do {
                        int alt31=7;
                        switch ( input.LA(1) ) {
                        case 38:
                        case 39:
                        case 40:
                            {
                            alt31=1;
                            }
                            break;
                        case 43:
                            {
                            alt31=2;
                            }
                            break;
                        case 29:
                            {
                            alt31=3;
                            }
                            break;
                        case 30:
                            {
                            alt31=4;
                            }
                            break;
                        case 31:
                            {
                            alt31=5;
                            }
                            break;
                        case 32:
                            {
                            alt31=6;
                            }
                            break;

                        }

                        switch (alt31) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1085:3: ( (lv_signals_17_0= ruleSignal ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1085:3: ( (lv_signals_17_0= ruleSignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1086:1: (lv_signals_17_0= ruleSignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1086:1: (lv_signals_17_0= ruleSignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1087:3: lv_signals_17_0= ruleSignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSignalsSignalParserRuleCall_6_1_1_0_0_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_ruleState1465);
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1110:6: ( (lv_variables_18_0= ruleVariable ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1110:6: ( (lv_variables_18_0= ruleVariable ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1111:1: (lv_variables_18_0= ruleVariable )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1111:1: (lv_variables_18_0= ruleVariable )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1112:3: lv_variables_18_0= ruleVariable
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getVariablesVariableParserRuleCall_6_1_1_0_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_ruleState1492);
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1135:6: ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1135:6: ( 'onentry' ( (lv_entryActions_20_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1135:8: 'onentry' ( (lv_entryActions_20_0= ruleAction ) )
                    	    {
                    	    match(input,29,FollowSets000.FOLLOW_29_in_ruleState1509); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnentryKeyword_6_1_1_0_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1139:1: ( (lv_entryActions_20_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1140:1: (lv_entryActions_20_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1140:1: (lv_entryActions_20_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1141:3: lv_entryActions_20_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getEntryActionsActionParserRuleCall_6_1_1_0_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1530);
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1164:6: ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1164:6: ( 'oninner' ( (lv_innerActions_22_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1164:8: 'oninner' ( (lv_innerActions_22_0= ruleAction ) )
                    	    {
                    	    match(input,30,FollowSets000.FOLLOW_30_in_ruleState1548); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOninnerKeyword_6_1_1_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1168:1: ( (lv_innerActions_22_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1169:1: (lv_innerActions_22_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1169:1: (lv_innerActions_22_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1170:3: lv_innerActions_22_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getInnerActionsActionParserRuleCall_6_1_1_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1569);
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1193:6: ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1193:6: ( 'onexit' ( (lv_exitActions_24_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1193:8: 'onexit' ( (lv_exitActions_24_0= ruleAction ) )
                    	    {
                    	    match(input,31,FollowSets000.FOLLOW_31_in_ruleState1587); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getOnexitKeyword_6_1_1_0_4_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1197:1: ( (lv_exitActions_24_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1198:1: (lv_exitActions_24_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1198:1: (lv_exitActions_24_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1199:3: lv_exitActions_24_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getExitActionsActionParserRuleCall_6_1_1_0_4_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1608);
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
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1222:6: ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1222:6: ( 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1222:8: 'suspension' ( (lv_suspensionTrigger_26_0= ruleAction ) )
                    	    {
                    	    match(input,32,FollowSets000.FOLLOW_32_in_ruleState1626); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getStateAccess().getSuspensionKeyword_6_1_1_0_5_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1226:1: ( (lv_suspensionTrigger_26_0= ruleAction ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1227:1: (lv_suspensionTrigger_26_0= ruleAction )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1227:1: (lv_suspensionTrigger_26_0= ruleAction )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1228:3: lv_suspensionTrigger_26_0= ruleAction
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getSuspensionTriggerActionParserRuleCall_6_1_1_0_5_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAction_in_ruleState1647);
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
                    	    break loop31;
                        }
                    } while (true);

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1250:5: ( (lv_bodyText_27_0= ruleTextualCode ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==18) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1251:1: (lv_bodyText_27_0= ruleTextualCode )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1251:1: (lv_bodyText_27_0= ruleTextualCode )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1252:3: lv_bodyText_27_0= ruleTextualCode
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getBodyTextTextualCodeParserRuleCall_6_1_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_ruleState1671);
                    	    lv_bodyText_27_0=ruleTextualCode();
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
                    	      	       			"bodyText",
                    	      	        		lv_bodyText_27_0, 
                    	      	        		"TextualCode", 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1274:3: ( ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==15||LA34_0==17||(LA34_0>=21 && LA34_0<=24)||(LA34_0>=48 && LA34_0<=50)) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==33) ) {
                        int LA34_2 = input.LA(2);

                        if ( (synpred44()) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1274:4: ( (lv_regions_28_0= ruleSingleRegion ) ) ( (lv_regions_29_0= ruleRegion ) )*
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1274:4: ( (lv_regions_28_0= ruleSingleRegion ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1275:1: (lv_regions_28_0= ruleSingleRegion )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1275:1: (lv_regions_28_0= ruleSingleRegion )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1276:3: lv_regions_28_0= ruleSingleRegion
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_ruleState1694);
                            lv_regions_28_0=ruleSingleRegion();
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
                              	        		"SingleRegion", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1298:2: ( (lv_regions_29_0= ruleRegion ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==RULE_COMMENT_ANNOTATION||LA33_0==15||LA33_0==24) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1299:1: (lv_regions_29_0= ruleRegion )
                            	    {
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1299:1: (lv_regions_29_0= ruleRegion )
                            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1300:3: lv_regions_29_0= ruleRegion
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_ruleState1715);
                            	    lv_regions_29_0=ruleRegion();
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
                            	      	        		lv_regions_29_0, 
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
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }

                    match(input,33,FollowSets000.FOLLOW_33_in_ruleState1729); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1326:4: ( (lv_outgoingTransitions_31_0= ruleTransition ) )*
            loop36:
            do {
                int alt36=2;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1327:1: (lv_outgoingTransitions_31_0= ruleTransition )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1327:1: (lv_outgoingTransitions_31_0= ruleTransition )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1328:3: lv_outgoingTransitions_31_0= ruleTransition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionsTransitionParserRuleCall_7_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState1753);
            	    lv_outgoingTransitions_31_0=ruleTransition();
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
            	      	        		lv_outgoingTransitions_31_0, 
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
            	    break loop36;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1358:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1359:2: (iv_ruleTransition= ruleTransition EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1360:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTransitionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1790);
            iv_ruleTransition=ruleTransition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1800); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1367:1: ruleTransition returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? ) ;
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
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1372:6: ( ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1373:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1373:1: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1373:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )* ( (lv_type_1_0= ruleTransitionType ) ) ( (lv_priority_2_0= RULE_INT ) )? ( ( RULE_ID ) ) ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )? ( (lv_isHistory_13_0= 'history' ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1373:2: ( (lv_annotations_0_0= ruleStringAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_COMMENT_ANNOTATION||LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1374:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1374:1: (lv_annotations_0_0= ruleStringAnnotation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1375:3: lv_annotations_0_0= ruleStringAnnotation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_ruleTransition1846);
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
            	    break loop37;
                }
            } while (true);

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1397:3: ( (lv_type_1_0= ruleTransitionType ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1398:1: (lv_type_1_0= ruleTransitionType )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1398:1: (lv_type_1_0= ruleTransitionType )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1399:3: lv_type_1_0= ruleTransitionType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTypeTransitionTypeEnumRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionType_in_ruleTransition1868);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1421:2: ( (lv_priority_2_0= RULE_INT ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1422:1: (lv_priority_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1422:1: (lv_priority_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1423:3: lv_priority_2_0= RULE_INT
                    {
                    lv_priority_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition1885); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1445:3: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1446:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1446:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1447:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTransition1913); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_3_0(), "targetState"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1462:2: ( 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1462:4: 'with' ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) )
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_ruleTransition1924); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTransitionAccess().getWithKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1466:1: ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==EOF||LA44_0==RULE_ID||(LA44_0>=RULE_INT && LA44_0<=RULE_COMMENT_ANNOTATION)||LA44_0==15||LA44_0==17||LA44_0==19||(LA44_0>=21 && LA44_0<=24)||LA44_0==33||(LA44_0>=35 && LA44_0<=37)||(LA44_0>=48 && LA44_0<=53)||LA44_0==60||LA44_0==63||LA44_0==65||LA44_0==68) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_STRING) ) {
                        alt44=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1466:1: ( ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? ) | ( (lv_label_12_0= RULE_STRING ) ) )", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1466:2: ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1466:2: ( ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )? )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1466:3: ( (lv_isImmediate_5_0= '#' ) )? ( (lv_delay_6_0= RULE_INT ) )? ( (lv_trigger_7_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )?
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1466:3: ( (lv_isImmediate_5_0= '#' ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==35) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1467:1: (lv_isImmediate_5_0= '#' )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1467:1: (lv_isImmediate_5_0= '#' )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1468:3: lv_isImmediate_5_0= '#'
                                    {
                                    lv_isImmediate_5_0=(Token)input.LT(1);
                                    match(input,35,FollowSets000.FOLLOW_35_in_ruleTransition1944); if (failed) return current;
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

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1487:3: ( (lv_delay_6_0= RULE_INT ) )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==RULE_INT) ) {
                                int LA40_1 = input.LA(2);

                                if ( (LA40_1==65) ) {
                                    switch ( input.LA(3) ) {
                                        case 65:
                                            {
                                            switch ( input.LA(4) ) {
                                                case 65:
                                                    {
                                                    int LA40_14 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                                case RULE_INT:
                                                    {
                                                    int LA40_15 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                                case RULE_FLOAT:
                                                    {
                                                    int LA40_16 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                                case 19:
                                                    {
                                                    int LA40_17 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                                case RULE_BOOLEAN:
                                                    {
                                                    int LA40_18 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                                case 60:
                                                    {
                                                    int LA40_19 = input.LA(5);

                                                    if ( (LA40_19==19) ) {
                                                        switch ( input.LA(6) ) {
                                                            case 60:
                                                                {
                                                                int LA40_30 = input.LA(7);

                                                                if ( (LA40_30==19) ) {
                                                                    int LA40_36 = input.LA(8);

                                                                    if ( (synpred50()) ) {
                                                                        alt40=1;
                                                                    }
                                                                }
                                                                }
                                                                break;
                                                            case 68:
                                                                {
                                                                int LA40_31 = input.LA(7);

                                                                if ( (LA40_31==RULE_ID) ) {
                                                                    int LA40_37 = input.LA(8);

                                                                    if ( (LA40_37==20) ) {
                                                                        int LA40_38 = input.LA(9);

                                                                        if ( (synpred50()) ) {
                                                                            alt40=1;
                                                                        }
                                                                    }
                                                                }
                                                                }
                                                                break;
                                                            case RULE_ID:
                                                                {
                                                                int LA40_32 = input.LA(7);

                                                                if ( (LA40_32==20) ) {
                                                                    int LA40_38 = input.LA(8);

                                                                    if ( (synpred50()) ) {
                                                                        alt40=1;
                                                                    }
                                                                }
                                                                }
                                                                break;
                                                        }

                                                    }
                                                    }
                                                    break;
                                                case 68:
                                                    {
                                                    int LA40_20 = input.LA(5);

                                                    if ( (LA40_20==RULE_ID) ) {
                                                        int LA40_26 = input.LA(6);

                                                        if ( (synpred50()) ) {
                                                            alt40=1;
                                                        }
                                                    }
                                                    }
                                                    break;
                                                case RULE_ID:
                                                    {
                                                    int LA40_21 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                                case RULE_HOSTCODE:
                                                    {
                                                    int LA40_22 = input.LA(5);

                                                    if ( (synpred50()) ) {
                                                        alt40=1;
                                                    }
                                                    }
                                                    break;
                                            }

                                            }
                                            break;
                                        case RULE_INT:
                                            {
                                            int LA40_6 = input.LA(4);

                                            if ( (synpred50()) ) {
                                                alt40=1;
                                            }
                                            }
                                            break;
                                        case RULE_FLOAT:
                                            {
                                            int LA40_7 = input.LA(4);

                                            if ( (synpred50()) ) {
                                                alt40=1;
                                            }
                                            }
                                            break;
                                        case 19:
                                            {
                                            int LA40_8 = input.LA(4);

                                            if ( (synpred50()) ) {
                                                alt40=1;
                                            }
                                            }
                                            break;
                                        case RULE_BOOLEAN:
                                            {
                                            int LA40_9 = input.LA(4);

                                            if ( (synpred50()) ) {
                                                alt40=1;
                                            }
                                            }
                                            break;
                                        case 60:
                                            {
                                            int LA40_10 = input.LA(4);

                                            if ( (LA40_10==19) ) {
                                                switch ( input.LA(5) ) {
                                                    case 60:
                                                        {
                                                        int LA40_27 = input.LA(6);

                                                        if ( (LA40_27==19) ) {
                                                            int LA40_33 = input.LA(7);

                                                            if ( (synpred50()) ) {
                                                                alt40=1;
                                                            }
                                                        }
                                                        }
                                                        break;
                                                    case 68:
                                                        {
                                                        int LA40_28 = input.LA(6);

                                                        if ( (LA40_28==RULE_ID) ) {
                                                            int LA40_34 = input.LA(7);

                                                            if ( (LA40_34==20) ) {
                                                                int LA40_35 = input.LA(8);

                                                                if ( (synpred50()) ) {
                                                                    alt40=1;
                                                                }
                                                            }
                                                        }
                                                        }
                                                        break;
                                                    case RULE_ID:
                                                        {
                                                        int LA40_29 = input.LA(6);

                                                        if ( (LA40_29==20) ) {
                                                            int LA40_35 = input.LA(7);

                                                            if ( (synpred50()) ) {
                                                                alt40=1;
                                                            }
                                                        }
                                                        }
                                                        break;
                                                }

                                            }
                                            }
                                            break;
                                        case 68:
                                            {
                                            int LA40_11 = input.LA(4);

                                            if ( (LA40_11==RULE_ID) ) {
                                                int LA40_24 = input.LA(5);

                                                if ( (synpred50()) ) {
                                                    alt40=1;
                                                }
                                            }
                                            }
                                            break;
                                        case RULE_ID:
                                            {
                                            int LA40_12 = input.LA(4);

                                            if ( (synpred50()) ) {
                                                alt40=1;
                                            }
                                            }
                                            break;
                                        case RULE_HOSTCODE:
                                            {
                                            int LA40_13 = input.LA(4);

                                            if ( (synpred50()) ) {
                                                alt40=1;
                                            }
                                            }
                                            break;
                                    }

                                }
                                else if ( (LA40_1==EOF||LA40_1==RULE_ID||(LA40_1>=RULE_INT && LA40_1<=RULE_COMMENT_ANNOTATION)||LA40_1==15||LA40_1==17||LA40_1==19||(LA40_1>=21 && LA40_1<=24)||LA40_1==33||(LA40_1>=36 && LA40_1<=37)||(LA40_1>=48 && LA40_1<=53)||LA40_1==60||LA40_1==63||LA40_1==68) ) {
                                    alt40=1;
                                }
                            }
                            switch (alt40) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1488:1: (lv_delay_6_0= RULE_INT )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1488:1: (lv_delay_6_0= RULE_INT )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1489:3: lv_delay_6_0= RULE_INT
                                    {
                                    lv_delay_6_0=(Token)input.LT(1);
                                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleTransition1975); if (failed) return current;
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

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1511:3: ( (lv_trigger_7_0= ruleBooleanExpression ) )?
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==RULE_ID||(LA41_0>=RULE_INT && LA41_0<=RULE_BOOLEAN)||LA41_0==19||LA41_0==60||LA41_0==63||LA41_0==65||LA41_0==68) ) {
                                alt41=1;
                            }
                            switch (alt41) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1512:1: (lv_trigger_7_0= ruleBooleanExpression )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1512:1: (lv_trigger_7_0= ruleBooleanExpression )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1513:3: lv_trigger_7_0= ruleBooleanExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getTriggerBooleanExpressionParserRuleCall_4_1_0_2_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleTransition2002);
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

                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1535:3: ( '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )* )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==36) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1535:5: '/' ( (lv_effects_9_0= ruleEffect ) ) ( ',' ( (lv_effects_11_0= ruleEffect ) ) )*
                                    {
                                    match(input,36,FollowSets000.FOLLOW_36_in_ruleTransition2014); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getTransitionAccess().getSolidusKeyword_4_1_0_3_0(), null); 
                                          
                                    }
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1539:1: ( (lv_effects_9_0= ruleEffect ) )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1540:1: (lv_effects_9_0= ruleEffect )
                                    {
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1540:1: (lv_effects_9_0= ruleEffect )
                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1541:3: lv_effects_9_0= ruleEffect
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0_3_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2035);
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

                                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1563:2: ( ',' ( (lv_effects_11_0= ruleEffect ) ) )*
                                    loop42:
                                    do {
                                        int alt42=2;
                                        int LA42_0 = input.LA(1);

                                        if ( (LA42_0==26) ) {
                                            alt42=1;
                                        }


                                        switch (alt42) {
                                    	case 1 :
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1563:4: ',' ( (lv_effects_11_0= ruleEffect ) )
                                    	    {
                                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleTransition2046); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getTransitionAccess().getCommaKeyword_4_1_0_3_2_0(), null); 
                                    	          
                                    	    }
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1567:1: ( (lv_effects_11_0= ruleEffect ) )
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1568:1: (lv_effects_11_0= ruleEffect )
                                    	    {
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1568:1: (lv_effects_11_0= ruleEffect )
                                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1569:3: lv_effects_11_0= ruleEffect
                                    	    {
                                    	    if ( backtracking==0 ) {
                                    	       
                                    	      	        currentNode=createCompositeNode(grammarAccess.getTransitionAccess().getEffectsEffectParserRuleCall_4_1_0_3_2_1_0(), currentNode); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleTransition2067);
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
                                    	    break loop42;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1592:6: ( (lv_label_12_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1592:6: ( (lv_label_12_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1593:1: (lv_label_12_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1593:1: (lv_label_12_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1594:3: lv_label_12_0= RULE_STRING
                            {
                            lv_label_12_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTransition2095); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1616:5: ( (lv_isHistory_13_0= 'history' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==37) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1617:1: (lv_isHistory_13_0= 'history' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1617:1: (lv_isHistory_13_0= 'history' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1618:3: lv_isHistory_13_0= 'history'
                    {
                    lv_isHistory_13_0=(Token)input.LT(1);
                    match(input,37,FollowSets000.FOLLOW_37_in_ruleTransition2121); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1645:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1646:2: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1647:2: iv_ruleSignal= ruleSignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignal_in_entryRuleSignal2171);
            iv_ruleSignal=ruleSignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSignal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignal2181); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1654:1: ruleSignal returns [EObject current=null] : ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_5_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) ) )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_isInput_0_0=null;
        Token lv_isOutput_1_0=null;
        Token lv_name_3_0=null;
        Token lv_hostType_8_0=null;
        Token lv_hostType_12_0=null;
        Token lv_hostCombineOperator_15_0=null;
        AntlrDatatypeRuleToken lv_initialValue_5_0 = null;

        Enumerator lv_type_7_0 = null;

        Enumerator lv_type_11_0 = null;

        Enumerator lv_combineOperator_14_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1659:6: ( ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_5_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1660:1: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_5_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1660:1: ( ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_5_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1660:2: ( (lv_isInput_0_0= 'input' ) )? ( (lv_isOutput_1_0= 'output' ) )? 'signal' ( (lv_name_3_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_5_0= ruleAnyType ) ) )? ( ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1660:2: ( (lv_isInput_0_0= 'input' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1661:1: (lv_isInput_0_0= 'input' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1661:1: (lv_isInput_0_0= 'input' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1662:3: lv_isInput_0_0= 'input'
                    {
                    lv_isInput_0_0=(Token)input.LT(1);
                    match(input,38,FollowSets000.FOLLOW_38_in_ruleSignal2224); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsInputInputKeyword_0_0(), "isInput"); 
                          
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1681:3: ( (lv_isOutput_1_0= 'output' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1682:1: (lv_isOutput_1_0= 'output' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1682:1: (lv_isOutput_1_0= 'output' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1683:3: lv_isOutput_1_0= 'output'
                    {
                    lv_isOutput_1_0=(Token)input.LT(1);
                    match(input,39,FollowSets000.FOLLOW_39_in_ruleSignal2256); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getIsOutputOutputKeyword_1_0(), "isOutput"); 
                          
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

            match(input,40,FollowSets000.FOLLOW_40_in_ruleSignal2280); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSignalAccess().getSignalKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1706:1: ( (lv_name_3_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1707:1: (lv_name_3_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1707:1: (lv_name_3_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1708:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSignal2297); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
              		
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
              	        		lv_name_3_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1730:2: ( ':=' ( (lv_initialValue_5_0= ruleAnyType ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==41) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1730:4: ':=' ( (lv_initialValue_5_0= ruleAnyType ) )
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleSignal2313); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonEqualsSignKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1734:1: ( (lv_initialValue_5_0= ruleAnyType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1735:1: (lv_initialValue_5_0= ruleAnyType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1735:1: (lv_initialValue_5_0= ruleAnyType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1736:3: lv_initialValue_5_0= ruleAnyType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getInitialValueAnyTypeParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnyType_in_ruleSignal2334);
                    lv_initialValue_5_0=ruleAnyType();
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
                      	        		lv_initialValue_5_0, 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1758:4: ( ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) ) | ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==16) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==42) ) {
                    alt53=2;
                }
                else if ( (LA53_1==RULE_STRING||(LA53_1>=69 && LA53_1<=74)) ) {
                    alt53=1;
                }
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1758:5: ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1758:5: ( ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1758:7: ':' ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSignal2348); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1762:1: ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=69 && LA50_0<=74)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_STRING) ) {
                        alt50=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1762:1: ( ( (lv_type_7_0= ruleValueType ) ) | ( (lv_hostType_8_0= RULE_STRING ) ) )", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1762:2: ( (lv_type_7_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1762:2: ( (lv_type_7_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1763:1: (lv_type_7_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1763:1: (lv_type_7_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1764:3: lv_type_7_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_0_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleSignal2370);
                            lv_type_7_0=ruleValueType();
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
                              	        		lv_type_7_0, 
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1787:6: ( (lv_hostType_8_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1787:6: ( (lv_hostType_8_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1788:1: (lv_hostType_8_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1788:1: (lv_hostType_8_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1789:3: lv_hostType_8_0= RULE_STRING
                            {
                            lv_hostType_8_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSignal2393); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_0_1_1_0(), "hostType"); 
                              		
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
                              	        		lv_hostType_8_0, 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1812:6: ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1812:6: ( ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1812:8: ':' 'combine' ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) ) 'with' ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleSignal2417); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getColonKeyword_5_1_0(), null); 
                          
                    }
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleSignal2427); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getCombineKeyword_5_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1820:1: ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( ((LA51_0>=69 && LA51_0<=74)) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==RULE_STRING) ) {
                        alt51=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1820:1: ( ( (lv_type_11_0= ruleValueType ) ) | ( (lv_hostType_12_0= RULE_STRING ) ) )", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1820:2: ( (lv_type_11_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1820:2: ( (lv_type_11_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1821:1: (lv_type_11_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1821:1: (lv_type_11_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1822:3: lv_type_11_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getTypeValueTypeEnumRuleCall_5_1_2_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleSignal2449);
                            lv_type_11_0=ruleValueType();
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
                              	        		lv_type_11_0, 
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1845:6: ( (lv_hostType_12_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1845:6: ( (lv_hostType_12_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1846:1: (lv_hostType_12_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1846:1: (lv_hostType_12_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1847:3: lv_hostType_12_0= RULE_STRING
                            {
                            lv_hostType_12_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSignal2472); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSignalAccess().getHostTypeSTRINGTerminalRuleCall_5_1_2_1_0(), "hostType"); 
                              		
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
                              	        		lv_hostType_12_0, 
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

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleSignal2488); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getSignalAccess().getWithKeyword_5_1_3(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1873:1: ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=61 && LA52_0<=62)||LA52_0==64||LA52_0==66||(LA52_0>=74 && LA52_0<=77)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_STRING) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1873:1: ( ( (lv_combineOperator_14_0= ruleCombineOperator ) ) | ( (lv_hostCombineOperator_15_0= RULE_STRING ) ) )", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1873:2: ( (lv_combineOperator_14_0= ruleCombineOperator ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1873:2: ( (lv_combineOperator_14_0= ruleCombineOperator ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1874:1: (lv_combineOperator_14_0= ruleCombineOperator )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1874:1: (lv_combineOperator_14_0= ruleCombineOperator )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1875:3: lv_combineOperator_14_0= ruleCombineOperator
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getCombineOperatorCombineOperatorEnumRuleCall_5_1_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleSignal2510);
                            lv_combineOperator_14_0=ruleCombineOperator();
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
                              	        		lv_combineOperator_14_0, 
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1898:6: ( (lv_hostCombineOperator_15_0= RULE_STRING ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1898:6: ( (lv_hostCombineOperator_15_0= RULE_STRING ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1899:1: (lv_hostCombineOperator_15_0= RULE_STRING )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1899:1: (lv_hostCombineOperator_15_0= RULE_STRING )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1900:3: lv_hostCombineOperator_15_0= RULE_STRING
                            {
                            lv_hostCombineOperator_15_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSignal2533); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getSignalAccess().getHostCombineOperatorSTRINGTerminalRuleCall_5_1_4_1_0(), "hostCombineOperator"); 
                              		
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
                              	        		lv_hostCombineOperator_15_0, 
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1930:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1931:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1932:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariable_in_entryRuleVariable2578);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariable2588); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1939:1: ruleVariable returns [EObject current=null] : ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= ruleAnyType ) ) )? ':' ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_hostType_6_0=null;
        AntlrDatatypeRuleToken lv_initialValue_3_0 = null;

        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1944:6: ( ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= ruleAnyType ) ) )? ':' ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1945:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= ruleAnyType ) ) )? ':' ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1945:1: ( 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= ruleAnyType ) ) )? ':' ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1945:3: 'var' ( (lv_name_1_0= RULE_ID ) ) ( ':=' ( (lv_initialValue_3_0= ruleAnyType ) ) )? ':' ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) )
            {
            match(input,43,FollowSets000.FOLLOW_43_in_ruleVariable2623); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1949:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1950:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1950:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1951:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleVariable2640); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
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
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1973:2: ( ':=' ( (lv_initialValue_3_0= ruleAnyType ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1973:4: ':=' ( (lv_initialValue_3_0= ruleAnyType ) )
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleVariable2656); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getVariableAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1977:1: ( (lv_initialValue_3_0= ruleAnyType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1978:1: (lv_initialValue_3_0= ruleAnyType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1978:1: (lv_initialValue_3_0= ruleAnyType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1979:3: lv_initialValue_3_0= ruleAnyType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getInitialValueAnyTypeParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnyType_in_ruleVariable2677);
                    lv_initialValue_3_0=ruleAnyType();
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
                      	        		lv_initialValue_3_0, 
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

            match(input,16,FollowSets000.FOLLOW_16_in_ruleVariable2689); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableAccess().getColonKeyword_3(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2005:1: ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=69 && LA55_0<=74)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_STRING) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2005:1: ( ( (lv_type_5_0= ruleValueType ) ) | ( (lv_hostType_6_0= RULE_STRING ) ) )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2005:2: ( (lv_type_5_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2005:2: ( (lv_type_5_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2006:1: (lv_type_5_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2006:1: (lv_type_5_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2007:3: lv_type_5_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getTypeValueTypeEnumRuleCall_4_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleVariable2711);
                    lv_type_5_0=ruleValueType();
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
                      	        		lv_type_5_0, 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2030:6: ( (lv_hostType_6_0= RULE_STRING ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2030:6: ( (lv_hostType_6_0= RULE_STRING ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2031:1: (lv_hostType_6_0= RULE_STRING )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2031:1: (lv_hostType_6_0= RULE_STRING )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2032:3: lv_hostType_6_0= RULE_STRING
                    {
                    lv_hostType_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleVariable2734); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getVariableAccess().getHostTypeSTRINGTerminalRuleCall_4_1_0(), "hostType"); 
                      		
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
                      	        		lv_hostType_6_0, 
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2062:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2063:2: (iv_ruleSubstitution= ruleSubstitution EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2064:2: iv_ruleSubstitution= ruleSubstitution EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubstitutionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_entryRuleSubstitution2776);
            iv_ruleSubstitution=ruleSubstitution();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubstitution; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstitution2786); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2071:1: ruleSubstitution returns [EObject current=null] : ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token lv_actual_0_0=null;
        Token lv_formal_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2076:6: ( ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2077:1: ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2077:1: ( ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2077:2: ( (lv_actual_0_0= RULE_ID ) ) '/' ( (lv_formal_2_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2077:2: ( (lv_actual_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2078:1: (lv_actual_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2078:1: (lv_actual_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2079:3: lv_actual_0_0= RULE_ID
            {
            lv_actual_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubstitution2828); if (failed) return current;
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

            match(input,36,FollowSets000.FOLLOW_36_in_ruleSubstitution2843); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getSubstitutionAccess().getSolidusKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2105:1: ( (lv_formal_2_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2106:1: (lv_formal_2_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2106:1: (lv_formal_2_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2107:3: lv_formal_2_0= RULE_ID
            {
            lv_formal_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSubstitution2860); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2137:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2138:2: (iv_ruleAction= ruleAction EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2139:2: iv_ruleAction= ruleAction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getActionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAction_in_entryRuleAction2901);
            iv_ruleAction=ruleAction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAction2911); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2146:1: ruleAction returns [EObject current=null] : ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token lv_isImmediate_1_0=null;
        Token lv_delay_2_0=null;
        EObject lv_trigger_3_0 = null;

        EObject lv_effects_5_0 = null;

        EObject lv_effects_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2151:6: ( ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2152:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2152:1: ( () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2152:2: () ( (lv_isImmediate_1_0= '#' ) )? ( (lv_delay_2_0= RULE_INT ) )? ( (lv_trigger_3_0= ruleBooleanExpression ) )? ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2152:2: ()
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2153:2: 
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2166:2: ( (lv_isImmediate_1_0= '#' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==35) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2167:1: (lv_isImmediate_1_0= '#' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2167:1: (lv_isImmediate_1_0= '#' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2168:3: lv_isImmediate_1_0= '#'
                    {
                    lv_isImmediate_1_0=(Token)input.LT(1);
                    match(input,35,FollowSets000.FOLLOW_35_in_ruleAction2966); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2187:3: ( (lv_delay_2_0= RULE_INT ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_INT) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==65) ) {
                    switch ( input.LA(3) ) {
                        case 65:
                            {
                            switch ( input.LA(4) ) {
                                case 65:
                                    {
                                    int LA57_14 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                                case RULE_INT:
                                    {
                                    int LA57_15 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                                case RULE_FLOAT:
                                    {
                                    int LA57_16 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                                case 19:
                                    {
                                    int LA57_17 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                                case RULE_BOOLEAN:
                                    {
                                    int LA57_18 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                                case 60:
                                    {
                                    int LA57_19 = input.LA(5);

                                    if ( (LA57_19==19) ) {
                                        switch ( input.LA(6) ) {
                                            case 60:
                                                {
                                                int LA57_30 = input.LA(7);

                                                if ( (LA57_30==19) ) {
                                                    int LA57_36 = input.LA(8);

                                                    if ( (synpred68()) ) {
                                                        alt57=1;
                                                    }
                                                }
                                                }
                                                break;
                                            case 68:
                                                {
                                                int LA57_31 = input.LA(7);

                                                if ( (LA57_31==RULE_ID) ) {
                                                    int LA57_37 = input.LA(8);

                                                    if ( (LA57_37==20) ) {
                                                        int LA57_38 = input.LA(9);

                                                        if ( (synpred68()) ) {
                                                            alt57=1;
                                                        }
                                                    }
                                                }
                                                }
                                                break;
                                            case RULE_ID:
                                                {
                                                int LA57_32 = input.LA(7);

                                                if ( (LA57_32==20) ) {
                                                    int LA57_38 = input.LA(8);

                                                    if ( (synpred68()) ) {
                                                        alt57=1;
                                                    }
                                                }
                                                }
                                                break;
                                        }

                                    }
                                    }
                                    break;
                                case 68:
                                    {
                                    int LA57_20 = input.LA(5);

                                    if ( (LA57_20==RULE_ID) ) {
                                        int LA57_26 = input.LA(6);

                                        if ( (synpred68()) ) {
                                            alt57=1;
                                        }
                                    }
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA57_21 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                                case RULE_HOSTCODE:
                                    {
                                    int LA57_22 = input.LA(5);

                                    if ( (synpred68()) ) {
                                        alt57=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case RULE_INT:
                            {
                            int LA57_6 = input.LA(4);

                            if ( (synpred68()) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case RULE_FLOAT:
                            {
                            int LA57_7 = input.LA(4);

                            if ( (synpred68()) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case 19:
                            {
                            int LA57_8 = input.LA(4);

                            if ( (synpred68()) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case RULE_BOOLEAN:
                            {
                            int LA57_9 = input.LA(4);

                            if ( (synpred68()) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case 60:
                            {
                            int LA57_10 = input.LA(4);

                            if ( (LA57_10==19) ) {
                                switch ( input.LA(5) ) {
                                    case 60:
                                        {
                                        int LA57_27 = input.LA(6);

                                        if ( (LA57_27==19) ) {
                                            int LA57_33 = input.LA(7);

                                            if ( (synpred68()) ) {
                                                alt57=1;
                                            }
                                        }
                                        }
                                        break;
                                    case 68:
                                        {
                                        int LA57_28 = input.LA(6);

                                        if ( (LA57_28==RULE_ID) ) {
                                            int LA57_34 = input.LA(7);

                                            if ( (LA57_34==20) ) {
                                                int LA57_35 = input.LA(8);

                                                if ( (synpred68()) ) {
                                                    alt57=1;
                                                }
                                            }
                                        }
                                        }
                                        break;
                                    case RULE_ID:
                                        {
                                        int LA57_29 = input.LA(6);

                                        if ( (LA57_29==20) ) {
                                            int LA57_35 = input.LA(7);

                                            if ( (synpred68()) ) {
                                                alt57=1;
                                            }
                                        }
                                        }
                                        break;
                                }

                            }
                            }
                            break;
                        case 68:
                            {
                            int LA57_11 = input.LA(4);

                            if ( (LA57_11==RULE_ID) ) {
                                int LA57_24 = input.LA(5);

                                if ( (synpred68()) ) {
                                    alt57=1;
                                }
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA57_12 = input.LA(4);

                            if ( (synpred68()) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case RULE_HOSTCODE:
                            {
                            int LA57_13 = input.LA(4);

                            if ( (synpred68()) ) {
                                alt57=1;
                            }
                            }
                            break;
                    }

                }
                else if ( (LA57_1==EOF||LA57_1==RULE_ID||(LA57_1>=RULE_INT && LA57_1<=RULE_COMMENT_ANNOTATION)||LA57_1==15||LA57_1==17||LA57_1==19||(LA57_1>=21 && LA57_1<=24)||(LA57_1>=29 && LA57_1<=33)||LA57_1==36||(LA57_1>=38 && LA57_1<=40)||LA57_1==43||(LA57_1>=48 && LA57_1<=50)||LA57_1==60||LA57_1==63||LA57_1==68) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2188:1: (lv_delay_2_0= RULE_INT )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2188:1: (lv_delay_2_0= RULE_INT )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2189:3: lv_delay_2_0= RULE_INT
                    {
                    lv_delay_2_0=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAction2997); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2211:3: ( (lv_trigger_3_0= ruleBooleanExpression ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ID||(LA58_0>=RULE_INT && LA58_0<=RULE_BOOLEAN)||LA58_0==19||LA58_0==60||LA58_0==63||LA58_0==65||LA58_0==68) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2212:1: (lv_trigger_3_0= ruleBooleanExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2212:1: (lv_trigger_3_0= ruleBooleanExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2213:3: lv_trigger_3_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getTriggerBooleanExpressionParserRuleCall_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAction3024);
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2235:3: ( '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==36) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2235:5: '/' ( (lv_effects_5_0= ruleEffect ) ) ( ',' ( (lv_effects_7_0= ruleEffect ) ) )*
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_ruleAction3036); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getActionAccess().getSolidusKeyword_4_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2239:1: ( (lv_effects_5_0= ruleEffect ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2240:1: (lv_effects_5_0= ruleEffect )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2240:1: (lv_effects_5_0= ruleEffect )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2241:3: lv_effects_5_0= ruleEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleAction3057);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2263:2: ( ',' ( (lv_effects_7_0= ruleEffect ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==26) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2263:4: ',' ( (lv_effects_7_0= ruleEffect ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleAction3068); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getActionAccess().getCommaKeyword_4_2_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2267:1: ( (lv_effects_7_0= ruleEffect ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2268:1: (lv_effects_7_0= ruleEffect )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2268:1: (lv_effects_7_0= ruleEffect )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2269:3: lv_effects_7_0= ruleEffect
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getActionAccess().getEffectsEffectParserRuleCall_4_2_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleEffect_in_ruleAction3089);
                    	    lv_effects_7_0=ruleEffect();
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
                    	      	        		lv_effects_7_0, 
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
                    	    break loop59;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2299:1: entryRuleEffect returns [EObject current=null] : iv_ruleEffect= ruleEffect EOF ;
    public final EObject entryRuleEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2300:2: (iv_ruleEffect= ruleEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2301:2: iv_ruleEffect= ruleEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEffectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEffect_in_entryRuleEffect3129);
            iv_ruleEffect=ruleEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEffect3139); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2308:1: ruleEffect returns [EObject current=null] : (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) ;
    public final EObject ruleEffect() throws RecognitionException {
        EObject current = null;

        EObject this_Emission_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_TextEffect_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2313:6: ( (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2314:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2314:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==41) ) {
                    alt61=2;
                }
                else if ( (LA61_1==EOF||LA61_1==RULE_COMMENT_ANNOTATION||LA61_1==15||LA61_1==17||LA61_1==19||(LA61_1>=21 && LA61_1<=24)||LA61_1==26||(LA61_1>=29 && LA61_1<=33)||(LA61_1>=37 && LA61_1<=40)||LA61_1==43||(LA61_1>=48 && LA61_1<=53)) ) {
                    alt61=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2314:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 61, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA61_0==RULE_HOSTCODE) ) {
                alt61=3;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2314:1: (this_Emission_0= ruleEmission | this_Assignment_1= ruleAssignment | this_TextEffect_2= ruleTextEffect )", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2315:2: this_Emission_0= ruleEmission
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getEmissionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEmission_in_ruleEffect3189);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2328:2: this_Assignment_1= ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getAssignmentParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_ruleEffect3219);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2341:2: this_TextEffect_2= ruleTextEffect
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getEffectAccess().getTextEffectParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_ruleEffect3249);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2360:1: entryRuleEmission returns [EObject current=null] : iv_ruleEmission= ruleEmission EOF ;
    public final EObject entryRuleEmission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmission = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2361:2: (iv_ruleEmission= ruleEmission EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2362:2: iv_ruleEmission= ruleEmission EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEmissionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEmission_in_entryRuleEmission3284);
            iv_ruleEmission=ruleEmission();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEmission; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEmission3294); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2369:1: ruleEmission returns [EObject current=null] : ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) ;
    public final EObject ruleEmission() throws RecognitionException {
        EObject current = null;

        EObject lv_newValue_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2374:6: ( ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2375:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2375:1: ( ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2375:2: ( ( RULE_ID ) ) ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2375:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2376:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2376:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2377:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEmission3341); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getEmissionAccess().getSignalSignalCrossReference_0_0(), "signal"); 
              	
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2392:2: ( '(' ( (lv_newValue_2_0= ruleExpression ) ) ')' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==19) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2392:4: '(' ( (lv_newValue_2_0= ruleExpression ) ) ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleEmission3352); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEmissionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2396:1: ( (lv_newValue_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2397:1: (lv_newValue_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2397:1: (lv_newValue_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2398:3: lv_newValue_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEmissionAccess().getNewValueExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleEmission3373);
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

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleEmission3383); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2432:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2433:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2434:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAssignment_in_entryRuleAssignment3421);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssignment3431); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2441:1: ruleAssignment returns [EObject current=null] : ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2446:6: ( ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2447:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2447:1: ( ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2447:2: ( ( RULE_ID ) ) ':=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2447:2: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2448:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2448:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2449:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAssignment3478); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_0_0(), "variable"); 
              	
            }

            }


            }

            match(input,41,FollowSets000.FOLLOW_41_in_ruleAssignment3488); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2468:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2469:1: (lv_expression_2_0= ruleExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2469:1: (lv_expression_2_0= ruleExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2470:3: lv_expression_2_0= ruleExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAssignment3509);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2500:1: entryRuleTextEffect returns [EObject current=null] : iv_ruleTextEffect= ruleTextEffect EOF ;
    public final EObject entryRuleTextEffect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextEffect = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2501:2: (iv_ruleTextEffect= ruleTextEffect EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2502:2: iv_ruleTextEffect= ruleTextEffect EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextEffectRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextEffect_in_entryRuleTextEffect3545);
            iv_ruleTextEffect=ruleTextEffect();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextEffect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextEffect3555); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2509:1: ruleTextEffect returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextEffect() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2514:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2515:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2515:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2515:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2515:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2516:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2516:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2517:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3597); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2539:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==19) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2539:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleTextEffect3613); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextEffectAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2543:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2544:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2544:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2545:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextEffect3630); if (failed) return current;
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

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleTextEffect3645); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2581:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2582:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2583:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression3685);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression3695); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2590:1: ruleExpression returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpression_0 = null;

        EObject this_ValuedExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2595:6: ( (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )
            int alt64=2;
            switch ( input.LA(1) ) {
            case 65:
                {
                int LA64_1 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA64_2 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                int LA64_3 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA64_4 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA64_5 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 5, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA64_6 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 6, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA64_7 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 7, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA64_8 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 8, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                int LA64_9 = input.LA(2);

                if ( (synpred76()) ) {
                    alt64=1;
                }
                else if ( (true) ) {
                    alt64=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 9, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                alt64=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2596:1: (this_BooleanExpression_0= ruleBooleanExpression | this_ValuedExpression_1= ruleValuedExpression )", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2597:2: this_BooleanExpression_0= ruleBooleanExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getBooleanExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleExpression3745);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2610:2: this_ValuedExpression_1= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleExpression3775);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2629:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2630:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2631:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3810);
            iv_ruleBooleanExpression=ruleBooleanExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanExpression3820); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2638:1: ruleBooleanExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2643:6: (this_OrExpression_0= ruleOrExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2645:2: this_OrExpression_0= ruleOrExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBooleanExpressionAccess().getOrExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleBooleanExpression3869);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2664:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2665:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2666:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getOrExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression3903);
            iv_ruleOrExpression=ruleOrExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression3913); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2673:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2678:6: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2679:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2679:1: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2680:2: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression3963);
            this_AndExpression_0=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2691:1: ( () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==61) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2691:2: () ( (lv_operator_2_0= ruleOrOperator ) ) ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2691:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2692:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2710:2: ( (lv_operator_2_0= ruleOrOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2711:1: (lv_operator_2_0= ruleOrOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2711:1: (lv_operator_2_0= ruleOrOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2712:3: lv_operator_2_0= ruleOrOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleOrOperator_in_ruleOrExpression3996);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2734:2: ( (lv_subExpressions_3_0= ruleAndExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2735:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2735:1: (lv_subExpressions_3_0= ruleAndExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2736:3: lv_subExpressions_3_0= ruleAndExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getOrExpressionAccess().getSubExpressionsAndExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression4017);
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
            	    break loop65;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2766:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2767:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2768:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression4055);
            iv_ruleAndExpression=ruleAndExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression4065); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2775:1: ruleAndExpression returns [EObject current=null] : (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompareOperation_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2780:6: ( (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2781:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2781:1: (this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2782:2: this_CompareOperation_0= ruleCompareOperation ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getCompareOperationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression4115);
            this_CompareOperation_0=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_CompareOperation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2793:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==62) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2793:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2793:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2794:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2812:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2813:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2813:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2814:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAndOperator_in_ruleAndExpression4148);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2836:2: ( (lv_subExpressions_3_0= ruleCompareOperation ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2837:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2837:1: (lv_subExpressions_3_0= ruleCompareOperation )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2838:3: lv_subExpressions_3_0= ruleCompareOperation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExpressionAccess().getSubExpressionsCompareOperationParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_ruleAndExpression4169);
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
            	    break loop66;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2868:1: entryRuleCompareOperation returns [EObject current=null] : iv_ruleCompareOperation= ruleCompareOperation EOF ;
    public final EObject entryRuleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOperation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2869:2: (iv_ruleCompareOperation= ruleCompareOperation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2870:2: iv_ruleCompareOperation= ruleCompareOperation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareOperationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4207);
            iv_ruleCompareOperation=ruleCompareOperation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompareOperation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompareOperation4217); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2877:1: ruleCompareOperation returns [EObject current=null] : ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) ;
    public final EObject ruleCompareOperation() throws RecognitionException {
        EObject current = null;

        EObject this_NotOrValuedExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;

        EObject this_NotExpression_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2882:6: ( ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )
            int alt67=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 65:
                {
                alt67=1;
                }
                break;
            case 19:
                {
                int LA67_2 = input.LA(2);

                if ( (synpred79()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                switch ( input.LA(2) ) {
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 65:
                case 66:
                case 67:
                    {
                    alt67=1;
                    }
                    break;
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                    case RULE_HOSTCODE:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 19:
                    case 60:
                    case 65:
                    case 68:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA67_22 = input.LA(4);

                        if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                            alt67=1;
                        }
                        else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        {
                        alt67=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case RULE_COMMENT_ANNOTATION:
                case 15:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 43:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 61:
                case 62:
                    {
                    alt67=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 3, input);

                    throw nvae;
                }

                }
                break;
            case 60:
                {
                int LA67_4 = input.LA(2);

                if ( (LA67_4==19) ) {
                    switch ( input.LA(3) ) {
                    case 60:
                        {
                        int LA67_23 = input.LA(4);

                        if ( (LA67_23==19) ) {
                            int LA67_30 = input.LA(5);

                            if ( (synpred79()) ) {
                                alt67=1;
                            }
                            else if ( (true) ) {
                                alt67=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 30, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 68:
                        {
                        int LA67_24 = input.LA(4);

                        if ( (LA67_24==RULE_ID) ) {
                            int LA67_31 = input.LA(5);

                            if ( (LA67_31==20) ) {
                                switch ( input.LA(6) ) {
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                case 64:
                                case 65:
                                case 66:
                                case 67:
                                    {
                                    alt67=1;
                                    }
                                    break;
                                case EOF:
                                case RULE_COMMENT_ANNOTATION:
                                case 15:
                                case 17:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 26:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 43:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 61:
                                case 62:
                                    {
                                    alt67=2;
                                    }
                                    break;
                                case 16:
                                    {
                                    switch ( input.LA(7) ) {
                                    case RULE_INT:
                                    case RULE_HOSTCODE:
                                    case RULE_FLOAT:
                                    case RULE_BOOLEAN:
                                    case 19:
                                    case 60:
                                    case 65:
                                    case 68:
                                        {
                                        alt67=1;
                                        }
                                        break;
                                    case RULE_ID:
                                        {
                                        int LA67_22 = input.LA(8);

                                        if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                                            alt67=1;
                                        }
                                        else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                                            alt67=2;
                                        }
                                        else {
                                            if (backtracking>0) {failed=true; return current;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                                            throw nvae;
                                        }
                                        }
                                        break;
                                    case 42:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                        {
                                        alt67=2;
                                        }
                                        break;
                                    default:
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                                        throw nvae;
                                    }

                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 32, input);

                                    throw nvae;
                                }

                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 31, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA67_25 = input.LA(4);

                        if ( (LA67_25==20) ) {
                            switch ( input.LA(5) ) {
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                                {
                                alt67=1;
                                }
                                break;
                            case EOF:
                            case RULE_COMMENT_ANNOTATION:
                            case 15:
                            case 17:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 26:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 43:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 61:
                            case 62:
                                {
                                alt67=2;
                                }
                                break;
                            case 16:
                                {
                                switch ( input.LA(6) ) {
                                case RULE_INT:
                                case RULE_HOSTCODE:
                                case RULE_FLOAT:
                                case RULE_BOOLEAN:
                                case 19:
                                case 60:
                                case 65:
                                case 68:
                                    {
                                    alt67=1;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA67_22 = input.LA(7);

                                    if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                                        alt67=1;
                                    }
                                    else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                                        alt67=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 42:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                    {
                                    alt67=2;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                                    throw nvae;
                                }

                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 32, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 25, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 12, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 4, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA67_5 = input.LA(2);

                if ( (LA67_5==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case RULE_COMMENT_ANNOTATION:
                    case 15:
                    case 17:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 43:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 61:
                    case 62:
                        {
                        alt67=2;
                        }
                        break;
                    case 16:
                        {
                        switch ( input.LA(4) ) {
                        case RULE_INT:
                        case RULE_HOSTCODE:
                        case RULE_FLOAT:
                        case RULE_BOOLEAN:
                        case 19:
                        case 60:
                        case 65:
                        case 68:
                            {
                            alt67=1;
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA67_22 = input.LA(5);

                            if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                                alt67=1;
                            }
                            else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                                alt67=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 42:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                            {
                            alt67=2;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        {
                        alt67=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 13, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 65:
                case 66:
                case 67:
                    {
                    alt67=1;
                    }
                    break;
                case EOF:
                case RULE_COMMENT_ANNOTATION:
                case 15:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 43:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 61:
                case 62:
                    {
                    alt67=2;
                    }
                    break;
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                    case RULE_HOSTCODE:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 19:
                    case 60:
                    case 65:
                    case 68:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA67_22 = input.LA(4);

                        if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                            alt67=1;
                        }
                        else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        {
                        alt67=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 6, input);

                    throw nvae;
                }

                }
                break;
            case RULE_HOSTCODE:
                {
                switch ( input.LA(2) ) {
                case 19:
                    {
                    int LA67_14 = input.LA(3);

                    if ( (LA67_14==RULE_ID) ) {
                        int LA67_26 = input.LA(4);

                        if ( (LA67_26==20) ) {
                            switch ( input.LA(5) ) {
                            case EOF:
                            case RULE_COMMENT_ANNOTATION:
                            case 15:
                            case 17:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 26:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 43:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 61:
                            case 62:
                                {
                                alt67=2;
                                }
                                break;
                            case 16:
                                {
                                switch ( input.LA(6) ) {
                                case RULE_INT:
                                case RULE_HOSTCODE:
                                case RULE_FLOAT:
                                case RULE_BOOLEAN:
                                case 19:
                                case 60:
                                case 65:
                                case 68:
                                    {
                                    alt67=1;
                                    }
                                    break;
                                case RULE_ID:
                                    {
                                    int LA67_22 = input.LA(7);

                                    if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                                        alt67=1;
                                    }
                                    else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                                        alt67=2;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                                        throw nvae;
                                    }
                                    }
                                    break;
                                case 42:
                                case 69:
                                case 70:
                                case 71:
                                case 72:
                                case 73:
                                case 74:
                                    {
                                    alt67=2;
                                    }
                                    break;
                                default:
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                                    throw nvae;
                                }

                                }
                                break;
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                                {
                                alt67=1;
                                }
                                break;
                            default:
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 33, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 26, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 14, input);

                        throw nvae;
                    }
                    }
                    break;
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 64:
                case 65:
                case 66:
                case 67:
                    {
                    alt67=1;
                    }
                    break;
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_INT:
                    case RULE_HOSTCODE:
                    case RULE_FLOAT:
                    case RULE_BOOLEAN:
                    case 19:
                    case 60:
                    case 65:
                    case 68:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA67_22 = input.LA(4);

                        if ( ((LA67_22>=54 && LA67_22<=59)||(LA67_22>=64 && LA67_22<=67)) ) {
                            alt67=1;
                        }
                        else if ( (LA67_22==EOF||LA67_22==26||LA67_22==44) ) {
                            alt67=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                        {
                        alt67=2;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 10, input);

                        throw nvae;
                    }

                    }
                    break;
                case EOF:
                case RULE_COMMENT_ANNOTATION:
                case 15:
                case 17:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 26:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 43:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 61:
                case 62:
                    {
                    alt67=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 7, input);

                    throw nvae;
                }

                }
                break;
            case 63:
                {
                switch ( input.LA(2) ) {
                case 63:
                    {
                    int LA67_15 = input.LA(3);

                    if ( (synpred79()) ) {
                        alt67=1;
                    }
                    else if ( (true) ) {
                        alt67=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 15, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_BOOLEAN:
                    {
                    int LA67_16 = input.LA(3);

                    if ( ((LA67_16>=54 && LA67_16<=59)) ) {
                        alt67=1;
                    }
                    else if ( (LA67_16==EOF||LA67_16==RULE_COMMENT_ANNOTATION||(LA67_16>=15 && LA67_16<=17)||(LA67_16>=20 && LA67_16<=24)||LA67_16==26||(LA67_16>=29 && LA67_16<=33)||(LA67_16>=36 && LA67_16<=40)||LA67_16==43||(LA67_16>=48 && LA67_16<=53)||(LA67_16>=61 && LA67_16<=62)) ) {
                        alt67=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 16, input);

                        throw nvae;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA67_17 = input.LA(3);

                    if ( (LA67_17==19) ) {
                        switch ( input.LA(4) ) {
                        case 60:
                            {
                            int LA67_34 = input.LA(5);

                            if ( (LA67_34==19) ) {
                                int LA67_38 = input.LA(6);

                                if ( (synpred79()) ) {
                                    alt67=1;
                                }
                                else if ( (true) ) {
                                    alt67=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 38, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 68:
                            {
                            int LA67_35 = input.LA(5);

                            if ( (LA67_35==RULE_ID) ) {
                                int LA67_39 = input.LA(6);

                                if ( (LA67_39==20) ) {
                                    int LA67_40 = input.LA(7);

                                    if ( (LA67_40==EOF||LA67_40==RULE_COMMENT_ANNOTATION||(LA67_40>=15 && LA67_40<=17)||(LA67_40>=20 && LA67_40<=24)||LA67_40==26||(LA67_40>=29 && LA67_40<=33)||(LA67_40>=36 && LA67_40<=40)||LA67_40==43||(LA67_40>=48 && LA67_40<=53)||(LA67_40>=61 && LA67_40<=62)) ) {
                                        alt67=2;
                                    }
                                    else if ( ((LA67_40>=54 && LA67_40<=59)) ) {
                                        alt67=1;
                                    }
                                    else {
                                        if (backtracking>0) {failed=true; return current;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 40, input);

                                        throw nvae;
                                    }
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 39, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 35, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA67_36 = input.LA(5);

                            if ( (LA67_36==20) ) {
                                int LA67_40 = input.LA(6);

                                if ( (LA67_40==EOF||LA67_40==RULE_COMMENT_ANNOTATION||(LA67_40>=15 && LA67_40<=17)||(LA67_40>=20 && LA67_40<=24)||LA67_40==26||(LA67_40>=29 && LA67_40<=33)||(LA67_40>=36 && LA67_40<=40)||LA67_40==43||(LA67_40>=48 && LA67_40<=53)||(LA67_40>=61 && LA67_40<=62)) ) {
                                    alt67=2;
                                }
                                else if ( ((LA67_40>=54 && LA67_40<=59)) ) {
                                    alt67=1;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 40, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 36, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 27, input);

                            throw nvae;
                        }

                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 68:
                    {
                    int LA67_18 = input.LA(3);

                    if ( (LA67_18==RULE_ID) ) {
                        int LA67_28 = input.LA(4);

                        if ( (LA67_28==EOF||LA67_28==RULE_COMMENT_ANNOTATION||(LA67_28>=15 && LA67_28<=17)||(LA67_28>=20 && LA67_28<=24)||LA67_28==26||(LA67_28>=29 && LA67_28<=33)||(LA67_28>=36 && LA67_28<=40)||LA67_28==43||(LA67_28>=48 && LA67_28<=53)||(LA67_28>=61 && LA67_28<=62)) ) {
                            alt67=2;
                        }
                        else if ( ((LA67_28>=54 && LA67_28<=59)) ) {
                            alt67=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 28, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 18, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA67_19 = input.LA(3);

                    if ( (LA67_19==EOF||LA67_19==RULE_COMMENT_ANNOTATION||(LA67_19>=15 && LA67_19<=17)||(LA67_19>=20 && LA67_19<=24)||LA67_19==26||(LA67_19>=29 && LA67_19<=33)||(LA67_19>=36 && LA67_19<=40)||LA67_19==43||(LA67_19>=48 && LA67_19<=53)||(LA67_19>=61 && LA67_19<=62)) ) {
                        alt67=2;
                    }
                    else if ( ((LA67_19>=54 && LA67_19<=59)) ) {
                        alt67=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 19, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA67_20 = input.LA(3);

                    if ( (synpred79()) ) {
                        alt67=1;
                    }
                    else if ( (true) ) {
                        alt67=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 20, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HOSTCODE:
                    {
                    switch ( input.LA(3) ) {
                    case 19:
                        {
                        int LA67_29 = input.LA(4);

                        if ( (LA67_29==RULE_ID) ) {
                            int LA67_37 = input.LA(5);

                            if ( (LA67_37==20) ) {
                                int LA67_41 = input.LA(6);

                                if ( ((LA67_41>=54 && LA67_41<=59)) ) {
                                    alt67=1;
                                }
                                else if ( (LA67_41==EOF||LA67_41==RULE_COMMENT_ANNOTATION||(LA67_41>=15 && LA67_41<=17)||(LA67_41>=20 && LA67_41<=24)||LA67_41==26||(LA67_41>=29 && LA67_41<=33)||(LA67_41>=36 && LA67_41<=40)||LA67_41==43||(LA67_41>=48 && LA67_41<=53)||(LA67_41>=61 && LA67_41<=62)) ) {
                                    alt67=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 41, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 37, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 29, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_COMMENT_ANNOTATION:
                    case 15:
                    case 16:
                    case 17:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 43:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 61:
                    case 62:
                        {
                        alt67=2;
                        }
                        break;
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        {
                        alt67=1;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 21, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 8, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2883:1: ( (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) ) | this_NotExpression_4= ruleNotExpression )", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:2: (this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2884:2: this_NotOrValuedExpression_0= ruleNotOrValuedExpression ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotOrValuedExpressionParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4268);
                    this_NotOrValuedExpression_0=ruleNotOrValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NotOrValuedExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2895:1: ( () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2895:2: () ( (lv_operator_2_0= ruleCompareOperator ) ) ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2895:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2896:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2914:2: ( (lv_operator_2_0= ruleCompareOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2915:1: (lv_operator_2_0= ruleCompareOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2915:1: (lv_operator_2_0= ruleCompareOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2916:3: lv_operator_2_0= ruleCompareOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleCompareOperation4301);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2938:2: ( (lv_subExpressions_3_0= ruleNotOrValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2939:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2939:1: (lv_subExpressions_3_0= ruleNotOrValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2940:3: lv_subExpressions_3_0= ruleNotOrValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4322);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2964:2: this_NotExpression_4= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleCompareOperation4355);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2983:1: entryRuleNotOrValuedExpression returns [EObject current=null] : iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF ;
    public final EObject entryRuleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOrValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2984:2: (iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2985:2: iv_ruleNotOrValuedExpression= ruleNotOrValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotOrValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4390);
            iv_ruleNotOrValuedExpression=ruleNotOrValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotOrValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotOrValuedExpression4400); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2992:1: ruleNotOrValuedExpression returns [EObject current=null] : (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) ;
    public final EObject ruleNotOrValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ValuedExpression_0 = null;

        EObject this_NotExpression_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2997:6: ( (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )
            int alt68=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_FLOAT:
            case 65:
                {
                alt68=1;
                }
                break;
            case 19:
                {
                int LA68_2 = input.LA(2);

                if ( (synpred80()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA68_3 = input.LA(2);

                if ( (synpred80()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 3, input);

                    throw nvae;
                }
                }
                break;
            case 60:
                {
                int LA68_4 = input.LA(2);

                if ( (LA68_4==19) ) {
                    switch ( input.LA(3) ) {
                    case 60:
                        {
                        int LA68_11 = input.LA(4);

                        if ( (LA68_11==19) ) {
                            int LA68_14 = input.LA(5);

                            if ( (synpred80()) ) {
                                alt68=1;
                            }
                            else if ( (true) ) {
                                alt68=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 14, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 11, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 68:
                        {
                        int LA68_12 = input.LA(4);

                        if ( (LA68_12==RULE_ID) ) {
                            int LA68_15 = input.LA(5);

                            if ( (LA68_15==20) ) {
                                int LA68_16 = input.LA(6);

                                if ( (synpred80()) ) {
                                    alt68=1;
                                }
                                else if ( (true) ) {
                                    alt68=2;
                                }
                                else {
                                    if (backtracking>0) {failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 16, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 15, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 12, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA68_13 = input.LA(4);

                        if ( (LA68_13==20) ) {
                            int LA68_16 = input.LA(5);

                            if ( (synpred80()) ) {
                                alt68=1;
                            }
                            else if ( (true) ) {
                                alt68=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 16, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 13, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 9, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 4, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                int LA68_5 = input.LA(2);

                if ( (LA68_5==RULE_ID) ) {
                    int LA68_10 = input.LA(3);

                    if ( (synpred80()) ) {
                        alt68=1;
                    }
                    else if ( (true) ) {
                        alt68=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 10, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA68_6 = input.LA(2);

                if ( (synpred80()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 6, input);

                    throw nvae;
                }
                }
                break;
            case RULE_HOSTCODE:
                {
                int LA68_7 = input.LA(2);

                if ( (synpred80()) ) {
                    alt68=1;
                }
                else if ( (true) ) {
                    alt68=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 7, input);

                    throw nvae;
                }
                }
                break;
            case 63:
                {
                alt68=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2998:1: (this_ValuedExpression_0= ruleValuedExpression | this_NotExpression_1= ruleNotExpression )", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2999:2: this_ValuedExpression_0= ruleValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getValuedExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4450);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3012:2: this_NotExpression_1= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotOrValuedExpressionAccess().getNotExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4480);
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


    // $ANTLR start entryRuleNotExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3031:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3032:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3033:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNotExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression4515);
            iv_ruleNotExpression=ruleNotExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression4525); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3040:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3045:6: ( ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3046:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3046:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==63) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID||LA69_0==RULE_HOSTCODE||LA69_0==RULE_BOOLEAN||LA69_0==19||LA69_0==60||LA69_0==68) ) {
                alt69=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3046:1: ( ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) ) | this_AtomicExpression_3= ruleAtomicExpression )", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3046:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3046:2: ( () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3046:3: () ( (lv_operator_1_0= ruleNotOperator ) ) ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3046:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3047:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3060:2: ( (lv_operator_1_0= ruleNotOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3061:1: (lv_operator_1_0= ruleNotOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3061:1: (lv_operator_1_0= ruleNotOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3062:3: lv_operator_1_0= ruleNotOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotOperator_in_ruleNotExpression4584);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3084:2: ( (lv_subExpressions_2_0= ruleNotExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3085:1: (lv_subExpressions_2_0= ruleNotExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3085:1: (lv_subExpressions_2_0= ruleNotExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3086:3: lv_subExpressions_2_0= ruleNotExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getSubExpressionsNotExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleNotExpression4605);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3110:2: this_AtomicExpression_3= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNotExpressionAccess().getAtomicExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleNotExpression4637);
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


    // $ANTLR start entryRuleValuedExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3129:1: entryRuleValuedExpression returns [EObject current=null] : iv_ruleValuedExpression= ruleValuedExpression EOF ;
    public final EObject entryRuleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3130:2: (iv_ruleValuedExpression= ruleValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3131:2: iv_ruleValuedExpression= ruleValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4672);
            iv_ruleValuedExpression=ruleValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedExpression4682); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3138:1: ruleValuedExpression returns [EObject current=null] : this_AddExpression_0= ruleAddExpression ;
    public final EObject ruleValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3143:6: (this_AddExpression_0= ruleAddExpression )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3145:2: this_AddExpression_0= ruleAddExpression
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getValuedExpressionAccess().getAddExpressionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_ruleValuedExpression4731);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3164:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3165:2: (iv_ruleAddExpression= ruleAddExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3166:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAddExpression_in_entryRuleAddExpression4765);
            iv_ruleAddExpression=ruleAddExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddExpression4775); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3173:1: ruleAddExpression returns [EObject current=null] : (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3178:6: ( (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3179:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3179:1: (this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3180:2: this_SubExpression_0= ruleSubExpression ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression4825);
            this_SubExpression_0=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SubExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3191:1: ( () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==64) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3191:2: () ( (lv_operator_2_0= ruleAddOperator ) ) ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3191:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3192:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3210:2: ( (lv_operator_2_0= ruleAddOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3211:1: (lv_operator_2_0= ruleAddOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3211:1: (lv_operator_2_0= ruleAddOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3212:3: lv_operator_2_0= ruleAddOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getOperatorAddOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAddOperator_in_ruleAddExpression4858);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3234:2: ( (lv_subExpressions_3_0= ruleSubExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3235:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3235:1: (lv_subExpressions_3_0= ruleSubExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3236:3: lv_subExpressions_3_0= ruleSubExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExpressionAccess().getSubExpressionsSubExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_ruleAddExpression4879);
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
            	    break loop70;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3266:1: entryRuleSubExpression returns [EObject current=null] : iv_ruleSubExpression= ruleSubExpression EOF ;
    public final EObject entryRuleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3267:2: (iv_ruleSubExpression= ruleSubExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3268:2: iv_ruleSubExpression= ruleSubExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSubExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubExpression_in_entryRuleSubExpression4917);
            iv_ruleSubExpression=ruleSubExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSubExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubExpression4927); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3275:1: ruleSubExpression returns [EObject current=null] : (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) ;
    public final EObject ruleSubExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3280:6: ( (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3281:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3281:1: (this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3282:2: this_MultExpression_0= ruleMultExpression ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getMultExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression4977);
            this_MultExpression_0=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_MultExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3293:1: ( () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==65) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3293:2: () ( (lv_operator_2_0= ruleSubOperator ) ) ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3293:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3294:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3312:2: ( (lv_operator_2_0= ruleSubOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3313:1: (lv_operator_2_0= ruleSubOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3313:1: (lv_operator_2_0= ruleSubOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3314:3: lv_operator_2_0= ruleSubOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getOperatorSubOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleSubExpression5010);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3336:2: ( (lv_subExpressions_3_0= ruleMultExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3337:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3337:1: (lv_subExpressions_3_0= ruleMultExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3338:3: lv_subExpressions_3_0= ruleMultExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getSubExpressionAccess().getSubExpressionsMultExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_ruleSubExpression5031);
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
            	    break loop71;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3368:1: entryRuleMultExpression returns [EObject current=null] : iv_ruleMultExpression= ruleMultExpression EOF ;
    public final EObject entryRuleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3369:2: (iv_ruleMultExpression= ruleMultExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3370:2: iv_ruleMultExpression= ruleMultExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultExpression_in_entryRuleMultExpression5069);
            iv_ruleMultExpression=ruleMultExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultExpression5079); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3377:1: ruleMultExpression returns [EObject current=null] : (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) ;
    public final EObject ruleMultExpression() throws RecognitionException {
        EObject current = null;

        EObject this_DivExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3382:6: ( (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3383:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3383:1: (this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3384:2: this_DivExpression_0= ruleDivExpression ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getDivExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression5129);
            this_DivExpression_0=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_DivExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3395:1: ( () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==66) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3395:2: () ( (lv_operator_2_0= ruleMultOperator ) ) ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3395:2: ()
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3396:2: 
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3414:2: ( (lv_operator_2_0= ruleMultOperator ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3415:1: (lv_operator_2_0= ruleMultOperator )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3415:1: (lv_operator_2_0= ruleMultOperator )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3416:3: lv_operator_2_0= ruleMultOperator
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getOperatorMultOperatorEnumRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultOperator_in_ruleMultExpression5162);
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

            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3438:2: ( (lv_subExpressions_3_0= ruleDivExpression ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3439:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3439:1: (lv_subExpressions_3_0= ruleDivExpression )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3440:3: lv_subExpressions_3_0= ruleDivExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultExpressionAccess().getSubExpressionsDivExpressionParserRuleCall_1_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_ruleMultExpression5183);
            	    lv_subExpressions_3_0=ruleDivExpression();
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
            	      	        		"DivExpression", 
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
            	    break loop72;
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


    // $ANTLR start entryRuleDivExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3470:1: entryRuleDivExpression returns [EObject current=null] : iv_ruleDivExpression= ruleDivExpression EOF ;
    public final EObject entryRuleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3471:2: (iv_ruleDivExpression= ruleDivExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3472:2: iv_ruleDivExpression= ruleDivExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDivExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDivExpression_in_entryRuleDivExpression5221);
            iv_ruleDivExpression=ruleDivExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDivExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDivExpression5231); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3479:1: ruleDivExpression returns [EObject current=null] : (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) ;
    public final EObject ruleDivExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ModExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3484:6: ( (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3485:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3485:1: (this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3486:2: this_ModExpression_0= ruleModExpression ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getModExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression5281);
            this_ModExpression_0=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_ModExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3497:1: ( () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==16) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                        case RULE_COMMENT_ANNOTATION:
                        case 15:
                        case 16:
                        case 17:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 43:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 61:
                        case 62:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            {
                            alt73=1;
                            }
                            break;
                        case 26:
                            {
                            int LA73_5 = input.LA(4);

                            if ( (LA73_5==RULE_ID) ) {
                                int LA73_7 = input.LA(5);

                                if ( (synpred85()) ) {
                                    alt73=1;
                                }
                            }
                            else if ( (LA73_5==RULE_HOSTCODE) ) {
                                alt73=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA73_6 = input.LA(4);

                            if ( (LA73_6==EOF) ) {
                                int LA73_99 = input.LA(5);


                            }
                            }
                            break;
                    }

                }
                else if ( ((LA73_1>=RULE_INT && LA73_1<=RULE_BOOLEAN)||LA73_1==19||LA73_1==60||LA73_1==65||LA73_1==68) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3497:2: () ( (lv_operator_2_0= ruleDivOperator ) ) ( (lv_subExpressions_3_0= ruleModExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3497:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3498:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0().getType().getClassifier());
                              try {
                              	factory.add(temp, "subExpressions", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3516:2: ( (lv_operator_2_0= ruleDivOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3517:1: (lv_operator_2_0= ruleDivOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3517:1: (lv_operator_2_0= ruleDivOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3518:3: lv_operator_2_0= ruleDivOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_ruleDivExpression5314);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3540:2: ( (lv_subExpressions_3_0= ruleModExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3541:1: (lv_subExpressions_3_0= ruleModExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3541:1: (lv_subExpressions_3_0= ruleModExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3542:3: lv_subExpressions_3_0= ruleModExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_ruleDivExpression5335);
                    lv_subExpressions_3_0=ruleModExpression();
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


    // $ANTLR start entryRuleModExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3572:1: entryRuleModExpression returns [EObject current=null] : iv_ruleModExpression= ruleModExpression EOF ;
    public final EObject entryRuleModExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3573:2: (iv_ruleModExpression= ruleModExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3574:2: iv_ruleModExpression= ruleModExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_entryRuleModExpression5373);
            iv_ruleModExpression=ruleModExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModExpression5383); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3581:1: ruleModExpression returns [EObject current=null] : (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) ;
    public final EObject ruleModExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NegExpression_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_subExpressions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3586:6: ( (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3587:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3587:1: (this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3588:2: this_NegExpression_0= ruleNegExpression ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getNegExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleModExpression5433);
            this_NegExpression_0=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_NegExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3599:1: ( () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==67) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3599:2: () ( (lv_operator_2_0= ruleModOperator ) ) ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3599:2: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3600:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3618:2: ( (lv_operator_2_0= ruleModOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3619:1: (lv_operator_2_0= ruleModOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3619:1: (lv_operator_2_0= ruleModOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3620:3: lv_operator_2_0= ruleModOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getOperatorModOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleModOperator_in_ruleModExpression5466);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3642:2: ( (lv_subExpressions_3_0= ruleAtomicValuedExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3643:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3643:1: (lv_subExpressions_3_0= ruleAtomicValuedExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3644:3: lv_subExpressions_3_0= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getModExpressionAccess().getSubExpressionsAtomicValuedExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5487);
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


    // $ANTLR start entryRuleNegExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3674:1: entryRuleNegExpression returns [EObject current=null] : iv_ruleNegExpression= ruleNegExpression EOF ;
    public final EObject entryRuleNegExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3675:2: (iv_ruleNegExpression= ruleNegExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3676:2: iv_ruleNegExpression= ruleNegExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNegExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_entryRuleNegExpression5525);
            iv_ruleNegExpression=ruleNegExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNegExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNegExpression5535); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNegExpression


    // $ANTLR start ruleNegExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3683:1: ruleNegExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) ;
    public final EObject ruleNegExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_2_0 = null;

        EObject this_AtomicValuedExpression_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3688:6: ( ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3689:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3689:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==65) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_ID||(LA75_0>=RULE_INT && LA75_0<=RULE_BOOLEAN)||LA75_0==19||LA75_0==60||LA75_0==68) ) {
                alt75=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3689:1: ( ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) ) | this_AtomicValuedExpression_3= ruleAtomicValuedExpression )", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3689:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3689:2: ( () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3689:3: () ( (lv_operator_1_0= ruleSubOperator ) ) ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3689:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3690:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorExpressionAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3703:2: ( (lv_operator_1_0= ruleSubOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3704:1: (lv_operator_1_0= ruleSubOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3704:1: (lv_operator_1_0= ruleSubOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3705:3: lv_operator_1_0= ruleSubOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getOperatorSubOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubOperator_in_ruleNegExpression5594);
                    lv_operator_1_0=ruleSubOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNegExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_1_0, 
                      	        		"SubOperator", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3727:2: ( (lv_subExpressions_2_0= ruleNegExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3728:1: (lv_subExpressions_2_0= ruleNegExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3728:1: (lv_subExpressions_2_0= ruleNegExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3729:3: lv_subExpressions_2_0= ruleNegExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getSubExpressionsNegExpressionParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNegExpression_in_ruleNegExpression5615);
                    lv_subExpressions_2_0=ruleNegExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getNegExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"subExpressions",
                      	        		lv_subExpressions_2_0, 
                      	        		"NegExpression", 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3753:2: this_AtomicValuedExpression_3= ruleAtomicValuedExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNegExpressionAccess().getAtomicValuedExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression5647);
                    this_AtomicValuedExpression_3=ruleAtomicValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicValuedExpression_3; 
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
    // $ANTLR end ruleNegExpression


    // $ANTLR start entryRuleAtomicExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3772:1: entryRuleAtomicExpression returns [EObject current=null] : iv_ruleAtomicExpression= ruleAtomicExpression EOF ;
    public final EObject entryRuleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3773:2: (iv_ruleAtomicExpression= ruleAtomicExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3774:2: iv_ruleAtomicExpression= ruleAtomicExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression5682);
            iv_ruleAtomicExpression=ruleAtomicExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicExpression5692); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3781:1: ruleAtomicExpression returns [EObject current=null] : (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) ;
    public final EObject ruleAtomicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValue_0 = null;

        EObject this_ValuedObjectTestExpression_1 = null;

        EObject this_BooleanExpression_3 = null;

        EObject this_TextExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3786:6: ( (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3787:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3787:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )
            int alt76=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt76=1;
                }
                break;
            case RULE_ID:
            case 60:
            case 68:
                {
                alt76=2;
                }
                break;
            case 19:
                {
                alt76=3;
                }
                break;
            case RULE_HOSTCODE:
                {
                alt76=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3787:1: (this_BooleanValue_0= ruleBooleanValue | this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression | ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' ) | this_TextExpression_5= ruleTextExpression )", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3788:2: this_BooleanValue_0= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_ruleAtomicExpression5742);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3801:2: this_ValuedObjectTestExpression_1= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getValuedObjectTestExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression5772);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3813:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3813:6: ( '(' this_BooleanExpression_3= ruleBooleanExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3813:8: '(' this_BooleanExpression_3= ruleBooleanExpression ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleAtomicExpression5788); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getBooleanExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression5813);
                    this_BooleanExpression_3=ruleBooleanExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAtomicExpression5822); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3835:2: this_TextExpression_5= ruleTextExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicExpressionAccess().getTextExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_ruleAtomicExpression5854);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3854:1: entryRuleAtomicValuedExpression returns [EObject current=null] : iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF ;
    public final EObject entryRuleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicValuedExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3855:2: (iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3856:2: iv_ruleAtomicValuedExpression= ruleAtomicValuedExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomicValuedExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5889);
            iv_ruleAtomicValuedExpression=ruleAtomicValuedExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAtomicValuedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtomicValuedExpression5899); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3863:1: ruleAtomicValuedExpression returns [EObject current=null] : (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) ;
    public final EObject ruleAtomicValuedExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntValue_0 = null;

        EObject this_FloatValue_1 = null;

        EObject this_ValuedExpression_3 = null;

        EObject this_AtomicExpression_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3868:6: ( (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3869:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3869:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )
            int alt77=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt77=1;
                }
                break;
            case RULE_FLOAT:
                {
                alt77=2;
                }
                break;
            case 19:
                {
                int LA77_3 = input.LA(2);

                if ( (synpred93()) ) {
                    alt77=3;
                }
                else if ( (true) ) {
                    alt77=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("3869:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 77, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_HOSTCODE:
            case RULE_BOOLEAN:
            case 60:
            case 68:
                {
                alt77=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3869:1: (this_IntValue_0= ruleIntValue | this_FloatValue_1= ruleFloatValue | ( '(' this_ValuedExpression_3= ruleValuedExpression ')' ) | this_AtomicExpression_5= ruleAtomicExpression )", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3870:2: this_IntValue_0= ruleIntValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getIntValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5949);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3883:2: this_FloatValue_1= ruleFloatValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getFloatValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5979);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:6: ( '(' this_ValuedExpression_3= ruleValuedExpression ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:8: '(' this_ValuedExpression_3= ruleValuedExpression ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleAtomicValuedExpression5995); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getValuedExpressionParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression6020);
                    this_ValuedExpression_3=ruleValuedExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_ValuedExpression_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,20,FollowSets000.FOLLOW_20_in_ruleAtomicValuedExpression6029); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomicValuedExpressionAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3917:2: this_AtomicExpression_5= ruleAtomicExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomicValuedExpressionAccess().getAtomicExpressionParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression6061);
                    this_AtomicExpression_5=ruleAtomicExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AtomicExpression_5; 
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


    // $ANTLR start entryRuleValuedObjectTestExpression
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3936:1: entryRuleValuedObjectTestExpression returns [EObject current=null] : iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF ;
    public final EObject entryRuleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectTestExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3937:2: (iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3938:2: iv_ruleValuedObjectTestExpression= ruleValuedObjectTestExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectTestExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression6096);
            iv_ruleValuedObjectTestExpression=ruleValuedObjectTestExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectTestExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectTestExpression6106); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3945:1: ruleValuedObjectTestExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) ;
    public final EObject ruleValuedObjectTestExpression() throws RecognitionException {
        EObject current = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_subExpressions_3_0 = null;

        Enumerator lv_operator_6_0 = null;

        EObject lv_subExpressions_7_0 = null;

        EObject this_ValuedObjectReference_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3950:6: ( ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3951:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3951:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt78=1;
                }
                break;
            case 68:
                {
                alt78=2;
                }
                break;
            case RULE_ID:
                {
                alt78=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("3951:1: ( ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' ) | ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) ) | this_ValuedObjectReference_8= ruleValuedObjectReference )", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3951:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3951:2: ( () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3951:3: () ( (lv_operator_1_0= rulePreOperator ) ) '(' ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) ) ')'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3951:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3952:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3965:2: ( (lv_operator_1_0= rulePreOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3966:1: (lv_operator_1_0= rulePreOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3966:1: (lv_operator_1_0= rulePreOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3967:3: lv_operator_1_0= rulePreOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorPreOperatorEnumRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression6165);
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

                    match(input,19,FollowSets000.FOLLOW_19_in_ruleValuedObjectTestExpression6175); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getLeftParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3993:1: ( (lv_subExpressions_3_0= ruleValuedObjectTestExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3994:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3994:1: (lv_subExpressions_3_0= ruleValuedObjectTestExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3995:3: lv_subExpressions_3_0= ruleValuedObjectTestExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectTestExpressionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression6196);
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

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleValuedObjectTestExpression6206); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getValuedObjectTestExpressionAccess().getRightParenthesisKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4022:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4022:6: ( () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4022:7: () ( (lv_operator_6_0= ruleValueTestOperator ) ) ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4022:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4023:2: 
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4036:2: ( (lv_operator_6_0= ruleValueTestOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4037:1: (lv_operator_6_0= ruleValueTestOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4037:1: (lv_operator_6_0= ruleValueTestOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4038:3: lv_operator_6_0= ruleValueTestOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getOperatorValueTestOperatorEnumRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression6247);
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

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4060:2: ( (lv_subExpressions_7_0= ruleValuedObjectReference ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4061:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4061:1: (lv_subExpressions_7_0= ruleValuedObjectReference )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4062:3: lv_subExpressions_7_0= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getSubExpressionsValuedObjectReferenceParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6268);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4086:2: this_ValuedObjectReference_8= ruleValuedObjectReference
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getValuedObjectTestExpressionAccess().getValuedObjectReferenceParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6300);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4105:1: entryRuleValuedObjectReference returns [EObject current=null] : iv_ruleValuedObjectReference= ruleValuedObjectReference EOF ;
    public final EObject entryRuleValuedObjectReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuedObjectReference = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4106:2: (iv_ruleValuedObjectReference= ruleValuedObjectReference EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4107:2: iv_ruleValuedObjectReference= ruleValuedObjectReference EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValuedObjectReferenceRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference6335);
            iv_ruleValuedObjectReference=ruleValuedObjectReference();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValuedObjectReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValuedObjectReference6345); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4114:1: ruleValuedObjectReference returns [EObject current=null] : ( ( RULE_ID ) ) ;
    public final EObject ruleValuedObjectReference() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4119:6: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4120:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4120:1: ( ( RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4121:1: ( RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4121:1: ( RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4122:3: RULE_ID
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
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValuedObjectReference6391); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4145:1: entryRuleTextExpression returns [EObject current=null] : iv_ruleTextExpression= ruleTextExpression EOF ;
    public final EObject entryRuleTextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextExpression = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4146:2: (iv_ruleTextExpression= ruleTextExpression EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4147:2: iv_ruleTextExpression= ruleTextExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTextExpressionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextExpression_in_entryRuleTextExpression6426);
            iv_ruleTextExpression=ruleTextExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextExpression6436); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4154:1: ruleTextExpression returns [EObject current=null] : ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) ;
    public final EObject ruleTextExpression() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;
        Token lv_type_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4159:6: ( ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4160:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4160:1: ( ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4160:2: ( (lv_code_0_0= RULE_HOSTCODE ) ) ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4160:2: ( (lv_code_0_0= RULE_HOSTCODE ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4161:1: (lv_code_0_0= RULE_HOSTCODE )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4161:1: (lv_code_0_0= RULE_HOSTCODE )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4162:3: lv_code_0_0= RULE_HOSTCODE
            {
            lv_code_0_0=(Token)input.LT(1);
            match(input,RULE_HOSTCODE,FollowSets000.FOLLOW_RULE_HOSTCODE_in_ruleTextExpression6478); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4184:2: ( '(' ( (lv_type_2_0= RULE_ID ) ) ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==19) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4184:4: '(' ( (lv_type_2_0= RULE_ID ) ) ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleTextExpression6494); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTextExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4188:1: ( (lv_type_2_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4189:1: (lv_type_2_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4189:1: (lv_type_2_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4190:3: lv_type_2_0= RULE_ID
                    {
                    lv_type_2_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextExpression6511); if (failed) return current;
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

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleTextExpression6526); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4224:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4225:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4226:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIntValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntValue_in_entryRuleIntValue6564);
            iv_ruleIntValue=ruleIntValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIntValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntValue6574); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4233:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4238:6: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4239:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4239:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4240:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4240:1: (lv_value_0_0= RULE_INT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4241:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleIntValue6615); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4271:1: entryRuleFloatValue returns [EObject current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final EObject entryRuleFloatValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4272:2: (iv_ruleFloatValue= ruleFloatValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4273:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFloatValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatValue_in_entryRuleFloatValue6655);
            iv_ruleFloatValue=ruleFloatValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFloatValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatValue6665); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4280:1: ruleFloatValue returns [EObject current=null] : ( (lv_value_0_0= RULE_FLOAT ) ) ;
    public final EObject ruleFloatValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4285:6: ( ( (lv_value_0_0= RULE_FLOAT ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4286:1: ( (lv_value_0_0= RULE_FLOAT ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4286:1: ( (lv_value_0_0= RULE_FLOAT ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4287:1: (lv_value_0_0= RULE_FLOAT )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4287:1: (lv_value_0_0= RULE_FLOAT )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4288:3: lv_value_0_0= RULE_FLOAT
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleFloatValue6706); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4318:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4319:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4320:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6746);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanValue6756); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4327:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4332:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4333:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4333:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4334:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4334:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4335:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue6797); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4365:1: entryRuleAnyType returns [String current=null] : iv_ruleAnyType= ruleAnyType EOF ;
    public final String entryRuleAnyType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyType = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4366:2: (iv_ruleAnyType= ruleAnyType EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4367:2: iv_ruleAnyType= ruleAnyType EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAnyTypeRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnyType_in_entryRuleAnyType6838);
            iv_ruleAnyType=ruleAnyType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAnyType.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnyType6849); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4374:1: ruleAnyType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleAnyType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_Boolean_0=null;
        Token this_INT_1=null;
        Token this_Float_2=null;
        Token this_ID_3=null;
        Token this_STRING_4=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4379:6: ( (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4380:1: (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4380:1: (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING )
            int alt80=5;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt80=1;
                }
                break;
            case RULE_INT:
                {
                alt80=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt80=3;
                }
                break;
            case RULE_ID:
                {
                alt80=4;
                }
                break;
            case RULE_STRING:
                {
                alt80=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4380:1: (this_Boolean_0= RULE_BOOLEAN | this_INT_1= RULE_INT | this_Float_2= RULE_FLOAT | this_ID_3= RULE_ID | this_STRING_4= RULE_STRING )", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4380:6: this_Boolean_0= RULE_BOOLEAN
                    {
                    this_Boolean_0=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnyType6889); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Boolean_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getBooleanTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4388:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)input.LT(1);
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleAnyType6915); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getINTTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4396:10: this_Float_2= RULE_FLOAT
                    {
                    this_Float_2=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FollowSets000.FOLLOW_RULE_FLOAT_in_ruleAnyType6941); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_Float_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getFloatTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4404:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnyType6967); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAnyTypeAccess().getIDTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4412:10: this_STRING_4= RULE_STRING
                    {
                    this_STRING_4=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnyType6993); if (failed) return current;
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


    // $ANTLR start entryRuleInterfaceDeclaration
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4427:1: entryRuleInterfaceDeclaration returns [EObject current=null] : iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF ;
    public final EObject entryRuleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDeclaration = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4428:2: (iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4429:2: iv_ruleInterfaceDeclaration= ruleInterfaceDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceDeclarationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration7038);
            iv_ruleInterfaceDeclaration=ruleInterfaceDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDeclaration7048); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceDeclaration


    // $ANTLR start ruleInterfaceDeclaration
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4436:1: ruleInterfaceDeclaration returns [EObject current=null] : (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) ;
    public final EObject ruleInterfaceDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceSignalDecl_0 = null;

        EObject this_InterfaceVariableDecl_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4441:6: ( (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4442:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4442:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=38 && LA81_0<=39)||(LA81_0>=45 && LA81_0<=46)) ) {
                alt81=1;
            }
            else if ( (LA81_0==43) ) {
                alt81=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4442:1: (this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl | this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl )", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4443:2: this_InterfaceSignalDecl_0= ruleInterfaceSignalDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceSignalDeclParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration7098);
                    this_InterfaceSignalDecl_0=ruleInterfaceSignalDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceSignalDecl_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4456:2: this_InterfaceVariableDecl_1= ruleInterfaceVariableDecl
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getInterfaceDeclarationAccess().getInterfaceVariableDeclParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration7128);
                    this_InterfaceVariableDecl_1=ruleInterfaceVariableDecl();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_InterfaceVariableDecl_1; 
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
    // $ANTLR end ruleInterfaceDeclaration


    // $ANTLR start entryRuleISignal
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4475:1: entryRuleISignal returns [EObject current=null] : iv_ruleISignal= ruleISignal EOF ;
    public final EObject entryRuleISignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleISignal = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4476:2: (iv_ruleISignal= ruleISignal EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4477:2: iv_ruleISignal= ruleISignal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getISignalRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleISignal_in_entryRuleISignal7163);
            iv_ruleISignal=ruleISignal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleISignal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleISignal7173); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleISignal


    // $ANTLR start ruleISignal
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4484:1: ruleISignal returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) ;
    public final EObject ruleISignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_channelDescr_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4489:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4490:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4490:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4490:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4490:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4491:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4491:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4492:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleISignal7215); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getISignalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getISignalRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4514:2: ( (lv_channelDescr_1_0= ruleChannelDescription ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==16||LA82_0==19||LA82_0==41) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4515:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4515:1: (lv_channelDescr_1_0= ruleChannelDescription )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4516:3: lv_channelDescr_1_0= ruleChannelDescription
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getISignalAccess().getChannelDescrChannelDescriptionParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleChannelDescription_in_ruleISignal7241);
                    lv_channelDescr_1_0=ruleChannelDescription();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getISignalRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"channelDescr",
                      	        		lv_channelDescr_1_0, 
                      	        		"ChannelDescription", 
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
    // $ANTLR end ruleISignal


    // $ANTLR start entryRuleInterfaceSignalDecl
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4546:1: entryRuleInterfaceSignalDecl returns [EObject current=null] : iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF ;
    public final EObject entryRuleInterfaceSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4547:2: (iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4548:2: iv_ruleInterfaceSignalDecl= ruleInterfaceSignalDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl7278);
            iv_ruleInterfaceSignalDecl=ruleInterfaceSignalDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceSignalDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceSignalDecl7288); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceSignalDecl


    // $ANTLR start ruleInterfaceSignalDecl
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4555:1: ruleInterfaceSignalDecl returns [EObject current=null] : ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) ;
    public final EObject ruleInterfaceSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signals_2_0 = null;

        EObject lv_signals_4_0 = null;

        EObject lv_signals_8_0 = null;

        EObject lv_signals_10_0 = null;

        EObject lv_signals_14_0 = null;

        EObject lv_signals_16_0 = null;

        EObject lv_signals_20_0 = null;

        EObject lv_signals_22_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4560:6: ( ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4561:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4561:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt87=1;
                }
                break;
            case 39:
                {
                alt87=2;
                }
                break;
            case 45:
                {
                alt87=3;
                }
                break;
            case 46:
                {
                alt87=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4561:1: ( ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' ) | ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' ) | ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' ) | ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' ) )", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4561:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4561:2: ( () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4561:3: () 'input' ( (lv_signals_2_0= ruleISignal ) ) ( ',' ( (lv_signals_4_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4561:3: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4562:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getInputAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,38,FollowSets000.FOLLOW_38_in_ruleInterfaceSignalDecl7336); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputKeyword_0_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4579:1: ( (lv_signals_2_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4580:1: (lv_signals_2_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4580:1: (lv_signals_2_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4581:3: lv_signals_2_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7357);
                    lv_signals_2_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_2_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4603:2: ( ',' ( (lv_signals_4_0= ruleISignal ) ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==26) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4603:4: ',' ( (lv_signals_4_0= ruleISignal ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceSignalDecl7368); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_0_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4607:1: ( (lv_signals_4_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4608:1: (lv_signals_4_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4608:1: (lv_signals_4_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4609:3: lv_signals_4_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_0_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7389);
                    	    lv_signals_4_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_4_0, 
                    	      	        		"ISignal", 
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
                    	    break loop83;
                        }
                    } while (true);

                    match(input,44,FollowSets000.FOLLOW_44_in_ruleInterfaceSignalDecl7401); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_0_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4636:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4636:6: ( () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4636:7: () 'output' ( (lv_signals_8_0= ruleISignal ) ) ( ',' ( (lv_signals_10_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4636:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4637:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getOutputAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,39,FollowSets000.FOLLOW_39_in_ruleInterfaceSignalDecl7431); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getOutputKeyword_1_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4654:1: ( (lv_signals_8_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4655:1: (lv_signals_8_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4655:1: (lv_signals_8_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4656:3: lv_signals_8_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7452);
                    lv_signals_8_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_8_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4678:2: ( ',' ( (lv_signals_10_0= ruleISignal ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==26) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4678:4: ',' ( (lv_signals_10_0= ruleISignal ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceSignalDecl7463); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_1_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4682:1: ( (lv_signals_10_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4683:1: (lv_signals_10_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4683:1: (lv_signals_10_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4684:3: lv_signals_10_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_1_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7484);
                    	    lv_signals_10_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_10_0, 
                    	      	        		"ISignal", 
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
                    	    break loop84;
                        }
                    } while (true);

                    match(input,44,FollowSets000.FOLLOW_44_in_ruleInterfaceSignalDecl7496); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_1_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4711:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4711:6: ( () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4711:7: () 'inputoutput' ( (lv_signals_14_0= ruleISignal ) ) ( ',' ( (lv_signals_16_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4711:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4712:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getInputOutputAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,45,FollowSets000.FOLLOW_45_in_ruleInterfaceSignalDecl7526); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getInputoutputKeyword_2_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4729:1: ( (lv_signals_14_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4730:1: (lv_signals_14_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4730:1: (lv_signals_14_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4731:3: lv_signals_14_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7547);
                    lv_signals_14_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_14_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4753:2: ( ',' ( (lv_signals_16_0= ruleISignal ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==26) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4753:4: ',' ( (lv_signals_16_0= ruleISignal ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceSignalDecl7558); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_2_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4757:1: ( (lv_signals_16_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4758:1: (lv_signals_16_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4758:1: (lv_signals_16_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4759:3: lv_signals_16_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_2_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7579);
                    	    lv_signals_16_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_16_0, 
                    	      	        		"ISignal", 
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
                    	    break loop85;
                        }
                    } while (true);

                    match(input,44,FollowSets000.FOLLOW_44_in_ruleInterfaceSignalDecl7591); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_2_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4786:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4786:6: ( () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4786:7: () 'return' ( (lv_signals_20_0= ruleISignal ) ) ( ',' ( (lv_signals_22_0= ruleISignal ) ) )* ';'
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4786:7: ()
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4787:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getReturnAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,46,FollowSets000.FOLLOW_46_in_ruleInterfaceSignalDecl7621); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4804:1: ( (lv_signals_20_0= ruleISignal ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4805:1: (lv_signals_20_0= ruleISignal )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4805:1: (lv_signals_20_0= ruleISignal )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4806:3: lv_signals_20_0= ruleISignal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7642);
                    lv_signals_20_0=ruleISignal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"signals",
                      	        		lv_signals_20_0, 
                      	        		"ISignal", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4828:2: ( ',' ( (lv_signals_22_0= ruleISignal ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==26) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4828:4: ',' ( (lv_signals_22_0= ruleISignal ) )
                    	    {
                    	    match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceSignalDecl7653); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getCommaKeyword_3_3_0(), null); 
                    	          
                    	    }
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4832:1: ( (lv_signals_22_0= ruleISignal ) )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4833:1: (lv_signals_22_0= ruleISignal )
                    	    {
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4833:1: (lv_signals_22_0= ruleISignal )
                    	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4834:3: lv_signals_22_0= ruleISignal
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceSignalDeclAccess().getSignalsISignalParserRuleCall_3_3_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7674);
                    	    lv_signals_22_0=ruleISignal();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getInterfaceSignalDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"signals",
                    	      	        		lv_signals_22_0, 
                    	      	        		"ISignal", 
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
                    	    break loop86;
                        }
                    } while (true);

                    match(input,44,FollowSets000.FOLLOW_44_in_ruleInterfaceSignalDecl7686); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getInterfaceSignalDeclAccess().getSemicolonKeyword_3_4(), null); 
                          
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
    // $ANTLR end ruleInterfaceSignalDecl


    // $ANTLR start entryRuleChannelDescription
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4868:1: entryRuleChannelDescription returns [EObject current=null] : iv_ruleChannelDescription= ruleChannelDescription EOF ;
    public final EObject entryRuleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDescription = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4869:2: (iv_ruleChannelDescription= ruleChannelDescription EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4870:2: iv_ruleChannelDescription= ruleChannelDescription EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getChannelDescriptionRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription7723);
            iv_ruleChannelDescription=ruleChannelDescription();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleChannelDescription; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChannelDescription7733); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleChannelDescription


    // $ANTLR start ruleChannelDescription
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4877:1: ruleChannelDescription returns [EObject current=null] : ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) ;
    public final EObject ruleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_type_8_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4882:6: ( ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4883:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4883:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt88=1;
                }
                break;
            case 19:
                {
                alt88=2;
                }
                break;
            case 41:
                {
                alt88=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("4883:1: ( ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) ) | ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' ) | ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) ) )", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4883:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4883:2: ( ':' ( (lv_type_1_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4883:4: ':' ( (lv_type_1_0= ruleTypeIdentifier ) )
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_ruleChannelDescription7769); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4887:1: ( (lv_type_1_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4888:1: (lv_type_1_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4888:1: (lv_type_1_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4889:3: lv_type_1_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7790);
                    lv_type_1_0=ruleTypeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_1_0, 
                      	        		"TypeIdentifier", 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4912:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4912:6: ( '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4912:8: '(' ( (lv_type_3_0= ruleTypeIdentifier ) ) ')'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_ruleChannelDescription7808); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4916:1: ( (lv_type_3_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4917:1: (lv_type_3_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4917:1: (lv_type_3_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4918:3: lv_type_3_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7829);
                    lv_type_3_0=ruleTypeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_3_0, 
                      	        		"TypeIdentifier", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,20,FollowSets000.FOLLOW_20_in_ruleChannelDescription7839); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4945:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4945:6: ( ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4945:8: ':=' ( (lv_expression_6_0= ruleExpression ) ) ':' ( (lv_type_8_0= ruleTypeIdentifier ) )
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleChannelDescription7857); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4949:1: ( (lv_expression_6_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4950:1: (lv_expression_6_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4950:1: (lv_expression_6_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4951:3: lv_expression_6_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getExpressionExpressionParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleChannelDescription7878);
                    lv_expression_6_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"expression",
                      	        		lv_expression_6_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,16,FollowSets000.FOLLOW_16_in_ruleChannelDescription7888); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4977:1: ( (lv_type_8_0= ruleTypeIdentifier ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4978:1: (lv_type_8_0= ruleTypeIdentifier )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4978:1: (lv_type_8_0= ruleTypeIdentifier )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:4979:3: lv_type_8_0= ruleTypeIdentifier
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getTypeTypeIdentifierParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7909);
                    lv_type_8_0=ruleTypeIdentifier();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_8_0, 
                      	        		"TypeIdentifier", 
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
    // $ANTLR end ruleChannelDescription


    // $ANTLR start entryRuleInterfaceVariableDecl
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5009:1: entryRuleInterfaceVariableDecl returns [EObject current=null] : iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF ;
    public final EObject entryRuleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5010:2: (iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5011:2: iv_ruleInterfaceVariableDecl= ruleInterfaceVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getInterfaceVariableDeclRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl7946);
            iv_ruleInterfaceVariableDecl=ruleInterfaceVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleInterfaceVariableDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceVariableDecl7956); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceVariableDecl


    // $ANTLR start ruleInterfaceVariableDecl
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5018:1: ruleInterfaceVariableDecl returns [EObject current=null] : ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) ;
    public final EObject ruleInterfaceVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecls_1_0 = null;

        EObject lv_varDecls_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5023:6: ( ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5024:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5024:1: ( 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )* )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5024:3: 'var' ( (lv_varDecls_1_0= ruleVariableDecl ) ) ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            {
            match(input,43,FollowSets000.FOLLOW_43_in_ruleInterfaceVariableDecl7991); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getVarKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5028:1: ( (lv_varDecls_1_0= ruleVariableDecl ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5029:1: (lv_varDecls_1_0= ruleVariableDecl )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5029:1: (lv_varDecls_1_0= ruleVariableDecl )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5030:3: lv_varDecls_1_0= ruleVariableDecl
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl8012);
            lv_varDecls_1_0=ruleVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getInterfaceVariableDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"varDecls",
              	        		lv_varDecls_1_0, 
              	        		"VariableDecl", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5052:2: ( ',' ( (lv_varDecls_3_0= ruleVariableDecl ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==26) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5052:4: ',' ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    {
            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceVariableDecl8023); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getInterfaceVariableDeclAccess().getCommaKeyword_2_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5056:1: ( (lv_varDecls_3_0= ruleVariableDecl ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5057:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5057:1: (lv_varDecls_3_0= ruleVariableDecl )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5058:3: lv_varDecls_3_0= ruleVariableDecl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getInterfaceVariableDeclAccess().getVarDeclsVariableDeclParserRuleCall_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl8044);
            	    lv_varDecls_3_0=ruleVariableDecl();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getInterfaceVariableDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"varDecls",
            	      	        		lv_varDecls_3_0, 
            	      	        		"VariableDecl", 
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
            	    break loop89;
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
    // $ANTLR end ruleInterfaceVariableDecl


    // $ANTLR start entryRuleVariableDecl
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5088:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5089:2: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5090:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl8082);
            iv_ruleVariableDecl=ruleVariableDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDecl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDecl8092); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableDecl


    // $ANTLR start ruleVariableDecl
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5097:1: ruleVariableDecl returns [EObject current=null] : ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;

        EObject lv_variables_2_0 = null;

        EObject lv_type_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5102:6: ( ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5103:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5103:1: ( ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5103:2: ( (lv_variables_0_0= ruleIVariable ) ) ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )* ':' ( (lv_type_4_0= ruleTypeIdentifier ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5103:2: ( (lv_variables_0_0= ruleIVariable ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5104:1: (lv_variables_0_0= ruleIVariable )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5104:1: (lv_variables_0_0= ruleIVariable )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5105:3: lv_variables_0_0= ruleIVariable
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleIVariable_in_ruleVariableDecl8138);
            lv_variables_0_0=ruleIVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"variables",
              	        		lv_variables_0_0, 
              	        		"IVariable", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5127:2: ( ',' ( (lv_variables_2_0= ruleIVariable ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==26) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5127:4: ',' ( (lv_variables_2_0= ruleIVariable ) )
            	    {
            	    match(input,26,FollowSets000.FOLLOW_26_in_ruleVariableDecl8149); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getVariableDeclAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5131:1: ( (lv_variables_2_0= ruleIVariable ) )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5132:1: (lv_variables_2_0= ruleIVariable )
            	    {
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5132:1: (lv_variables_2_0= ruleIVariable )
            	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5133:3: lv_variables_2_0= ruleIVariable
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVariablesIVariableParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIVariable_in_ruleVariableDecl8170);
            	    lv_variables_2_0=ruleIVariable();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variables",
            	      	        		lv_variables_2_0, 
            	      	        		"IVariable", 
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
            	    break loop90;
                }
            } while (true);

            match(input,16,FollowSets000.FOLLOW_16_in_ruleVariableDecl8182); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_2(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5159:1: ( (lv_type_4_0= ruleTypeIdentifier ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5160:1: (lv_type_4_0= ruleTypeIdentifier )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5160:1: (lv_type_4_0= ruleTypeIdentifier )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5161:3: lv_type_4_0= ruleTypeIdentifier
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getTypeTypeIdentifierParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl8203);
            lv_type_4_0=ruleTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_4_0, 
              	        		"TypeIdentifier", 
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
    // $ANTLR end ruleVariableDecl


    // $ANTLR start entryRuleIVariable
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5191:1: entryRuleIVariable returns [EObject current=null] : iv_ruleIVariable= ruleIVariable EOF ;
    public final EObject entryRuleIVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIVariable = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5192:2: (iv_ruleIVariable= ruleIVariable EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5193:2: iv_ruleIVariable= ruleIVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getIVariableRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIVariable_in_entryRuleIVariable8239);
            iv_ruleIVariable=ruleIVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleIVariable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIVariable8249); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIVariable


    // $ANTLR start ruleIVariable
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5200:1: ruleIVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleIVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_expression_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5205:6: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5206:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5206:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )? )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5206:2: ( (lv_name_0_0= RULE_ID ) ) ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5206:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5207:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5207:1: (lv_name_0_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5208:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIVariable8291); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getIVariableAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getIVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5230:2: ( ':=' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==41) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5230:4: ':=' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    match(input,41,FollowSets000.FOLLOW_41_in_ruleIVariable8307); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getIVariableAccess().getColonEqualsSignKeyword_1_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5234:1: ( (lv_expression_2_0= ruleExpression ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5235:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5235:1: (lv_expression_2_0= ruleExpression )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5236:3: lv_expression_2_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getIVariableAccess().getExpressionExpressionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIVariable8328);
                    lv_expression_2_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getIVariableRule().getType().getClassifier());
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
    // $ANTLR end ruleIVariable


    // $ANTLR start entryRuleTypeIdentifier
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5266:1: entryRuleTypeIdentifier returns [EObject current=null] : iv_ruleTypeIdentifier= ruleTypeIdentifier EOF ;
    public final EObject entryRuleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdentifier = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5267:2: (iv_ruleTypeIdentifier= ruleTypeIdentifier EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5268:2: iv_ruleTypeIdentifier= ruleTypeIdentifier EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeIdentifierRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier8366);
            iv_ruleTypeIdentifier=ruleTypeIdentifier();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleTypeIdentifier; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeIdentifier8376); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeIdentifier


    // $ANTLR start ruleTypeIdentifier
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5275:1: ruleTypeIdentifier returns [EObject current=null] : ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) ;
    public final EObject ruleTypeIdentifier() throws RecognitionException {
        EObject current = null;

        Token lv_typeID_1_0=null;
        Token lv_typeID_4_0=null;
        Enumerator lv_type_0_0 = null;

        Enumerator lv_type_3_0 = null;

        Enumerator lv_operator_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5280:6: ( ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5281:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5281:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt93=1;
                }
                break;
            case RULE_ID:
                {
                alt93=2;
                }
                break;
            case 42:
                {
                alt93=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5281:1: ( ( (lv_type_0_0= ruleValueType ) ) | ( (lv_typeID_1_0= RULE_ID ) ) | ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) ) )", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5281:2: ( (lv_type_0_0= ruleValueType ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5281:2: ( (lv_type_0_0= ruleValueType ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5282:1: (lv_type_0_0= ruleValueType )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5282:1: (lv_type_0_0= ruleValueType )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5283:3: lv_type_0_0= ruleValueType
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleTypeIdentifier8422);
                    lv_type_0_0=ruleValueType();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"type",
                      	        		lv_type_0_0, 
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5306:6: ( (lv_typeID_1_0= RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5306:6: ( (lv_typeID_1_0= RULE_ID ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5307:1: (lv_typeID_1_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5307:1: (lv_typeID_1_0= RULE_ID )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5308:3: lv_typeID_1_0= RULE_ID
                    {
                    lv_typeID_1_0=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeIdentifier8445); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_1_0(), "typeID"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"typeID",
                      	        		lv_typeID_1_0, 
                      	        		"ID", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5331:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5331:6: ( 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5331:8: 'combine' ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) ) 'with' ( (lv_operator_6_0= ruleCombineOperator ) )
                    {
                    match(input,42,FollowSets000.FOLLOW_42_in_ruleTypeIdentifier8467); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getCombineKeyword_2_0(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5335:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( ((LA92_0>=69 && LA92_0<=74)) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==RULE_ID) ) {
                        alt92=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("5335:1: ( ( (lv_type_3_0= ruleValueType ) ) | ( (lv_typeID_4_0= RULE_ID ) ) )", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5335:2: ( (lv_type_3_0= ruleValueType ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5335:2: ( (lv_type_3_0= ruleValueType ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5336:1: (lv_type_3_0= ruleValueType )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5336:1: (lv_type_3_0= ruleValueType )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5337:3: lv_type_3_0= ruleValueType
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getTypeValueTypeEnumRuleCall_2_1_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleValueType_in_ruleTypeIdentifier8489);
                            lv_type_3_0=ruleValueType();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"type",
                              	        		lv_type_3_0, 
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
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5360:6: ( (lv_typeID_4_0= RULE_ID ) )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5360:6: ( (lv_typeID_4_0= RULE_ID ) )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5361:1: (lv_typeID_4_0= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5361:1: (lv_typeID_4_0= RULE_ID )
                            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5362:3: lv_typeID_4_0= RULE_ID
                            {
                            lv_typeID_4_0=(Token)input.LT(1);
                            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeIdentifier8512); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getTypeIdentifierAccess().getTypeIDIDTerminalRuleCall_2_1_1_0(), "typeID"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"typeID",
                              	        		lv_typeID_4_0, 
                              	        		"ID", 
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

                    match(input,34,FollowSets000.FOLLOW_34_in_ruleTypeIdentifier8528); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeIdentifierAccess().getWithKeyword_2_2(), null); 
                          
                    }
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5388:1: ( (lv_operator_6_0= ruleCombineOperator ) )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5389:1: (lv_operator_6_0= ruleCombineOperator )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5389:1: (lv_operator_6_0= ruleCombineOperator )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5390:3: lv_operator_6_0= ruleCombineOperator
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getTypeIdentifierAccess().getOperatorCombineOperatorEnumRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier8549);
                    lv_operator_6_0=ruleCombineOperator();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeIdentifierRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"operator",
                      	        		lv_operator_6_0, 
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
    // $ANTLR end ruleTypeIdentifier


    // $ANTLR start entryRuleStringAnnotation
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5420:1: entryRuleStringAnnotation returns [EObject current=null] : iv_ruleStringAnnotation= ruleStringAnnotation EOF ;
    public final EObject entryRuleStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5421:2: (iv_ruleStringAnnotation= ruleStringAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5422:2: iv_ruleStringAnnotation= ruleStringAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_entryRuleStringAnnotation8586);
            iv_ruleStringAnnotation=ruleStringAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringAnnotation8596); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5429:1: ruleStringAnnotation returns [EObject current=null] : (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation ) ;
    public final EObject ruleStringAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_CommentAnnotation_0 = null;

        EObject this_KeyValueAnnotation_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5434:6: ( (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5435:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5435:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RULE_COMMENT_ANNOTATION) ) {
                alt94=1;
            }
            else if ( (LA94_0==24) ) {
                alt94=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5435:1: (this_CommentAnnotation_0= ruleCommentAnnotation | this_KeyValueAnnotation_1= ruleKeyValueAnnotation )", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5436:2: this_CommentAnnotation_0= ruleCommentAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStringAnnotationAccess().getCommentAnnotationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_ruleStringAnnotation8646);
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
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5449:2: this_KeyValueAnnotation_1= ruleKeyValueAnnotation
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStringAnnotationAccess().getKeyValueAnnotationParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_ruleStringAnnotation8676);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5468:1: entryRuleCommentAnnotation returns [EObject current=null] : iv_ruleCommentAnnotation= ruleCommentAnnotation EOF ;
    public final EObject entryRuleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5469:2: (iv_ruleCommentAnnotation= ruleCommentAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5470:2: iv_ruleCommentAnnotation= ruleCommentAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommentAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8711);
            iv_ruleCommentAnnotation=ruleCommentAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommentAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCommentAnnotation8721); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5477:1: ruleCommentAnnotation returns [EObject current=null] : ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) ;
    public final EObject ruleCommentAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5482:6: ( ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5483:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5483:1: ( (lv_value_0_0= RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5484:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5484:1: (lv_value_0_0= RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5485:3: lv_value_0_0= RULE_COMMENT_ANNOTATION
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_COMMENT_ANNOTATION,FollowSets000.FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8762); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5515:1: entryRuleKeyValueAnnotation returns [EObject current=null] : iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF ;
    public final EObject entryRuleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValueAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5516:2: (iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5517:2: iv_ruleKeyValueAnnotation= ruleKeyValueAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getKeyValueAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation8802);
            iv_ruleKeyValueAnnotation=ruleKeyValueAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleKeyValueAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleKeyValueAnnotation8812); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5524:1: ruleKeyValueAnnotation returns [EObject current=null] : ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValueAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5529:6: ( ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5530:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5530:1: ( '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5530:3: '@' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= ruleEString ) )
            {
            match(input,24,FollowSets000.FOLLOW_24_in_ruleKeyValueAnnotation8847); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getKeyValueAnnotationAccess().getCommercialAtKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5534:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5535:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5535:1: (lv_name_1_0= RULE_ID )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5536:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleKeyValueAnnotation8864); if (failed) return current;
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

            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5558:2: ( (lv_value_2_0= ruleEString ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5559:1: (lv_value_2_0= ruleEString )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5559:1: (lv_value_2_0= ruleEString )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5560:3: lv_value_2_0= ruleEString
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleKeyValueAnnotation8890);
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5590:1: entryRuleImportAnnotation returns [EObject current=null] : iv_ruleImportAnnotation= ruleImportAnnotation EOF ;
    public final EObject entryRuleImportAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportAnnotation = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5591:2: (iv_ruleImportAnnotation= ruleImportAnnotation EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5592:2: iv_ruleImportAnnotation= ruleImportAnnotation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImportAnnotationRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImportAnnotation_in_entryRuleImportAnnotation8926);
            iv_ruleImportAnnotation=ruleImportAnnotation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImportAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImportAnnotation8936); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5599:1: ruleImportAnnotation returns [EObject current=null] : ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_importURI_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5604:6: ( ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5605:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5605:1: ( 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5605:3: 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            match(input,47,FollowSets000.FOLLOW_47_in_ruleImportAnnotation8971); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getImportAnnotationAccess().getImportKeyword_0(), null); 
                  
            }
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5609:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5610:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5610:1: (lv_importURI_1_0= RULE_STRING )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5611:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleImportAnnotation8988); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5641:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5642:2: (iv_ruleEString= ruleEString EOF )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5643:2: iv_ruleEString= ruleEString EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEStringRule(), currentNode); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString9030);
            iv_ruleEString=ruleEString();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString9041); if (failed) return current;

            }

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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5650:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5655:6: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5656:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5656:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_STRING) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_ID) ) {
                alt95=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5656:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5656:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString9081); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5664:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString9107); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5679:1: ruleStateType returns [Enumerator current=null] : ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5683:6: ( ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5684:1: ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5684:1: ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt96=1;
                }
                break;
            case 49:
                {
                alt96=2;
                }
                break;
            case 50:
                {
                alt96=3;
                }
                break;
            case 17:
                {
                alt96=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5684:1: ( ( 'normal' ) | ( 'conditional' ) | ( 'reference' ) | ( 'textual' ) )", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5684:2: ( 'normal' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5684:2: ( 'normal' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5684:4: 'normal'
                    {
                    match(input,48,FollowSets000.FOLLOW_48_in_ruleStateType9164); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getNORMALEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5690:6: ( 'conditional' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5690:6: ( 'conditional' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5690:8: 'conditional'
                    {
                    match(input,49,FollowSets000.FOLLOW_49_in_ruleStateType9179); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getCONDITIONALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5696:6: ( 'reference' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5696:6: ( 'reference' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5696:8: 'reference'
                    {
                    match(input,50,FollowSets000.FOLLOW_50_in_ruleStateType9194); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getStateTypeAccess().getREFERENCEEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5702:6: ( 'textual' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5702:6: ( 'textual' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5702:8: 'textual'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_ruleStateType9209); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5712:1: ruleTransitionType returns [Enumerator current=null] : ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) ;
    public final Enumerator ruleTransitionType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5716:6: ( ( ( '-->' ) | ( 'o->' ) | ( '>->' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5717:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5717:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt97=1;
                }
                break;
            case 52:
                {
                alt97=2;
                }
                break;
            case 53:
                {
                alt97=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5717:1: ( ( '-->' ) | ( 'o->' ) | ( '>->' ) )", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5717:2: ( '-->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5717:2: ( '-->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5717:4: '-->'
                    {
                    match(input,51,FollowSets000.FOLLOW_51_in_ruleTransitionType9252); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getWEAKABORTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5723:6: ( 'o->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5723:6: ( 'o->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5723:8: 'o->'
                    {
                    match(input,52,FollowSets000.FOLLOW_52_in_ruleTransitionType9267); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTransitionTypeAccess().getSTRONGABORTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5729:6: ( '>->' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5729:6: ( '>->' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5729:8: '>->'
                    {
                    match(input,53,FollowSets000.FOLLOW_53_in_ruleTransitionType9282); if (failed) return current;
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


    // $ANTLR start ruleDivOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5739:1: ruleDivOperator returns [Enumerator current=null] : ( ':' ) ;
    public final Enumerator ruleDivOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5743:6: ( ( ':' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5744:1: ( ':' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5744:1: ( ':' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5744:3: ':'
            {
            match(input,16,FollowSets000.FOLLOW_16_in_ruleDivOperator9324); if (failed) return current;
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


    // $ANTLR start ruleCompareOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5754:1: ruleCompareOperator returns [Enumerator current=null] : ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5758:6: ( ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5759:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5759:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )
            int alt98=6;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt98=1;
                }
                break;
            case 55:
                {
                alt98=2;
                }
                break;
            case 56:
                {
                alt98=3;
                }
                break;
            case 57:
                {
                alt98=4;
                }
                break;
            case 58:
                {
                alt98=5;
                }
                break;
            case 59:
                {
                alt98=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5759:1: ( ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '<>' ) )", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5759:2: ( '=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5759:2: ( '=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5759:4: '='
                    {
                    match(input,54,FollowSets000.FOLLOW_54_in_ruleCompareOperator9366); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5765:6: ( '<' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5765:6: ( '<' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5765:8: '<'
                    {
                    match(input,55,FollowSets000.FOLLOW_55_in_ruleCompareOperator9381); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLTEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5771:6: ( '<=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5771:6: ( '<=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5771:8: '<='
                    {
                    match(input,56,FollowSets000.FOLLOW_56_in_ruleCompareOperator9396); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5777:6: ( '>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5777:6: ( '>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5777:8: '>'
                    {
                    match(input,57,FollowSets000.FOLLOW_57_in_ruleCompareOperator9411); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5783:6: ( '>=' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5783:6: ( '>=' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5783:8: '>='
                    {
                    match(input,58,FollowSets000.FOLLOW_58_in_ruleCompareOperator9426); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5789:6: ( '<>' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5789:6: ( '<>' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5789:8: '<>'
                    {
                    match(input,59,FollowSets000.FOLLOW_59_in_ruleCompareOperator9441); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5799:1: rulePreOperator returns [Enumerator current=null] : ( 'pre' ) ;
    public final Enumerator rulePreOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5803:6: ( ( 'pre' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5804:1: ( 'pre' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5804:1: ( 'pre' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5804:3: 'pre'
            {
            match(input,60,FollowSets000.FOLLOW_60_in_rulePreOperator9483); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5814:1: ruleOrOperator returns [Enumerator current=null] : ( 'or' ) ;
    public final Enumerator ruleOrOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5818:6: ( ( 'or' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5819:1: ( 'or' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5819:1: ( 'or' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5819:3: 'or'
            {
            match(input,61,FollowSets000.FOLLOW_61_in_ruleOrOperator9524); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5829:1: ruleAndOperator returns [Enumerator current=null] : ( 'and' ) ;
    public final Enumerator ruleAndOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5833:6: ( ( 'and' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5834:1: ( 'and' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5834:1: ( 'and' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5834:3: 'and'
            {
            match(input,62,FollowSets000.FOLLOW_62_in_ruleAndOperator9565); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5844:1: ruleNotOperator returns [Enumerator current=null] : ( 'not' ) ;
    public final Enumerator ruleNotOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5848:6: ( ( 'not' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5849:1: ( 'not' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5849:1: ( 'not' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5849:3: 'not'
            {
            match(input,63,FollowSets000.FOLLOW_63_in_ruleNotOperator9606); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5859:1: ruleAddOperator returns [Enumerator current=null] : ( '+' ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5863:6: ( ( '+' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5864:1: ( '+' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5864:1: ( '+' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5864:3: '+'
            {
            match(input,64,FollowSets000.FOLLOW_64_in_ruleAddOperator9647); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5874:1: ruleSubOperator returns [Enumerator current=null] : ( '-' ) ;
    public final Enumerator ruleSubOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5878:6: ( ( '-' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5879:1: ( '-' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5879:1: ( '-' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5879:3: '-'
            {
            match(input,65,FollowSets000.FOLLOW_65_in_ruleSubOperator9688); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5889:1: ruleMultOperator returns [Enumerator current=null] : ( '*' ) ;
    public final Enumerator ruleMultOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5893:6: ( ( '*' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5894:1: ( '*' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5894:1: ( '*' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5894:3: '*'
            {
            match(input,66,FollowSets000.FOLLOW_66_in_ruleMultOperator9729); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5904:1: ruleModOperator returns [Enumerator current=null] : ( 'mod' ) ;
    public final Enumerator ruleModOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5908:6: ( ( 'mod' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5909:1: ( 'mod' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5909:1: ( 'mod' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5909:3: 'mod'
            {
            match(input,67,FollowSets000.FOLLOW_67_in_ruleModOperator9770); if (failed) return current;
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


    // $ANTLR start ruleValueTestOperator
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5919:1: ruleValueTestOperator returns [Enumerator current=null] : ( '?' ) ;
    public final Enumerator ruleValueTestOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5923:6: ( ( '?' ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5924:1: ( '?' )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5924:1: ( '?' )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5924:3: '?'
            {
            match(input,68,FollowSets000.FOLLOW_68_in_ruleValueTestOperator9811); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5934:1: ruleValueType returns [Enumerator current=null] : ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) ) ;
    public final Enumerator ruleValueType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5938:6: ( ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5939:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5939:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )
            int alt99=6;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt99=1;
                }
                break;
            case 70:
                {
                alt99=2;
                }
                break;
            case 71:
                {
                alt99=3;
                }
                break;
            case 72:
                {
                alt99=4;
                }
                break;
            case 73:
                {
                alt99=5;
                }
                break;
            case 74:
                {
                alt99=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5939:1: ( ( 'pure' ) | ( 'bool' ) | ( 'unsigned' ) | ( 'int' ) | ( 'float' ) | ( 'host' ) )", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5939:2: ( 'pure' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5939:2: ( 'pure' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5939:4: 'pure'
                    {
                    match(input,69,FollowSets000.FOLLOW_69_in_ruleValueType9853); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getPUREEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5945:6: ( 'bool' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5945:6: ( 'bool' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5945:8: 'bool'
                    {
                    match(input,70,FollowSets000.FOLLOW_70_in_ruleValueType9868); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getBOOLEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5951:6: ( 'unsigned' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5951:6: ( 'unsigned' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5951:8: 'unsigned'
                    {
                    match(input,71,FollowSets000.FOLLOW_71_in_ruleValueType9883); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getUNSIGNEDEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5957:6: ( 'int' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5957:6: ( 'int' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5957:8: 'int'
                    {
                    match(input,72,FollowSets000.FOLLOW_72_in_ruleValueType9898); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getINTEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5963:6: ( 'float' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5963:6: ( 'float' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5963:8: 'float'
                    {
                    match(input,73,FollowSets000.FOLLOW_73_in_ruleValueType9913); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getValueTypeAccess().getFLOATEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5969:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5969:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5969:8: 'host'
                    {
                    match(input,74,FollowSets000.FOLLOW_74_in_ruleValueType9928); if (failed) return current;
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
    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5979:1: ruleCombineOperator returns [Enumerator current=null] : ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) ;
    public final Enumerator ruleCombineOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5983:6: ( ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) ) )
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5984:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            {
            // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5984:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )
            int alt100=8;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt100=1;
                }
                break;
            case 64:
                {
                alt100=2;
                }
                break;
            case 66:
                {
                alt100=3;
                }
                break;
            case 76:
                {
                alt100=4;
                }
                break;
            case 77:
                {
                alt100=5;
                }
                break;
            case 61:
                {
                alt100=6;
                }
                break;
            case 62:
                {
                alt100=7;
                }
                break;
            case 74:
                {
                alt100=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("5984:1: ( ( 'none' ) | ( '+' ) | ( '*' ) | ( 'max' ) | ( 'min' ) | ( 'or' ) | ( 'and' ) | ( 'host' ) )", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5984:2: ( 'none' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5984:2: ( 'none' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5984:4: 'none'
                    {
                    match(input,75,FollowSets000.FOLLOW_75_in_ruleCombineOperator9971); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getNONEEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5990:6: ( '+' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5990:6: ( '+' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5990:8: '+'
                    {
                    match(input,64,FollowSets000.FOLLOW_64_in_ruleCombineOperator9986); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getADDEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5996:6: ( '*' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5996:6: ( '*' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:5996:8: '*'
                    {
                    match(input,66,FollowSets000.FOLLOW_66_in_ruleCombineOperator10001); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMULTEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6002:6: ( 'max' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6002:6: ( 'max' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6002:8: 'max'
                    {
                    match(input,76,FollowSets000.FOLLOW_76_in_ruleCombineOperator10016); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMAXEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6008:6: ( 'min' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6008:6: ( 'min' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6008:8: 'min'
                    {
                    match(input,77,FollowSets000.FOLLOW_77_in_ruleCombineOperator10031); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getMINEnumLiteralDeclaration_4(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6014:6: ( 'or' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6014:6: ( 'or' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6014:8: 'or'
                    {
                    match(input,61,FollowSets000.FOLLOW_61_in_ruleCombineOperator10046); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getOREnumLiteralDeclaration_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6020:6: ( 'and' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6020:6: ( 'and' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6020:8: 'and'
                    {
                    match(input,62,FollowSets000.FOLLOW_62_in_ruleCombineOperator10061); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getCombineOperatorAccess().getANDEnumLiteralDeclaration_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6026:6: ( 'host' )
                    {
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6026:6: ( 'host' )
                    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:6026:8: 'host'
                    {
                    match(input,74,FollowSets000.FOLLOW_74_in_ruleCombineOperator10076); if (failed) return current;
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

    // $ANTLR start synpred16
    public final void synpred16_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:3: ( ( ( ruleStringAnnotation ) )* 'region' ( ( RULE_ID ) )? ( ( RULE_STRING ) )? ':' ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleTextualCode ) )* )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:3: ( ( ruleStringAnnotation ) )* 'region' ( ( RULE_ID ) )? ( ( RULE_STRING ) )? ':' ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )* ( ( ruleTextualCode ) )*
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:323:3: ( ( ruleStringAnnotation ) )*
        loop106:
        do {
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_COMMENT_ANNOTATION||LA106_0==24) ) {
                alt106=1;
            }


            switch (alt106) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:324:1: ( ruleStringAnnotation )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:324:1: ( ruleStringAnnotation )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:325:3: ruleStringAnnotation
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getAnnotationsStringAnnotationParserRuleCall_0_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleStringAnnotation_in_synpred16417);
        	    ruleStringAnnotation();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop106;
            }
        } while (true);

        match(input,15,FollowSets000.FOLLOW_15_in_synpred16428); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:351:1: ( ( RULE_ID ) )?
        int alt107=2;
        int LA107_0 = input.LA(1);

        if ( (LA107_0==RULE_ID) ) {
            alt107=1;
        }
        switch (alt107) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: ( RULE_ID )
                {
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:352:1: ( RULE_ID )
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:353:3: RULE_ID
                {
                match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_synpred16445); if (failed) return ;

                }


                }
                break;

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:375:3: ( ( RULE_STRING ) )?
        int alt108=2;
        int LA108_0 = input.LA(1);

        if ( (LA108_0==RULE_STRING) ) {
            alt108=1;
        }
        switch (alt108) {
            case 1 :
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:376:1: ( RULE_STRING )
                {
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:376:1: ( RULE_STRING )
                // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:377:3: RULE_STRING
                {
                match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_synpred16468); if (failed) return ;

                }


                }
                break;

        }

        match(input,16,FollowSets000.FOLLOW_16_in_synpred16484); if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:403:1: ( ( ( ruleVariable ) ) | ( ( ruleSignal ) ) )*
        loop109:
        do {
            int alt109=3;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==43) ) {
                alt109=1;
            }
            else if ( ((LA109_0>=38 && LA109_0<=40)) ) {
                alt109=2;
            }


            switch (alt109) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:403:2: ( ( ruleVariable ) )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:403:2: ( ( ruleVariable ) )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:1: ( ruleVariable )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:404:1: ( ruleVariable )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:405:3: ruleVariable
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getVariablesVariableParserRuleCall_0_5_0_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleVariable_in_synpred16506);
        	    ruleVariable();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:428:6: ( ( ruleSignal ) )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:428:6: ( ( ruleSignal ) )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:429:1: ( ruleSignal )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:429:1: ( ruleSignal )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:430:3: ruleSignal
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getSignalsSignalParserRuleCall_0_5_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleSignal_in_synpred16533);
        	    ruleSignal();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    break loop109;
            }
        } while (true);

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:452:4: ( ( ruleTextualCode ) )*
        loop110:
        do {
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==17) ) {
                alt110=1;
            }


            switch (alt110) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:453:1: ( ruleTextualCode )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:453:1: ( ruleTextualCode )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:454:3: ruleTextualCode
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getSingleRegionAccess().getBodyTextTextualCodeParserRuleCall_0_6_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleTextualCode_in_synpred16556);
        	    ruleTextualCode();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop110;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred16

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1274:4: ( ( ( ruleSingleRegion ) ) ( ( ruleRegion ) )* )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1274:4: ( ( ruleSingleRegion ) ) ( ( ruleRegion ) )*
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1274:4: ( ( ruleSingleRegion ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1275:1: ( ruleSingleRegion )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1275:1: ( ruleSingleRegion )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1276:3: ruleSingleRegion
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsSingleRegionParserRuleCall_6_1_1_2_0_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleSingleRegion_in_synpred441694);
        ruleSingleRegion();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1298:2: ( ( ruleRegion ) )*
        loop116:
        do {
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==RULE_COMMENT_ANNOTATION||LA116_0==15||LA116_0==24) ) {
                alt116=1;
            }


            switch (alt116) {
        	case 1 :
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1299:1: ( ruleRegion )
        	    {
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1299:1: ( ruleRegion )
        	    // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1300:3: ruleRegion
        	    {
        	    if ( backtracking==0 ) {
        	       
        	      	        currentNode=createCompositeNode(grammarAccess.getStateAccess().getRegionsRegionParserRuleCall_6_1_1_2_1_0(), currentNode); 
        	      	    
        	    }
        	    pushFollow(FollowSets000.FOLLOW_ruleRegion_in_synpred441715);
        	    ruleRegion();
        	    _fsp--;
        	    if (failed) return ;

        	    }


        	    }
        	    break;

        	default :
        	    break loop116;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred44

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1488:1: ( ( RULE_INT ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1488:1: ( RULE_INT )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1488:1: ( RULE_INT )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:1489:3: RULE_INT
        {
        match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred501975); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred68
    public final void synpred68_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2188:1: ( ( RULE_INT ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2188:1: ( RULE_INT )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2188:1: ( RULE_INT )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2189:3: RULE_INT
        {
        match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_synpred682997); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred68

    // $ANTLR start synpred76
    public final void synpred76_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2597:2: ( ruleBooleanExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2597:2: ruleBooleanExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleBooleanExpression_in_synpred763745);
        ruleBooleanExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred76

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:2: ( ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2883:2: ( ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2884:2: ruleNotOrValuedExpression ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred794268);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2895:1: ( () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2895:2: () ( ( ruleCompareOperator ) ) ( ( ruleNotOrValuedExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2895:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2896:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2914:2: ( ( ruleCompareOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2915:1: ( ruleCompareOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2915:1: ( ruleCompareOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2916:3: ruleCompareOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getOperatorCompareOperatorEnumRuleCall_0_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_synpred794301);
        ruleCompareOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2938:2: ( ( ruleNotOrValuedExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2939:1: ( ruleNotOrValuedExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2939:1: ( ruleNotOrValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2940:3: ruleNotOrValuedExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCompareOperationAccess().getSubExpressionsNotOrValuedExpressionParserRuleCall_0_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleNotOrValuedExpression_in_synpred794322);
        ruleNotOrValuedExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred80
    public final void synpred80_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2999:2: ( ruleValuedExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:2999:2: ruleValuedExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred804450);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred80

    // $ANTLR start synpred85
    public final void synpred85_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3497:2: ( () ( ( ruleDivOperator ) ) ( ( ruleModExpression ) ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3497:2: () ( ( ruleDivOperator ) ) ( ( ruleModExpression ) )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3497:2: ()
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3498:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3516:2: ( ( ruleDivOperator ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3517:1: ( ruleDivOperator )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3517:1: ( ruleDivOperator )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3518:3: ruleDivOperator
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getOperatorDivOperatorEnumRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleDivOperator_in_synpred855314);
        ruleDivOperator();
        _fsp--;
        if (failed) return ;

        }


        }

        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3540:2: ( ( ruleModExpression ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3541:1: ( ruleModExpression )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3541:1: ( ruleModExpression )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3542:3: ruleModExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getDivExpressionAccess().getSubExpressionsModExpressionParserRuleCall_1_2_0(), currentNode); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleModExpression_in_synpred855335);
        ruleModExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred85

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:6: ( ( '(' ruleValuedExpression ')' ) )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:6: ( '(' ruleValuedExpression ')' )
        {
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:6: ( '(' ruleValuedExpression ')' )
        // ../de.cau.cs.kieler.synccharts.text/src-gen/de/cau/cs/kieler/synccharts/text/kits/parser/antlr/internal/InternalKits.g:3895:8: '(' ruleValuedExpression ')'
        {
        match(input,19,FollowSets000.FOLLOW_19_in_synpred935995); if (failed) return ;
        pushFollow(FollowSets000.FOLLOW_ruleValuedExpression_in_synpred936020);
        ruleValuedExpression();
        _fsp--;
        if (failed) return ;
        match(input,20,FollowSets000.FOLLOW_20_in_synpred936029); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred93

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred79() {
        backtracking++;
        int start = input.mark();
        try {
            synpred79_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred85() {
        backtracking++;
        int start = input.mark();
        try {
            synpred85_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred16() {
        backtracking++;
        int start = input.mark();
        try {
            synpred16_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred76() {
        backtracking++;
        int start = input.mark();
        try {
            synpred76_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred80() {
        backtracking++;
        int start = input.mark();
        try {
            synpred80_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred93() {
        backtracking++;
        int start = input.mark();
        try {
            synpred93_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred68() {
        backtracking++;
        int start = input.mark();
        try {
            synpred68_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA7_eotS =
        "\10\uffff";
    static final String DFA7_eofS =
        "\1\4\7\uffff";
    static final String DFA7_minS =
        "\2\12\1\4\2\uffff\1\4\2\12";
    static final String DFA7_maxS =
        "\2\62\1\4\2\uffff\1\5\2\62";
    static final String DFA7_acceptS =
        "\3\uffff\1\1\1\2\3\uffff";
    static final String DFA7_specialS =
        "\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4",
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4",
            "\1\5",
            "",
            "",
            "\1\7\1\6",
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4",
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "123:3: ( ( (lv_annotations_1_0= ruleStringAnnotation ) )* 'region' ( (lv_id_3_0= RULE_ID ) )? ( (lv_label_4_0= RULE_STRING ) )? ':' ( ( (lv_variables_6_0= ruleVariable ) ) | ( (lv_signals_7_0= ruleSignal ) ) )* ( (lv_bodyText_8_0= ruleTextualCode ) )* )?";
        }
    }
    static final String DFA14_eotS =
        "\126\uffff";
    static final String DFA14_eofS =
        "\1\4\7\uffff\1\30\21\uffff\1\30\23\uffff\14\30\1\uffff\7\30\1\uffff"+
        "\1\30\11\uffff\11\30";
    static final String DFA14_minS =
        "\2\12\2\4\1\uffff\1\4\1\5\1\20\3\12\1\4\1\47\1\50\1\4\1\22\1\12"+
        "\1\4\2\21\3\27\1\4\1\uffff\1\20\1\12\1\20\1\27\1\4\2\21\1\0\1\4"+
        "\1\5\1\4\1\5\1\4\1\5\2\12\5\20\14\12\1\5\7\12\1\24\1\12\7\42\1\20"+
        "\1\5\11\12";
    static final String DFA14_maxS =
        "\2\62\1\4\1\20\1\uffff\1\5\2\20\3\62\1\4\2\50\1\4\1\27\1\62\1\4"+
        "\2\62\3\27\1\4\1\uffff\1\51\1\62\1\23\1\27\1\5\2\62\1\0\1\11\1\112"+
        "\1\11\1\112\1\4\1\5\2\62\5\20\14\62\1\112\7\62\1\24\1\62\7\42\1"+
        "\20\1\115\11\62";
    static final String DFA14_acceptS =
        "\4\uffff\1\2\23\uffff\1\1\75\uffff";
    static final String DFA14_specialS =
        "\40\uffff\1\0\65\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\10\uffff\1\4\16"+
            "\uffff\3\4",
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4",
            "\1\5",
            "\1\6\1\7\12\uffff\1\10",
            "",
            "\1\12\1\11",
            "\1\7\12\uffff\1\10",
            "\1\10",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4",
            "\1\1\4\uffff\1\3\1\uffff\1\4\3\uffff\3\4\1\2\27\uffff\3\4",
            "\1\31",
            "\1\15\1\16",
            "\1\16",
            "\1\32",
            "\1\33\4\uffff\1\27",
            "\1\20\4\uffff\1\30\1\uffff\1\34\3\uffff\1\22\1\23\1\27\1\21"+
            "\27\uffff\1\24\1\25\1\26",
            "\1\35",
            "\1\34\4\uffff\1\36\1\27\30\uffff\1\24\1\25\1\26",
            "\1\34\3\uffff\1\37\1\uffff\1\27\30\uffff\1\24\1\25\1\26",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\40",
            "",
            "\1\42\30\uffff\1\41",
            "\1\20\4\uffff\1\30\1\44\1\17\3\uffff\1\22\1\23\1\27\1\21\10"+
            "\uffff\1\30\4\uffff\1\14\1\15\1\16\1\43\1\uffff\1\13\4\uffff"+
            "\1\24\1\25\1\26",
            "\1\46\2\uffff\1\45",
            "\1\27",
            "\1\50\1\47",
            "\1\34\5\uffff\1\27\30\uffff\1\24\1\25\1\26",
            "\1\34\5\uffff\1\27\30\uffff\1\24\1\25\1\26",
            "\1\uffff",
            "\1\54\1\55\1\52\1\uffff\1\53\1\51",
            "\1\64\77\uffff\1\56\1\57\1\60\1\61\1\62\1\63",
            "\1\70\1\71\1\66\1\uffff\1\67\1\65",
            "\1\101\44\uffff\1\72\32\uffff\1\73\1\74\1\75\1\76\1\77\1\100",
            "\1\102",
            "\1\103",
            "\1\20\4\uffff\1\30\1\uffff\1\34\3\uffff\1\22\1\23\1\27\1\21"+
            "\27\uffff\1\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\34\3\uffff\1\22\1\23\1\27\1\21"+
            "\27\uffff\1\24\1\25\1\26",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\42",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\44\1\17\3\uffff\1\22\1\23\1\27\1\21\10"+
            "\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1\24"+
            "\1\25\1\26",
            "\1\20\4\uffff\1\30\1\44\1\17\3\uffff\1\22\1\23\1\27\1\21\10"+
            "\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1\24"+
            "\1\25\1\26",
            "\1\20\4\uffff\1\30\1\44\1\17\3\uffff\1\22\1\23\1\27\1\21\10"+
            "\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1\24"+
            "\1\25\1\26",
            "\1\20\4\uffff\1\30\1\44\1\17\3\uffff\1\22\1\23\1\27\1\21\10"+
            "\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1\24"+
            "\1\25\1\26",
            "\1\20\4\uffff\1\30\1\44\1\17\3\uffff\1\22\1\23\1\27\1\21\10"+
            "\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1\24"+
            "\1\25\1\26",
            "\1\112\77\uffff\1\104\1\105\1\106\1\107\1\110\1\111",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\113",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\16\uffff\1\24\1\25\1\26",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\114",
            "\1\46",
            "\1\125\67\uffff\1\122\1\123\1\uffff\1\116\1\uffff\1\117\7\uffff"+
            "\1\124\1\115\1\120\1\121",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26",
            "\1\20\4\uffff\1\30\1\uffff\1\17\3\uffff\1\22\1\23\1\27\1\21"+
            "\10\uffff\1\30\4\uffff\1\14\1\15\1\16\2\uffff\1\13\4\uffff\1"+
            "\24\1\25\1\26"
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
            return "323:2: ( ( (lv_annotations_0_0= ruleStringAnnotation ) )* 'region' ( (lv_id_2_0= RULE_ID ) )? ( (lv_label_3_0= RULE_STRING ) )? ':' ( ( (lv_variables_5_0= ruleVariable ) ) | ( (lv_signals_6_0= ruleSignal ) ) )* ( (lv_bodyText_7_0= ruleTextualCode ) )* )?";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_32 = input.LA(1);

                         
                        int index14_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16()) ) {s = 24;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index14_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\10\uffff";
    static final String DFA15_eofS =
        "\1\1\7\uffff";
    static final String DFA15_minS =
        "\1\12\1\uffff\1\12\1\4\1\uffff\1\4\2\12";
    static final String DFA15_maxS =
        "\1\62\1\uffff\1\62\1\4\1\uffff\1\5\2\62";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String DFA15_specialS =
        "\10\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\10\uffff\1\1\16"+
            "\uffff\3\4",
            "",
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\27\uffff\3\4",
            "\1\5",
            "",
            "\1\7\1\6",
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\27\uffff\3\4",
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\27\uffff\3\4"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 476:5: ( (lv_states_8_0= ruleState ) )*";
        }
    }
    static final String DFA22_eotS =
        "\10\uffff";
    static final String DFA22_eofS =
        "\1\1\7\uffff";
    static final String DFA22_minS =
        "\1\12\1\uffff\1\12\1\4\1\uffff\1\4\2\12";
    static final String DFA22_maxS =
        "\1\62\1\uffff\1\62\1\4\1\uffff\1\5\2\62";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String DFA22_specialS =
        "\10\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\10\uffff\1\1\16"+
            "\uffff\3\4",
            "",
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\27\uffff\3\4",
            "\1\5",
            "",
            "\1\7\1\6",
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\27\uffff\3\4",
            "\1\2\4\uffff\1\1\1\uffff\1\4\3\uffff\3\4\1\3\27\uffff\3\4"
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
            return "()+ loopback of 767:3: ( (lv_states_8_0= ruleState ) )+";
        }
    }
    static final String DFA36_eotS =
        "\10\uffff";
    static final String DFA36_eofS =
        "\1\1\7\uffff";
    static final String DFA36_minS =
        "\1\12\1\uffff\1\12\1\4\1\uffff\1\4\2\12";
    static final String DFA36_maxS =
        "\1\65\1\uffff\1\65\1\4\1\uffff\1\5\2\65";
    static final String DFA36_acceptS =
        "\1\uffff\1\2\2\uffff\1\1\3\uffff";
    static final String DFA36_specialS =
        "\10\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\2\4\uffff\1\1\1\uffff\1\1\3\uffff\3\1\1\3\10\uffff\1\1\16"+
            "\uffff\3\1\3\4",
            "",
            "\1\2\4\uffff\1\1\1\uffff\1\1\3\uffff\3\1\1\3\27\uffff\3\1\3"+
            "\4",
            "\1\5",
            "",
            "\1\7\1\6",
            "\1\2\4\uffff\1\1\1\uffff\1\1\3\uffff\3\1\1\3\27\uffff\3\1\3"+
            "\4",
            "\1\2\4\uffff\1\1\1\uffff\1\1\3\uffff\3\1\1\3\27\uffff\3\1\3"+
            "\4"
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
            return "()* loopback of 1326:4: ( (lv_outgoingTransitions_31_0= ruleTransition ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRootRegion_in_entryRuleRootRegion81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRootRegion91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportAnnotation_in_ruleRootRegion137 = new BitSet(new long[]{0x0007800001E28402L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleRootRegion160 = new BitSet(new long[]{0x0000000001008400L});
        public static final BitSet FOLLOW_15_in_ruleRootRegion171 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRootRegion188 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRootRegion211 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRootRegion227 = new BitSet(new long[]{0x000709C001E20402L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRootRegion249 = new BitSet(new long[]{0x000709C001E20402L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleRootRegion276 = new BitSet(new long[]{0x000709C001E20402L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleRootRegion299 = new BitSet(new long[]{0x0007000001E20402L});
        public static final BitSet FOLLOW_ruleState_in_ruleRootRegion323 = new BitSet(new long[]{0x0007000001E20402L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_entryRuleSingleRegion360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleRegion370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleSingleRegion417 = new BitSet(new long[]{0x0000000001008400L});
        public static final BitSet FOLLOW_15_in_ruleSingleRegion428 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSingleRegion445 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleRegion468 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSingleRegion484 = new BitSet(new long[]{0x000709C001E20402L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleSingleRegion506 = new BitSet(new long[]{0x000709C001E20402L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleSingleRegion533 = new BitSet(new long[]{0x000709C001E20402L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleSingleRegion556 = new BitSet(new long[]{0x0007000001E20402L});
        public static final BitSet FOLLOW_ruleState_in_ruleSingleRegion580 = new BitSet(new long[]{0x0007000001E20402L});
        public static final BitSet FOLLOW_ruleTextualCode_in_entryRuleTextualCode617 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextualCode627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleTextualCode662 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTextualCode672 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleTextualCode683 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextualCode700 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTextualCode715 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTextualCode727 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextualCode744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRegion_in_entryRuleRegion785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRegion795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleRegion841 = new BitSet(new long[]{0x0000000001008400L});
        public static final BitSet FOLLOW_15_in_ruleRegion852 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRegion869 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleRegion892 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRegion908 = new BitSet(new long[]{0x000709C001E20400L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleRegion930 = new BitSet(new long[]{0x000709C001E20400L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleRegion957 = new BitSet(new long[]{0x000709C001E20400L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleRegion980 = new BitSet(new long[]{0x0007000001E20400L});
        public static final BitSet FOLLOW_ruleState_in_ruleRegion1002 = new BitSet(new long[]{0x0007000001E20402L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState1039 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleState1095 = new BitSet(new long[]{0x0007000001E20400L});
        public static final BitSet FOLLOW_21_in_ruleState1116 = new BitSet(new long[]{0x0007000000C20000L});
        public static final BitSet FOLLOW_22_in_ruleState1147 = new BitSet(new long[]{0x0007000000820000L});
        public static final BitSet FOLLOW_22_in_ruleState1187 = new BitSet(new long[]{0x0007000000A20000L});
        public static final BitSet FOLLOW_21_in_ruleState1218 = new BitSet(new long[]{0x0007000000820000L});
        public static final BitSet FOLLOW_ruleStateType_in_ruleState1256 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleState1267 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1284 = new BitSet(new long[]{0x0038000011000422L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleState1306 = new BitSet(new long[]{0x0038000011000402L});
        public static final BitSet FOLLOW_24_in_ruleState1324 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleState1346 = new BitSet(new long[]{0x0038000003000402L});
        public static final BitSet FOLLOW_25_in_ruleState1357 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleState1378 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleState1389 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleState1410 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_27_in_ruleState1422 = new BitSet(new long[]{0x0038000001000402L});
        public static final BitSet FOLLOW_28_in_ruleState1442 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_ruleSignal_in_ruleState1465 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_ruleVariable_in_ruleState1492 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_29_in_ruleState1509 = new BitSet(new long[]{0x900709DBE1EA87D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1530 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_30_in_ruleState1548 = new BitSet(new long[]{0x900709DBE1EA87D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1569 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_31_in_ruleState1587 = new BitSet(new long[]{0x900709DBE1EA87D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1608 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_32_in_ruleState1626 = new BitSet(new long[]{0x900709DBE1EA87D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAction_in_ruleState1647 = new BitSet(new long[]{0x000709C3E1E28400L});
        public static final BitSet FOLLOW_ruleTextualCode_in_ruleState1671 = new BitSet(new long[]{0x0007000201E28400L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_ruleState1694 = new BitSet(new long[]{0x0000000201008400L});
        public static final BitSet FOLLOW_ruleRegion_in_ruleState1715 = new BitSet(new long[]{0x0000000201008400L});
        public static final BitSet FOLLOW_33_in_ruleState1729 = new BitSet(new long[]{0x0038000001000402L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState1753 = new BitSet(new long[]{0x0038000001000402L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1790 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_ruleTransition1846 = new BitSet(new long[]{0x0038000001000400L});
        public static final BitSet FOLLOW_ruleTransitionType_in_ruleTransition1868 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition1885 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1913 = new BitSet(new long[]{0x0000002400000002L});
        public static final BitSet FOLLOW_34_in_ruleTransition1924 = new BitSet(new long[]{0x90000038000803F2L,0x0000000000000012L});
        public static final BitSet FOLLOW_35_in_ruleTransition1944 = new BitSet(new long[]{0x90000030000803D2L,0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleTransition1975 = new BitSet(new long[]{0x90000030000803D2L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleTransition2002 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_36_in_ruleTransition2014 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2035 = new BitSet(new long[]{0x0000002004000002L});
        public static final BitSet FOLLOW_26_in_ruleTransition2046 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleTransition2067 = new BitSet(new long[]{0x0000002004000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTransition2095 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleTransition2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal2171 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignal2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSignal2224 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_39_in_ruleSignal2256 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleSignal2280 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSignal2297 = new BitSet(new long[]{0x0000020000010002L});
        public static final BitSet FOLLOW_41_in_ruleSignal2313 = new BitSet(new long[]{0x0000000000000370L});
        public static final BitSet FOLLOW_ruleAnyType_in_ruleSignal2334 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleSignal2348 = new BitSet(new long[]{0x0000000000000020L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleSignal2417 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleSignal2427 = new BitSet(new long[]{0x0000000000000020L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleSignal2449 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2472 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleSignal2488 = new BitSet(new long[]{0x6000000000000020L,0x0000000000003C05L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleSignal2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSignal2533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2578 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariable2588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleVariable2623 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleVariable2640 = new BitSet(new long[]{0x0000020000010000L});
        public static final BitSet FOLLOW_41_in_ruleVariable2656 = new BitSet(new long[]{0x0000000000000370L});
        public static final BitSet FOLLOW_ruleAnyType_in_ruleVariable2677 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleVariable2689 = new BitSet(new long[]{0x0000000000000020L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleVariable2711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleVariable2734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstitution_in_entryRuleSubstitution2776 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution2828 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleSubstitution2843 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution2860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAction_in_entryRuleAction2901 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAction2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAction2966 = new BitSet(new long[]{0x90000010000803D2L,0x0000000000000012L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAction2997 = new BitSet(new long[]{0x90000010000803D2L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAction3024 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleAction3036 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleAction3057 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleAction3068 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_ruleEffect_in_ruleAction3089 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleEffect_in_entryRuleEffect3129 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEffect3139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_ruleEffect3189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_ruleEffect3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_ruleEffect3249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEmission_in_entryRuleEmission3284 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEmission3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEmission3341 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleEmission3352 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleEmission3373 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEmission3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment3478 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleAssignment3488 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment3509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextEffect_in_entryRuleTextEffect3545 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextEffect3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextEffect3597 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleTextEffect3613 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextEffect3630 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTextEffect3645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression3695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleExpression3745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleExpression3775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression3810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression3820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleBooleanExpression3869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression3903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression3913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression3963 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleOrOperator_in_ruleOrExpression3996 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4017 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression4055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression4065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression4115 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleAndOperator_in_ruleAndExpression4148 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_ruleAndExpression4169 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleCompareOperation_in_entryRuleCompareOperation4207 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompareOperation4217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4268 = new BitSet(new long[]{0x0FC0000000000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleCompareOperation4301 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_ruleCompareOperation4322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleCompareOperation4355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_entryRuleNotOrValuedExpression4390 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotOrValuedExpression4400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleNotOrValuedExpression4450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotOrValuedExpression4480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression4515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression4525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOperator_in_ruleNotExpression4584 = new BitSet(new long[]{0x9000000000080290L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleNotExpression4605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleNotExpression4637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_entryRuleValuedExpression4672 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedExpression4682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_ruleValuedExpression4731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddExpression_in_entryRuleAddExpression4765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddExpression4775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleAddOperator_in_ruleAddExpression4858 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleSubExpression_in_ruleAddExpression4879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleSubExpression_in_entryRuleSubExpression4917 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubExpression4927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression4977 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleSubExpression5010 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleMultExpression_in_ruleSubExpression5031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultExpression_in_entryRuleMultExpression5069 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultExpression5079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression5129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleMultOperator_in_ruleMultExpression5162 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleDivExpression_in_ruleMultExpression5183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleDivExpression_in_entryRuleDivExpression5221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDivExpression5231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5281 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_ruleDivExpression5314 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleModExpression_in_ruleDivExpression5335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleModExpression_in_entryRuleModExpression5373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModExpression5383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleModExpression5433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_ruleModOperator_in_ruleModExpression5466 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleModExpression5487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNegExpression_in_entryRuleNegExpression5525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNegExpression5535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubOperator_in_ruleNegExpression5594 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNegExpression_in_ruleNegExpression5615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_ruleNegExpression5647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_entryRuleAtomicExpression5682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpression5692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_ruleAtomicExpression5742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleAtomicExpression5772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAtomicExpression5788 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAtomicExpression5813 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAtomicExpression5822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_ruleAtomicExpression5854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicValuedExpression_in_entryRuleAtomicValuedExpression5889 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtomicValuedExpression5899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_ruleAtomicValuedExpression5949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_ruleAtomicValuedExpression5979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleAtomicValuedExpression5995 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_ruleAtomicValuedExpression6020 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAtomicValuedExpression6029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtomicExpression_in_ruleAtomicValuedExpression6061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_entryRuleValuedObjectTestExpression6096 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectTestExpression6106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePreOperator_in_ruleValuedObjectTestExpression6165 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleValuedObjectTestExpression6175 = new BitSet(new long[]{0x1000000000000010L,0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObjectTestExpression_in_ruleValuedObjectTestExpression6196 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleValuedObjectTestExpression6206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueTestOperator_in_ruleValuedObjectTestExpression6247 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_ruleValuedObjectTestExpression6300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedObjectReference_in_entryRuleValuedObjectReference6335 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValuedObjectReference6345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValuedObjectReference6391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextExpression_in_entryRuleTextExpression6426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextExpression6436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_HOSTCODE_in_ruleTextExpression6478 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleTextExpression6494 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextExpression6511 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTextExpression6526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue6564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntValue6574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue6615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue6655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue6665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleFloatValue6706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue6746 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue6756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue6797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnyType_in_entryRuleAnyType6838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnyType6849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnyType6889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleAnyType6915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_FLOAT_in_ruleAnyType6941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnyType6967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnyType6993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDeclaration_in_entryRuleInterfaceDeclaration7038 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDeclaration7048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_ruleInterfaceDeclaration7098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_ruleInterfaceDeclaration7128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleISignal_in_entryRuleISignal7163 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleISignal7173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleISignal7215 = new BitSet(new long[]{0x0000020000090002L});
        public static final BitSet FOLLOW_ruleChannelDescription_in_ruleISignal7241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceSignalDecl_in_entryRuleInterfaceSignalDecl7278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceSignalDecl7288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleInterfaceSignalDecl7336 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7357 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceSignalDecl7368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7389 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_44_in_ruleInterfaceSignalDecl7401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleInterfaceSignalDecl7431 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7452 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceSignalDecl7463 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7484 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_44_in_ruleInterfaceSignalDecl7496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleInterfaceSignalDecl7526 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7547 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceSignalDecl7558 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7579 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_44_in_ruleInterfaceSignalDecl7591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleInterfaceSignalDecl7621 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7642 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceSignalDecl7653 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleISignal_in_ruleInterfaceSignalDecl7674 = new BitSet(new long[]{0x0000100004000000L});
        public static final BitSet FOLLOW_44_in_ruleInterfaceSignalDecl7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription7723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChannelDescription7733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleChannelDescription7769 = new BitSet(new long[]{0x0000040000000010L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleChannelDescription7808 = new BitSet(new long[]{0x0000040000000010L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7829 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleChannelDescription7839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleChannelDescription7857 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleChannelDescription7878 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleChannelDescription7888 = new BitSet(new long[]{0x0000040000000010L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleChannelDescription7909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceVariableDecl_in_entryRuleInterfaceVariableDecl7946 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceVariableDecl7956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleInterfaceVariableDecl7991 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl8012 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceVariableDecl8023 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_ruleInterfaceVariableDecl8044 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl8082 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl8092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl8138 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_26_in_ruleVariableDecl8149 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleIVariable_in_ruleVariableDecl8170 = new BitSet(new long[]{0x0000000004010000L});
        public static final BitSet FOLLOW_16_in_ruleVariableDecl8182 = new BitSet(new long[]{0x0000040000000010L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_ruleVariableDecl8203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIVariable_in_entryRuleIVariable8239 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIVariable8249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIVariable8291 = new BitSet(new long[]{0x0000020000000002L});
        public static final BitSet FOLLOW_41_in_ruleIVariable8307 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIVariable8328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeIdentifier_in_entryRuleTypeIdentifier8366 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdentifier8376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier8422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier8445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTypeIdentifier8467 = new BitSet(new long[]{0x0000000000000010L,0x00000000000007E0L});
        public static final BitSet FOLLOW_ruleValueType_in_ruleTypeIdentifier8489 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeIdentifier8512 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTypeIdentifier8528 = new BitSet(new long[]{0x6000000000000000L,0x0000000000003C05L});
        public static final BitSet FOLLOW_ruleCombineOperator_in_ruleTypeIdentifier8549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_entryRuleStringAnnotation8586 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringAnnotation8596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_ruleStringAnnotation8646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_ruleStringAnnotation8676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation8711 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation8721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_ruleCommentAnnotation8762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleKeyValueAnnotation_in_entryRuleKeyValueAnnotation8802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleKeyValueAnnotation8812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleKeyValueAnnotation8847 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleKeyValueAnnotation8864 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleKeyValueAnnotation8890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImportAnnotation_in_entryRuleImportAnnotation8926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImportAnnotation8936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleImportAnnotation8971 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleImportAnnotation8988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString9030 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString9041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString9081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString9107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleStateType9164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleStateType9179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleStateType9194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleStateType9209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTransitionType9252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTransitionType9267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTransitionType9282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleDivOperator9324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCompareOperator9366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleCompareOperator9381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleCompareOperator9396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleCompareOperator9411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleCompareOperator9426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleCompareOperator9441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_rulePreOperator9483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleOrOperator9524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleAndOperator9565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleNotOperator9606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleAddOperator9647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleSubOperator9688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleMultOperator9729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleModOperator9770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleValueTestOperator9811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleValueType9853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleValueType9868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleValueType9883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleValueType9898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleValueType9913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleValueType9928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleCombineOperator9971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleCombineOperator9986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleCombineOperator10001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleCombineOperator10016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleCombineOperator10031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleCombineOperator10046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleCombineOperator10061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleCombineOperator10076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringAnnotation_in_synpred16417 = new BitSet(new long[]{0x0000000001008400L});
        public static final BitSet FOLLOW_15_in_synpred16428 = new BitSet(new long[]{0x0000000000010030L});
        public static final BitSet FOLLOW_RULE_ID_in_synpred16445 = new BitSet(new long[]{0x0000000000010020L});
        public static final BitSet FOLLOW_RULE_STRING_in_synpred16468 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_synpred16484 = new BitSet(new long[]{0x000009C000020002L});
        public static final BitSet FOLLOW_ruleVariable_in_synpred16506 = new BitSet(new long[]{0x000009C000020002L});
        public static final BitSet FOLLOW_ruleSignal_in_synpred16533 = new BitSet(new long[]{0x000009C000020002L});
        public static final BitSet FOLLOW_ruleTextualCode_in_synpred16556 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_ruleSingleRegion_in_synpred441694 = new BitSet(new long[]{0x0000000001008402L});
        public static final BitSet FOLLOW_ruleRegion_in_synpred441715 = new BitSet(new long[]{0x0000000001008402L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred501975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_synpred682997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanExpression_in_synpred763745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred794268 = new BitSet(new long[]{0x0FC0000000000000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_synpred794301 = new BitSet(new long[]{0x90000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleNotOrValuedExpression_in_synpred794322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred804450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDivOperator_in_synpred855314 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleModExpression_in_synpred855335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_synpred935995 = new BitSet(new long[]{0x10000000000803D0L,0x0000000000000012L});
        public static final BitSet FOLLOW_ruleValuedExpression_in_synpred936020 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_synpred936029 = new BitSet(new long[]{0x0000000000000002L});
    }


}