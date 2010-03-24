package de.cau.cs.kieler.quartz.editor.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import de.cau.cs.kieler.quartz.editor.services.QuartzGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalQuartzParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BVCONST", "RULE_OCTCONST", "RULE_HEXCONST", "RULE_NATCONST", "RULE_REALCONST", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'package'", "';'", "'import'", "'.'", "'.*'", "'macro'", "'('", "')'", "'='", "'module'", "','", "'event'", "'mem'", "'bool'", "'real'", "'bv'", "'{'", "'}'", "'nat'", "'int'", "'['", "']'", "'?'", "'!'", "'mu'", "'nu'", "'_'", "'instant'", "'inside'", "'terminate'", "'true'", "'false'", "'+'", "'-'", "'abs'", "'sat'", "'der'", "'reverse'", "'::'", "'next'", "'nat2bv'", "'int2bv'", "'arr2bv'", "'tup2bv'", "'bv2nat'", "'bv2int'", "'nat2real'", "'int2real'", "'sin'", "'cos'", "'exp'", "'log'", "'sizeOf'", "'forall'", "'exists'", "'sum'", "'X'", "'G'", "'F'", "'PA'", "'PF'", "'PSX'", "'PMX'", "'E'", "'A'", "'[]'", "'<>'", "'[:]'", "'<:>'", "'fixpoints'", "'in'", "':'", "'emit'", "'<-'", "'assume'", "'assert'", "'do'", "'..'", "'||'", "'|||'", "'&&'", "'&&&'", "'nothing'", "'weak'", "'immediate'", "'abort'", "'when'", "'during'", "'final'", "'abstract'", "'case'", "'default'", "'choose'", "'while'", "'for'", "'if'", "'else'", "'let'", "'loop'", "'pause'", "'halt'", "'every'", "'not'", "'&'", "'and'", "'|'", "'or'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_BVCONST=5;
    public static final int RULE_OCTCONST=6;
    public static final int RULE_REALCONST=9;
    public static final int RULE_HEXCONST=7;
    public static final int RULE_NATCONST=8;
    public static final int RULE_WS=12;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;

        public InternalQuartzParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g"; }



     	private QuartzGrammarAccess grammarAccess;
     	
        public InternalQuartzParser(TokenStream input, IAstFactory factory, QuartzGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QrzFile";	
       	}
       	
       	@Override
       	protected QuartzGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleQrzFile
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:77:1: entryRuleQrzFile returns [EObject current=null] : iv_ruleQrzFile= ruleQrzFile EOF ;
    public final EObject entryRuleQrzFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQrzFile = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:78:2: (iv_ruleQrzFile= ruleQrzFile EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:79:2: iv_ruleQrzFile= ruleQrzFile EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQrzFileRule(), currentNode); 
            pushFollow(FOLLOW_ruleQrzFile_in_entryRuleQrzFile75);
            iv_ruleQrzFile=ruleQrzFile();
            _fsp--;

             current =iv_ruleQrzFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQrzFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQrzFile


    // $ANTLR start ruleQrzFile
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:86:1: ruleQrzFile returns [EObject current=null] : ( (this_PackagePath_0= rulePackagePath )? ( (lv_imports_1_0= ruleImportList ) )? ( (lv_macros_2_0= ruleMacroDef ) )* ( (lv_module_3_0= ruleQModule ) ) ) ;
    public final EObject ruleQrzFile() throws RecognitionException {
        EObject current = null;

        EObject this_PackagePath_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_macros_2_0 = null;

        EObject lv_module_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:91:6: ( ( (this_PackagePath_0= rulePackagePath )? ( (lv_imports_1_0= ruleImportList ) )? ( (lv_macros_2_0= ruleMacroDef ) )* ( (lv_module_3_0= ruleQModule ) ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:92:1: ( (this_PackagePath_0= rulePackagePath )? ( (lv_imports_1_0= ruleImportList ) )? ( (lv_macros_2_0= ruleMacroDef ) )* ( (lv_module_3_0= ruleQModule ) ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:92:1: ( (this_PackagePath_0= rulePackagePath )? ( (lv_imports_1_0= ruleImportList ) )? ( (lv_macros_2_0= ruleMacroDef ) )* ( (lv_module_3_0= ruleQModule ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:92:2: (this_PackagePath_0= rulePackagePath )? ( (lv_imports_1_0= ruleImportList ) )? ( (lv_macros_2_0= ruleMacroDef ) )* ( (lv_module_3_0= ruleQModule ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:92:2: (this_PackagePath_0= rulePackagePath )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:93:5: this_PackagePath_0= rulePackagePath
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getQrzFileAccess().getPackagePathParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePackagePath_in_ruleQrzFile133);
                    this_PackagePath_0=rulePackagePath();
                    _fsp--;

                     
                            current = this_PackagePath_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:101:3: ( (lv_imports_1_0= ruleImportList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:102:1: (lv_imports_1_0= ruleImportList )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:102:1: (lv_imports_1_0= ruleImportList )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:103:3: lv_imports_1_0= ruleImportList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQrzFileAccess().getImportsImportListParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleImportList_in_ruleQrzFile155);
                    lv_imports_1_0=ruleImportList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQrzFileRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"imports",
                    	        		lv_imports_1_0, 
                    	        		"ImportList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:125:3: ( (lv_macros_2_0= ruleMacroDef ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:126:1: (lv_macros_2_0= ruleMacroDef )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:126:1: (lv_macros_2_0= ruleMacroDef )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:127:3: lv_macros_2_0= ruleMacroDef
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQrzFileAccess().getMacrosMacroDefParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMacroDef_in_ruleQrzFile177);
            	    lv_macros_2_0=ruleMacroDef();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQrzFileRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"macros",
            	    	        		lv_macros_2_0, 
            	    	        		"MacroDef", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:149:3: ( (lv_module_3_0= ruleQModule ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:150:1: (lv_module_3_0= ruleQModule )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:150:1: (lv_module_3_0= ruleQModule )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:151:3: lv_module_3_0= ruleQModule
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQrzFileAccess().getModuleQModuleParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQModule_in_ruleQrzFile199);
            lv_module_3_0=ruleQModule();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQrzFileRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"module",
            	        		lv_module_3_0, 
            	        		"QModule", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQrzFile


    // $ANTLR start entryRulePackagePath
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:181:1: entryRulePackagePath returns [EObject current=null] : iv_rulePackagePath= rulePackagePath EOF ;
    public final EObject entryRulePackagePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagePath = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:182:2: (iv_rulePackagePath= rulePackagePath EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:183:2: iv_rulePackagePath= rulePackagePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPackagePathRule(), currentNode); 
            pushFollow(FOLLOW_rulePackagePath_in_entryRulePackagePath235);
            iv_rulePackagePath=rulePackagePath();
            _fsp--;

             current =iv_rulePackagePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePackagePath245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePackagePath


    // $ANTLR start rulePackagePath
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:190:1: rulePackagePath returns [EObject current=null] : ( 'package' this_PointedName_1= rulePointedName ';' ) ;
    public final EObject rulePackagePath() throws RecognitionException {
        EObject current = null;

        EObject this_PointedName_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:195:6: ( ( 'package' this_PointedName_1= rulePointedName ';' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:196:1: ( 'package' this_PointedName_1= rulePointedName ';' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:196:1: ( 'package' this_PointedName_1= rulePointedName ';' )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:196:3: 'package' this_PointedName_1= rulePointedName ';'
            {
            match(input,13,FOLLOW_13_in_rulePackagePath280); 

                    createLeafNode(grammarAccess.getPackagePathAccess().getPackageKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getPackagePathAccess().getPointedNameParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_rulePointedName_in_rulePackagePath302);
            this_PointedName_1=rulePointedName();
            _fsp--;

             
                    current = this_PointedName_1; 
                    currentNode = currentNode.getParent();
                
            match(input,14,FOLLOW_14_in_rulePackagePath311); 

                    createLeafNode(grammarAccess.getPackagePathAccess().getSemicolonKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePackagePath


    // $ANTLR start entryRuleImportList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:221:1: entryRuleImportList returns [EObject current=null] : iv_ruleImportList= ruleImportList EOF ;
    public final EObject entryRuleImportList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:222:2: (iv_ruleImportList= ruleImportList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:223:2: iv_ruleImportList= ruleImportList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportListRule(), currentNode); 
            pushFollow(FOLLOW_ruleImportList_in_entryRuleImportList347);
            iv_ruleImportList=ruleImportList();
            _fsp--;

             current =iv_ruleImportList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportList357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImportList


    // $ANTLR start ruleImportList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:230:1: ruleImportList returns [EObject current=null] : ( 'import' ( (lv_imp_1_0= rulePointedName ) ) ';' )+ ;
    public final EObject ruleImportList() throws RecognitionException {
        EObject current = null;

        EObject lv_imp_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:235:6: ( ( 'import' ( (lv_imp_1_0= rulePointedName ) ) ';' )+ )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:236:1: ( 'import' ( (lv_imp_1_0= rulePointedName ) ) ';' )+
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:236:1: ( 'import' ( (lv_imp_1_0= rulePointedName ) ) ';' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:236:3: 'import' ( (lv_imp_1_0= rulePointedName ) ) ';'
            	    {
            	    match(input,15,FOLLOW_15_in_ruleImportList392); 

            	            createLeafNode(grammarAccess.getImportListAccess().getImportKeyword_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:240:1: ( (lv_imp_1_0= rulePointedName ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:241:1: (lv_imp_1_0= rulePointedName )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:241:1: (lv_imp_1_0= rulePointedName )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:242:3: lv_imp_1_0= rulePointedName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getImportListAccess().getImpPointedNameParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePointedName_in_ruleImportList413);
            	    lv_imp_1_0=rulePointedName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getImportListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imp",
            	    	        		lv_imp_1_0, 
            	    	        		"PointedName", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,14,FOLLOW_14_in_ruleImportList423); 

            	            createLeafNode(grammarAccess.getImportListAccess().getSemicolonKeyword_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImportList


    // $ANTLR start entryRulePointedName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:276:1: entryRulePointedName returns [EObject current=null] : iv_rulePointedName= rulePointedName EOF ;
    public final EObject entryRulePointedName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePointedName = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:277:2: (iv_rulePointedName= rulePointedName EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:278:2: iv_rulePointedName= rulePointedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPointedNameRule(), currentNode); 
            pushFollow(FOLLOW_rulePointedName_in_entryRulePointedName460);
            iv_rulePointedName=rulePointedName();
            _fsp--;

             current =iv_rulePointedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointedName470); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePointedName


    // $ANTLR start rulePointedName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:285:1: rulePointedName returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) ( '.' ( (lv_name_2_0= rulePointedName ) ) )* ( (lv_all_3_0= '.*' ) ) ) ;
    public final EObject rulePointedName() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_all_3_0=null;
        EObject lv_name_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:290:6: ( ( ( (lv_id_0_0= RULE_ID ) ) ( '.' ( (lv_name_2_0= rulePointedName ) ) )* ( (lv_all_3_0= '.*' ) ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:291:1: ( ( (lv_id_0_0= RULE_ID ) ) ( '.' ( (lv_name_2_0= rulePointedName ) ) )* ( (lv_all_3_0= '.*' ) ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:291:1: ( ( (lv_id_0_0= RULE_ID ) ) ( '.' ( (lv_name_2_0= rulePointedName ) ) )* ( (lv_all_3_0= '.*' ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:291:2: ( (lv_id_0_0= RULE_ID ) ) ( '.' ( (lv_name_2_0= rulePointedName ) ) )* ( (lv_all_3_0= '.*' ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:291:2: ( (lv_id_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:292:1: (lv_id_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:292:1: (lv_id_0_0= RULE_ID )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:293:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePointedName512); 

            			createLeafNode(grammarAccess.getPointedNameAccess().getIdIDTerminalRuleCall_0_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPointedNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:315:2: ( '.' ( (lv_name_2_0= rulePointedName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:315:4: '.' ( (lv_name_2_0= rulePointedName ) )
            	    {
            	    match(input,16,FOLLOW_16_in_rulePointedName528); 

            	            createLeafNode(grammarAccess.getPointedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:319:1: ( (lv_name_2_0= rulePointedName ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:320:1: (lv_name_2_0= rulePointedName )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:320:1: (lv_name_2_0= rulePointedName )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:321:3: lv_name_2_0= rulePointedName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPointedNameAccess().getNamePointedNameParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePointedName_in_rulePointedName549);
            	    lv_name_2_0=rulePointedName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPointedNameRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_2_0, 
            	    	        		"PointedName", 
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
            	    break loop5;
                }
            } while (true);

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:343:4: ( (lv_all_3_0= '.*' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:344:1: (lv_all_3_0= '.*' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:344:1: (lv_all_3_0= '.*' )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:345:3: lv_all_3_0= '.*'
            {
            lv_all_3_0=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_rulePointedName569); 

                    createLeafNode(grammarAccess.getPointedNameAccess().getAllFullStopAsteriskKeyword_2_0(), "all"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPointedNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "all", true, ".*", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePointedName


    // $ANTLR start entryRuleMacroDef
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:372:1: entryRuleMacroDef returns [EObject current=null] : iv_ruleMacroDef= ruleMacroDef EOF ;
    public final EObject entryRuleMacroDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacroDef = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:373:2: (iv_ruleMacroDef= ruleMacroDef EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:374:2: iv_ruleMacroDef= ruleMacroDef EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMacroDefRule(), currentNode); 
            pushFollow(FOLLOW_ruleMacroDef_in_entryRuleMacroDef618);
            iv_ruleMacroDef=ruleMacroDef();
            _fsp--;

             current =iv_ruleMacroDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMacroDef628); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMacroDef


    // $ANTLR start ruleMacroDef
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:381:1: ruleMacroDef returns [EObject current=null] : ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) ) ;
    public final EObject ruleMacroDef() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_args_3_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_name_9_0 = null;

        EObject lv_expr_13_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:386:6: ( ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:387:1: ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:387:1: ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==19) ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==20) ) {
                            alt6=2;
                        }
                        else if ( (LA6_3==RULE_ID) ) {
                            alt6=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("387:1: ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) )", 6, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("387:1: ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) )", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("387:1: ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) )", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("387:1: ( ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' ) | ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:387:2: ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:387:2: ( 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:387:4: 'macro' ( (lv_name_1_0= ruleQName ) ) '(' ( (lv_args_3_0= ruleQNameList ) ) ')' '=' ( (lv_expr_6_0= ruleUtyExpr ) ) ';'
                    {
                    match(input,18,FOLLOW_18_in_ruleMacroDef664); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getMacroKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:391:1: ( (lv_name_1_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:392:1: (lv_name_1_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:392:1: (lv_name_1_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:393:3: lv_name_1_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMacroDefAccess().getNameQNameParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleMacroDef685);
                    lv_name_1_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMacroDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_1_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleMacroDef695); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:419:1: ( (lv_args_3_0= ruleQNameList ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:420:1: (lv_args_3_0= ruleQNameList )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:420:1: (lv_args_3_0= ruleQNameList )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:421:3: lv_args_3_0= ruleQNameList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMacroDefAccess().getArgsQNameListParserRuleCall_0_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQNameList_in_ruleMacroDef716);
                    lv_args_3_0=ruleQNameList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMacroDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"args",
                    	        		lv_args_3_0, 
                    	        		"QNameList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleMacroDef726); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getRightParenthesisKeyword_0_4(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleMacroDef736); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getEqualsSignKeyword_0_5(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:451:1: ( (lv_expr_6_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:452:1: (lv_expr_6_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:452:1: (lv_expr_6_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:453:3: lv_expr_6_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMacroDefAccess().getExprUtyExprParserRuleCall_0_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleMacroDef757);
                    lv_expr_6_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMacroDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_6_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleMacroDef767); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getSemicolonKeyword_0_7(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:480:6: ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:480:6: ( 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:480:8: 'macro' ( (lv_name_9_0= ruleQName ) ) '(' ')' '=' ( (lv_expr_13_0= ruleUtyExpr ) ) ';'
                    {
                    match(input,18,FOLLOW_18_in_ruleMacroDef785); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getMacroKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:484:1: ( (lv_name_9_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:485:1: (lv_name_9_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:485:1: (lv_name_9_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:486:3: lv_name_9_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMacroDefAccess().getNameQNameParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleMacroDef806);
                    lv_name_9_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMacroDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_9_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleMacroDef816); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getLeftParenthesisKeyword_1_2(), null); 
                        
                    match(input,20,FOLLOW_20_in_ruleMacroDef826); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getRightParenthesisKeyword_1_3(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleMacroDef836); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getEqualsSignKeyword_1_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:520:1: ( (lv_expr_13_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:521:1: (lv_expr_13_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:521:1: (lv_expr_13_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:522:3: lv_expr_13_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMacroDefAccess().getExprUtyExprParserRuleCall_1_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleMacroDef857);
                    lv_expr_13_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMacroDefRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_13_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,14,FOLLOW_14_in_ruleMacroDef867); 

                            createLeafNode(grammarAccess.getMacroDefAccess().getSemicolonKeyword_1_6(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleMacroDef


    // $ANTLR start entryRuleQModule
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:556:1: entryRuleQModule returns [EObject current=null] : iv_ruleQModule= ruleQModule EOF ;
    public final EObject entryRuleQModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQModule = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:557:2: (iv_ruleQModule= ruleQModule EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:558:2: iv_ruleQModule= ruleQModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleQModule_in_entryRuleQModule904);
            iv_ruleQModule=ruleQModule();
            _fsp--;

             current =iv_ruleQModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQModule914); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQModule


    // $ANTLR start ruleQModule
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:565:1: ruleQModule returns [EObject current=null] : ( 'module' ( (lv_name_1_0= ruleName ) ) '(' ( (lv_intf_3_0= ruleInterfaceList ) ) ')' ( (lv_stmt_5_0= ruleLocStmt ) )? ) ;
    public final EObject ruleQModule() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_intf_3_0 = null;

        EObject lv_stmt_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:570:6: ( ( 'module' ( (lv_name_1_0= ruleName ) ) '(' ( (lv_intf_3_0= ruleInterfaceList ) ) ')' ( (lv_stmt_5_0= ruleLocStmt ) )? ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:571:1: ( 'module' ( (lv_name_1_0= ruleName ) ) '(' ( (lv_intf_3_0= ruleInterfaceList ) ) ')' ( (lv_stmt_5_0= ruleLocStmt ) )? )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:571:1: ( 'module' ( (lv_name_1_0= ruleName ) ) '(' ( (lv_intf_3_0= ruleInterfaceList ) ) ')' ( (lv_stmt_5_0= ruleLocStmt ) )? )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:571:3: 'module' ( (lv_name_1_0= ruleName ) ) '(' ( (lv_intf_3_0= ruleInterfaceList ) ) ')' ( (lv_stmt_5_0= ruleLocStmt ) )?
            {
            match(input,22,FOLLOW_22_in_ruleQModule949); 

                    createLeafNode(grammarAccess.getQModuleAccess().getModuleKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:575:1: ( (lv_name_1_0= ruleName ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:576:1: (lv_name_1_0= ruleName )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:576:1: (lv_name_1_0= ruleName )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:577:3: lv_name_1_0= ruleName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQModuleAccess().getNameNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleQModule970);
            lv_name_1_0=ruleName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"Name", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,19,FOLLOW_19_in_ruleQModule980); 

                    createLeafNode(grammarAccess.getQModuleAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:603:1: ( (lv_intf_3_0= ruleInterfaceList ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:604:1: (lv_intf_3_0= ruleInterfaceList )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:604:1: (lv_intf_3_0= ruleInterfaceList )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:605:3: lv_intf_3_0= ruleInterfaceList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQModuleAccess().getIntfInterfaceListParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInterfaceList_in_ruleQModule1001);
            lv_intf_3_0=ruleInterfaceList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"intf",
            	        		lv_intf_3_0, 
            	        		"InterfaceList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleQModule1011); 

                    createLeafNode(grammarAccess.getQModuleAccess().getRightParenthesisKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:631:1: ( (lv_stmt_5_0= ruleLocStmt ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:632:1: (lv_stmt_5_0= ruleLocStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:632:1: (lv_stmt_5_0= ruleLocStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:633:3: lv_stmt_5_0= ruleLocStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQModuleAccess().getStmtLocStmtParserRuleCall_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLocStmt_in_ruleQModule1032);
                    lv_stmt_5_0=ruleLocStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQModuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"stmt",
                    	        		lv_stmt_5_0, 
                    	        		"LocStmt", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQModule


    // $ANTLR start entryRuleName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:663:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:664:2: (iv_ruleName= ruleName EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:665:2: iv_ruleName= ruleName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1069);
            iv_ruleName=ruleName();
            _fsp--;

             current =iv_ruleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1079); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleName


    // $ANTLR start ruleName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:672:1: ruleName returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;

         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:677:6: ( ( (lv_id_0_0= RULE_ID ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:678:1: ( (lv_id_0_0= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:678:1: ( (lv_id_0_0= RULE_ID ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:679:1: (lv_id_0_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:679:1: (lv_id_0_0= RULE_ID )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:680:3: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleName1120); 

            			createLeafNode(grammarAccess.getNameAccess().getIdIDTerminalRuleCall_0(), "id"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getNameRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"id",
            	        		lv_id_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleName


    // $ANTLR start entryRuleQName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:710:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:711:2: (iv_ruleQName= ruleQName EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:712:2: iv_ruleQName= ruleQName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName1160);
            iv_ruleQName=ruleQName();
            _fsp--;

             current =iv_ruleQName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName1170); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQName


    // $ANTLR start ruleQName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:719:1: ruleQName returns [EObject current=null] : this_Name_0= ruleName ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        EObject this_Name_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:724:6: (this_Name_0= ruleName )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:726:5: this_Name_0= ruleName
            {
             
                    currentNode=createCompositeNode(grammarAccess.getQNameAccess().getNameParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleName_in_ruleQName1216);
            this_Name_0=ruleName();
            _fsp--;

             
                    current = this_Name_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQName


    // $ANTLR start entryRuleQNameList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:742:1: entryRuleQNameList returns [EObject current=null] : iv_ruleQNameList= ruleQNameList EOF ;
    public final EObject entryRuleQNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQNameList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:743:2: (iv_ruleQNameList= ruleQNameList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:744:2: iv_ruleQNameList= ruleQNameList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQNameListRule(), currentNode); 
            pushFollow(FOLLOW_ruleQNameList_in_entryRuleQNameList1250);
            iv_ruleQNameList=ruleQNameList();
            _fsp--;

             current =iv_ruleQNameList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNameList1260); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQNameList


    // $ANTLR start ruleQNameList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:751:1: ruleQNameList returns [EObject current=null] : ( ( (lv_name_0_0= ruleQName ) ) ( ',' ( (lv_names_2_0= ruleQName ) ) )* ) ;
    public final EObject ruleQNameList() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;

        EObject lv_names_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:756:6: ( ( ( (lv_name_0_0= ruleQName ) ) ( ',' ( (lv_names_2_0= ruleQName ) ) )* ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:757:1: ( ( (lv_name_0_0= ruleQName ) ) ( ',' ( (lv_names_2_0= ruleQName ) ) )* )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:757:1: ( ( (lv_name_0_0= ruleQName ) ) ( ',' ( (lv_names_2_0= ruleQName ) ) )* )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:757:2: ( (lv_name_0_0= ruleQName ) ) ( ',' ( (lv_names_2_0= ruleQName ) ) )*
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:757:2: ( (lv_name_0_0= ruleQName ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:758:1: (lv_name_0_0= ruleQName )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:758:1: (lv_name_0_0= ruleQName )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:759:3: lv_name_0_0= ruleQName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getQNameListAccess().getNameQNameParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleQNameList1306);
            lv_name_0_0=ruleQName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getQNameListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_0_0, 
            	        		"QName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:781:2: ( ',' ( (lv_names_2_0= ruleQName ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:781:4: ',' ( (lv_names_2_0= ruleQName ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleQNameList1317); 

            	            createLeafNode(grammarAccess.getQNameListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:785:1: ( (lv_names_2_0= ruleQName ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:786:1: (lv_names_2_0= ruleQName )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:786:1: (lv_names_2_0= ruleQName )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:787:3: lv_names_2_0= ruleQName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getQNameListAccess().getNamesQNameParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQName_in_ruleQNameList1338);
            	    lv_names_2_0=ruleQName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getQNameListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_2_0, 
            	    	        		"QName", 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQNameList


    // $ANTLR start entryRuleStorage
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:817:1: entryRuleStorage returns [String current=null] : iv_ruleStorage= ruleStorage EOF ;
    public final String entryRuleStorage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStorage = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:818:2: (iv_ruleStorage= ruleStorage EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:819:2: iv_ruleStorage= ruleStorage EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStorageRule(), currentNode); 
            pushFollow(FOLLOW_ruleStorage_in_entryRuleStorage1377);
            iv_ruleStorage=ruleStorage();
            _fsp--;

             current =iv_ruleStorage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStorage1388); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStorage


    // $ANTLR start ruleStorage
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:826:1: ruleStorage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'event' | kw= 'mem' ) ;
    public final AntlrDatatypeRuleToken ruleStorage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:831:6: ( (kw= 'event' | kw= 'mem' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:832:1: (kw= 'event' | kw= 'mem' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:832:1: (kw= 'event' | kw= 'mem' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("832:1: (kw= 'event' | kw= 'mem' )", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:833:2: kw= 'event'
                    {
                    kw=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruleStorage1426); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getStorageAccess().getEventKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:840:2: kw= 'mem'
                    {
                    kw=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleStorage1445); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getStorageAccess().getMemKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStorage


    // $ANTLR start entryRuleQType
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:853:1: entryRuleQType returns [EObject current=null] : iv_ruleQType= ruleQType EOF ;
    public final EObject entryRuleQType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQType = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:854:2: (iv_ruleQType= ruleQType EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:855:2: iv_ruleQType= ruleQType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleQType_in_entryRuleQType1485);
            iv_ruleQType=ruleQType();
            _fsp--;

             current =iv_ruleQType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQType1495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleQType


    // $ANTLR start ruleQType
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:862:1: ruleQType returns [EObject current=null] : ( ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) ) ( (lv_dims_17_0= ruleDimList ) )? ) ;
    public final EObject ruleQType() throws RecognitionException {
        EObject current = null;

        EObject lv_ta_5_0 = null;

        EObject lv_tb_10_0 = null;

        EObject lv_tc_15_0 = null;

        EObject lv_dims_17_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:867:6: ( ( ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) ) ( (lv_dims_17_0= ruleDimList ) )? ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:868:1: ( ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) ) ( (lv_dims_17_0= ruleDimList ) )? )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:868:1: ( ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) ) ( (lv_dims_17_0= ruleDimList ) )? )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:868:2: ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) ) ( (lv_dims_17_0= ruleDimList ) )?
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:868:2: ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==29) ) {
                    alt10=4;
                }
                else if ( (LA10_3==EOF||LA10_3==RULE_ID||LA10_3==16||LA10_3==33||(LA10_3>=35 && LA10_3<=36)) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("868:2: ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) )", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==29) ) {
                    alt10=6;
                }
                else if ( (LA10_4==EOF||LA10_4==RULE_ID||LA10_4==16||LA10_4==33||(LA10_4>=35 && LA10_4<=36)) ) {
                    alt10=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("868:2: ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) )", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA10_5 = input.LA(2);

                if ( (LA10_5==29) ) {
                    alt10=8;
                }
                else if ( (LA10_5==EOF||LA10_5==RULE_ID||LA10_5==16||LA10_5==33||(LA10_5>=35 && LA10_5<=36)) ) {
                    alt10=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("868:2: ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) )", 10, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("868:2: ( 'bool' | 'real' | 'bv' | ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' ) | 'nat' | ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' ) | 'int' | ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:868:4: 'bool'
                    {
                    match(input,26,FOLLOW_26_in_ruleQType1531); 

                            createLeafNode(grammarAccess.getQTypeAccess().getBoolKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:873:7: 'real'
                    {
                    match(input,27,FOLLOW_27_in_ruleQType1547); 

                            createLeafNode(grammarAccess.getQTypeAccess().getRealKeyword_0_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:878:7: 'bv'
                    {
                    match(input,28,FOLLOW_28_in_ruleQType1563); 

                            createLeafNode(grammarAccess.getQTypeAccess().getBvKeyword_0_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:883:6: ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:883:6: ( 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:883:8: 'bv' '{' ( (lv_ta_5_0= ruleUtyExpr ) ) '}'
                    {
                    match(input,28,FOLLOW_28_in_ruleQType1580); 

                            createLeafNode(grammarAccess.getQTypeAccess().getBvKeyword_0_3_0(), null); 
                        
                    match(input,29,FOLLOW_29_in_ruleQType1590); 

                            createLeafNode(grammarAccess.getQTypeAccess().getLeftCurlyBracketKeyword_0_3_1(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:891:1: ( (lv_ta_5_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:892:1: (lv_ta_5_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:892:1: (lv_ta_5_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:893:3: lv_ta_5_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQTypeAccess().getTaUtyExprParserRuleCall_0_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleQType1611);
                    lv_ta_5_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"ta",
                    	        		lv_ta_5_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,30,FOLLOW_30_in_ruleQType1621); 

                            createLeafNode(grammarAccess.getQTypeAccess().getRightCurlyBracketKeyword_0_3_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:920:7: 'nat'
                    {
                    match(input,31,FOLLOW_31_in_ruleQType1638); 

                            createLeafNode(grammarAccess.getQTypeAccess().getNatKeyword_0_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:925:6: ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:925:6: ( 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:925:8: 'nat' '{' ( (lv_tb_10_0= ruleUtyExpr ) ) '}'
                    {
                    match(input,31,FOLLOW_31_in_ruleQType1655); 

                            createLeafNode(grammarAccess.getQTypeAccess().getNatKeyword_0_5_0(), null); 
                        
                    match(input,29,FOLLOW_29_in_ruleQType1665); 

                            createLeafNode(grammarAccess.getQTypeAccess().getLeftCurlyBracketKeyword_0_5_1(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:933:1: ( (lv_tb_10_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:934:1: (lv_tb_10_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:934:1: (lv_tb_10_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:935:3: lv_tb_10_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQTypeAccess().getTbUtyExprParserRuleCall_0_5_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleQType1686);
                    lv_tb_10_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tb",
                    	        		lv_tb_10_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,30,FOLLOW_30_in_ruleQType1696); 

                            createLeafNode(grammarAccess.getQTypeAccess().getRightCurlyBracketKeyword_0_5_3(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:962:7: 'int'
                    {
                    match(input,32,FOLLOW_32_in_ruleQType1713); 

                            createLeafNode(grammarAccess.getQTypeAccess().getIntKeyword_0_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:967:6: ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:967:6: ( 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:967:8: 'int' '{' ( (lv_tc_15_0= ruleUtyExpr ) ) '}'
                    {
                    match(input,32,FOLLOW_32_in_ruleQType1730); 

                            createLeafNode(grammarAccess.getQTypeAccess().getIntKeyword_0_7_0(), null); 
                        
                    match(input,29,FOLLOW_29_in_ruleQType1740); 

                            createLeafNode(grammarAccess.getQTypeAccess().getLeftCurlyBracketKeyword_0_7_1(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:975:1: ( (lv_tc_15_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:976:1: (lv_tc_15_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:976:1: (lv_tc_15_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:977:3: lv_tc_15_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQTypeAccess().getTcUtyExprParserRuleCall_0_7_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleQType1761);
                    lv_tc_15_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tc",
                    	        		lv_tc_15_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,30,FOLLOW_30_in_ruleQType1771); 

                            createLeafNode(grammarAccess.getQTypeAccess().getRightCurlyBracketKeyword_0_7_3(), null); 
                        

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1003:3: ( (lv_dims_17_0= ruleDimList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1004:1: (lv_dims_17_0= ruleDimList )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1004:1: (lv_dims_17_0= ruleDimList )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1005:3: lv_dims_17_0= ruleDimList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getQTypeAccess().getDimsDimListParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDimList_in_ruleQType1794);
                    lv_dims_17_0=ruleDimList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getQTypeRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"dims",
                    	        		lv_dims_17_0, 
                    	        		"DimList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleQType


    // $ANTLR start entryRuleDimList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1037:1: entryRuleDimList returns [EObject current=null] : iv_ruleDimList= ruleDimList EOF ;
    public final EObject entryRuleDimList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1038:2: (iv_ruleDimList= ruleDimList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1039:2: iv_ruleDimList= ruleDimList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDimListRule(), currentNode); 
            pushFollow(FOLLOW_ruleDimList_in_entryRuleDimList1833);
            iv_ruleDimList=ruleDimList();
            _fsp--;

             current =iv_ruleDimList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDimList1843); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDimList


    // $ANTLR start ruleDimList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1046:1: ruleDimList returns [EObject current=null] : ( '[' ( (lv_expr_1_0= ruleUtyExpr ) ) ']' )+ ;
    public final EObject ruleDimList() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1051:6: ( ( '[' ( (lv_expr_1_0= ruleUtyExpr ) ) ']' )+ )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1052:1: ( '[' ( (lv_expr_1_0= ruleUtyExpr ) ) ']' )+
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1052:1: ( '[' ( (lv_expr_1_0= ruleUtyExpr ) ) ']' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1052:3: '[' ( (lv_expr_1_0= ruleUtyExpr ) ) ']'
            	    {
            	    match(input,33,FOLLOW_33_in_ruleDimList1878); 

            	            createLeafNode(grammarAccess.getDimListAccess().getLeftSquareBracketKeyword_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1056:1: ( (lv_expr_1_0= ruleUtyExpr ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1057:1: (lv_expr_1_0= ruleUtyExpr )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1057:1: (lv_expr_1_0= ruleUtyExpr )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1058:3: lv_expr_1_0= ruleUtyExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getDimListAccess().getExprUtyExprParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUtyExpr_in_ruleDimList1899);
            	    lv_expr_1_0=ruleUtyExpr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getDimListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"expr",
            	    	        		lv_expr_1_0, 
            	    	        		"UtyExpr", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,34,FOLLOW_34_in_ruleDimList1909); 

            	            createLeafNode(grammarAccess.getDimListAccess().getRightSquareBracketKeyword_2(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDimList


    // $ANTLR start entryRuleInOutName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1092:1: entryRuleInOutName returns [EObject current=null] : iv_ruleInOutName= ruleInOutName EOF ;
    public final EObject entryRuleInOutName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutName = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1093:2: (iv_ruleInOutName= ruleInOutName EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1094:2: iv_ruleInOutName= ruleInOutName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInOutNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleInOutName_in_entryRuleInOutName1946);
            iv_ruleInOutName=ruleInOutName();
            _fsp--;

             current =iv_ruleInOutName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutName1956); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInOutName


    // $ANTLR start ruleInOutName
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1101:1: ruleInOutName returns [EObject current=null] : ( ( '?' | '!' )? this_QName_2= ruleQName ) ;
    public final EObject ruleInOutName() throws RecognitionException {
        EObject current = null;

        EObject this_QName_2 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1106:6: ( ( ( '?' | '!' )? this_QName_2= ruleQName ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1107:1: ( ( '?' | '!' )? this_QName_2= ruleQName )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1107:1: ( ( '?' | '!' )? this_QName_2= ruleQName )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1107:2: ( '?' | '!' )? this_QName_2= ruleQName
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1107:2: ( '?' | '!' )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1107:4: '?'
                    {
                    match(input,35,FOLLOW_35_in_ruleInOutName1992); 

                            createLeafNode(grammarAccess.getInOutNameAccess().getQuestionMarkKeyword_0_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1112:7: '!'
                    {
                    match(input,36,FOLLOW_36_in_ruleInOutName2008); 

                            createLeafNode(grammarAccess.getInOutNameAccess().getExclamationMarkKeyword_0_1(), null); 
                        

                    }
                    break;

            }

             
                    currentNode=createCompositeNode(grammarAccess.getInOutNameAccess().getQNameParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleInOutName2032);
            this_QName_2=ruleQName();
            _fsp--;

             
                    current = this_QName_2; 
                    currentNode = currentNode.getParent();
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInOutName


    // $ANTLR start entryRuleInOutNameList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1133:1: entryRuleInOutNameList returns [EObject current=null] : iv_ruleInOutNameList= ruleInOutNameList EOF ;
    public final EObject entryRuleInOutNameList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutNameList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1134:2: (iv_ruleInOutNameList= ruleInOutNameList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1135:2: iv_ruleInOutNameList= ruleInOutNameList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInOutNameListRule(), currentNode); 
            pushFollow(FOLLOW_ruleInOutNameList_in_entryRuleInOutNameList2067);
            iv_ruleInOutNameList=ruleInOutNameList();
            _fsp--;

             current =iv_ruleInOutNameList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutNameList2077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInOutNameList


    // $ANTLR start ruleInOutNameList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1142:1: ruleInOutNameList returns [EObject current=null] : (this_InOutName_0= ruleInOutName ( ',' ( (lv_names_2_0= ruleInOutName ) ) )* ) ;
    public final EObject ruleInOutNameList() throws RecognitionException {
        EObject current = null;

        EObject this_InOutName_0 = null;

        EObject lv_names_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1147:6: ( (this_InOutName_0= ruleInOutName ( ',' ( (lv_names_2_0= ruleInOutName ) ) )* ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1148:1: (this_InOutName_0= ruleInOutName ( ',' ( (lv_names_2_0= ruleInOutName ) ) )* )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1148:1: (this_InOutName_0= ruleInOutName ( ',' ( (lv_names_2_0= ruleInOutName ) ) )* )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1149:5: this_InOutName_0= ruleInOutName ( ',' ( (lv_names_2_0= ruleInOutName ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getInOutNameListAccess().getInOutNameParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleInOutName_in_ruleInOutNameList2124);
            this_InOutName_0=ruleInOutName();
            _fsp--;

             
                    current = this_InOutName_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1157:1: ( ',' ( (lv_names_2_0= ruleInOutName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID||(LA14_2>=35 && LA14_2<=36)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1157:3: ',' ( (lv_names_2_0= ruleInOutName ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleInOutNameList2134); 

            	            createLeafNode(grammarAccess.getInOutNameListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1161:1: ( (lv_names_2_0= ruleInOutName ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1162:1: (lv_names_2_0= ruleInOutName )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1162:1: (lv_names_2_0= ruleInOutName )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1163:3: lv_names_2_0= ruleInOutName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInOutNameListAccess().getNamesInOutNameParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInOutName_in_ruleInOutNameList2155);
            	    lv_names_2_0=ruleInOutName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInOutNameListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_2_0, 
            	    	        		"InOutName", 
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


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInOutNameList


    // $ANTLR start entryRuleInOutNameListComma
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1193:1: entryRuleInOutNameListComma returns [EObject current=null] : iv_ruleInOutNameListComma= ruleInOutNameListComma EOF ;
    public final EObject entryRuleInOutNameListComma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInOutNameListComma = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1194:2: (iv_ruleInOutNameListComma= ruleInOutNameListComma EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1195:2: iv_ruleInOutNameListComma= ruleInOutNameListComma EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInOutNameListCommaRule(), currentNode); 
            pushFollow(FOLLOW_ruleInOutNameListComma_in_entryRuleInOutNameListComma2193);
            iv_ruleInOutNameListComma=ruleInOutNameListComma();
            _fsp--;

             current =iv_ruleInOutNameListComma; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInOutNameListComma2203); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInOutNameListComma


    // $ANTLR start ruleInOutNameListComma
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1202:1: ruleInOutNameListComma returns [EObject current=null] : ( ( (lv_names_0_0= ruleInOutName ) ) ',' )+ ;
    public final EObject ruleInOutNameListComma() throws RecognitionException {
        EObject current = null;

        EObject lv_names_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1207:6: ( ( ( (lv_names_0_0= ruleInOutName ) ) ',' )+ )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1208:1: ( ( (lv_names_0_0= ruleInOutName ) ) ',' )+
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1208:1: ( ( (lv_names_0_0= ruleInOutName ) ) ',' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=35 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1208:2: ( (lv_names_0_0= ruleInOutName ) ) ','
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1208:2: ( (lv_names_0_0= ruleInOutName ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1209:1: (lv_names_0_0= ruleInOutName )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1209:1: (lv_names_0_0= ruleInOutName )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1210:3: lv_names_0_0= ruleInOutName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInOutNameListCommaAccess().getNamesInOutNameParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInOutName_in_ruleInOutNameListComma2249);
            	    lv_names_0_0=ruleInOutName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInOutNameListCommaRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"names",
            	    	        		lv_names_0_0, 
            	    	        		"InOutName", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,23,FOLLOW_23_in_ruleInOutNameListComma2259); 

            	            createLeafNode(grammarAccess.getInOutNameListCommaAccess().getCommaKeyword_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInOutNameListComma


    // $ANTLR start entryRuleInterface
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1244:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1245:2: (iv_ruleInterface= ruleInterface EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1246:2: iv_ruleInterface= ruleInterface EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface2296);
            iv_ruleInterface=ruleInterface();
            _fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface2306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterface


    // $ANTLR start ruleInterface
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1253:1: ruleInterface returns [EObject current=null] : ( ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' ) ( (lv_names_3_0= ruleInOutNameList ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1_0 = null;

        EObject lv_names_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1258:6: ( ( ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' ) ( (lv_names_3_0= ruleInOutNameList ) ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:1: ( ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' ) ( (lv_names_3_0= ruleInOutNameList ) ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:1: ( ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' ) ( (lv_names_3_0= ruleInOutNameList ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:2: ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' ) ( (lv_names_3_0= ruleInOutNameList ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:2: ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=26 && LA17_1<=28)||(LA17_1>=31 && LA17_1<=32)) ) {
                    alt17=1;
                }
                else if ( (LA17_1==RULE_ID||(LA17_1>=35 && LA17_1<=36)) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1259:2: ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' )", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=25 && LA17_0<=28)||(LA17_0>=31 && LA17_0<=32)) ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1259:2: ( ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) ) | 'event' )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:3: ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:3: ( ( ruleStorage )? ( (lv_type_1_0= ruleQType ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:4: ( ruleStorage )? ( (lv_type_1_0= ruleQType ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:4: ( ruleStorage )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=24 && LA16_0<=25)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:5: ruleStorage
                            {
                            pushFollow(FOLLOW_ruleStorage_in_ruleInterface2343);
                            ruleStorage();
                            _fsp--;


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1259:18: ( (lv_type_1_0= ruleQType ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1260:1: (lv_type_1_0= ruleQType )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1260:1: (lv_type_1_0= ruleQType )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1261:3: lv_type_1_0= ruleQType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getTypeQTypeParserRuleCall_0_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQType_in_ruleInterface2358);
                    lv_type_1_0=ruleQType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_1_0, 
                    	        		"QType", 
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
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1284:7: 'event'
                    {
                    match(input,24,FOLLOW_24_in_ruleInterface2375); 

                            createLeafNode(grammarAccess.getInterfaceAccess().getEventKeyword_0_1(), null); 
                        

                    }
                    break;

            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1288:2: ( (lv_names_3_0= ruleInOutNameList ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1289:1: (lv_names_3_0= ruleInOutNameList )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1289:1: (lv_names_3_0= ruleInOutNameList )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1290:3: lv_names_3_0= ruleInOutNameList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceAccess().getNamesInOutNameListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInOutNameList_in_ruleInterface2397);
            lv_names_3_0=ruleInOutNameList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInterfaceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"names",
            	        		lv_names_3_0, 
            	        		"InOutNameList", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterface


    // $ANTLR start entryRuleInterfaceList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1322:1: entryRuleInterfaceList returns [EObject current=null] : iv_ruleInterfaceList= ruleInterfaceList EOF ;
    public final EObject entryRuleInterfaceList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1323:2: (iv_ruleInterfaceList= ruleInterfaceList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1324:2: iv_ruleInterfaceList= ruleInterfaceList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getInterfaceListRule(), currentNode); 
            pushFollow(FOLLOW_ruleInterfaceList_in_entryRuleInterfaceList2435);
            iv_ruleInterfaceList=ruleInterfaceList();
            _fsp--;

             current =iv_ruleInterfaceList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceList2445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleInterfaceList


    // $ANTLR start ruleInterfaceList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1331:1: ruleInterfaceList returns [EObject current=null] : ( ( (lv_intf_0_0= ruleInterface ) ) ( ',' ( (lv_interfaces_2_0= ruleInterface ) ) )* ) ;
    public final EObject ruleInterfaceList() throws RecognitionException {
        EObject current = null;

        EObject lv_intf_0_0 = null;

        EObject lv_interfaces_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1336:6: ( ( ( (lv_intf_0_0= ruleInterface ) ) ( ',' ( (lv_interfaces_2_0= ruleInterface ) ) )* ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1337:1: ( ( (lv_intf_0_0= ruleInterface ) ) ( ',' ( (lv_interfaces_2_0= ruleInterface ) ) )* )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1337:1: ( ( (lv_intf_0_0= ruleInterface ) ) ( ',' ( (lv_interfaces_2_0= ruleInterface ) ) )* )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1337:2: ( (lv_intf_0_0= ruleInterface ) ) ( ',' ( (lv_interfaces_2_0= ruleInterface ) ) )*
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1337:2: ( (lv_intf_0_0= ruleInterface ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1338:1: (lv_intf_0_0= ruleInterface )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1338:1: (lv_intf_0_0= ruleInterface )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1339:3: lv_intf_0_0= ruleInterface
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getInterfaceListAccess().getIntfInterfaceParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleInterface_in_ruleInterfaceList2491);
            lv_intf_0_0=ruleInterface();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getInterfaceListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"intf",
            	        		lv_intf_0_0, 
            	        		"Interface", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1361:2: ( ',' ( (lv_interfaces_2_0= ruleInterface ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1361:4: ',' ( (lv_interfaces_2_0= ruleInterface ) )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleInterfaceList2502); 

            	            createLeafNode(grammarAccess.getInterfaceListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1365:1: ( (lv_interfaces_2_0= ruleInterface ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1366:1: (lv_interfaces_2_0= ruleInterface )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1366:1: (lv_interfaces_2_0= ruleInterface )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1367:3: lv_interfaces_2_0= ruleInterface
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getInterfaceListAccess().getInterfacesInterfaceParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleInterfaceList2523);
            	    lv_interfaces_2_0=ruleInterface();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getInterfaceListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"interfaces",
            	    	        		lv_interfaces_2_0, 
            	    	        		"Interface", 
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
            	    break loop18;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleInterfaceList


    // $ANTLR start entryRuleFixpointEqList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1403:1: entryRuleFixpointEqList returns [EObject current=null] : iv_ruleFixpointEqList= ruleFixpointEqList EOF ;
    public final EObject entryRuleFixpointEqList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFixpointEqList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1404:2: (iv_ruleFixpointEqList= ruleFixpointEqList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1405:2: iv_ruleFixpointEqList= ruleFixpointEqList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFixpointEqListRule(), currentNode); 
            pushFollow(FOLLOW_ruleFixpointEqList_in_entryRuleFixpointEqList2567);
            iv_ruleFixpointEqList=ruleFixpointEqList();
            _fsp--;

             current =iv_ruleFixpointEqList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFixpointEqList2577); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFixpointEqList


    // $ANTLR start ruleFixpointEqList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1412:1: ruleFixpointEqList returns [EObject current=null] : ( ( 'mu' | 'nu' ) ( (lv_name_2_0= ruleQName ) ) '=' ( (lv_expr_4_0= ruleUtyExpr ) ) ';' )* ;
    public final EObject ruleFixpointEqList() throws RecognitionException {
        EObject current = null;

        EObject lv_name_2_0 = null;

        EObject lv_expr_4_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1417:6: ( ( ( 'mu' | 'nu' ) ( (lv_name_2_0= ruleQName ) ) '=' ( (lv_expr_4_0= ruleUtyExpr ) ) ';' )* )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1418:1: ( ( 'mu' | 'nu' ) ( (lv_name_2_0= ruleQName ) ) '=' ( (lv_expr_4_0= ruleUtyExpr ) ) ';' )*
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1418:1: ( ( 'mu' | 'nu' ) ( (lv_name_2_0= ruleQName ) ) '=' ( (lv_expr_4_0= ruleUtyExpr ) ) ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1418:2: ( 'mu' | 'nu' ) ( (lv_name_2_0= ruleQName ) ) '=' ( (lv_expr_4_0= ruleUtyExpr ) ) ';'
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1418:2: ( 'mu' | 'nu' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==37) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==38) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1418:2: ( 'mu' | 'nu' )", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1418:4: 'mu'
            	            {
            	            match(input,37,FOLLOW_37_in_ruleFixpointEqList2613); 

            	                    createLeafNode(grammarAccess.getFixpointEqListAccess().getMuKeyword_0_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1423:7: 'nu'
            	            {
            	            match(input,38,FOLLOW_38_in_ruleFixpointEqList2629); 

            	                    createLeafNode(grammarAccess.getFixpointEqListAccess().getNuKeyword_0_1(), null); 
            	                

            	            }
            	            break;

            	    }

            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1427:2: ( (lv_name_2_0= ruleQName ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1428:1: (lv_name_2_0= ruleQName )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1428:1: (lv_name_2_0= ruleQName )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1429:3: lv_name_2_0= ruleQName
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFixpointEqListAccess().getNameQNameParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleQName_in_ruleFixpointEqList2651);
            	    lv_name_2_0=ruleQName();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFixpointEqListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"name",
            	    	        		lv_name_2_0, 
            	    	        		"QName", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,21,FOLLOW_21_in_ruleFixpointEqList2661); 

            	            createLeafNode(grammarAccess.getFixpointEqListAccess().getEqualsSignKeyword_2(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1455:1: ( (lv_expr_4_0= ruleUtyExpr ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1456:1: (lv_expr_4_0= ruleUtyExpr )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1456:1: (lv_expr_4_0= ruleUtyExpr )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1457:3: lv_expr_4_0= ruleUtyExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFixpointEqListAccess().getExprUtyExprParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleUtyExpr_in_ruleFixpointEqList2682);
            	    lv_expr_4_0=ruleUtyExpr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFixpointEqListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"expr",
            	    	        		lv_expr_4_0, 
            	    	        		"UtyExpr", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,14,FOLLOW_14_in_ruleFixpointEqList2692); 

            	            createLeafNode(grammarAccess.getFixpointEqListAccess().getSemicolonKeyword_4(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFixpointEqList


    // $ANTLR start entryRuleOptUtyExpr
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1491:1: entryRuleOptUtyExpr returns [EObject current=null] : iv_ruleOptUtyExpr= ruleOptUtyExpr EOF ;
    public final EObject entryRuleOptUtyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptUtyExpr = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1492:2: (iv_ruleOptUtyExpr= ruleOptUtyExpr EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1493:2: iv_ruleOptUtyExpr= ruleOptUtyExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOptUtyExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleOptUtyExpr_in_entryRuleOptUtyExpr2729);
            iv_ruleOptUtyExpr=ruleOptUtyExpr();
            _fsp--;

             current =iv_ruleOptUtyExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptUtyExpr2739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOptUtyExpr


    // $ANTLR start ruleOptUtyExpr
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1500:1: ruleOptUtyExpr returns [EObject current=null] : ( '_' | ( (lv_tk_1_0= ruleUtyExpr ) ) ) ;
    public final EObject ruleOptUtyExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_tk_1_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1505:6: ( ( '_' | ( (lv_tk_1_0= ruleUtyExpr ) ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1506:1: ( '_' | ( (lv_tk_1_0= ruleUtyExpr ) ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1506:1: ( '_' | ( (lv_tk_1_0= ruleUtyExpr ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_REALCONST)||LA21_0==19||LA21_0==29||(LA21_0>=36 && LA21_0<=38)||(LA21_0>=40 && LA21_0<=50)||(LA21_0>=52 && LA21_0<=82)||LA21_0==115) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1506:1: ( '_' | ( (lv_tk_1_0= ruleUtyExpr ) ) )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1506:3: '_'
                    {
                    match(input,39,FOLLOW_39_in_ruleOptUtyExpr2774); 

                            createLeafNode(grammarAccess.getOptUtyExprAccess().get_Keyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1511:6: ( (lv_tk_1_0= ruleUtyExpr ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1511:6: ( (lv_tk_1_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1512:1: (lv_tk_1_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1512:1: (lv_tk_1_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1513:3: lv_tk_1_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getOptUtyExprAccess().getTkUtyExprParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleOptUtyExpr2801);
                    lv_tk_1_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOptUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"tk",
                    	        		lv_tk_1_0, 
                    	        		"UtyExpr", 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOptUtyExpr


    // $ANTLR start entryRuleOptUtyExprList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1543:1: entryRuleOptUtyExprList returns [EObject current=null] : iv_ruleOptUtyExprList= ruleOptUtyExprList EOF ;
    public final EObject entryRuleOptUtyExprList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptUtyExprList = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1544:2: (iv_ruleOptUtyExprList= ruleOptUtyExprList EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1545:2: iv_ruleOptUtyExprList= ruleOptUtyExprList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOptUtyExprListRule(), currentNode); 
            pushFollow(FOLLOW_ruleOptUtyExprList_in_entryRuleOptUtyExprList2837);
            iv_ruleOptUtyExprList=ruleOptUtyExprList();
            _fsp--;

             current =iv_ruleOptUtyExprList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptUtyExprList2847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOptUtyExprList


    // $ANTLR start ruleOptUtyExprList
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1552:1: ruleOptUtyExprList returns [EObject current=null] : (this_OptUtyExpr_0= ruleOptUtyExpr ( ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) ) )* )? ;
    public final EObject ruleOptUtyExprList() throws RecognitionException {
        EObject current = null;

        EObject this_OptUtyExpr_0 = null;

        EObject lv_exprs_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1557:6: ( (this_OptUtyExpr_0= ruleOptUtyExpr ( ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) ) )* )? )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1558:1: (this_OptUtyExpr_0= ruleOptUtyExpr ( ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) ) )* )?
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1558:1: (this_OptUtyExpr_0= ruleOptUtyExpr ( ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_REALCONST)||LA23_0==19||LA23_0==29||(LA23_0>=36 && LA23_0<=50)||(LA23_0>=52 && LA23_0<=82)||LA23_0==115) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1559:5: this_OptUtyExpr_0= ruleOptUtyExpr ( ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) ) )*
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getOptUtyExprListAccess().getOptUtyExprParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleOptUtyExpr_in_ruleOptUtyExprList2894);
                    this_OptUtyExpr_0=ruleOptUtyExpr();
                    _fsp--;

                     
                            current = this_OptUtyExpr_0; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1567:1: ( ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==23) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1567:3: ',' ( (lv_exprs_2_0= ruleOptUtyExpr ) )
                    	    {
                    	    match(input,23,FOLLOW_23_in_ruleOptUtyExprList2904); 

                    	            createLeafNode(grammarAccess.getOptUtyExprListAccess().getCommaKeyword_1_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1571:1: ( (lv_exprs_2_0= ruleOptUtyExpr ) )
                    	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1572:1: (lv_exprs_2_0= ruleOptUtyExpr )
                    	    {
                    	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1572:1: (lv_exprs_2_0= ruleOptUtyExpr )
                    	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1573:3: lv_exprs_2_0= ruleOptUtyExpr
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getOptUtyExprListAccess().getExprsOptUtyExprParserRuleCall_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOptUtyExpr_in_ruleOptUtyExprList2925);
                    	    lv_exprs_2_0=ruleOptUtyExpr();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getOptUtyExprListRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"exprs",
                    	    	        		lv_exprs_2_0, 
                    	    	        		"OptUtyExpr", 
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
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOptUtyExprList


    // $ANTLR start entryRuleUtyExpr
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1605:1: entryRuleUtyExpr returns [EObject current=null] : iv_ruleUtyExpr= ruleUtyExpr EOF ;
    public final EObject entryRuleUtyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtyExpr = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1606:2: (iv_ruleUtyExpr= ruleUtyExpr EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1607:2: iv_ruleUtyExpr= ruleUtyExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUtyExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleUtyExpr_in_entryRuleUtyExpr2966);
            iv_ruleUtyExpr=ruleUtyExpr();
            _fsp--;

             current =iv_ruleUtyExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUtyExpr2976); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUtyExpr


    // $ANTLR start ruleUtyExpr
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1614:1: ruleUtyExpr returns [EObject current=null] : ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) ) ;
    public final EObject ruleUtyExpr() throws RecognitionException {
        EObject current = null;

        EObject this_QName_10 = null;

        AntlrDatatypeRuleToken lv_op_11_0 = null;

        EObject lv_expr_12_0 = null;

        EObject this_UtyExpr_14 = null;

        EObject this_UtyExpr_16 = null;

        EObject this_UtyExpr_19 = null;

        EObject this_UtyExpr_23 = null;

        EObject lv_t7_26_0 = null;

        EObject this_UtyExpr_30 = null;

        EObject this_UtyExpr_34 = null;

        EObject this_UtyExpr_37 = null;

        EObject lv_expr_39_0 = null;

        EObject this_UtyExpr_43 = null;

        EObject this_UtyExpr_47 = null;

        EObject this_UtyExpr_51 = null;

        EObject this_QName_55 = null;

        EObject this_UtyExpr_59 = null;

        EObject this_UtyExpr_63 = null;

        EObject this_UtyExpr_67 = null;

        EObject this_UtyExpr_71 = null;

        EObject this_UtyExpr_75 = null;

        EObject this_UtyExpr_79 = null;

        EObject this_UtyExpr_83 = null;

        EObject this_UtyExpr_87 = null;

        EObject lv_expr_89_0 = null;

        EObject this_UtyExpr_93 = null;

        EObject lv_expr_95_0 = null;

        EObject this_UtyExpr_99 = null;

        EObject this_Generic_102 = null;

        EObject lv_expr_103_0 = null;

        EObject this_Generic_105 = null;

        EObject lv_expr_106_0 = null;

        EObject this_Generic_108 = null;

        EObject lv_expr_109_0 = null;

        EObject this_UtyExpr_111 = null;

        EObject this_UtyExpr_113 = null;

        EObject this_UtyExpr_115 = null;

        EObject this_UtyExpr_117 = null;

        EObject this_UtyExpr_119 = null;

        EObject this_UtyExpr_121 = null;

        EObject this_UtyExpr_123 = null;

        EObject this_UtyExpr_125 = null;

        EObject this_UtyExpr_127 = null;

        EObject this_UtyExpr_129 = null;

        EObject this_UtyExpr_131 = null;

        EObject this_UtyExpr_133 = null;

        EObject this_UtyExpr_135 = null;

        EObject lv_name_137_0 = null;

        EObject lv_expr_139_0 = null;

        EObject lv_name_141_0 = null;

        EObject lv_expr_143_0 = null;

        EObject this_FixpointEqList_145 = null;

        EObject lv_expr2_147_0 = null;

        EObject lv_name_149_0 = null;

        EObject lv_type_151_0 = null;

        EObject lv_expr_153_0 = null;

        EObject lv_name_155_0 = null;

        EObject lv_type_157_0 = null;

        EObject lv_expr_159_0 = null;

        EObject this_UtyExpr_161 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1619:6: ( ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1620:1: ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1620:1: ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) )
            int alt24=55;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case 41:
                {
                alt24=2;
                }
                break;
            case 42:
                {
                alt24=3;
                }
                break;
            case 43:
                {
                alt24=4;
                }
                break;
            case 44:
                {
                alt24=5;
                }
                break;
            case RULE_BVCONST:
                {
                alt24=6;
                }
                break;
            case RULE_OCTCONST:
                {
                alt24=7;
                }
                break;
            case RULE_HEXCONST:
                {
                alt24=8;
                }
                break;
            case RULE_NATCONST:
                {
                alt24=9;
                }
                break;
            case RULE_REALCONST:
                {
                alt24=10;
                }
                break;
            case RULE_ID:
                {
                alt24=11;
                }
                break;
            case 36:
            case 115:
                {
                alt24=12;
                }
                break;
            case 45:
                {
                alt24=13;
                }
                break;
            case 46:
                {
                alt24=14;
                }
                break;
            case 47:
                {
                alt24=15;
                }
                break;
            case 48:
                {
                alt24=16;
                }
                break;
            case 49:
                {
                alt24=17;
                }
                break;
            case 50:
                {
                alt24=18;
                }
                break;
            case 29:
                {
                alt24=19;
                }
                break;
            case 52:
                {
                alt24=20;
                }
                break;
            case 53:
                {
                alt24=21;
                }
                break;
            case 54:
                {
                alt24=22;
                }
                break;
            case 55:
                {
                alt24=23;
                }
                break;
            case 56:
                {
                alt24=24;
                }
                break;
            case 57:
                {
                alt24=25;
                }
                break;
            case 58:
                {
                alt24=26;
                }
                break;
            case 59:
                {
                alt24=27;
                }
                break;
            case 60:
                {
                alt24=28;
                }
                break;
            case 61:
                {
                alt24=29;
                }
                break;
            case 62:
                {
                alt24=30;
                }
                break;
            case 63:
                {
                alt24=31;
                }
                break;
            case 64:
                {
                alt24=32;
                }
                break;
            case 65:
                {
                alt24=33;
                }
                break;
            case 66:
                {
                int LA24_34 = input.LA(2);

                if ( (LA24_34==19) ) {
                    alt24=34;
                }
                else if ( (LA24_34==RULE_ID) ) {
                    alt24=53;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1620:1: ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) )", 24, 34, input);

                    throw nvae;
                }
                }
                break;
            case 67:
                {
                int LA24_35 = input.LA(2);

                if ( (LA24_35==RULE_ID) ) {
                    alt24=54;
                }
                else if ( (LA24_35==19) ) {
                    alt24=35;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1620:1: ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) )", 24, 35, input);

                    throw nvae;
                }
                }
                break;
            case 68:
                {
                alt24=36;
                }
                break;
            case 69:
                {
                alt24=37;
                }
                break;
            case 70:
                {
                alt24=38;
                }
                break;
            case 71:
                {
                alt24=39;
                }
                break;
            case 72:
                {
                alt24=40;
                }
                break;
            case 73:
                {
                alt24=41;
                }
                break;
            case 74:
                {
                alt24=42;
                }
                break;
            case 75:
                {
                alt24=43;
                }
                break;
            case 76:
                {
                alt24=44;
                }
                break;
            case 77:
                {
                alt24=45;
                }
                break;
            case 78:
                {
                alt24=46;
                }
                break;
            case 79:
                {
                alt24=47;
                }
                break;
            case 80:
                {
                alt24=48;
                }
                break;
            case 81:
                {
                alt24=49;
                }
                break;
            case 37:
                {
                alt24=50;
                }
                break;
            case 38:
                {
                alt24=51;
                }
                break;
            case 82:
                {
                alt24=52;
                }
                break;
            case 19:
                {
                alt24=55;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1620:1: ( 'instant' | 'inside' | 'terminate' | 'true' | 'false' | RULE_BVCONST | RULE_OCTCONST | RULE_HEXCONST | RULE_NATCONST | RULE_REALCONST | this_QName_10= ruleQName | ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) ) | ( '+' this_UtyExpr_14= ruleUtyExpr ) | ( '-' this_UtyExpr_16= ruleUtyExpr ) | ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' ) | ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' ) | ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' ) | ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' ) | ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' ) | ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' ) | ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' ) | ( 'arr2bv' '(' this_QName_55= ruleQName ')' ) | ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' ) | ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' ) | ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' ) | ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' ) | ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' ) | ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' ) | ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' ) | ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' ) | ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' ) | ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' ) | ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) ) | ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) ) | ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) ) | ( 'X' this_UtyExpr_111= ruleUtyExpr ) | ( 'G' this_UtyExpr_113= ruleUtyExpr ) | ( 'F' this_UtyExpr_115= ruleUtyExpr ) | ( 'PA' this_UtyExpr_117= ruleUtyExpr ) | ( 'PF' this_UtyExpr_119= ruleUtyExpr ) | ( 'PSX' this_UtyExpr_121= ruleUtyExpr ) | ( 'PMX' this_UtyExpr_123= ruleUtyExpr ) | ( 'E' this_UtyExpr_125= ruleUtyExpr ) | ( 'A' this_UtyExpr_127= ruleUtyExpr ) | ( '[]' this_UtyExpr_129= ruleUtyExpr ) | ( '<>' this_UtyExpr_131= ruleUtyExpr ) | ( '[:]' this_UtyExpr_133= ruleUtyExpr ) | ( '<:>' this_UtyExpr_135= ruleUtyExpr ) | ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) ) | ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) ) | ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) ) | ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) ) | ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) ) | ( '(' this_UtyExpr_161= ruleUtyExpr ')' ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1620:3: 'instant'
                    {
                    match(input,40,FOLLOW_40_in_ruleUtyExpr3011); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getInstantKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1625:7: 'inside'
                    {
                    match(input,41,FOLLOW_41_in_ruleUtyExpr3027); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getInsideKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1630:7: 'terminate'
                    {
                    match(input,42,FOLLOW_42_in_ruleUtyExpr3043); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getTerminateKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1635:7: 'true'
                    {
                    match(input,43,FOLLOW_43_in_ruleUtyExpr3059); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getTrueKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1640:7: 'false'
                    {
                    match(input,44,FOLLOW_44_in_ruleUtyExpr3075); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFalseKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1645:6: RULE_BVCONST
                    {
                    match(input,RULE_BVCONST,FOLLOW_RULE_BVCONST_in_ruleUtyExpr3090); 
                     
                        createLeafNode(grammarAccess.getUtyExprAccess().getBVCONSTTerminalRuleCall_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1650:6: RULE_OCTCONST
                    {
                    match(input,RULE_OCTCONST,FOLLOW_RULE_OCTCONST_in_ruleUtyExpr3104); 
                     
                        createLeafNode(grammarAccess.getUtyExprAccess().getOCTCONSTTerminalRuleCall_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1655:6: RULE_HEXCONST
                    {
                    match(input,RULE_HEXCONST,FOLLOW_RULE_HEXCONST_in_ruleUtyExpr3118); 
                     
                        createLeafNode(grammarAccess.getUtyExprAccess().getHEXCONSTTerminalRuleCall_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1660:6: RULE_NATCONST
                    {
                    match(input,RULE_NATCONST,FOLLOW_RULE_NATCONST_in_ruleUtyExpr3132); 
                     
                        createLeafNode(grammarAccess.getUtyExprAccess().getNATCONSTTerminalRuleCall_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1665:6: RULE_REALCONST
                    {
                    match(input,RULE_REALCONST,FOLLOW_RULE_REALCONST_in_ruleUtyExpr3146); 
                     
                        createLeafNode(grammarAccess.getUtyExprAccess().getREALCONSTTerminalRuleCall_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1671:5: this_QName_10= ruleQName
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getQNameParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleUtyExpr3173);
                    this_QName_10=ruleQName();
                    _fsp--;

                     
                            current = this_QName_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1680:6: ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1680:6: ( ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1680:7: ( (lv_op_11_0= ruleNOT ) ) ( (lv_expr_12_0= ruleUtyExpr ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1680:7: ( (lv_op_11_0= ruleNOT ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1681:1: (lv_op_11_0= ruleNOT )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1681:1: (lv_op_11_0= ruleNOT )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1682:3: lv_op_11_0= ruleNOT
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getOpNOTParserRuleCall_11_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleNOT_in_ruleUtyExpr3200);
                    lv_op_11_0=ruleNOT();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"op",
                    	        		lv_op_11_0, 
                    	        		"NOT", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1704:2: ( (lv_expr_12_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1705:1: (lv_expr_12_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1705:1: (lv_expr_12_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1706:3: lv_expr_12_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_11_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3221);
                    lv_expr_12_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_12_0, 
                    	        		"UtyExpr", 
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
                case 13 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1729:6: ( '+' this_UtyExpr_14= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1729:6: ( '+' this_UtyExpr_14= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1729:8: '+' this_UtyExpr_14= ruleUtyExpr
                    {
                    match(input,45,FOLLOW_45_in_ruleUtyExpr3239); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getPlusSignKeyword_12_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_12_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3261);
                    this_UtyExpr_14=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_14; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1743:6: ( '-' this_UtyExpr_16= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1743:6: ( '-' this_UtyExpr_16= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1743:8: '-' this_UtyExpr_16= ruleUtyExpr
                    {
                    match(input,46,FOLLOW_46_in_ruleUtyExpr3278); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getHyphenMinusKeyword_13_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_13_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3300);
                    this_UtyExpr_16=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_16; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1757:6: ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1757:6: ( 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1757:8: 'abs' '(' this_UtyExpr_19= ruleUtyExpr ')'
                    {
                    match(input,47,FOLLOW_47_in_ruleUtyExpr3317); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getAbsKeyword_14_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3327); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_14_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_14_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3349);
                    this_UtyExpr_19=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_19; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3358); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_14_3(), null); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1779:6: ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1779:6: ( 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1779:8: 'sat' '{' this_UtyExpr_23= ruleUtyExpr '}' '(' ( (lv_t7_26_0= ruleUtyExpr ) ) ')'
                    {
                    match(input,48,FOLLOW_48_in_ruleUtyExpr3376); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getSatKeyword_15_0(), null); 
                        
                    match(input,29,FOLLOW_29_in_ruleUtyExpr3386); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftCurlyBracketKeyword_15_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_15_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3408);
                    this_UtyExpr_23=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_23; 
                            currentNode = currentNode.getParent();
                        
                    match(input,30,FOLLOW_30_in_ruleUtyExpr3417); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightCurlyBracketKeyword_15_3(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3427); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_15_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1804:1: ( (lv_t7_26_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1805:1: (lv_t7_26_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1805:1: (lv_t7_26_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1806:3: lv_t7_26_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getT7UtyExprParserRuleCall_15_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3448);
                    lv_t7_26_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t7",
                    	        		lv_t7_26_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleUtyExpr3458); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_15_6(), null); 
                        

                    }


                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1833:6: ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1833:6: ( 'der' '(' this_UtyExpr_30= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1833:8: 'der' '(' this_UtyExpr_30= ruleUtyExpr ')'
                    {
                    match(input,49,FOLLOW_49_in_ruleUtyExpr3476); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getDerKeyword_16_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3486); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_16_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_16_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3508);
                    this_UtyExpr_30=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_30; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3517); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_16_3(), null); 
                        

                    }


                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1855:6: ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1855:6: ( 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1855:8: 'reverse' '(' this_UtyExpr_34= ruleUtyExpr ')'
                    {
                    match(input,50,FOLLOW_50_in_ruleUtyExpr3535); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getReverseKeyword_17_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3545); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_17_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_17_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3567);
                    this_UtyExpr_34=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_34; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3576); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_17_3(), null); 
                        

                    }


                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1877:6: ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1877:6: ( '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1877:8: '{' this_UtyExpr_37= ruleUtyExpr '::' ( (lv_expr_39_0= ruleUtyExpr ) ) '}'
                    {
                    match(input,29,FOLLOW_29_in_ruleUtyExpr3594); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftCurlyBracketKeyword_18_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_18_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3616);
                    this_UtyExpr_37=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_37; 
                            currentNode = currentNode.getParent();
                        
                    match(input,51,FOLLOW_51_in_ruleUtyExpr3625); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getColonColonKeyword_18_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1894:1: ( (lv_expr_39_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1895:1: (lv_expr_39_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1895:1: (lv_expr_39_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1896:3: lv_expr_39_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_18_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3646);
                    lv_expr_39_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_39_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,30,FOLLOW_30_in_ruleUtyExpr3656); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightCurlyBracketKeyword_18_4(), null); 
                        

                    }


                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1923:6: ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1923:6: ( 'next' '(' this_UtyExpr_43= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1923:8: 'next' '(' this_UtyExpr_43= ruleUtyExpr ')'
                    {
                    match(input,52,FOLLOW_52_in_ruleUtyExpr3674); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getNextKeyword_19_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3684); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_19_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_19_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3706);
                    this_UtyExpr_43=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_43; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3715); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_19_3(), null); 
                        

                    }


                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1945:6: ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1945:6: ( 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1945:8: 'nat2bv' '(' this_UtyExpr_47= ruleUtyExpr ')'
                    {
                    match(input,53,FOLLOW_53_in_ruleUtyExpr3733); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getNat2bvKeyword_20_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3743); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_20_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_20_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3765);
                    this_UtyExpr_47=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_47; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3774); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_20_3(), null); 
                        

                    }


                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1967:6: ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1967:6: ( 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1967:8: 'int2bv' '(' this_UtyExpr_51= ruleUtyExpr ')'
                    {
                    match(input,54,FOLLOW_54_in_ruleUtyExpr3792); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getInt2bvKeyword_21_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3802); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_21_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_21_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3824);
                    this_UtyExpr_51=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_51; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3833); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_21_3(), null); 
                        

                    }


                    }
                    break;
                case 23 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1989:6: ( 'arr2bv' '(' this_QName_55= ruleQName ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1989:6: ( 'arr2bv' '(' this_QName_55= ruleQName ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:1989:8: 'arr2bv' '(' this_QName_55= ruleQName ')'
                    {
                    match(input,55,FOLLOW_55_in_ruleUtyExpr3851); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getArr2bvKeyword_22_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3861); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_22_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getQNameParserRuleCall_22_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleUtyExpr3883);
                    this_QName_55=ruleQName();
                    _fsp--;

                     
                            current = this_QName_55; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3892); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_22_3(), null); 
                        

                    }


                    }
                    break;
                case 24 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2011:6: ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2011:6: ( 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2011:8: 'tup2bv' '(' this_UtyExpr_59= ruleUtyExpr ')'
                    {
                    match(input,56,FOLLOW_56_in_ruleUtyExpr3910); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getTup2bvKeyword_23_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3920); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_23_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_23_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr3942);
                    this_UtyExpr_59=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_59; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr3951); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_23_3(), null); 
                        

                    }


                    }
                    break;
                case 25 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2033:6: ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2033:6: ( 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2033:8: 'bv2nat' '(' this_UtyExpr_63= ruleUtyExpr ')'
                    {
                    match(input,57,FOLLOW_57_in_ruleUtyExpr3969); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getBv2natKeyword_24_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr3979); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_24_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_24_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4001);
                    this_UtyExpr_63=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_63; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4010); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_24_3(), null); 
                        

                    }


                    }
                    break;
                case 26 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2055:6: ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2055:6: ( 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2055:8: 'bv2int' '(' this_UtyExpr_67= ruleUtyExpr ')'
                    {
                    match(input,58,FOLLOW_58_in_ruleUtyExpr4028); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getBv2intKeyword_25_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4038); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_25_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_25_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4060);
                    this_UtyExpr_67=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_67; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4069); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_25_3(), null); 
                        

                    }


                    }
                    break;
                case 27 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2077:6: ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2077:6: ( 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2077:8: 'nat2real' '(' this_UtyExpr_71= ruleUtyExpr ')'
                    {
                    match(input,59,FOLLOW_59_in_ruleUtyExpr4087); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getNat2realKeyword_26_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4097); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_26_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_26_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4119);
                    this_UtyExpr_71=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_71; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4128); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_26_3(), null); 
                        

                    }


                    }
                    break;
                case 28 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2099:6: ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2099:6: ( 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2099:8: 'int2real' '(' this_UtyExpr_75= ruleUtyExpr ')'
                    {
                    match(input,60,FOLLOW_60_in_ruleUtyExpr4146); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getInt2realKeyword_27_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4156); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_27_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_27_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4178);
                    this_UtyExpr_75=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_75; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4187); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_27_3(), null); 
                        

                    }


                    }
                    break;
                case 29 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2121:6: ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2121:6: ( 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2121:8: 'sin' '(' this_UtyExpr_79= ruleUtyExpr ')'
                    {
                    match(input,61,FOLLOW_61_in_ruleUtyExpr4205); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getSinKeyword_28_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4215); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_28_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_28_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4237);
                    this_UtyExpr_79=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_79; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4246); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_28_3(), null); 
                        

                    }


                    }
                    break;
                case 30 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2143:6: ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2143:6: ( 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2143:8: 'cos' '(' this_UtyExpr_83= ruleUtyExpr ')'
                    {
                    match(input,62,FOLLOW_62_in_ruleUtyExpr4264); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getCosKeyword_29_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4274); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_29_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_29_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4296);
                    this_UtyExpr_83=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_83; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4305); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_29_3(), null); 
                        

                    }


                    }
                    break;
                case 31 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2165:6: ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2165:6: ( 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2165:8: 'exp' '(' this_UtyExpr_87= ruleUtyExpr ',' ( (lv_expr_89_0= ruleUtyExpr ) ) ')'
                    {
                    match(input,63,FOLLOW_63_in_ruleUtyExpr4323); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getExpKeyword_30_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4333); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_30_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_30_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4355);
                    this_UtyExpr_87=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_87; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleUtyExpr4364); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getCommaKeyword_30_3(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2186:1: ( (lv_expr_89_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2187:1: (lv_expr_89_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2187:1: (lv_expr_89_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2188:3: lv_expr_89_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_30_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4385);
                    lv_expr_89_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_89_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleUtyExpr4395); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_30_5(), null); 
                        

                    }


                    }
                    break;
                case 32 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2215:6: ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2215:6: ( 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2215:8: 'log' '(' this_UtyExpr_93= ruleUtyExpr ',' ( (lv_expr_95_0= ruleUtyExpr ) ) ')'
                    {
                    match(input,64,FOLLOW_64_in_ruleUtyExpr4413); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLogKeyword_31_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4423); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_31_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_31_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4445);
                    this_UtyExpr_93=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_93; 
                            currentNode = currentNode.getParent();
                        
                    match(input,23,FOLLOW_23_in_ruleUtyExpr4454); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getCommaKeyword_31_3(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2236:1: ( (lv_expr_95_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2237:1: (lv_expr_95_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2237:1: (lv_expr_95_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2238:3: lv_expr_95_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_31_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4475);
                    lv_expr_95_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_95_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleUtyExpr4485); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_31_5(), null); 
                        

                    }


                    }
                    break;
                case 33 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2265:6: ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2265:6: ( 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2265:8: 'sizeOf' '(' this_UtyExpr_99= ruleUtyExpr ')'
                    {
                    match(input,65,FOLLOW_65_in_ruleUtyExpr4503); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getSizeOfKeyword_32_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyExpr4513); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_32_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_32_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4535);
                    this_UtyExpr_99=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_99; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr4544); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_32_3(), null); 
                        

                    }


                    }
                    break;
                case 34 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2287:6: ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2287:6: ( 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2287:8: 'forall' this_Generic_102= ruleGeneric ( (lv_expr_103_0= ruleUtyExpr ) )
                    {
                    match(input,66,FOLLOW_66_in_ruleUtyExpr4562); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getForallKeyword_33_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getGenericParserRuleCall_33_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGeneric_in_ruleUtyExpr4584);
                    this_Generic_102=ruleGeneric();
                    _fsp--;

                     
                            current = this_Generic_102; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2300:1: ( (lv_expr_103_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2301:1: (lv_expr_103_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2301:1: (lv_expr_103_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2302:3: lv_expr_103_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_33_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4604);
                    lv_expr_103_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_103_0, 
                    	        		"UtyExpr", 
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
                case 35 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2325:6: ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2325:6: ( 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2325:8: 'exists' this_Generic_105= ruleGeneric ( (lv_expr_106_0= ruleUtyExpr ) )
                    {
                    match(input,67,FOLLOW_67_in_ruleUtyExpr4622); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getExistsKeyword_34_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getGenericParserRuleCall_34_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGeneric_in_ruleUtyExpr4644);
                    this_Generic_105=ruleGeneric();
                    _fsp--;

                     
                            current = this_Generic_105; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2338:1: ( (lv_expr_106_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2339:1: (lv_expr_106_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2339:1: (lv_expr_106_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2340:3: lv_expr_106_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_34_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4664);
                    lv_expr_106_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_106_0, 
                    	        		"UtyExpr", 
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
                case 36 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2363:6: ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2363:6: ( 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2363:8: 'sum' this_Generic_108= ruleGeneric ( (lv_expr_109_0= ruleUtyExpr ) )
                    {
                    match(input,68,FOLLOW_68_in_ruleUtyExpr4682); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getSumKeyword_35_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getGenericParserRuleCall_35_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGeneric_in_ruleUtyExpr4704);
                    this_Generic_108=ruleGeneric();
                    _fsp--;

                     
                            current = this_Generic_108; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2376:1: ( (lv_expr_109_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2377:1: (lv_expr_109_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2377:1: (lv_expr_109_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2378:3: lv_expr_109_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_35_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4724);
                    lv_expr_109_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_109_0, 
                    	        		"UtyExpr", 
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
                case 37 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2401:6: ( 'X' this_UtyExpr_111= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2401:6: ( 'X' this_UtyExpr_111= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2401:8: 'X' this_UtyExpr_111= ruleUtyExpr
                    {
                    match(input,69,FOLLOW_69_in_ruleUtyExpr4742); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getXKeyword_36_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_36_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4764);
                    this_UtyExpr_111=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_111; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 38 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2415:6: ( 'G' this_UtyExpr_113= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2415:6: ( 'G' this_UtyExpr_113= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2415:8: 'G' this_UtyExpr_113= ruleUtyExpr
                    {
                    match(input,70,FOLLOW_70_in_ruleUtyExpr4781); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getGKeyword_37_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_37_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4803);
                    this_UtyExpr_113=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_113; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 39 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2429:6: ( 'F' this_UtyExpr_115= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2429:6: ( 'F' this_UtyExpr_115= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2429:8: 'F' this_UtyExpr_115= ruleUtyExpr
                    {
                    match(input,71,FOLLOW_71_in_ruleUtyExpr4820); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFKeyword_38_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_38_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4842);
                    this_UtyExpr_115=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_115; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 40 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2443:6: ( 'PA' this_UtyExpr_117= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2443:6: ( 'PA' this_UtyExpr_117= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2443:8: 'PA' this_UtyExpr_117= ruleUtyExpr
                    {
                    match(input,72,FOLLOW_72_in_ruleUtyExpr4859); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getPAKeyword_39_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_39_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4881);
                    this_UtyExpr_117=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_117; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 41 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2457:6: ( 'PF' this_UtyExpr_119= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2457:6: ( 'PF' this_UtyExpr_119= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2457:8: 'PF' this_UtyExpr_119= ruleUtyExpr
                    {
                    match(input,73,FOLLOW_73_in_ruleUtyExpr4898); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getPFKeyword_40_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_40_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4920);
                    this_UtyExpr_119=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_119; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 42 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2471:6: ( 'PSX' this_UtyExpr_121= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2471:6: ( 'PSX' this_UtyExpr_121= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2471:8: 'PSX' this_UtyExpr_121= ruleUtyExpr
                    {
                    match(input,74,FOLLOW_74_in_ruleUtyExpr4937); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getPSXKeyword_41_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_41_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4959);
                    this_UtyExpr_121=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_121; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 43 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2485:6: ( 'PMX' this_UtyExpr_123= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2485:6: ( 'PMX' this_UtyExpr_123= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2485:8: 'PMX' this_UtyExpr_123= ruleUtyExpr
                    {
                    match(input,75,FOLLOW_75_in_ruleUtyExpr4976); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getPMXKeyword_42_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_42_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr4998);
                    this_UtyExpr_123=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_123; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 44 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2499:6: ( 'E' this_UtyExpr_125= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2499:6: ( 'E' this_UtyExpr_125= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2499:8: 'E' this_UtyExpr_125= ruleUtyExpr
                    {
                    match(input,76,FOLLOW_76_in_ruleUtyExpr5015); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getEKeyword_43_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_43_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5037);
                    this_UtyExpr_125=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_125; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 45 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2513:6: ( 'A' this_UtyExpr_127= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2513:6: ( 'A' this_UtyExpr_127= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2513:8: 'A' this_UtyExpr_127= ruleUtyExpr
                    {
                    match(input,77,FOLLOW_77_in_ruleUtyExpr5054); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getAKeyword_44_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_44_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5076);
                    this_UtyExpr_127=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_127; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 46 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2527:6: ( '[]' this_UtyExpr_129= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2527:6: ( '[]' this_UtyExpr_129= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2527:8: '[]' this_UtyExpr_129= ruleUtyExpr
                    {
                    match(input,78,FOLLOW_78_in_ruleUtyExpr5093); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftSquareBracketRightSquareBracketKeyword_45_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_45_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5115);
                    this_UtyExpr_129=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_129; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 47 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2541:6: ( '<>' this_UtyExpr_131= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2541:6: ( '<>' this_UtyExpr_131= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2541:8: '<>' this_UtyExpr_131= ruleUtyExpr
                    {
                    match(input,79,FOLLOW_79_in_ruleUtyExpr5132); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLessThanSignGreaterThanSignKeyword_46_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_46_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5154);
                    this_UtyExpr_131=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_131; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 48 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2555:6: ( '[:]' this_UtyExpr_133= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2555:6: ( '[:]' this_UtyExpr_133= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2555:8: '[:]' this_UtyExpr_133= ruleUtyExpr
                    {
                    match(input,80,FOLLOW_80_in_ruleUtyExpr5171); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftSquareBracketColonRightSquareBracketKeyword_47_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_47_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5193);
                    this_UtyExpr_133=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_133; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 49 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2569:6: ( '<:>' this_UtyExpr_135= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2569:6: ( '<:>' this_UtyExpr_135= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2569:8: '<:>' this_UtyExpr_135= ruleUtyExpr
                    {
                    match(input,81,FOLLOW_81_in_ruleUtyExpr5210); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLessThanSignColonGreaterThanSignKeyword_48_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_48_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5232);
                    this_UtyExpr_135=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_135; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 50 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2583:6: ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2583:6: ( 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2583:8: 'mu' ( (lv_name_137_0= ruleQName ) ) '.' ( (lv_expr_139_0= ruleUtyExpr ) )
                    {
                    match(input,37,FOLLOW_37_in_ruleUtyExpr5249); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getMuKeyword_49_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2587:1: ( (lv_name_137_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2588:1: (lv_name_137_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2588:1: (lv_name_137_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2589:3: lv_name_137_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getNameQNameParserRuleCall_49_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleUtyExpr5270);
                    lv_name_137_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_137_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleUtyExpr5280); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFullStopKeyword_49_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2615:1: ( (lv_expr_139_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2616:1: (lv_expr_139_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2616:1: (lv_expr_139_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2617:3: lv_expr_139_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_49_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5301);
                    lv_expr_139_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_139_0, 
                    	        		"UtyExpr", 
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
                case 51 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2640:6: ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2640:6: ( 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2640:8: 'nu' ( (lv_name_141_0= ruleQName ) ) '.' ( (lv_expr_143_0= ruleUtyExpr ) )
                    {
                    match(input,38,FOLLOW_38_in_ruleUtyExpr5319); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getNuKeyword_50_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2644:1: ( (lv_name_141_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2645:1: (lv_name_141_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2645:1: (lv_name_141_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2646:3: lv_name_141_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getNameQNameParserRuleCall_50_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleUtyExpr5340);
                    lv_name_141_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_141_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleUtyExpr5350); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFullStopKeyword_50_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2672:1: ( (lv_expr_143_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2673:1: (lv_expr_143_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2673:1: (lv_expr_143_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2674:3: lv_expr_143_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_50_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5371);
                    lv_expr_143_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_143_0, 
                    	        		"UtyExpr", 
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
                case 52 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2697:6: ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2697:6: ( 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2697:8: 'fixpoints' this_FixpointEqList_145= ruleFixpointEqList 'in' ( (lv_expr2_147_0= ruleUtyExpr ) )
                    {
                    match(input,82,FOLLOW_82_in_ruleUtyExpr5389); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFixpointsKeyword_51_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getFixpointEqListParserRuleCall_51_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFixpointEqList_in_ruleUtyExpr5411);
                    this_FixpointEqList_145=ruleFixpointEqList();
                    _fsp--;

                     
                            current = this_FixpointEqList_145; 
                            currentNode = currentNode.getParent();
                        
                    match(input,83,FOLLOW_83_in_ruleUtyExpr5420); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getInKeyword_51_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2714:1: ( (lv_expr2_147_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2715:1: (lv_expr2_147_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2715:1: (lv_expr2_147_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2716:3: lv_expr2_147_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExpr2UtyExprParserRuleCall_51_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5441);
                    lv_expr2_147_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr2",
                    	        		lv_expr2_147_0, 
                    	        		"UtyExpr", 
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
                case 53 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2739:6: ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2739:6: ( 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2739:8: 'forall' ( (lv_name_149_0= ruleQName ) ) ':' ( (lv_type_151_0= ruleQType ) ) '.' ( (lv_expr_153_0= ruleUtyExpr ) )
                    {
                    match(input,66,FOLLOW_66_in_ruleUtyExpr5459); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getForallKeyword_52_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2743:1: ( (lv_name_149_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2744:1: (lv_name_149_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2744:1: (lv_name_149_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2745:3: lv_name_149_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getNameQNameParserRuleCall_52_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleUtyExpr5480);
                    lv_name_149_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_149_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,84,FOLLOW_84_in_ruleUtyExpr5490); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getColonKeyword_52_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2771:1: ( (lv_type_151_0= ruleQType ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2772:1: (lv_type_151_0= ruleQType )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2772:1: (lv_type_151_0= ruleQType )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2773:3: lv_type_151_0= ruleQType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getTypeQTypeParserRuleCall_52_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQType_in_ruleUtyExpr5511);
                    lv_type_151_0=ruleQType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_151_0, 
                    	        		"QType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleUtyExpr5521); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFullStopKeyword_52_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2799:1: ( (lv_expr_153_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2800:1: (lv_expr_153_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2800:1: (lv_expr_153_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2801:3: lv_expr_153_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_52_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5542);
                    lv_expr_153_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_153_0, 
                    	        		"UtyExpr", 
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
                case 54 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2824:6: ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2824:6: ( 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2824:8: 'exists' ( (lv_name_155_0= ruleQName ) ) ':' ( (lv_type_157_0= ruleQType ) ) '.' ( (lv_expr_159_0= ruleUtyExpr ) )
                    {
                    match(input,67,FOLLOW_67_in_ruleUtyExpr5560); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getExistsKeyword_53_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2828:1: ( (lv_name_155_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2829:1: (lv_name_155_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2829:1: (lv_name_155_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2830:3: lv_name_155_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getNameQNameParserRuleCall_53_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleUtyExpr5581);
                    lv_name_155_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_155_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,84,FOLLOW_84_in_ruleUtyExpr5591); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getColonKeyword_53_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2856:1: ( (lv_type_157_0= ruleQType ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2857:1: (lv_type_157_0= ruleQType )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2857:1: (lv_type_157_0= ruleQType )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2858:3: lv_type_157_0= ruleQType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getTypeQTypeParserRuleCall_53_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQType_in_ruleUtyExpr5612);
                    lv_type_157_0=ruleQType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_157_0, 
                    	        		"QType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,16,FOLLOW_16_in_ruleUtyExpr5622); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getFullStopKeyword_53_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2884:1: ( (lv_expr_159_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2885:1: (lv_expr_159_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2885:1: (lv_expr_159_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2886:3: lv_expr_159_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getExprUtyExprParserRuleCall_53_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5643);
                    lv_expr_159_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_159_0, 
                    	        		"UtyExpr", 
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
                case 55 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2909:6: ( '(' this_UtyExpr_161= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2909:6: ( '(' this_UtyExpr_161= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2909:8: '(' this_UtyExpr_161= ruleUtyExpr ')'
                    {
                    match(input,19,FOLLOW_19_in_ruleUtyExpr5661); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getLeftParenthesisKeyword_54_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyExprAccess().getUtyExprParserRuleCall_54_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyExpr5683);
                    this_UtyExpr_161=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_161; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyExpr5692); 

                            createLeafNode(grammarAccess.getUtyExprAccess().getRightParenthesisKeyword_54_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUtyExpr


    // $ANTLR start entryRuleUtyAction
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2934:1: entryRuleUtyAction returns [EObject current=null] : iv_ruleUtyAction= ruleUtyAction EOF ;
    public final EObject entryRuleUtyAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUtyAction = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2935:2: (iv_ruleUtyAction= ruleUtyAction EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2936:2: iv_ruleUtyAction= ruleUtyAction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUtyActionRule(), currentNode); 
            pushFollow(FOLLOW_ruleUtyAction_in_entryRuleUtyAction5729);
            iv_ruleUtyAction=ruleUtyAction();
            _fsp--;

             current =iv_ruleUtyAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUtyAction5739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleUtyAction


    // $ANTLR start ruleUtyAction
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2943:1: ruleUtyAction returns [EObject current=null] : ( ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' ) | ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) ) | ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) ) | ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' ) ) ;
    public final EObject ruleUtyAction() throws RecognitionException {
        EObject current = null;

        EObject this_UtyExpr_3 = null;

        EObject this_UtyExpr_7 = null;

        EObject lv_t2_10_0 = null;

        EObject this_UtyExpr_13 = null;

        EObject lv_t4_16_0 = null;

        EObject this_UtyExpr_19 = null;

        EObject this_UtyExpr_23 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2948:6: ( ( ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' ) | ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) ) | ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) ) | ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2949:1: ( ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' ) | ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) ) | ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) ) | ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2949:1: ( ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' ) | ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) ) | ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) ) | ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt26=1;
                }
                break;
            case 52:
                {
                alt26=2;
                }
                break;
            case 49:
                {
                alt26=3;
                }
                break;
            case 87:
                {
                alt26=4;
                }
                break;
            case 88:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2949:1: ( ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' ) | ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) ) | ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) ) | ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' ) | ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2949:2: ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2949:2: ( 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2949:4: 'emit' ( 'next' )? '(' this_UtyExpr_3= ruleUtyExpr ')'
                    {
                    match(input,85,FOLLOW_85_in_ruleUtyAction5775); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getEmitKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2953:1: ( 'next' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==52) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2953:3: 'next'
                            {
                            match(input,52,FOLLOW_52_in_ruleUtyAction5786); 

                                    createLeafNode(grammarAccess.getUtyActionAccess().getNextKeyword_0_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,19,FOLLOW_19_in_ruleUtyAction5798); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getLeftParenthesisKeyword_0_2(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getUtyExprParserRuleCall_0_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction5820);
                    this_UtyExpr_3=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyAction5829); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getRightParenthesisKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2975:6: ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2975:6: ( 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:2975:8: 'next' '(' this_UtyExpr_7= ruleUtyExpr ')' '=' ( (lv_t2_10_0= ruleUtyExpr ) )
                    {
                    match(input,52,FOLLOW_52_in_ruleUtyAction5847); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getNextKeyword_1_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyAction5857); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getUtyExprParserRuleCall_1_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction5879);
                    this_UtyExpr_7=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_7; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyAction5888); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getRightParenthesisKeyword_1_3(), null); 
                        
                    match(input,21,FOLLOW_21_in_ruleUtyAction5898); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getEqualsSignKeyword_1_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3000:1: ( (lv_t2_10_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3001:1: (lv_t2_10_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3001:1: (lv_t2_10_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3002:3: lv_t2_10_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getT2UtyExprParserRuleCall_1_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction5919);
                    lv_t2_10_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t2",
                    	        		lv_t2_10_0, 
                    	        		"UtyExpr", 
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
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3025:6: ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3025:6: ( 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3025:8: 'der' '(' this_UtyExpr_13= ruleUtyExpr ')' '<-' ( (lv_t4_16_0= ruleUtyExpr ) )
                    {
                    match(input,49,FOLLOW_49_in_ruleUtyAction5937); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getDerKeyword_2_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyAction5947); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getLeftParenthesisKeyword_2_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getUtyExprParserRuleCall_2_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction5969);
                    this_UtyExpr_13=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_13; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyAction5978); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getRightParenthesisKeyword_2_3(), null); 
                        
                    match(input,86,FOLLOW_86_in_ruleUtyAction5988); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getLessThanSignHyphenMinusKeyword_2_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3050:1: ( (lv_t4_16_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3051:1: (lv_t4_16_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3051:1: (lv_t4_16_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3052:3: lv_t4_16_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getT4UtyExprParserRuleCall_2_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction6009);
                    lv_t4_16_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getUtyActionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t4",
                    	        		lv_t4_16_0, 
                    	        		"UtyExpr", 
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
                case 4 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3075:6: ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3075:6: ( 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3075:8: 'assume' '(' this_UtyExpr_19= ruleUtyExpr ')'
                    {
                    match(input,87,FOLLOW_87_in_ruleUtyAction6027); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getAssumeKeyword_3_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyAction6037); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getLeftParenthesisKeyword_3_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getUtyExprParserRuleCall_3_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction6059);
                    this_UtyExpr_19=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_19; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyAction6068); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getRightParenthesisKeyword_3_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3097:6: ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3097:6: ( 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3097:8: 'assert' '(' this_UtyExpr_23= ruleUtyExpr ')'
                    {
                    match(input,88,FOLLOW_88_in_ruleUtyAction6086); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getAssertKeyword_4_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleUtyAction6096); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getLeftParenthesisKeyword_4_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getUtyActionAccess().getUtyExprParserRuleCall_4_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleUtyAction6118);
                    this_UtyExpr_23=ruleUtyExpr();
                    _fsp--;

                     
                            current = this_UtyExpr_23; 
                            currentNode = currentNode.getParent();
                        
                    match(input,20,FOLLOW_20_in_ruleUtyAction6127); 

                            createLeafNode(grammarAccess.getUtyActionAccess().getRightParenthesisKeyword_4_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleUtyAction


    // $ANTLR start entryRulecase_list
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3126:1: entryRulecase_list returns [EObject current=null] : iv_rulecase_list= rulecase_list EOF ;
    public final EObject entryRulecase_list() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecase_list = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3127:2: (iv_rulecase_list= rulecase_list EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3128:2: iv_rulecase_list= rulecase_list EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCase_listRule(), currentNode); 
            pushFollow(FOLLOW_rulecase_list_in_entryRulecase_list6164);
            iv_rulecase_list=rulecase_list();
            _fsp--;

             current =iv_rulecase_list; 
            match(input,EOF,FOLLOW_EOF_in_entryRulecase_list6174); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulecase_list


    // $ANTLR start rulecase_list
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3135:1: rulecase_list returns [EObject current=null] : ( ( (lv_exp_0_0= ruledUtyExpr ) ) 'do' ( (lv_stmt_2_0= ruleStmt ) ) )* ;
    public final EObject rulecase_list() throws RecognitionException {
        EObject current = null;

        EObject lv_exp_0_0 = null;

        EObject lv_stmt_2_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3140:6: ( ( ( (lv_exp_0_0= ruledUtyExpr ) ) 'do' ( (lv_stmt_2_0= ruleStmt ) ) )* )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3141:1: ( ( (lv_exp_0_0= ruledUtyExpr ) ) 'do' ( (lv_stmt_2_0= ruleStmt ) ) )*
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3141:1: ( ( (lv_exp_0_0= ruledUtyExpr ) ) 'do' ( (lv_stmt_2_0= ruleStmt ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3141:2: ( (lv_exp_0_0= ruledUtyExpr ) ) 'do' ( (lv_stmt_2_0= ruleStmt ) )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3141:2: ( (lv_exp_0_0= ruledUtyExpr ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3142:1: (lv_exp_0_0= ruledUtyExpr )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3142:1: (lv_exp_0_0= ruledUtyExpr )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3143:3: lv_exp_0_0= ruledUtyExpr
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCase_listAccess().getExpDUtyExprParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruledUtyExpr_in_rulecase_list6220);
            	    lv_exp_0_0=ruledUtyExpr();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCase_listRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"exp",
            	    	        		lv_exp_0_0, 
            	    	        		"dUtyExpr", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,89,FOLLOW_89_in_rulecase_list6230); 

            	            createLeafNode(grammarAccess.getCase_listAccess().getDoKeyword_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3169:1: ( (lv_stmt_2_0= ruleStmt ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3170:1: (lv_stmt_2_0= ruleStmt )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3170:1: (lv_stmt_2_0= ruleStmt )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3171:3: lv_stmt_2_0= ruleStmt
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getCase_listAccess().getStmtStmtParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStmt_in_rulecase_list6251);
            	    lv_stmt_2_0=ruleStmt();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getCase_listRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"stmt",
            	    	        		lv_stmt_2_0, 
            	    	        		"Stmt", 
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
            	    break loop27;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulecase_list


    // $ANTLR start entryRuledUtyExpr
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3201:1: entryRuledUtyExpr returns [EObject current=null] : iv_ruledUtyExpr= ruledUtyExpr EOF ;
    public final EObject entryRuledUtyExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledUtyExpr = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3202:2: (iv_ruledUtyExpr= ruledUtyExpr EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3203:2: iv_ruledUtyExpr= ruledUtyExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDUtyExprRule(), currentNode); 
            pushFollow(FOLLOW_ruledUtyExpr_in_entryRuledUtyExpr6288);
            iv_ruledUtyExpr=ruledUtyExpr();
            _fsp--;

             current =iv_ruledUtyExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledUtyExpr6298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuledUtyExpr


    // $ANTLR start ruledUtyExpr
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3210:1: ruledUtyExpr returns [EObject current=null] : ( '(' this_UtyExpr_1= ruleUtyExpr ')' ) ;
    public final EObject ruledUtyExpr() throws RecognitionException {
        EObject current = null;

        EObject this_UtyExpr_1 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3215:6: ( ( '(' this_UtyExpr_1= ruleUtyExpr ')' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3216:1: ( '(' this_UtyExpr_1= ruleUtyExpr ')' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3216:1: ( '(' this_UtyExpr_1= ruleUtyExpr ')' )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3216:3: '(' this_UtyExpr_1= ruleUtyExpr ')'
            {
            match(input,19,FOLLOW_19_in_ruledUtyExpr6333); 

                    createLeafNode(grammarAccess.getDUtyExprAccess().getLeftParenthesisKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getDUtyExprAccess().getUtyExprParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleUtyExpr_in_ruledUtyExpr6355);
            this_UtyExpr_1=ruleUtyExpr();
            _fsp--;

             
                    current = this_UtyExpr_1; 
                    currentNode = currentNode.getParent();
                
            match(input,20,FOLLOW_20_in_ruledUtyExpr6364); 

                    createLeafNode(grammarAccess.getDUtyExprAccess().getRightParenthesisKeyword_2(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruledUtyExpr


    // $ANTLR start entryRuledUtyExprs
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3241:1: entryRuledUtyExprs returns [EObject current=null] : iv_ruledUtyExprs= ruledUtyExprs EOF ;
    public final EObject entryRuledUtyExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledUtyExprs = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3242:2: (iv_ruledUtyExprs= ruledUtyExprs EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3243:2: iv_ruledUtyExprs= ruledUtyExprs EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDUtyExprsRule(), currentNode); 
            pushFollow(FOLLOW_ruledUtyExprs_in_entryRuledUtyExprs6400);
            iv_ruledUtyExprs=ruledUtyExprs();
            _fsp--;

             current =iv_ruledUtyExprs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuledUtyExprs6410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuledUtyExprs


    // $ANTLR start ruledUtyExprs
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3250:1: ruledUtyExprs returns [EObject current=null] : (this_dUtyExpr_0= ruledUtyExpr ';' ) ;
    public final EObject ruledUtyExprs() throws RecognitionException {
        EObject current = null;

        EObject this_dUtyExpr_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3255:6: ( (this_dUtyExpr_0= ruledUtyExpr ';' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3256:1: (this_dUtyExpr_0= ruledUtyExpr ';' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3256:1: (this_dUtyExpr_0= ruledUtyExpr ';' )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3257:5: this_dUtyExpr_0= ruledUtyExpr ';'
            {
             
                    currentNode=createCompositeNode(grammarAccess.getDUtyExprsAccess().getDUtyExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruledUtyExpr_in_ruledUtyExprs6457);
            this_dUtyExpr_0=ruledUtyExpr();
            _fsp--;

             
                    current = this_dUtyExpr_0; 
                    currentNode = currentNode.getParent();
                
            match(input,14,FOLLOW_14_in_ruledUtyExprs6466); 

                    createLeafNode(grammarAccess.getDUtyExprsAccess().getSemicolonKeyword_1(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruledUtyExprs


    // $ANTLR start entryRuleGeneric
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3277:1: entryRuleGeneric returns [EObject current=null] : iv_ruleGeneric= ruleGeneric EOF ;
    public final EObject entryRuleGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneric = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3278:2: (iv_ruleGeneric= ruleGeneric EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3279:2: iv_ruleGeneric= ruleGeneric EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGenericRule(), currentNode); 
            pushFollow(FOLLOW_ruleGeneric_in_entryRuleGeneric6502);
            iv_ruleGeneric=ruleGeneric();
            _fsp--;

             current =iv_ruleGeneric; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneric6512); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleGeneric


    // $ANTLR start ruleGeneric
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3286:1: ruleGeneric returns [EObject current=null] : ( '(' this_QName_1= ruleQName '=' ( (lv_t6_3_0= ruleUtyExpr ) ) '..' ( (lv_t5_5_0= ruleUtyExpr ) ) ')' ) ;
    public final EObject ruleGeneric() throws RecognitionException {
        EObject current = null;

        EObject this_QName_1 = null;

        EObject lv_t6_3_0 = null;

        EObject lv_t5_5_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3291:6: ( ( '(' this_QName_1= ruleQName '=' ( (lv_t6_3_0= ruleUtyExpr ) ) '..' ( (lv_t5_5_0= ruleUtyExpr ) ) ')' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3292:1: ( '(' this_QName_1= ruleQName '=' ( (lv_t6_3_0= ruleUtyExpr ) ) '..' ( (lv_t5_5_0= ruleUtyExpr ) ) ')' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3292:1: ( '(' this_QName_1= ruleQName '=' ( (lv_t6_3_0= ruleUtyExpr ) ) '..' ( (lv_t5_5_0= ruleUtyExpr ) ) ')' )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3292:3: '(' this_QName_1= ruleQName '=' ( (lv_t6_3_0= ruleUtyExpr ) ) '..' ( (lv_t5_5_0= ruleUtyExpr ) ) ')'
            {
            match(input,19,FOLLOW_19_in_ruleGeneric6547); 

                    createLeafNode(grammarAccess.getGenericAccess().getLeftParenthesisKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getGenericAccess().getQNameParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleQName_in_ruleGeneric6569);
            this_QName_1=ruleQName();
            _fsp--;

             
                    current = this_QName_1; 
                    currentNode = currentNode.getParent();
                
            match(input,21,FOLLOW_21_in_ruleGeneric6578); 

                    createLeafNode(grammarAccess.getGenericAccess().getEqualsSignKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3309:1: ( (lv_t6_3_0= ruleUtyExpr ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3310:1: (lv_t6_3_0= ruleUtyExpr )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3310:1: (lv_t6_3_0= ruleUtyExpr )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3311:3: lv_t6_3_0= ruleUtyExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericAccess().getT6UtyExprParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUtyExpr_in_ruleGeneric6599);
            lv_t6_3_0=ruleUtyExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"t6",
            	        		lv_t6_3_0, 
            	        		"UtyExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,90,FOLLOW_90_in_ruleGeneric6609); 

                    createLeafNode(grammarAccess.getGenericAccess().getFullStopFullStopKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3337:1: ( (lv_t5_5_0= ruleUtyExpr ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3338:1: (lv_t5_5_0= ruleUtyExpr )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3338:1: (lv_t5_5_0= ruleUtyExpr )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3339:3: lv_t5_5_0= ruleUtyExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getGenericAccess().getT5UtyExprParserRuleCall_5_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleUtyExpr_in_ruleGeneric6630);
            lv_t5_5_0=ruleUtyExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getGenericRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"t5",
            	        		lv_t5_5_0, 
            	        		"UtyExpr", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,20,FOLLOW_20_in_ruleGeneric6640); 

                    createLeafNode(grammarAccess.getGenericAccess().getRightParenthesisKeyword_6(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleGeneric


    // $ANTLR start entryRuleLocStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3373:1: entryRuleLocStmt returns [EObject current=null] : iv_ruleLocStmt= ruleLocStmt EOF ;
    public final EObject entryRuleLocStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocStmt = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3374:2: (iv_ruleLocStmt= ruleLocStmt EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3375:2: iv_ruleLocStmt= ruleLocStmt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocStmtRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocStmt_in_entryRuleLocStmt6676);
            iv_ruleLocStmt=ruleLocStmt();
            _fsp--;

             current =iv_ruleLocStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocStmt6686); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocStmt


    // $ANTLR start ruleLocStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3382:1: ruleLocStmt returns [EObject current=null] : ( '{' ( ( (lv_locals_1_0= ruleInterfaceList ) ) ';' )* ( (lv_stmt_3_0= ruleStmt ) ) '}' ) ;
    public final EObject ruleLocStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_locals_1_0 = null;

        EObject lv_stmt_3_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3387:6: ( ( '{' ( ( (lv_locals_1_0= ruleInterfaceList ) ) ';' )* ( (lv_stmt_3_0= ruleStmt ) ) '}' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3388:1: ( '{' ( ( (lv_locals_1_0= ruleInterfaceList ) ) ';' )* ( (lv_stmt_3_0= ruleStmt ) ) '}' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3388:1: ( '{' ( ( (lv_locals_1_0= ruleInterfaceList ) ) ';' )* ( (lv_stmt_3_0= ruleStmt ) ) '}' )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3388:3: '{' ( ( (lv_locals_1_0= ruleInterfaceList ) ) ';' )* ( (lv_stmt_3_0= ruleStmt ) ) '}'
            {
            match(input,29,FOLLOW_29_in_ruleLocStmt6721); 

                    createLeafNode(grammarAccess.getLocStmtAccess().getLeftCurlyBracketKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3392:1: ( ( (lv_locals_1_0= ruleInterfaceList ) ) ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=24 && LA28_0<=28)||(LA28_0>=31 && LA28_0<=32)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3392:2: ( (lv_locals_1_0= ruleInterfaceList ) ) ';'
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3392:2: ( (lv_locals_1_0= ruleInterfaceList ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3393:1: (lv_locals_1_0= ruleInterfaceList )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3393:1: (lv_locals_1_0= ruleInterfaceList )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3394:3: lv_locals_1_0= ruleInterfaceList
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLocStmtAccess().getLocalsInterfaceListParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterfaceList_in_ruleLocStmt6743);
            	    lv_locals_1_0=ruleInterfaceList();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLocStmtRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"locals",
            	    	        		lv_locals_1_0, 
            	    	        		"InterfaceList", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,14,FOLLOW_14_in_ruleLocStmt6753); 

            	            createLeafNode(grammarAccess.getLocStmtAccess().getSemicolonKeyword_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3420:3: ( (lv_stmt_3_0= ruleStmt ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3421:1: (lv_stmt_3_0= ruleStmt )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3421:1: (lv_stmt_3_0= ruleStmt )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3422:3: lv_stmt_3_0= ruleStmt
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocStmtAccess().getStmtStmtParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStmt_in_ruleLocStmt6776);
            lv_stmt_3_0=ruleStmt();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocStmtRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"stmt",
            	        		lv_stmt_3_0, 
            	        		"Stmt", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,30,FOLLOW_30_in_ruleLocStmt6786); 

                    createLeafNode(grammarAccess.getLocStmtAccess().getRightCurlyBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleLocStmt


    // $ANTLR start entryRuleSeqStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3456:1: entryRuleSeqStmt returns [EObject current=null] : iv_ruleSeqStmt= ruleSeqStmt EOF ;
    public final EObject entryRuleSeqStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqStmt = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3457:2: (iv_ruleSeqStmt= ruleSeqStmt EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3458:2: iv_ruleSeqStmt= ruleSeqStmt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSeqStmtRule(), currentNode); 
            pushFollow(FOLLOW_ruleSeqStmt_in_entryRuleSeqStmt6822);
            iv_ruleSeqStmt=ruleSeqStmt();
            _fsp--;

             current =iv_ruleSeqStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeqStmt6832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSeqStmt


    // $ANTLR start ruleSeqStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3465:1: ruleSeqStmt returns [EObject current=null] : ( (lv_s_0_0= ruleAtomicStmt ) )+ ;
    public final EObject ruleSeqStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_s_0_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3470:6: ( ( (lv_s_0_0= ruleAtomicStmt ) )+ )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3471:1: ( (lv_s_0_0= ruleAtomicStmt ) )+
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3471:1: ( (lv_s_0_0= ruleAtomicStmt ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==29||LA29_0==49||LA29_0==52||LA29_0==85||(LA29_0>=87 && LA29_0<=89)||(LA29_0>=95 && LA29_0<=98)||(LA29_0>=100 && LA29_0<=103)||(LA29_0>=105 && LA29_0<=108)||(LA29_0>=110 && LA29_0<=114)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3472:1: (lv_s_0_0= ruleAtomicStmt )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3472:1: (lv_s_0_0= ruleAtomicStmt )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3473:3: lv_s_0_0= ruleAtomicStmt
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSeqStmtAccess().getSAtomicStmtParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleSeqStmt6877);
            	    lv_s_0_0=ruleAtomicStmt();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSeqStmtRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"s",
            	    	        		lv_s_0_0, 
            	    	        		"AtomicStmt", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleSeqStmt


    // $ANTLR start entryRuleStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3503:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3504:2: (iv_ruleStmt= ruleStmt EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3505:2: iv_ruleStmt= ruleStmt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStmtRule(), currentNode); 
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt6913);
            iv_ruleStmt=ruleStmt();
            _fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt6923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStmt


    // $ANTLR start ruleStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3512:1: ruleStmt returns [EObject current=null] : ( ( (lv_left_0_0= ruleSeqStmt ) ) ( ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) ) )* ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_7_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3517:6: ( ( ( (lv_left_0_0= ruleSeqStmt ) ) ( ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) ) )* ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3518:1: ( ( (lv_left_0_0= ruleSeqStmt ) ) ( ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) ) )* )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3518:1: ( ( (lv_left_0_0= ruleSeqStmt ) ) ( ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) ) )* )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3518:2: ( (lv_left_0_0= ruleSeqStmt ) ) ( ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) ) )*
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3518:2: ( (lv_left_0_0= ruleSeqStmt ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3519:1: (lv_left_0_0= ruleSeqStmt )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3519:1: (lv_left_0_0= ruleSeqStmt )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3520:3: lv_left_0_0= ruleSeqStmt
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStmtAccess().getLeftSeqStmtParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSeqStmt_in_ruleStmt6969);
            lv_left_0_0=ruleSeqStmt();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStmtRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"left",
            	        		lv_left_0_0, 
            	        		"SeqStmt", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3542:2: ( ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=91 && LA31_0<=94)||(LA31_0>=116 && LA31_0<=119)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3542:3: ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND ) ( (lv_right_7_0= ruleSeqStmt ) )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3542:3: ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND )
            	    int alt30=6;
            	    switch ( input.LA(1) ) {
            	    case 91:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case 92:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case 118:
            	    case 119:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case 93:
            	        {
            	        alt30=4;
            	        }
            	        break;
            	    case 94:
            	        {
            	        alt30=5;
            	        }
            	        break;
            	    case 116:
            	    case 117:
            	        {
            	        alt30=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("3542:3: ( '||' | '|||' | ruleOR | '&&' | '&&&' | ruleAND )", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3542:5: '||'
            	            {
            	            match(input,91,FOLLOW_91_in_ruleStmt6981); 

            	                    createLeafNode(grammarAccess.getStmtAccess().getVerticalLineVerticalLineKeyword_1_0_0(), null); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3547:7: '|||'
            	            {
            	            match(input,92,FOLLOW_92_in_ruleStmt6997); 

            	                    createLeafNode(grammarAccess.getStmtAccess().getVerticalLineVerticalLineVerticalLineKeyword_1_0_1(), null); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3552:6: ruleOR
            	            {
            	            pushFollow(FOLLOW_ruleOR_in_ruleStmt7012);
            	            ruleOR();
            	            _fsp--;


            	            }
            	            break;
            	        case 4 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3553:7: '&&'
            	            {
            	            match(input,93,FOLLOW_93_in_ruleStmt7020); 

            	                    createLeafNode(grammarAccess.getStmtAccess().getAmpersandAmpersandKeyword_1_0_3(), null); 
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3558:7: '&&&'
            	            {
            	            match(input,94,FOLLOW_94_in_ruleStmt7036); 

            	                    createLeafNode(grammarAccess.getStmtAccess().getAmpersandAmpersandAmpersandKeyword_1_0_4(), null); 
            	                

            	            }
            	            break;
            	        case 6 :
            	            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3563:6: ruleAND
            	            {
            	            pushFollow(FOLLOW_ruleAND_in_ruleStmt7051);
            	            ruleAND();
            	            _fsp--;


            	            }
            	            break;

            	    }

            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3563:14: ( (lv_right_7_0= ruleSeqStmt ) )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3564:1: (lv_right_7_0= ruleSeqStmt )
            	    {
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3564:1: (lv_right_7_0= ruleSeqStmt )
            	    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3565:3: lv_right_7_0= ruleSeqStmt
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStmtAccess().getRightSeqStmtParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSeqStmt_in_ruleStmt7065);
            	    lv_right_7_0=ruleSeqStmt();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStmtRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"right",
            	    	        		lv_right_7_0, 
            	    	        		"SeqStmt", 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStmt


    // $ANTLR start entryRuleAtomicStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3595:1: entryRuleAtomicStmt returns [EObject current=null] : iv_ruleAtomicStmt= ruleAtomicStmt EOF ;
    public final EObject entryRuleAtomicStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicStmt = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3596:2: (iv_ruleAtomicStmt= ruleAtomicStmt EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3597:2: iv_ruleAtomicStmt= ruleAtomicStmt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicStmtRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomicStmt_in_entryRuleAtomicStmt7103);
            iv_ruleAtomicStmt=ruleAtomicStmt();
            _fsp--;

             current =iv_ruleAtomicStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicStmt7113); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicStmt


    // $ANTLR start ruleAtomicStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3604:1: ruleAtomicStmt returns [EObject current=null] : ( ( 'nothing' ';' ) | (this_UtyAction_2= ruleUtyAction ';' ) | this_NamedStmt_4= ruleNamedStmt | ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) ) | ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) ) | ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt ) | ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) ) | ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) ) | ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) ) | ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) ) | ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) ) | ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) ) | ( 'loop' this_AtomicStmt_53= ruleAtomicStmt ) | ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) ) | this_LocStmt_57= ruleLocStmt ) ;
    public final EObject ruleAtomicStmt() throws RecognitionException {
        EObject current = null;

        EObject this_UtyAction_2 = null;

        EObject this_NamedStmt_4 = null;

        EObject this_AtomicStmt_8 = null;

        EObject lv_expr_10_0 = null;

        EObject this_AtomicStmt_14 = null;

        EObject lv_t03_16_0 = null;

        EObject this_AtomicStmt_18 = null;

        EObject this_case_list_20 = null;

        EObject lv_t15_22_0 = null;

        EObject this_Generic_24 = null;

        EObject lv_t23_25_0 = null;

        EObject this_AtomicStmt_27 = null;

        EObject lv_t06_29_0 = null;

        EObject this_Generic_31 = null;

        EObject lv_t_39_0 = null;

        EObject this_dUtyExpr_41 = null;

        EObject lv_t13_42_0 = null;

        EObject lv_t14_44_0 = null;

        EObject this_QName_47 = null;

        EObject lv_expr_49_0 = null;

        EObject lv_t24_51_0 = null;

        EObject this_AtomicStmt_53 = null;

        EObject this_dUtyExpr_55 = null;

        EObject lv_t07_56_0 = null;

        EObject this_LocStmt_57 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3609:6: ( ( ( 'nothing' ';' ) | (this_UtyAction_2= ruleUtyAction ';' ) | this_NamedStmt_4= ruleNamedStmt | ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) ) | ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) ) | ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt ) | ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) ) | ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) ) | ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) ) | ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) ) | ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) ) | ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) ) | ( 'loop' this_AtomicStmt_53= ruleAtomicStmt ) | ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) ) | this_LocStmt_57= ruleLocStmt ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3610:1: ( ( 'nothing' ';' ) | (this_UtyAction_2= ruleUtyAction ';' ) | this_NamedStmt_4= ruleNamedStmt | ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) ) | ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) ) | ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt ) | ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) ) | ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) ) | ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) ) | ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) ) | ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) ) | ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) ) | ( 'loop' this_AtomicStmt_53= ruleAtomicStmt ) | ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) ) | this_LocStmt_57= ruleLocStmt )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3610:1: ( ( 'nothing' ';' ) | (this_UtyAction_2= ruleUtyAction ';' ) | this_NamedStmt_4= ruleNamedStmt | ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) ) | ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) ) | ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt ) | ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) ) | ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) ) | ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) ) | ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) ) | ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) ) | ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) ) | ( 'loop' this_AtomicStmt_53= ruleAtomicStmt ) | ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) ) | this_LocStmt_57= ruleLocStmt )
            int alt38=15;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt38=1;
                }
                break;
            case 49:
            case 52:
            case 85:
            case 87:
            case 88:
                {
                alt38=2;
                }
                break;
            case RULE_ID:
            case 112:
            case 113:
            case 114:
                {
                alt38=3;
                }
                break;
            case 96:
            case 98:
                {
                alt38=4;
                }
                break;
            case 97:
                {
                int LA38_5 = input.LA(2);

                if ( (LA38_5==98) ) {
                    alt38=4;
                }
                else if ( ((LA38_5>=100 && LA38_5<=101)) ) {
                    alt38=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("3610:1: ( ( 'nothing' ';' ) | (this_UtyAction_2= ruleUtyAction ';' ) | this_NamedStmt_4= ruleNamedStmt | ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) ) | ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) ) | ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt ) | ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) ) | ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) ) | ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) ) | ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) ) | ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) ) | ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) ) | ( 'loop' this_AtomicStmt_53= ruleAtomicStmt ) | ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) ) | this_LocStmt_57= ruleLocStmt )", 38, 5, input);

                    throw nvae;
                }
                }
                break;
            case 100:
            case 101:
                {
                alt38=5;
                }
                break;
            case 102:
                {
                alt38=6;
                }
                break;
            case 103:
                {
                alt38=7;
                }
                break;
            case 105:
                {
                alt38=8;
                }
                break;
            case 89:
                {
                alt38=9;
                }
                break;
            case 107:
                {
                alt38=10;
                }
                break;
            case 108:
                {
                alt38=11;
                }
                break;
            case 110:
                {
                alt38=12;
                }
                break;
            case 111:
                {
                alt38=13;
                }
                break;
            case 106:
                {
                alt38=14;
                }
                break;
            case 29:
                {
                alt38=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("3610:1: ( ( 'nothing' ';' ) | (this_UtyAction_2= ruleUtyAction ';' ) | this_NamedStmt_4= ruleNamedStmt | ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) ) | ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) ) | ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt ) | ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) ) | ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) ) | ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) ) | ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) ) | ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) ) | ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) ) | ( 'loop' this_AtomicStmt_53= ruleAtomicStmt ) | ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) ) | this_LocStmt_57= ruleLocStmt )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3610:2: ( 'nothing' ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3610:2: ( 'nothing' ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3610:4: 'nothing' ';'
                    {
                    match(input,95,FOLLOW_95_in_ruleAtomicStmt7149); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getNothingKeyword_0_0(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleAtomicStmt7159); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getSemicolonKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3619:6: (this_UtyAction_2= ruleUtyAction ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3619:6: (this_UtyAction_2= ruleUtyAction ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3620:5: this_UtyAction_2= ruleUtyAction ';'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getUtyActionParserRuleCall_1_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUtyAction_in_ruleAtomicStmt7189);
                    this_UtyAction_2=ruleUtyAction();
                    _fsp--;

                     
                            current = this_UtyAction_2; 
                            currentNode = currentNode.getParent();
                        
                    match(input,14,FOLLOW_14_in_ruleAtomicStmt7198); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getSemicolonKeyword_1_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3634:5: this_NamedStmt_4= ruleNamedStmt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getNamedStmtParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNamedStmt_in_ruleAtomicStmt7227);
                    this_NamedStmt_4=ruleNamedStmt();
                    _fsp--;

                     
                            current = this_NamedStmt_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3643:6: ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3643:6: ( ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3643:7: ( 'weak' )? ( 'immediate' )? 'abort' this_AtomicStmt_8= ruleAtomicStmt 'when' ( (lv_expr_10_0= ruledUtyExprs ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3643:7: ( 'weak' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==96) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3643:9: 'weak'
                            {
                            match(input,96,FOLLOW_96_in_ruleAtomicStmt7244); 

                                    createLeafNode(grammarAccess.getAtomicStmtAccess().getWeakKeyword_3_0(), null); 
                                

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3647:3: ( 'immediate' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==97) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3647:5: 'immediate'
                            {
                            match(input,97,FOLLOW_97_in_ruleAtomicStmt7257); 

                                    createLeafNode(grammarAccess.getAtomicStmtAccess().getImmediateKeyword_3_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,98,FOLLOW_98_in_ruleAtomicStmt7269); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getAbortKeyword_3_2(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getAtomicStmtParserRuleCall_3_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7291);
                    this_AtomicStmt_8=ruleAtomicStmt();
                    _fsp--;

                     
                            current = this_AtomicStmt_8; 
                            currentNode = currentNode.getParent();
                        
                    match(input,99,FOLLOW_99_in_ruleAtomicStmt7300); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getWhenKeyword_3_4(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3668:1: ( (lv_expr_10_0= ruledUtyExprs ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3669:1: (lv_expr_10_0= ruledUtyExprs )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3669:1: (lv_expr_10_0= ruledUtyExprs )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3670:3: lv_expr_10_0= ruledUtyExprs
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getExprDUtyExprsParserRuleCall_3_5_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruledUtyExprs_in_ruleAtomicStmt7321);
                    lv_expr_10_0=ruledUtyExprs();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_10_0, 
                    	        		"dUtyExprs", 
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
                case 5 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3693:6: ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3693:6: ( ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3693:7: ( 'immediate' )? ( 'during' | 'final' ) this_AtomicStmt_14= ruleAtomicStmt 'do' ( (lv_t03_16_0= ruleAtomicStmt ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3693:7: ( 'immediate' )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==97) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3693:9: 'immediate'
                            {
                            match(input,97,FOLLOW_97_in_ruleAtomicStmt7340); 

                                    createLeafNode(grammarAccess.getAtomicStmtAccess().getImmediateKeyword_4_0(), null); 
                                

                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3697:3: ( 'during' | 'final' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==100) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==101) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("3697:3: ( 'during' | 'final' )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3697:5: 'during'
                            {
                            match(input,100,FOLLOW_100_in_ruleAtomicStmt7353); 

                                    createLeafNode(grammarAccess.getAtomicStmtAccess().getDuringKeyword_4_1_0(), null); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3702:7: 'final'
                            {
                            match(input,101,FOLLOW_101_in_ruleAtomicStmt7369); 

                                    createLeafNode(grammarAccess.getAtomicStmtAccess().getFinalKeyword_4_1_1(), null); 
                                

                            }
                            break;

                    }

                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getAtomicStmtParserRuleCall_4_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7392);
                    this_AtomicStmt_14=ruleAtomicStmt();
                    _fsp--;

                     
                            current = this_AtomicStmt_14; 
                            currentNode = currentNode.getParent();
                        
                    match(input,89,FOLLOW_89_in_ruleAtomicStmt7401); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getDoKeyword_4_3(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3719:1: ( (lv_t03_16_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3720:1: (lv_t03_16_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3720:1: (lv_t03_16_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3721:3: lv_t03_16_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT03AtomicStmtParserRuleCall_4_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7422);
                    lv_t03_16_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t03",
                    	        		lv_t03_16_0, 
                    	        		"AtomicStmt", 
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
                case 6 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3744:6: ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3744:6: ( 'abstract' this_AtomicStmt_18= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3744:8: 'abstract' this_AtomicStmt_18= ruleAtomicStmt
                    {
                    match(input,102,FOLLOW_102_in_ruleAtomicStmt7440); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getAbstractKeyword_5_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getAtomicStmtParserRuleCall_5_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7462);
                    this_AtomicStmt_18=ruleAtomicStmt();
                    _fsp--;

                     
                            current = this_AtomicStmt_18; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3758:6: ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3758:6: ( 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3758:8: 'case' this_case_list_20= rulecase_list 'default' ( (lv_t15_22_0= ruleAtomicStmt ) )
                    {
                    match(input,103,FOLLOW_103_in_ruleAtomicStmt7479); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getCaseKeyword_6_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getCase_listParserRuleCall_6_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulecase_list_in_ruleAtomicStmt7501);
                    this_case_list_20=rulecase_list();
                    _fsp--;

                     
                            current = this_case_list_20; 
                            currentNode = currentNode.getParent();
                        
                    match(input,104,FOLLOW_104_in_ruleAtomicStmt7510); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getDefaultKeyword_6_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3775:1: ( (lv_t15_22_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3776:1: (lv_t15_22_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3776:1: (lv_t15_22_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3777:3: lv_t15_22_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT15AtomicStmtParserRuleCall_6_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7531);
                    lv_t15_22_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t15",
                    	        		lv_t15_22_0, 
                    	        		"AtomicStmt", 
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
                case 8 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3800:6: ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3800:6: ( 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3800:8: 'choose' this_Generic_24= ruleGeneric ( (lv_t23_25_0= ruleAtomicStmt ) )
                    {
                    match(input,105,FOLLOW_105_in_ruleAtomicStmt7549); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getChooseKeyword_7_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getGenericParserRuleCall_7_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGeneric_in_ruleAtomicStmt7571);
                    this_Generic_24=ruleGeneric();
                    _fsp--;

                     
                            current = this_Generic_24; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3813:1: ( (lv_t23_25_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3814:1: (lv_t23_25_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3814:1: (lv_t23_25_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3815:3: lv_t23_25_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT23AtomicStmtParserRuleCall_7_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7591);
                    lv_t23_25_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t23",
                    	        		lv_t23_25_0, 
                    	        		"AtomicStmt", 
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
                case 9 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3838:6: ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3838:6: ( 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3838:8: 'do' this_AtomicStmt_27= ruleAtomicStmt 'while' ( (lv_t06_29_0= ruledUtyExprs ) )
                    {
                    match(input,89,FOLLOW_89_in_ruleAtomicStmt7609); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getDoKeyword_8_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getAtomicStmtParserRuleCall_8_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7631);
                    this_AtomicStmt_27=ruleAtomicStmt();
                    _fsp--;

                     
                            current = this_AtomicStmt_27; 
                            currentNode = currentNode.getParent();
                        
                    match(input,106,FOLLOW_106_in_ruleAtomicStmt7640); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getWhileKeyword_8_2(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3855:1: ( (lv_t06_29_0= ruledUtyExprs ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3856:1: (lv_t06_29_0= ruledUtyExprs )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3856:1: (lv_t06_29_0= ruledUtyExprs )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3857:3: lv_t06_29_0= ruledUtyExprs
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT06DUtyExprsParserRuleCall_8_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruledUtyExprs_in_ruleAtomicStmt7661);
                    lv_t06_29_0=ruledUtyExprs();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t06",
                    	        		lv_t06_29_0, 
                    	        		"dUtyExprs", 
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
                case 10 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3880:6: ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3880:6: ( 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3880:8: 'for' this_Generic_31= ruleGeneric ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )? ( (lv_t_39_0= ruleAtomicStmt ) )
                    {
                    match(input,107,FOLLOW_107_in_ruleAtomicStmt7679); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getForKeyword_9_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getGenericParserRuleCall_9_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleGeneric_in_ruleAtomicStmt7701);
                    this_Generic_31=ruleGeneric();
                    _fsp--;

                     
                            current = this_Generic_31; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3893:1: ( 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==89) ) {
                        int LA37_1 = input.LA(2);

                        if ( ((LA37_1>=91 && LA37_1<=94)||(LA37_1>=116 && LA37_1<=119)) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3893:3: 'do' ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND )
                            {
                            match(input,89,FOLLOW_89_in_ruleAtomicStmt7711); 

                                    createLeafNode(grammarAccess.getAtomicStmtAccess().getDoKeyword_9_2_0(), null); 
                                
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3897:1: ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND )
                            int alt36=6;
                            switch ( input.LA(1) ) {
                            case 91:
                                {
                                alt36=1;
                                }
                                break;
                            case 93:
                                {
                                alt36=2;
                                }
                                break;
                            case 92:
                                {
                                alt36=3;
                                }
                                break;
                            case 94:
                                {
                                alt36=4;
                                }
                                break;
                            case 118:
                            case 119:
                                {
                                alt36=5;
                                }
                                break;
                            case 116:
                            case 117:
                                {
                                alt36=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("3897:1: ( '||' | '&&' | '|||' | '&&&' | ruleOR | ruleAND )", 36, 0, input);

                                throw nvae;
                            }

                            switch (alt36) {
                                case 1 :
                                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3897:3: '||'
                                    {
                                    match(input,91,FOLLOW_91_in_ruleAtomicStmt7722); 

                                            createLeafNode(grammarAccess.getAtomicStmtAccess().getVerticalLineVerticalLineKeyword_9_2_1_0(), null); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3902:7: '&&'
                                    {
                                    match(input,93,FOLLOW_93_in_ruleAtomicStmt7738); 

                                            createLeafNode(grammarAccess.getAtomicStmtAccess().getAmpersandAmpersandKeyword_9_2_1_1(), null); 
                                        

                                    }
                                    break;
                                case 3 :
                                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3907:7: '|||'
                                    {
                                    match(input,92,FOLLOW_92_in_ruleAtomicStmt7754); 

                                            createLeafNode(grammarAccess.getAtomicStmtAccess().getVerticalLineVerticalLineVerticalLineKeyword_9_2_1_2(), null); 
                                        

                                    }
                                    break;
                                case 4 :
                                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3912:7: '&&&'
                                    {
                                    match(input,94,FOLLOW_94_in_ruleAtomicStmt7770); 

                                            createLeafNode(grammarAccess.getAtomicStmtAccess().getAmpersandAmpersandAmpersandKeyword_9_2_1_3(), null); 
                                        

                                    }
                                    break;
                                case 5 :
                                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3917:6: ruleOR
                                    {
                                    pushFollow(FOLLOW_ruleOR_in_ruleAtomicStmt7785);
                                    ruleOR();
                                    _fsp--;


                                    }
                                    break;
                                case 6 :
                                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3918:6: ruleAND
                                    {
                                    pushFollow(FOLLOW_ruleAND_in_ruleAtomicStmt7792);
                                    ruleAND();
                                    _fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3918:16: ( (lv_t_39_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3919:1: (lv_t_39_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3919:1: (lv_t_39_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3920:3: lv_t_39_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getTAtomicStmtParserRuleCall_9_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7808);
                    lv_t_39_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t",
                    	        		lv_t_39_0, 
                    	        		"AtomicStmt", 
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
                case 11 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3943:6: ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3943:6: ( 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3943:8: 'if' this_dUtyExpr_41= ruledUtyExpr ( (lv_t13_42_0= ruleAtomicStmt ) ) 'else' ( (lv_t14_44_0= ruleAtomicStmt ) )
                    {
                    match(input,108,FOLLOW_108_in_ruleAtomicStmt7826); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getIfKeyword_10_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getDUtyExprParserRuleCall_10_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruledUtyExpr_in_ruleAtomicStmt7848);
                    this_dUtyExpr_41=ruledUtyExpr();
                    _fsp--;

                     
                            current = this_dUtyExpr_41; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3956:1: ( (lv_t13_42_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3957:1: (lv_t13_42_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3957:1: (lv_t13_42_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3958:3: lv_t13_42_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT13AtomicStmtParserRuleCall_10_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7868);
                    lv_t13_42_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t13",
                    	        		lv_t13_42_0, 
                    	        		"AtomicStmt", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,109,FOLLOW_109_in_ruleAtomicStmt7878); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getElseKeyword_10_3(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3984:1: ( (lv_t14_44_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3985:1: (lv_t14_44_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3985:1: (lv_t14_44_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:3986:3: lv_t14_44_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT14AtomicStmtParserRuleCall_10_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7899);
                    lv_t14_44_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t14",
                    	        		lv_t14_44_0, 
                    	        		"AtomicStmt", 
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
                case 12 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4009:6: ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4009:6: ( 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4009:8: 'let' '(' this_QName_47= ruleQName '=' ( (lv_expr_49_0= ruleUtyExpr ) ) ')' ( (lv_t24_51_0= ruleAtomicStmt ) )
                    {
                    match(input,110,FOLLOW_110_in_ruleAtomicStmt7917); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getLetKeyword_11_0(), null); 
                        
                    match(input,19,FOLLOW_19_in_ruleAtomicStmt7927); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getLeftParenthesisKeyword_11_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getQNameParserRuleCall_11_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleAtomicStmt7949);
                    this_QName_47=ruleQName();
                    _fsp--;

                     
                            current = this_QName_47; 
                            currentNode = currentNode.getParent();
                        
                    match(input,21,FOLLOW_21_in_ruleAtomicStmt7958); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getEqualsSignKeyword_11_3(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4030:1: ( (lv_expr_49_0= ruleUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4031:1: (lv_expr_49_0= ruleUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4031:1: (lv_expr_49_0= ruleUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4032:3: lv_expr_49_0= ruleUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getExprUtyExprParserRuleCall_11_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleUtyExpr_in_ruleAtomicStmt7979);
                    lv_expr_49_0=ruleUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_49_0, 
                    	        		"UtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleAtomicStmt7989); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getRightParenthesisKeyword_11_5(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4058:1: ( (lv_t24_51_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4059:1: (lv_t24_51_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4059:1: (lv_t24_51_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4060:3: lv_t24_51_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT24AtomicStmtParserRuleCall_11_6_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt8010);
                    lv_t24_51_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t24",
                    	        		lv_t24_51_0, 
                    	        		"AtomicStmt", 
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
                case 13 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4083:6: ( 'loop' this_AtomicStmt_53= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4083:6: ( 'loop' this_AtomicStmt_53= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4083:8: 'loop' this_AtomicStmt_53= ruleAtomicStmt
                    {
                    match(input,111,FOLLOW_111_in_ruleAtomicStmt8028); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getLoopKeyword_12_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getAtomicStmtParserRuleCall_12_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt8050);
                    this_AtomicStmt_53=ruleAtomicStmt();
                    _fsp--;

                     
                            current = this_AtomicStmt_53; 
                            currentNode = currentNode.getParent();
                        

                    }


                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4097:6: ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4097:6: ( 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4097:8: 'while' this_dUtyExpr_55= ruledUtyExpr ( (lv_t07_56_0= ruleAtomicStmt ) )
                    {
                    match(input,106,FOLLOW_106_in_ruleAtomicStmt8067); 

                            createLeafNode(grammarAccess.getAtomicStmtAccess().getWhileKeyword_13_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getDUtyExprParserRuleCall_13_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruledUtyExpr_in_ruleAtomicStmt8089);
                    this_dUtyExpr_55=ruledUtyExpr();
                    _fsp--;

                     
                            current = this_dUtyExpr_55; 
                            currentNode = currentNode.getParent();
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4110:1: ( (lv_t07_56_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4111:1: (lv_t07_56_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4111:1: (lv_t07_56_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4112:3: lv_t07_56_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getT07AtomicStmtParserRuleCall_13_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt8109);
                    lv_t07_56_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAtomicStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t07",
                    	        		lv_t07_56_0, 
                    	        		"AtomicStmt", 
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
                case 15 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4136:5: this_LocStmt_57= ruleLocStmt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStmtAccess().getLocStmtParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocStmt_in_ruleAtomicStmt8138);
                    this_LocStmt_57=ruleLocStmt();
                    _fsp--;

                     
                            current = this_LocStmt_57; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAtomicStmt


    // $ANTLR start entryRuleNamedStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4152:1: entryRuleNamedStmt returns [EObject current=null] : iv_ruleNamedStmt= ruleNamedStmt EOF ;
    public final EObject entryRuleNamedStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedStmt = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4153:2: (iv_ruleNamedStmt= ruleNamedStmt EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4154:2: iv_ruleNamedStmt= ruleNamedStmt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNamedStmtRule(), currentNode); 
            pushFollow(FOLLOW_ruleNamedStmt_in_entryRuleNamedStmt8173);
            iv_ruleNamedStmt=ruleNamedStmt();
            _fsp--;

             current =iv_ruleNamedStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedStmt8183); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNamedStmt


    // $ANTLR start ruleNamedStmt
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4161:1: ruleNamedStmt returns [EObject current=null] : ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) ) ;
    public final EObject ruleNamedStmt() throws RecognitionException {
        EObject current = null;

        EObject this_QName_0 = null;

        EObject this_QName_4 = null;

        EObject this_QName_8 = null;

        EObject lv_name_10_0 = null;

        EObject lv_exprs_12_0 = null;

        EObject this_QName_15 = null;

        EObject lv_name_17_0 = null;

        EObject lv_expr_20_0 = null;

        EObject lv_t10_21_0 = null;


         @SuppressWarnings("unused") EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4166:6: ( ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4167:1: ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4167:1: ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==84) ) {
                    switch ( input.LA(3) ) {
                    case 113:
                        {
                        alt42=2;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt42=3;
                        }
                        break;
                    case 112:
                        {
                        alt42=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("4167:1: ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) )", 42, 5, input);

                        throw nvae;
                    }

                }
                else if ( (LA42_1==23) ) {
                    alt42=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("4167:1: ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) )", 42, 1, input);

                    throw nvae;
                }
                }
                break;
            case 112:
                {
                alt42=1;
                }
                break;
            case 113:
                {
                alt42=2;
                }
                break;
            case 114:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4167:1: ( ( (this_QName_0= ruleQName ':' )? 'pause' ';' ) | ( (this_QName_4= ruleQName ':' )? 'halt' ';' ) | (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' ) | ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) ) )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4167:2: ( (this_QName_0= ruleQName ':' )? 'pause' ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4167:2: ( (this_QName_0= ruleQName ':' )? 'pause' ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4167:3: (this_QName_0= ruleQName ':' )? 'pause' ';'
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4167:3: (this_QName_0= ruleQName ':' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_ID) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4168:5: this_QName_0= ruleQName ':'
                            {
                             
                                    currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getQNameParserRuleCall_0_0_0(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleQName_in_ruleNamedStmt8232);
                            this_QName_0=ruleQName();
                            _fsp--;

                             
                                    current = this_QName_0; 
                                    currentNode = currentNode.getParent();
                                
                            match(input,84,FOLLOW_84_in_ruleNamedStmt8241); 

                                    createLeafNode(grammarAccess.getNamedStmtAccess().getColonKeyword_0_0_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,112,FOLLOW_112_in_ruleNamedStmt8253); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getPauseKeyword_0_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleNamedStmt8263); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getSemicolonKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4189:6: ( (this_QName_4= ruleQName ':' )? 'halt' ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4189:6: ( (this_QName_4= ruleQName ':' )? 'halt' ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4189:7: (this_QName_4= ruleQName ':' )? 'halt' ';'
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4189:7: (this_QName_4= ruleQName ':' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_ID) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4190:5: this_QName_4= ruleQName ':'
                            {
                             
                                    currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getQNameParserRuleCall_1_0_0(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleQName_in_ruleNamedStmt8294);
                            this_QName_4=ruleQName();
                            _fsp--;

                             
                                    current = this_QName_4; 
                                    currentNode = currentNode.getParent();
                                
                            match(input,84,FOLLOW_84_in_ruleNamedStmt8303); 

                                    createLeafNode(grammarAccess.getNamedStmtAccess().getColonKeyword_1_0_1(), null); 
                                

                            }
                            break;

                    }

                    match(input,113,FOLLOW_113_in_ruleNamedStmt8315); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getHaltKeyword_1_1(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleNamedStmt8325); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getSemicolonKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4211:6: (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4211:6: (this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';' )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4212:5: this_QName_8= ruleQName ':' ( (lv_name_10_0= ruleQName ) ) '(' ( (lv_exprs_12_0= ruleOptUtyExprList ) ) ')' ';'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getQNameParserRuleCall_2_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleQName_in_ruleNamedStmt8355);
                    this_QName_8=ruleQName();
                    _fsp--;

                     
                            current = this_QName_8; 
                            currentNode = currentNode.getParent();
                        
                    match(input,84,FOLLOW_84_in_ruleNamedStmt8364); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getColonKeyword_2_1(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4224:1: ( (lv_name_10_0= ruleQName ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4225:1: (lv_name_10_0= ruleQName )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4225:1: (lv_name_10_0= ruleQName )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4226:3: lv_name_10_0= ruleQName
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getNameQNameParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleNamedStmt8385);
                    lv_name_10_0=ruleQName();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_10_0, 
                    	        		"QName", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleNamedStmt8395); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getLeftParenthesisKeyword_2_3(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4252:1: ( (lv_exprs_12_0= ruleOptUtyExprList ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4253:1: (lv_exprs_12_0= ruleOptUtyExprList )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4253:1: (lv_exprs_12_0= ruleOptUtyExprList )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4254:3: lv_exprs_12_0= ruleOptUtyExprList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getExprsOptUtyExprListParserRuleCall_2_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleOptUtyExprList_in_ruleNamedStmt8416);
                    lv_exprs_12_0=ruleOptUtyExprList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"exprs",
                    	        		lv_exprs_12_0, 
                    	        		"OptUtyExprList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,20,FOLLOW_20_in_ruleNamedStmt8426); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getRightParenthesisKeyword_2_5(), null); 
                        
                    match(input,14,FOLLOW_14_in_ruleNamedStmt8436); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getSemicolonKeyword_2_6(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4285:6: ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4285:6: ( (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4285:7: (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )? 'every' ( (lv_expr_20_0= ruledUtyExpr ) ) ( (lv_t10_21_0= ruleAtomicStmt ) )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4285:7: (this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_ID) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4286:5: this_QName_15= ruleQName ',' ( (lv_name_17_0= ruleQName ) ) ':'
                            {
                             
                                    currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getQNameParserRuleCall_3_0_0(), currentNode); 
                                
                            pushFollow(FOLLOW_ruleQName_in_ruleNamedStmt8467);
                            this_QName_15=ruleQName();
                            _fsp--;

                             
                                    current = this_QName_15; 
                                    currentNode = currentNode.getParent();
                                
                            match(input,23,FOLLOW_23_in_ruleNamedStmt8476); 

                                    createLeafNode(grammarAccess.getNamedStmtAccess().getCommaKeyword_3_0_1(), null); 
                                
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4298:1: ( (lv_name_17_0= ruleQName ) )
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4299:1: (lv_name_17_0= ruleQName )
                            {
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4299:1: (lv_name_17_0= ruleQName )
                            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4300:3: lv_name_17_0= ruleQName
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getNameQNameParserRuleCall_3_0_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleQName_in_ruleNamedStmt8497);
                            lv_name_17_0=ruleQName();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getNamedStmtRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"name",
                            	        		lv_name_17_0, 
                            	        		"QName", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            match(input,84,FOLLOW_84_in_ruleNamedStmt8507); 

                                    createLeafNode(grammarAccess.getNamedStmtAccess().getColonKeyword_3_0_3(), null); 
                                

                            }
                            break;

                    }

                    match(input,114,FOLLOW_114_in_ruleNamedStmt8519); 

                            createLeafNode(grammarAccess.getNamedStmtAccess().getEveryKeyword_3_1(), null); 
                        
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4330:1: ( (lv_expr_20_0= ruledUtyExpr ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4331:1: (lv_expr_20_0= ruledUtyExpr )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4331:1: (lv_expr_20_0= ruledUtyExpr )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4332:3: lv_expr_20_0= ruledUtyExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getExprDUtyExprParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruledUtyExpr_in_ruleNamedStmt8540);
                    lv_expr_20_0=ruledUtyExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"expr",
                    	        		lv_expr_20_0, 
                    	        		"dUtyExpr", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4354:2: ( (lv_t10_21_0= ruleAtomicStmt ) )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4355:1: (lv_t10_21_0= ruleAtomicStmt )
                    {
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4355:1: (lv_t10_21_0= ruleAtomicStmt )
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4356:3: lv_t10_21_0= ruleAtomicStmt
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getNamedStmtAccess().getT10AtomicStmtParserRuleCall_3_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicStmt_in_ruleNamedStmt8561);
                    lv_t10_21_0=ruleAtomicStmt();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getNamedStmtRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"t10",
                    	        		lv_t10_21_0, 
                    	        		"AtomicStmt", 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNamedStmt


    // $ANTLR start entryRuleNOT
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4386:1: entryRuleNOT returns [String current=null] : iv_ruleNOT= ruleNOT EOF ;
    public final String entryRuleNOT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNOT = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4387:2: (iv_ruleNOT= ruleNOT EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4388:2: iv_ruleNOT= ruleNOT EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNOTRule(), currentNode); 
            pushFollow(FOLLOW_ruleNOT_in_entryRuleNOT8599);
            iv_ruleNOT=ruleNOT();
            _fsp--;

             current =iv_ruleNOT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNOT8610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNOT


    // $ANTLR start ruleNOT
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4395:1: ruleNOT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleNOT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4400:6: ( (kw= '!' | kw= 'not' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4401:1: (kw= '!' | kw= 'not' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4401:1: (kw= '!' | kw= 'not' )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==36) ) {
                alt43=1;
            }
            else if ( (LA43_0==115) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4401:1: (kw= '!' | kw= 'not' )", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4402:2: kw= '!'
                    {
                    kw=(Token)input.LT(1);
                    match(input,36,FOLLOW_36_in_ruleNOT8648); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getNOTAccess().getExclamationMarkKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4409:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,115,FOLLOW_115_in_ruleNOT8667); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getNOTAccess().getNotKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleNOT


    // $ANTLR start entryRuleAND
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4422:1: entryRuleAND returns [String current=null] : iv_ruleAND= ruleAND EOF ;
    public final String entryRuleAND() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4423:2: (iv_ruleAND= ruleAND EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4424:2: iv_ruleAND= ruleAND EOF
            {
             currentNode = createCompositeNode(grammarAccess.getANDRule(), currentNode); 
            pushFollow(FOLLOW_ruleAND_in_entryRuleAND8708);
            iv_ruleAND=ruleAND();
            _fsp--;

             current =iv_ruleAND.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAND8719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAND


    // $ANTLR start ruleAND
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4431:1: ruleAND returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleAND() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4436:6: ( (kw= '&' | kw= 'and' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4437:1: (kw= '&' | kw= 'and' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4437:1: (kw= '&' | kw= 'and' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==116) ) {
                alt44=1;
            }
            else if ( (LA44_0==117) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4437:1: (kw= '&' | kw= 'and' )", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4438:2: kw= '&'
                    {
                    kw=(Token)input.LT(1);
                    match(input,116,FOLLOW_116_in_ruleAND8757); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getANDAccess().getAmpersandKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4445:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,117,FOLLOW_117_in_ruleAND8776); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getANDAccess().getAndKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAND


    // $ANTLR start entryRuleOR
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4460:1: entryRuleOR returns [String current=null] : iv_ruleOR= ruleOR EOF ;
    public final String entryRuleOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOR = null;


        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4461:2: (iv_ruleOR= ruleOR EOF )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4462:2: iv_ruleOR= ruleOR EOF
            {
             currentNode = createCompositeNode(grammarAccess.getORRule(), currentNode); 
            pushFollow(FOLLOW_ruleOR_in_entryRuleOR8819);
            iv_ruleOR=ruleOR();
            _fsp--;

             current =iv_ruleOR.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOR8830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOR


    // $ANTLR start ruleOR
    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4469:1: ruleOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '|' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4474:6: ( (kw= '|' | kw= 'or' ) )
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4475:1: (kw= '|' | kw= 'or' )
            {
            // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4475:1: (kw= '|' | kw= 'or' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==118) ) {
                alt45=1;
            }
            else if ( (LA45_0==119) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4475:1: (kw= '|' | kw= 'or' )", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4476:2: kw= '|'
                    {
                    kw=(Token)input.LT(1);
                    match(input,118,FOLLOW_118_in_ruleOR8868); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getORAccess().getVerticalLineKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.quartz.editor/src-gen/de/cau/cs/kieler/quartz/editor/parser/antlr/internal/InternalQuartz.g:4483:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,119,FOLLOW_119_in_ruleOR8887); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getORAccess().getOrKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleOR


 

    public static final BitSet FOLLOW_ruleQrzFile_in_entryRuleQrzFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQrzFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackagePath_in_ruleQrzFile133 = new BitSet(new long[]{0x0000000000448000L});
    public static final BitSet FOLLOW_ruleImportList_in_ruleQrzFile155 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_ruleMacroDef_in_ruleQrzFile177 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_ruleQModule_in_ruleQrzFile199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackagePath_in_entryRulePackagePath235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackagePath245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulePackagePath280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePointedName_in_rulePackagePath302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePackagePath311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportList_in_entryRuleImportList347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportList357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleImportList392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePointedName_in_ruleImportList413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportList423 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rulePointedName_in_entryRulePointedName460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointedName470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePointedName512 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_rulePointedName528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePointedName_in_rulePointedName549 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_rulePointedName569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMacroDef_in_entryRuleMacroDef618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMacroDef628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMacroDef664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleMacroDef685 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMacroDef695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQNameList_in_ruleMacroDef716 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMacroDef726 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMacroDef736 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleMacroDef757 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMacroDef767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMacroDef785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleMacroDef806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMacroDef816 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMacroDef826 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMacroDef836 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleMacroDef857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMacroDef867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQModule_in_entryRuleQModule904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQModule914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleQModule949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleName_in_ruleQModule970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQModule980 = new BitSet(new long[]{0x000000019F000000L});
    public static final BitSet FOLLOW_ruleInterfaceList_in_ruleQModule1001 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleQModule1011 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleLocStmt_in_ruleQModule1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleName1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleQName1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNameList_in_entryRuleQNameList1250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNameList1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleQNameList1306 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQNameList1317 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleQNameList1338 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleStorage_in_entryRuleStorage1377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStorage1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStorage1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStorage1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQType_in_entryRuleQType1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQType1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleQType1531 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_27_in_ruleQType1547 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28_in_ruleQType1563 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28_in_ruleQType1580 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQType1590 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleQType1611 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQType1621 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31_in_ruleQType1638 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31_in_ruleQType1655 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQType1665 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleQType1686 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQType1696 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32_in_ruleQType1713 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_32_in_ruleQType1730 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleQType1740 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleQType1761 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleQType1771 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleDimList_in_ruleQType1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDimList_in_entryRuleDimList1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDimList1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDimList1878 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleDimList1899 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDimList1909 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleInOutName_in_entryRuleInOutName1946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutName1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInOutName1992 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_36_in_ruleInOutName2008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleInOutName2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutNameList_in_entryRuleInOutNameList2067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutNameList2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutName_in_ruleInOutNameList2124 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleInOutNameList2134 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_ruleInOutName_in_ruleInOutNameList2155 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleInOutNameListComma_in_entryRuleInOutNameListComma2193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInOutNameListComma2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInOutName_in_ruleInOutNameListComma2249 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInOutNameListComma2259 = new BitSet(new long[]{0x0000001800000012L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface2296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStorage_in_ruleInterface2343 = new BitSet(new long[]{0x000000019C000000L});
    public static final BitSet FOLLOW_ruleQType_in_ruleInterface2358 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_24_in_ruleInterface2375 = new BitSet(new long[]{0x0000001800000010L});
    public static final BitSet FOLLOW_ruleInOutNameList_in_ruleInterface2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceList_in_entryRuleInterfaceList2435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceList2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleInterfaceList2491 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceList2502 = new BitSet(new long[]{0x000000019F000000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleInterfaceList2523 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleFixpointEqList_in_entryRuleFixpointEqList2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFixpointEqList2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFixpointEqList2613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_38_in_ruleFixpointEqList2629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleFixpointEqList2651 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFixpointEqList2661 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleFixpointEqList2682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFixpointEqList2692 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleOptUtyExpr_in_entryRuleOptUtyExpr2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptUtyExpr2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOptUtyExpr2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleOptUtyExpr2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptUtyExprList_in_entryRuleOptUtyExprList2837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptUtyExprList2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptUtyExpr_in_ruleOptUtyExprList2894 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleOptUtyExprList2904 = new BitSet(new long[]{0xFFF7FFF0200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleOptUtyExpr_in_ruleOptUtyExprList2925 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleUtyExpr_in_entryRuleUtyExpr2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUtyExpr2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleUtyExpr3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleUtyExpr3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleUtyExpr3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleUtyExpr3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUtyExpr3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BVCONST_in_ruleUtyExpr3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTCONST_in_ruleUtyExpr3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEXCONST_in_ruleUtyExpr3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATCONST_in_ruleUtyExpr3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REALCONST_in_ruleUtyExpr3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleUtyExpr3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOT_in_ruleUtyExpr3200 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleUtyExpr3239 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUtyExpr3278 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUtyExpr3317 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3327 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3349 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleUtyExpr3376 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUtyExpr3386 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3408 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUtyExpr3417 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3427 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3448 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleUtyExpr3476 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3486 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3508 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleUtyExpr3535 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3545 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3567 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUtyExpr3594 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3616 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleUtyExpr3625 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3646 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleUtyExpr3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUtyExpr3674 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3684 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3706 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleUtyExpr3733 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3743 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3765 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleUtyExpr3792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3802 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3824 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleUtyExpr3851 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleUtyExpr3883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleUtyExpr3910 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3920 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr3942 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUtyExpr3969 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr3979 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4001 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleUtyExpr4028 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4038 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4060 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUtyExpr4087 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4097 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4119 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleUtyExpr4146 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4156 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4178 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUtyExpr4205 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4215 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4237 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleUtyExpr4264 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4274 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4296 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleUtyExpr4323 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4333 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4355 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUtyExpr4364 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4385 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleUtyExpr4413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4423 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4445 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUtyExpr4454 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4475 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleUtyExpr4503 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr4513 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4535 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUtyExpr4562 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleGeneric_in_ruleUtyExpr4584 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUtyExpr4622 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleGeneric_in_ruleUtyExpr4644 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleUtyExpr4682 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleGeneric_in_ruleUtyExpr4704 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleUtyExpr4742 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleUtyExpr4781 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleUtyExpr4820 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleUtyExpr4859 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleUtyExpr4898 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleUtyExpr4937 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleUtyExpr4976 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleUtyExpr5015 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleUtyExpr5054 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleUtyExpr5093 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleUtyExpr5132 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleUtyExpr5171 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleUtyExpr5210 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleUtyExpr5249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleUtyExpr5270 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUtyExpr5280 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUtyExpr5319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleUtyExpr5340 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUtyExpr5350 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleUtyExpr5389 = new BitSet(new long[]{0x0000006000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleFixpointEqList_in_ruleUtyExpr5411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleUtyExpr5420 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleUtyExpr5459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleUtyExpr5480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleUtyExpr5490 = new BitSet(new long[]{0x000000019C000000L});
    public static final BitSet FOLLOW_ruleQType_in_ruleUtyExpr5511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUtyExpr5521 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleUtyExpr5560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleUtyExpr5581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleUtyExpr5591 = new BitSet(new long[]{0x000000019C000000L});
    public static final BitSet FOLLOW_ruleQType_in_ruleUtyExpr5612 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUtyExpr5622 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUtyExpr5661 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyExpr5683 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyExpr5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUtyAction_in_entryRuleUtyAction5729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUtyAction5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleUtyAction5775 = new BitSet(new long[]{0x0010000000080000L});
    public static final BitSet FOLLOW_52_in_ruleUtyAction5786 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyAction5798 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction5820 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyAction5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUtyAction5847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyAction5857 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction5879 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyAction5888 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUtyAction5898 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleUtyAction5937 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyAction5947 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction5969 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyAction5978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleUtyAction5988 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleUtyAction6027 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyAction6037 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction6059 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyAction6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleUtyAction6086 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleUtyAction6096 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleUtyAction6118 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleUtyAction6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecase_list_in_entryRulecase_list6164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecase_list6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledUtyExpr_in_rulecase_list6220 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_rulecase_list6230 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleStmt_in_rulecase_list6251 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruledUtyExpr_in_entryRuledUtyExpr6288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledUtyExpr6298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruledUtyExpr6333 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruledUtyExpr6355 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruledUtyExpr6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledUtyExprs_in_entryRuledUtyExprs6400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledUtyExprs6410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledUtyExpr_in_ruledUtyExprs6457 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruledUtyExprs6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneric_in_entryRuleGeneric6502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneric6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGeneric6547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleGeneric6569 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGeneric6578 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleGeneric6599 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleGeneric6609 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleGeneric6630 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGeneric6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocStmt_in_entryRuleLocStmt6676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocStmt6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLocStmt6721 = new BitSet(new long[]{0x00120001BF000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleInterfaceList_in_ruleLocStmt6743 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLocStmt6753 = new BitSet(new long[]{0x00120001BF000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleLocStmt6776 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLocStmt6786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqStmt_in_entryRuleSeqStmt6822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeqStmt6832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleSeqStmt6877 = new BitSet(new long[]{0x0012000020000012L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt6913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeqStmt_in_ruleStmt6969 = new BitSet(new long[]{0x0000000000000002L,0x00F0000078000000L});
    public static final BitSet FOLLOW_91_in_ruleStmt6981 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_92_in_ruleStmt6997 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleOR_in_ruleStmt7012 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_93_in_ruleStmt7020 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_94_in_ruleStmt7036 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAND_in_ruleStmt7051 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleSeqStmt_in_ruleStmt7065 = new BitSet(new long[]{0x0000000000000002L,0x00F0000078000000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_entryRuleAtomicStmt7103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicStmt7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleAtomicStmt7149 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicStmt7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUtyAction_in_ruleAtomicStmt7189 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAtomicStmt7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedStmt_in_ruleAtomicStmt7227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleAtomicStmt7244 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_97_in_ruleAtomicStmt7257 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleAtomicStmt7269 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7291 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleAtomicStmt7300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruledUtyExprs_in_ruleAtomicStmt7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleAtomicStmt7340 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_100_in_ruleAtomicStmt7353 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_101_in_ruleAtomicStmt7369 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7392 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleAtomicStmt7401 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleAtomicStmt7440 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleAtomicStmt7479 = new BitSet(new long[]{0x0000000000080000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rulecase_list_in_ruleAtomicStmt7501 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_ruleAtomicStmt7510 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleAtomicStmt7549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleGeneric_in_ruleAtomicStmt7571 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleAtomicStmt7609 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7631 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ruleAtomicStmt7640 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruledUtyExprs_in_ruleAtomicStmt7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleAtomicStmt7679 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleGeneric_in_ruleAtomicStmt7701 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_89_in_ruleAtomicStmt7711 = new BitSet(new long[]{0x0000000000000000L,0x00F0000078000000L});
    public static final BitSet FOLLOW_91_in_ruleAtomicStmt7722 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_93_in_ruleAtomicStmt7738 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_92_in_ruleAtomicStmt7754 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_94_in_ruleAtomicStmt7770 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleOR_in_ruleAtomicStmt7785 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAND_in_ruleAtomicStmt7792 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleAtomicStmt7826 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruledUtyExpr_in_ruleAtomicStmt7848 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7868 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_ruleAtomicStmt7878 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleAtomicStmt7917 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAtomicStmt7927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleAtomicStmt7949 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAtomicStmt7958 = new BitSet(new long[]{0xFFF7FF70200803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleUtyExpr_in_ruleAtomicStmt7979 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAtomicStmt7989 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleAtomicStmt8028 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleAtomicStmt8067 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruledUtyExpr_in_ruleAtomicStmt8089 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleAtomicStmt8109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocStmt_in_ruleAtomicStmt8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedStmt_in_entryRuleNamedStmt8173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedStmt8183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamedStmt8232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleNamedStmt8241 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_ruleNamedStmt8253 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamedStmt8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamedStmt8294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleNamedStmt8303 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleNamedStmt8315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamedStmt8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamedStmt8355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleNamedStmt8364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamedStmt8385 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNamedStmt8395 = new BitSet(new long[]{0xFFF7FFF0201803F0L,0x000800000007FFFFL});
    public static final BitSet FOLLOW_ruleOptUtyExprList_in_ruleNamedStmt8416 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNamedStmt8426 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNamedStmt8436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamedStmt8467 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNamedStmt8476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNamedStmt8497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_ruleNamedStmt8507 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleNamedStmt8519 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruledUtyExpr_in_ruleNamedStmt8540 = new BitSet(new long[]{0x0012000020000010L,0x0007DEF783A00000L});
    public static final BitSet FOLLOW_ruleAtomicStmt_in_ruleNamedStmt8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNOT_in_entryRuleNOT8599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNOT8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleNOT8648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleNOT8667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_entryRuleAND8708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAND8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleAND8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleAND8776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_entryRuleOR8819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOR8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleOR8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleOR8887 = new BitSet(new long[]{0x0000000000000002L});

}