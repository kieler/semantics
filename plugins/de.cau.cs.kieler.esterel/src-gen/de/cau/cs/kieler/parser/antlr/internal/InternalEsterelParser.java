package de.cau.cs.kieler.parser.antlr.internal; 

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
import de.cau.cs.kieler.services.EsterelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalEsterelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BASETYPE", "RULE_NUMBER", "RULE_INT", "RULE_STRING", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ESTEREL_SL_COMMENT", "RULE_ESTEREL_ML_COMMENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "':'", "'end'", "'.'", "'input'", "','", "';'", "'output'", "'inputoutput'", "'return'", "'sensor'", "'relation'", "'=>'", "'#'", "'type'", "'constant'", "'='", "'function'", "'('", "')'", "'||'", "'['", "']'", "':='", "'abort'", "'when'", "'do'", "'case'", "'await'", "'upto'", "'watching'", "'timeout'", "'emit'", "'every'", "'exit'", "'halt'", "'if'", "'elsif'", "'then'", "'else'", "'loop'", "'each'", "'nothing'", "'pause'", "'present'", "'positive'", "'repeat'", "'times'", "'run'", "'copymodule'", "'/'", "'signal'", "'in'", "'suspend'", "'sustain'", "'trap'", "'handle'", "'var'", "'weak'", "'?'", "'pre'", "'??'", "'and'", "'or'", "'not'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'+'", "'-'", "'*'", "'mod'"
    };
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_NUMBER=6;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_INT=7;
    public static final int RULE_WS=15;
    public static final int RULE_FLOAT=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_BASETYPE=5;
    public static final int RULE_ESTEREL_ML_COMMENT=12;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_ESTEREL_SL_COMMENT=11;

        public InternalEsterelParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g"; }


     
     	private EsterelGrammarAccess grammarAccess;
     	
        public InternalEsterelParser(TokenStream input, IAstFactory factory, EsterelGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Programm";	
       	} 



    // $ANTLR start entryRuleProgramm
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:72:1: entryRuleProgramm returns [EObject current=null] : iv_ruleProgramm= ruleProgramm EOF ;
    public final EObject entryRuleProgramm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramm = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:72:50: (iv_ruleProgramm= ruleProgramm EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:73:2: iv_ruleProgramm= ruleProgramm EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgrammRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgramm_in_entryRuleProgramm73);
            iv_ruleProgramm=ruleProgramm();
            _fsp--;

             current =iv_ruleProgramm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgramm83); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleProgramm


    // $ANTLR start ruleProgramm
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:80:1: ruleProgramm returns [EObject current=null] : ( (lv_module_0= ruleMainModule ) (lv_module_1= ruleModule )* ) ;
    public final EObject ruleProgramm() throws RecognitionException {
        EObject current = null;

        EObject lv_module_0 = null;

        EObject lv_module_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_ESTEREL_SL_COMMENT", "RULE_ESTEREL_ML_COMMENT", "RULE_WS");
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:87:6: ( ( (lv_module_0= ruleMainModule ) (lv_module_1= ruleModule )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:88:1: ( (lv_module_0= ruleMainModule ) (lv_module_1= ruleModule )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:88:1: ( (lv_module_0= ruleMainModule ) (lv_module_1= ruleModule )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:88:2: (lv_module_0= ruleMainModule ) (lv_module_1= ruleModule )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:88:2: (lv_module_0= ruleMainModule )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:91:6: lv_module_0= ruleMainModule
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgrammAccess().getModuleMainModuleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleMainModule_in_ruleProgramm142);
            lv_module_0=ruleMainModule();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getProgrammRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "module", lv_module_0, "MainModule", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:109:2: (lv_module_1= ruleModule )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:112:6: lv_module_1= ruleModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgrammAccess().getModuleModuleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleModule_in_ruleProgramm180);
            	    lv_module_1=ruleModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getProgrammRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "module", lv_module_1, "Module", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
            		myHiddenTokenState.restore();
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgramm


    // $ANTLR start entryRuleMainModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:137:1: entryRuleMainModule returns [EObject current=null] : iv_ruleMainModule= ruleMainModule EOF ;
    public final EObject entryRuleMainModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainModule = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:137:52: (iv_ruleMainModule= ruleMainModule EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:138:2: iv_ruleMainModule= ruleMainModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMainModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleMainModule_in_entryRuleMainModule218);
            iv_ruleMainModule=ruleMainModule();
            _fsp--;

             current =iv_ruleMainModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainModule228); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleMainModule


    // $ANTLR start ruleMainModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:145:1: ruleMainModule returns [EObject current=null] : ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule ) ;
    public final EObject ruleMainModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_modInt_3 = null;

        EObject lv_modBody_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:150:6: ( ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:151:1: ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:151:1: ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:151:2: 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule
            {
            match(input,17,FOLLOW_17_in_ruleMainModule262); 

                    createLeafNode(grammarAccess.getMainModuleAccess().getModuleKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:155:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:157:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMainModule284); 

            		createLeafNode(grammarAccess.getMainModuleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMainModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleMainModule301); 

                    createLeafNode(grammarAccess.getMainModuleAccess().getColonKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:179:1: (lv_modInt_3= ruleModuleInterface )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=28)||(LA2_0>=31 && LA2_0<=32)||LA2_0==34) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:182:6: lv_modInt_3= ruleModuleInterface
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getMainModuleAccess().getModIntModuleInterfaceParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleInterface_in_ruleMainModule335);
                    lv_modInt_3=ruleModuleInterface();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getMainModuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "modInt", lv_modInt_3, "ModuleInterface", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:200:3: (lv_modBody_4= ruleModuleBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:203:6: lv_modBody_4= ruleModuleBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getMainModuleAccess().getModBodyModuleBodyParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModuleBody_in_ruleMainModule374);
            lv_modBody_4=ruleModuleBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getMainModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "modBody", lv_modBody_4, "ModuleBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            pushFollow(FOLLOW_ruleEndModule_in_ruleMainModule387);
            ruleEndModule();
            _fsp--;


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
    // $ANTLR end ruleMainModule


    // $ANTLR start entryRuleModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:228:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:228:48: (iv_ruleModule= ruleModule EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:229:2: iv_ruleModule= ruleModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule412);
            iv_ruleModule=ruleModule();
            _fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule422); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModule


    // $ANTLR start ruleModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:236:1: ruleModule returns [EObject current=null] : ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_modInt_3 = null;

        EObject lv_modBody_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:241:6: ( ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:242:1: ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:242:1: ( 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:242:2: 'module' (lv_name_1= RULE_ID ) ':' (lv_modInt_3= ruleModuleInterface )? (lv_modBody_4= ruleModuleBody ) ruleEndModule
            {
            match(input,17,FOLLOW_17_in_ruleModule456); 

                    createLeafNode(grammarAccess.getModuleAccess().getModuleKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:246:1: (lv_name_1= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:248:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModule478); 

            		createLeafNode(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleModule495); 

                    createLeafNode(grammarAccess.getModuleAccess().getColonKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:270:1: (lv_modInt_3= ruleModuleInterface )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21||(LA3_0>=24 && LA3_0<=28)||(LA3_0>=31 && LA3_0<=32)||LA3_0==34) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:273:6: lv_modInt_3= ruleModuleInterface
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModIntModuleInterfaceParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleInterface_in_ruleModule529);
                    lv_modInt_3=ruleModuleInterface();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "modInt", lv_modInt_3, "ModuleInterface", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:291:3: (lv_modBody_4= ruleModuleBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:294:6: lv_modBody_4= ruleModuleBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleAccess().getModBodyModuleBodyParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleModuleBody_in_ruleModule568);
            lv_modBody_4=ruleModuleBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "modBody", lv_modBody_4, "ModuleBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            pushFollow(FOLLOW_ruleEndModule_in_ruleModule581);
            ruleEndModule();
            _fsp--;


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
    // $ANTLR end ruleModule


    // $ANTLR start entryRuleEndModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:319:1: entryRuleEndModule returns [String current=null] : iv_ruleEndModule= ruleEndModule EOF ;
    public final String entryRuleEndModule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndModule = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:319:50: (iv_ruleEndModule= ruleEndModule EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:320:2: iv_ruleEndModule= ruleEndModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEndModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleEndModule_in_entryRuleEndModule607);
            iv_ruleEndModule=ruleEndModule();
            _fsp--;

             current =iv_ruleEndModule.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndModule618); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEndModule


    // $ANTLR start ruleEndModule
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:327:1: ruleEndModule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'end' kw= 'module' ) | kw= '.' ) ;
    public final AntlrDatatypeRuleToken ruleEndModule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:333:6: ( ( (kw= 'end' kw= 'module' ) | kw= '.' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:334:1: ( (kw= 'end' kw= 'module' ) | kw= '.' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:334:1: ( (kw= 'end' kw= 'module' ) | kw= '.' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("334:1: ( (kw= 'end' kw= 'module' ) | kw= '.' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:334:2: (kw= 'end' kw= 'module' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:334:2: (kw= 'end' kw= 'module' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:335:2: kw= 'end' kw= 'module'
                    {
                    kw=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleEndModule657); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndModuleAccess().getEndKeyword_0_0(), null); 
                        
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleEndModule670); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndModuleAccess().getModuleKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:348:2: kw= '.'
                    {
                    kw=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruleEndModule690); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndModuleAccess().getFullStopKeyword_1(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEndModule


    // $ANTLR start entryRuleModuleBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:361:1: entryRuleModuleBody returns [EObject current=null] : iv_ruleModuleBody= ruleModuleBody EOF ;
    public final EObject entryRuleModuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:361:52: (iv_ruleModuleBody= ruleModuleBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:362:2: iv_ruleModuleBody= ruleModuleBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleBody_in_entryRuleModuleBody728);
            iv_ruleModuleBody=ruleModuleBody();
            _fsp--;

             current =iv_ruleModuleBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleBody738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleBody


    // $ANTLR start ruleModuleBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:369:1: ruleModuleBody returns [EObject current=null] : (lv_statement_0= ruleStatement ) ;
    public final EObject ruleModuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:374:6: ( (lv_statement_0= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:375:1: (lv_statement_0= ruleStatement )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:375:1: (lv_statement_0= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:378:6: lv_statement_0= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getModuleBodyAccess().getStatementStatementParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleModuleBody796);
            lv_statement_0=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModuleBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "statement", lv_statement_0, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
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
    // $ANTLR end ruleModuleBody


    // $ANTLR start entryRuleModuleInterface
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:403:1: entryRuleModuleInterface returns [EObject current=null] : iv_ruleModuleInterface= ruleModuleInterface EOF ;
    public final EObject entryRuleModuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleInterface = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:403:57: (iv_ruleModuleInterface= ruleModuleInterface EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:404:2: iv_ruleModuleInterface= ruleModuleInterface EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleInterfaceRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleInterface_in_entryRuleModuleInterface832);
            iv_ruleModuleInterface=ruleModuleInterface();
            _fsp--;

             current =iv_ruleModuleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleInterface842); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleInterface


    // $ANTLR start ruleModuleInterface
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:411:1: ruleModuleInterface returns [EObject current=null] : ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) )+ ;
    public final EObject ruleModuleInterface() throws RecognitionException {
        EObject current = null;

        EObject lv_intSignalDecl_0 = null;

        EObject lv_intTypeDecl_1 = null;

        EObject lv_intSensorDecl_2 = null;

        EObject lv_intConstantDecl_3 = null;

        EObject lv_intRelationDecl_4 = null;

        EObject lv_intFunctionDecl_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:416:6: ( ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) )+ )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:417:1: ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) )+
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:417:1: ( (lv_intSignalDecl_0= ruleSignalDecl ) | (lv_intTypeDecl_1= ruleTypeDecl ) | (lv_intSensorDecl_2= ruleSensorDecl ) | (lv_intConstantDecl_3= ruleConstantDecl ) | (lv_intRelationDecl_4= ruleRelationDecl ) | (lv_intFunctionDecl_5= ruleFunctionDecl ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=7;
                switch ( input.LA(1) ) {
                case 21:
                case 24:
                case 25:
                case 26:
                    {
                    alt5=1;
                    }
                    break;
                case 31:
                    {
                    alt5=2;
                    }
                    break;
                case 27:
                    {
                    alt5=3;
                    }
                    break;
                case 32:
                    {
                    alt5=4;
                    }
                    break;
                case 28:
                    {
                    alt5=5;
                    }
                    break;
                case 34:
                    {
                    alt5=6;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:417:2: (lv_intSignalDecl_0= ruleSignalDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:417:2: (lv_intSignalDecl_0= ruleSignalDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:420:6: lv_intSignalDecl_0= ruleSignalDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntSignalDeclSignalDeclParserRuleCall_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignalDecl_in_ruleModuleInterface901);
            	    lv_intSignalDecl_0=ruleSignalDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intSignalDecl", lv_intSignalDecl_0, "SignalDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:439:6: (lv_intTypeDecl_1= ruleTypeDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:439:6: (lv_intTypeDecl_1= ruleTypeDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:442:6: lv_intTypeDecl_1= ruleTypeDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntTypeDeclTypeDeclParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeDecl_in_ruleModuleInterface945);
            	    lv_intTypeDecl_1=ruleTypeDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intTypeDecl", lv_intTypeDecl_1, "TypeDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:461:6: (lv_intSensorDecl_2= ruleSensorDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:461:6: (lv_intSensorDecl_2= ruleSensorDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:464:6: lv_intSensorDecl_2= ruleSensorDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntSensorDeclSensorDeclParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSensorDecl_in_ruleModuleInterface989);
            	    lv_intSensorDecl_2=ruleSensorDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intSensorDecl", lv_intSensorDecl_2, "SensorDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:483:6: (lv_intConstantDecl_3= ruleConstantDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:483:6: (lv_intConstantDecl_3= ruleConstantDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:486:6: lv_intConstantDecl_3= ruleConstantDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntConstantDeclConstantDeclParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstantDecl_in_ruleModuleInterface1033);
            	    lv_intConstantDecl_3=ruleConstantDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intConstantDecl", lv_intConstantDecl_3, "ConstantDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:505:6: (lv_intRelationDecl_4= ruleRelationDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:505:6: (lv_intRelationDecl_4= ruleRelationDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:508:6: lv_intRelationDecl_4= ruleRelationDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntRelationDeclRelationDeclParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelationDecl_in_ruleModuleInterface1077);
            	    lv_intRelationDecl_4=ruleRelationDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intRelationDecl", lv_intRelationDecl_4, "RelationDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:527:6: (lv_intFunctionDecl_5= ruleFunctionDecl )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:527:6: (lv_intFunctionDecl_5= ruleFunctionDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:530:6: lv_intFunctionDecl_5= ruleFunctionDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModuleInterfaceAccess().getIntFunctionDeclFunctionDeclParserRuleCall_5_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionDecl_in_ruleModuleInterface1121);
            	    lv_intFunctionDecl_5=ruleFunctionDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModuleInterfaceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "intFunctionDecl", lv_intFunctionDecl_5, "FunctionDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end ruleModuleInterface


    // $ANTLR start entryRuleSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:555:1: entryRuleSignalDecl returns [EObject current=null] : iv_ruleSignalDecl= ruleSignalDecl EOF ;
    public final EObject entryRuleSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:555:52: (iv_ruleSignalDecl= ruleSignalDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:556:2: iv_ruleSignalDecl= ruleSignalDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalDecl_in_entryRuleSignalDecl1159);
            iv_ruleSignalDecl=ruleSignalDecl();
            _fsp--;

             current =iv_ruleSignalDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalDecl1169); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignalDecl


    // $ANTLR start ruleSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:563:1: ruleSignalDecl returns [EObject current=null] : ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) ) ;
    public final EObject ruleSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signal_2 = null;

        EObject lv_signal_4 = null;

        EObject lv_signal_8 = null;

        EObject lv_signal_10 = null;

        EObject lv_signal_14 = null;

        EObject lv_signal_16 = null;

        EObject lv_signal_20 = null;

        EObject lv_signal_22 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:568:6: ( ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:569:1: ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:569:1: ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("569:1: ( ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' ) | ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' ) | ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' ) | ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' ) )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:569:2: ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:569:2: ( () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:569:3: () 'input' (lv_signal_2= ruleSignal ) ( ',' (lv_signal_4= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:569:3: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:570:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getInputAction_0_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getInputAction_0_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,21,FOLLOW_21_in_ruleSignalDecl1213); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getInputKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:584:1: (lv_signal_2= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:587:6: lv_signal_2= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_0_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1247);
                    lv_signal_2=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_2, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:605:2: ( ',' (lv_signal_4= ruleSignal ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:605:3: ',' (lv_signal_4= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1261); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_0_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:609:1: (lv_signal_4= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:612:6: lv_signal_4= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_0_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1295);
                    	    lv_signal_4=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_4, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1310); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_0_4(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:635:6: ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:635:6: ( () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:635:7: () 'output' (lv_signal_8= ruleSignal ) ( ',' (lv_signal_10= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:635:7: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:636:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getOutputAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getOutputAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,24,FOLLOW_24_in_ruleSignalDecl1336); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getOutputKeyword_1_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:650:1: (lv_signal_8= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:653:6: lv_signal_8= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1370);
                    lv_signal_8=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_8, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:671:2: ( ',' (lv_signal_10= ruleSignal ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:671:3: ',' (lv_signal_10= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1384); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_1_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:675:1: (lv_signal_10= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:678:6: lv_signal_10= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_1_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1418);
                    	    lv_signal_10=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_10, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1433); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_1_4(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:701:6: ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:701:6: ( () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:701:7: () 'inputoutput' (lv_signal_14= ruleSignal ) ( ',' (lv_signal_16= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:701:7: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:702:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getInputOutputAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getInputOutputAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,25,FOLLOW_25_in_ruleSignalDecl1459); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getInputoutputKeyword_2_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:716:1: (lv_signal_14= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:719:6: lv_signal_14= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_2_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1493);
                    lv_signal_14=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_14, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:737:2: ( ',' (lv_signal_16= ruleSignal ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==22) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:737:3: ',' (lv_signal_16= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1507); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_2_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:741:1: (lv_signal_16= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:744:6: lv_signal_16= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_2_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1541);
                    	    lv_signal_16=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_16, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1556); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_2_4(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:767:6: ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:767:6: ( () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:767:7: () 'return' (lv_signal_20= ruleSignal ) ( ',' (lv_signal_22= ruleSignal ) )* ';'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:767:7: ()
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:768:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getSignalDeclAccess().getReturnAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getSignalDeclAccess().getReturnAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,26,FOLLOW_26_in_ruleSignalDecl1582); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getReturnKeyword_3_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:782:1: (lv_signal_20= ruleSignal )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:785:6: lv_signal_20= ruleSignal
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_3_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1616);
                    lv_signal_20=ruleSignal();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "signal", lv_signal_20, "Signal", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:803:2: ( ',' (lv_signal_22= ruleSignal ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:803:3: ',' (lv_signal_22= ruleSignal )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleSignalDecl1630); 

                    	            createLeafNode(grammarAccess.getSignalDeclAccess().getCommaKeyword_3_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:807:1: (lv_signal_22= ruleSignal )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:810:6: lv_signal_22= ruleSignal
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getSignalDeclAccess().getSignalSignalParserRuleCall_3_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleSignalDecl1664);
                    	    lv_signal_22=ruleSignal();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getSignalDeclRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "signal", lv_signal_22, "Signal", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleSignalDecl1679); 

                            createLeafNode(grammarAccess.getSignalDeclAccess().getSemicolonKeyword_3_4(), null); 
                        

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
    // $ANTLR end ruleSignalDecl


    // $ANTLR start entryRuleSensorDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:839:1: entryRuleSensorDecl returns [EObject current=null] : iv_ruleSensorDecl= ruleSensorDecl EOF ;
    public final EObject entryRuleSensorDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:839:52: (iv_ruleSensorDecl= ruleSensorDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:840:2: iv_ruleSensorDecl= ruleSensorDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSensorDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleSensorDecl_in_entryRuleSensorDecl1713);
            iv_ruleSensorDecl=ruleSensorDecl();
            _fsp--;

             current =iv_ruleSensorDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensorDecl1723); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSensorDecl


    // $ANTLR start ruleSensorDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:847:1: ruleSensorDecl returns [EObject current=null] : ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' ) ;
    public final EObject ruleSensorDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_sensor_1 = null;

        EObject lv_sensor_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:852:6: ( ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:853:1: ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:853:1: ( 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:853:2: 'sensor' (lv_sensor_1= ruleSensor ) ( ',' (lv_sensor_3= ruleSensor ) )* ';'
            {
            match(input,27,FOLLOW_27_in_ruleSensorDecl1757); 

                    createLeafNode(grammarAccess.getSensorDeclAccess().getSensorKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:857:1: (lv_sensor_1= ruleSensor )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:860:6: lv_sensor_1= ruleSensor
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSensorDeclAccess().getSensorSensorParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSensor_in_ruleSensorDecl1791);
            lv_sensor_1=ruleSensor();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSensorDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "sensor", lv_sensor_1, "Sensor", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:878:2: ( ',' (lv_sensor_3= ruleSensor ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:878:3: ',' (lv_sensor_3= ruleSensor )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleSensorDecl1805); 

            	            createLeafNode(grammarAccess.getSensorDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:882:1: (lv_sensor_3= ruleSensor )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:885:6: lv_sensor_3= ruleSensor
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSensorDeclAccess().getSensorSensorParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSensor_in_ruleSensorDecl1839);
            	    lv_sensor_3=ruleSensor();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSensorDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "sensor", lv_sensor_3, "Sensor", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleSensorDecl1854); 

                    createLeafNode(grammarAccess.getSensorDeclAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleSensorDecl


    // $ANTLR start entryRuleRelationDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:914:1: entryRuleRelationDecl returns [EObject current=null] : iv_ruleRelationDecl= ruleRelationDecl EOF ;
    public final EObject entryRuleRelationDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:914:54: (iv_ruleRelationDecl= ruleRelationDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:915:2: iv_ruleRelationDecl= ruleRelationDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationDecl_in_entryRuleRelationDecl1887);
            iv_ruleRelationDecl=ruleRelationDecl();
            _fsp--;

             current =iv_ruleRelationDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationDecl1897); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationDecl


    // $ANTLR start ruleRelationDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:922:1: ruleRelationDecl returns [EObject current=null] : ( 'relation' (lv_relation_1= ruleRelation ) ( ',' (lv_relation_3= ruleRelation ) )* ';' ) ;
    public final EObject ruleRelationDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_relation_1 = null;

        EObject lv_relation_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:927:6: ( ( 'relation' (lv_relation_1= ruleRelation ) ( ',' (lv_relation_3= ruleRelation ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:928:1: ( 'relation' (lv_relation_1= ruleRelation ) ( ',' (lv_relation_3= ruleRelation ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:928:1: ( 'relation' (lv_relation_1= ruleRelation ) ( ',' (lv_relation_3= ruleRelation ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:928:2: 'relation' (lv_relation_1= ruleRelation ) ( ',' (lv_relation_3= ruleRelation ) )* ';'
            {
            match(input,28,FOLLOW_28_in_ruleRelationDecl1931); 

                    createLeafNode(grammarAccess.getRelationDeclAccess().getRelationKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:932:1: (lv_relation_1= ruleRelation )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:935:6: lv_relation_1= ruleRelation
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRelationDeclAccess().getRelationRelationParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRelation_in_ruleRelationDecl1965);
            lv_relation_1=ruleRelation();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "relation", lv_relation_1, "Relation", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:953:2: ( ',' (lv_relation_3= ruleRelation ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:953:3: ',' (lv_relation_3= ruleRelation )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleRelationDecl1979); 

            	            createLeafNode(grammarAccess.getRelationDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:957:1: (lv_relation_3= ruleRelation )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:960:6: lv_relation_3= ruleRelation
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRelationDeclAccess().getRelationRelationParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelation_in_ruleRelationDecl2013);
            	    lv_relation_3=ruleRelation();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelationDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "relation", lv_relation_3, "Relation", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleRelationDecl2028); 

                    createLeafNode(grammarAccess.getRelationDeclAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleRelationDecl


    // $ANTLR start entryRuleRelation
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:989:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:989:50: (iv_ruleRelation= ruleRelation EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:990:2: iv_ruleRelation= ruleRelation EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation2061);
            iv_ruleRelation=ruleRelation();
            _fsp--;

             current =iv_ruleRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation2071); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelation


    // $ANTLR start ruleRelation
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:997:1: ruleRelation returns [EObject current=null] : (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_RelationImplication_0 = null;

        EObject this_RelationIncompatibility_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1002:6: ( (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1003:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1003:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==30) ) {
                    alt13=2;
                }
                else if ( (LA13_1==29) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1003:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1003:1: (this_RelationImplication_0= ruleRelationImplication | this_RelationIncompatibility_1= ruleRelationIncompatibility )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1004:5: this_RelationImplication_0= ruleRelationImplication
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationAccess().getRelationImplicationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationImplication_in_ruleRelation2118);
                    this_RelationImplication_0=ruleRelationImplication();
                    _fsp--;

                     
                            current = this_RelationImplication_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1014:5: this_RelationIncompatibility_1= ruleRelationIncompatibility
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getRelationAccess().getRelationIncompatibilityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRelationIncompatibility_in_ruleRelation2145);
                    this_RelationIncompatibility_1=ruleRelationIncompatibility();
                    _fsp--;

                     
                            current = this_RelationIncompatibility_1; 
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
    // $ANTLR end ruleRelation


    // $ANTLR start entryRuleRelationImplication
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1029:1: entryRuleRelationImplication returns [EObject current=null] : iv_ruleRelationImplication= ruleRelationImplication EOF ;
    public final EObject entryRuleRelationImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationImplication = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1029:61: (iv_ruleRelationImplication= ruleRelationImplication EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1030:2: iv_ruleRelationImplication= ruleRelationImplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationImplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationImplication_in_entryRuleRelationImplication2177);
            iv_ruleRelationImplication=ruleRelationImplication();
            _fsp--;

             current =iv_ruleRelationImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationImplication2187); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationImplication


    // $ANTLR start ruleRelationImplication
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1037:1: ruleRelationImplication returns [EObject current=null] : ( ( RULE_ID ) (lv_type_1= '=>' ) ( RULE_ID ) ) ;
    public final EObject ruleRelationImplication() throws RecognitionException {
        EObject current = null;

        Token lv_type_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1042:6: ( ( ( RULE_ID ) (lv_type_1= '=>' ) ( RULE_ID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1043:1: ( ( RULE_ID ) (lv_type_1= '=>' ) ( RULE_ID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1043:1: ( ( RULE_ID ) (lv_type_1= '=>' ) ( RULE_ID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1043:2: ( RULE_ID ) (lv_type_1= '=>' ) ( RULE_ID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1043:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1046:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationImplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationImplication2234); 

            		createLeafNode(grammarAccess.getRelationImplicationAccess().getFirstSignalCrossReference_0_0(), "first"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1059:2: (lv_type_1= '=>' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1061:6: lv_type_1= '=>'
            {
            lv_type_1=(Token)input.LT(1);
            match(input,29,FOLLOW_29_in_ruleRelationImplication2258); 

                    createLeafNode(grammarAccess.getRelationImplicationAccess().getTypeEqualsSignGreaterThanSignKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationImplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", /* lv_type_1 */ input.LT(-1), "=>", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1080:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1083:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationImplicationRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationImplication2293); 

            		createLeafNode(grammarAccess.getRelationImplicationAccess().getSecondSignalCrossReference_2_0(), "second"); 
            	

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
    // $ANTLR end ruleRelationImplication


    // $ANTLR start entryRuleRelationIncompatibility
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1103:1: entryRuleRelationIncompatibility returns [EObject current=null] : iv_ruleRelationIncompatibility= ruleRelationIncompatibility EOF ;
    public final EObject entryRuleRelationIncompatibility() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationIncompatibility = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1103:65: (iv_ruleRelationIncompatibility= ruleRelationIncompatibility EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1104:2: iv_ruleRelationIncompatibility= ruleRelationIncompatibility EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRelationIncompatibilityRule(), currentNode); 
            pushFollow(FOLLOW_ruleRelationIncompatibility_in_entryRuleRelationIncompatibility2329);
            iv_ruleRelationIncompatibility=ruleRelationIncompatibility();
            _fsp--;

             current =iv_ruleRelationIncompatibility; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationIncompatibility2339); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRelationIncompatibility


    // $ANTLR start ruleRelationIncompatibility
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1111:1: ruleRelationIncompatibility returns [EObject current=null] : ( ( RULE_ID ) (lv_type_1= '#' ) ( RULE_ID ) ( '#' ( RULE_ID ) )* ) ;
    public final EObject ruleRelationIncompatibility() throws RecognitionException {
        EObject current = null;

        Token lv_type_1=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1116:6: ( ( ( RULE_ID ) (lv_type_1= '#' ) ( RULE_ID ) ( '#' ( RULE_ID ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1117:1: ( ( RULE_ID ) (lv_type_1= '#' ) ( RULE_ID ) ( '#' ( RULE_ID ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1117:1: ( ( RULE_ID ) (lv_type_1= '#' ) ( RULE_ID ) ( '#' ( RULE_ID ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1117:2: ( RULE_ID ) (lv_type_1= '#' ) ( RULE_ID ) ( '#' ( RULE_ID ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1117:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1120:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationIncompatibility2386); 

            		createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getIncompSignalCrossReference_0_0(), "incomp"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1133:2: (lv_type_1= '#' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1135:6: lv_type_1= '#'
            {
            lv_type_1=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleRelationIncompatibility2410); 

                    createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getTypeNumberSignKeyword_1_0(), "type"); 
                

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", /* lv_type_1 */ input.LT(-1), "#", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1154:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1157:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationIncompatibility2445); 

            		createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getIncompSignalCrossReference_2_0(), "incomp"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1170:2: ( '#' ( RULE_ID ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1170:3: '#' ( RULE_ID )
            	    {
            	    match(input,30,FOLLOW_30_in_ruleRelationIncompatibility2458); 

            	            createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getNumberSignKeyword_3_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1174:1: ( RULE_ID )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1177:3: RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = factory.create(grammarAccess.getRelationIncompatibilityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	            
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRelationIncompatibility2480); 

            	    		createLeafNode(grammarAccess.getRelationIncompatibilityAccess().getIncompSignalCrossReference_3_1_0(), "incomp"); 
            	    	

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
    // $ANTLR end ruleRelationIncompatibility


    // $ANTLR start entryRuleTypeDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1197:1: entryRuleTypeDecl returns [EObject current=null] : iv_ruleTypeDecl= ruleTypeDecl EOF ;
    public final EObject entryRuleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1197:50: (iv_ruleTypeDecl= ruleTypeDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1198:2: iv_ruleTypeDecl= ruleTypeDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl2518);
            iv_ruleTypeDecl=ruleTypeDecl();
            _fsp--;

             current =iv_ruleTypeDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDecl2528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeDecl


    // $ANTLR start ruleTypeDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1205:1: ruleTypeDecl returns [EObject current=null] : ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' ) ;
    public final EObject ruleTypeDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_type_1 = null;

        EObject lv_type_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1210:6: ( ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1211:1: ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1211:1: ( 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1211:2: 'type' (lv_type_1= ruleType ) ( ',' (lv_type_3= ruleType ) )* ';'
            {
            match(input,31,FOLLOW_31_in_ruleTypeDecl2562); 

                    createLeafNode(grammarAccess.getTypeDeclAccess().getTypeKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1215:1: (lv_type_1= ruleType )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1218:6: lv_type_1= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTypeDeclAccess().getTypeTypeParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeDecl2596);
            lv_type_1=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "type", lv_type_1, "Type", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1236:2: ( ',' (lv_type_3= ruleType ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1236:3: ',' (lv_type_3= ruleType )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTypeDecl2610); 

            	            createLeafNode(grammarAccess.getTypeDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1240:1: (lv_type_3= ruleType )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1243:6: lv_type_3= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTypeDeclAccess().getTypeTypeParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleTypeDecl2644);
            	    lv_type_3=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTypeDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "type", lv_type_3, "Type", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleTypeDecl2659); 

                    createLeafNode(grammarAccess.getTypeDeclAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleTypeDecl


    // $ANTLR start entryRuleType
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1272:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1272:46: (iv_ruleType= ruleType EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1273:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2692);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2702); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1280:1: ruleType returns [EObject current=null] : (lv_name_0= RULE_ID ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1285:6: ( (lv_name_0= RULE_ID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1286:1: (lv_name_0= RULE_ID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1286:1: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1288:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleType2748); 

            		createLeafNode(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
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
    // $ANTLR end ruleType


    // $ANTLR start entryRuleConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1313:1: entryRuleConstantDecl returns [EObject current=null] : iv_ruleConstantDecl= ruleConstantDecl EOF ;
    public final EObject entryRuleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1313:54: (iv_ruleConstantDecl= ruleConstantDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1314:2: iv_ruleConstantDecl= ruleConstantDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl2788);
            iv_ruleConstantDecl=ruleConstantDecl();
            _fsp--;

             current =iv_ruleConstantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDecl2798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantDecl


    // $ANTLR start ruleConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1321:1: ruleConstantDecl returns [EObject current=null] : ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' ) ;
    public final EObject ruleConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_constant_1 = null;

        EObject lv_constant_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1326:6: ( ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1327:1: ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1327:1: ( 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1327:2: 'constant' (lv_constant_1= ruleOneTypeConstantDecl ) ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )* ';'
            {
            match(input,32,FOLLOW_32_in_ruleConstantDecl2832); 

                    createLeafNode(grammarAccess.getConstantDeclAccess().getConstantKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1331:1: (lv_constant_1= ruleOneTypeConstantDecl )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1334:6: lv_constant_1= ruleOneTypeConstantDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantDeclAccess().getConstantOneTypeConstantDeclParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2866);
            lv_constant_1=ruleOneTypeConstantDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "constant", lv_constant_1, "OneTypeConstantDecl", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1352:2: ( ',' (lv_constant_3= ruleOneTypeConstantDecl ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1352:3: ',' (lv_constant_3= ruleOneTypeConstantDecl )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleConstantDecl2880); 

            	            createLeafNode(grammarAccess.getConstantDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1356:1: (lv_constant_3= ruleOneTypeConstantDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1359:6: lv_constant_3= ruleOneTypeConstantDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getConstantDeclAccess().getConstantOneTypeConstantDeclParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2914);
            	    lv_constant_3=ruleOneTypeConstantDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getConstantDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "constant", lv_constant_3, "OneTypeConstantDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleConstantDecl2929); 

                    createLeafNode(grammarAccess.getConstantDeclAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleConstantDecl


    // $ANTLR start entryRuleOneTypeConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1388:1: entryRuleOneTypeConstantDecl returns [EObject current=null] : iv_ruleOneTypeConstantDecl= ruleOneTypeConstantDecl EOF ;
    public final EObject entryRuleOneTypeConstantDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOneTypeConstantDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1388:61: (iv_ruleOneTypeConstantDecl= ruleOneTypeConstantDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1389:2: iv_ruleOneTypeConstantDecl= ruleOneTypeConstantDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getOneTypeConstantDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleOneTypeConstantDecl_in_entryRuleOneTypeConstantDecl2962);
            iv_ruleOneTypeConstantDecl=ruleOneTypeConstantDecl();
            _fsp--;

             current =iv_ruleOneTypeConstantDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOneTypeConstantDecl2972); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleOneTypeConstantDecl


    // $ANTLR start ruleOneTypeConstantDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1396:1: ruleOneTypeConstantDecl returns [EObject current=null] : ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ) ;
    public final EObject ruleOneTypeConstantDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_4=null;
        Token lv_type_5=null;
        EObject lv_constant_0 = null;

        EObject lv_constant_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1401:6: ( ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1402:1: ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1402:1: ( (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1402:2: (lv_constant_0= ruleConstant ) ( ',' (lv_constant_2= ruleConstant ) )* ':' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1402:2: (lv_constant_0= ruleConstant )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1405:6: lv_constant_0= ruleConstant
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getOneTypeConstantDeclAccess().getConstantConstantParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl3031);
            lv_constant_0=ruleConstant();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "constant", lv_constant_0, "Constant", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1423:2: ( ',' (lv_constant_2= ruleConstant ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1423:3: ',' (lv_constant_2= ruleConstant )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleOneTypeConstantDecl3045); 

            	            createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1427:1: (lv_constant_2= ruleConstant )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1430:6: lv_constant_2= ruleConstant
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getOneTypeConstantDeclAccess().getConstantConstantParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl3079);
            	    lv_constant_2=ruleConstant();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "constant", lv_constant_2, "Constant", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleOneTypeConstantDecl3094); 

                    createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getColonKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1452:1: ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_BASETYPE) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1452:1: ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1452:2: (lv_type_4= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1452:2: (lv_type_4= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1454:6: lv_type_4= RULE_ID
                    {
                    lv_type_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOneTypeConstantDecl3117); 

                    		createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getTypeIDTerminalRuleCall_3_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_4, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1473:6: (lv_type_5= RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1473:6: (lv_type_5= RULE_BASETYPE )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1475:6: lv_type_5= RULE_BASETYPE
                    {
                    lv_type_5=(Token)input.LT(1);
                    match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleOneTypeConstantDecl3153); 

                    		createLeafNode(grammarAccess.getOneTypeConstantDeclAccess().getTypeBaseTypeTerminalRuleCall_3_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getOneTypeConstantDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_5, "BaseType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleOneTypeConstantDecl


    // $ANTLR start entryRuleConstant
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1500:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1500:50: (iv_ruleConstant= ruleConstant EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1501:2: iv_ruleConstant= ruleConstant EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant3195);
            iv_ruleConstant=ruleConstant();
            _fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant3205); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstant


    // $ANTLR start ruleConstant
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1508:1: ruleConstant returns [EObject current=null] : ( (lv_name_0= RULE_ID ) ( '=' (lv_value_2= ruleConstantValue ) )? ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        AntlrDatatypeRuleToken lv_value_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1513:6: ( ( (lv_name_0= RULE_ID ) ( '=' (lv_value_2= ruleConstantValue ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1514:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_value_2= ruleConstantValue ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1514:1: ( (lv_name_0= RULE_ID ) ( '=' (lv_value_2= ruleConstantValue ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1514:2: (lv_name_0= RULE_ID ) ( '=' (lv_value_2= ruleConstantValue ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1514:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1516:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant3252); 

            		createLeafNode(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1534:2: ( '=' (lv_value_2= ruleConstantValue ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1534:3: '=' (lv_value_2= ruleConstantValue )
                    {
                    match(input,33,FOLLOW_33_in_ruleConstant3270); 

                            createLeafNode(grammarAccess.getConstantAccess().getEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1538:1: (lv_value_2= ruleConstantValue )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1541:6: lv_value_2= ruleConstantValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getValueConstantValueParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleConstant3304);
                    lv_value_2=ruleConstantValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "value", lv_value_2, "ConstantValue", currentNode);
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
    // $ANTLR end ruleConstant


    // $ANTLR start entryRuleConstantValue
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1566:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1566:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1567:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue3344);
            iv_ruleConstantValue=ruleConstantValue();
            _fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue3355); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantValue


    // $ANTLR start ruleConstantValue
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1574:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Number_1= RULE_NUMBER | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_Number_1=null;
        Token this_INT_2=null;
        Token this_STRING_3=null;
        Token this_Float_4=null;
        Token this_Boolean_5=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1580:6: ( (this_ID_0= RULE_ID | this_Number_1= RULE_NUMBER | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1581:1: (this_ID_0= RULE_ID | this_Number_1= RULE_NUMBER | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1581:1: (this_ID_0= RULE_ID | this_Number_1= RULE_NUMBER | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN )
            int alt20=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt20=2;
                }
                break;
            case RULE_INT:
                {
                alt20=3;
                }
                break;
            case RULE_STRING:
                {
                alt20=4;
                }
                break;
            case RULE_FLOAT:
                {
                alt20=5;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt20=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1581:1: (this_ID_0= RULE_ID | this_Number_1= RULE_NUMBER | this_INT_2= RULE_INT | this_STRING_3= RULE_STRING | this_Float_4= RULE_FLOAT | this_Boolean_5= RULE_BOOLEAN )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1581:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantValue3395); 

                    		current.merge(this_ID_0);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1589:10: this_Number_1= RULE_NUMBER
                    {
                    this_Number_1=(Token)input.LT(1);
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleConstantValue3421); 

                    		current.merge(this_Number_1);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getNumberTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1597:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantValue3447); 

                    		current.merge(this_INT_2);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getINTTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1605:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantValue3473); 

                    		current.merge(this_STRING_3);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getSTRINGTerminalRuleCall_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1613:10: this_Float_4= RULE_FLOAT
                    {
                    this_Float_4=(Token)input.LT(1);
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleConstantValue3499); 

                    		current.merge(this_Float_4);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getFloatTerminalRuleCall_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1621:10: this_Boolean_5= RULE_BOOLEAN
                    {
                    this_Boolean_5=(Token)input.LT(1);
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleConstantValue3525); 

                    		current.merge(this_Boolean_5);
                        
                     
                        createLeafNode(grammarAccess.getConstantValueAccess().getBooleanTerminalRuleCall_5(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleConstantValue


    // $ANTLR start entryRuleFunctionDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1636:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1636:54: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1637:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionDecl_in_entryRuleFunctionDecl3568);
            iv_ruleFunctionDecl=ruleFunctionDecl();
            _fsp--;

             current =iv_ruleFunctionDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDecl3578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionDecl


    // $ANTLR start ruleFunctionDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1644:1: ruleFunctionDecl returns [EObject current=null] : ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_function_1 = null;

        EObject lv_function_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1649:6: ( ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1650:1: ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1650:1: ( 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1650:2: 'function' (lv_function_1= ruleFunction ) ( ',' (lv_function_3= ruleFunction ) )* ';'
            {
            match(input,34,FOLLOW_34_in_ruleFunctionDecl3612); 

                    createLeafNode(grammarAccess.getFunctionDeclAccess().getFunctionKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1654:1: (lv_function_1= ruleFunction )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1657:6: lv_function_1= ruleFunction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionFunctionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunction_in_ruleFunctionDecl3646);
            lv_function_1=ruleFunction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "function", lv_function_1, "Function", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1675:2: ( ',' (lv_function_3= ruleFunction ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1675:3: ',' (lv_function_3= ruleFunction )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleFunctionDecl3660); 

            	            createLeafNode(grammarAccess.getFunctionDeclAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1679:1: (lv_function_3= ruleFunction )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1682:6: lv_function_3= ruleFunction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionDeclAccess().getFunctionFunctionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunction_in_ruleFunctionDecl3694);
            	    lv_function_3=ruleFunction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "function", lv_function_3, "Function", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,23,FOLLOW_23_in_ruleFunctionDecl3709); 

                    createLeafNode(grammarAccess.getFunctionDeclAccess().getSemicolonKeyword_3(), null); 
                

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
    // $ANTLR end ruleFunctionDecl


    // $ANTLR start entryRuleFunction
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1711:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1711:50: (iv_ruleFunction= ruleFunction EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1712:2: iv_ruleFunction= ruleFunction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction3742);
            iv_ruleFunction=ruleFunction();
            _fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction3752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunction


    // $ANTLR start ruleFunction
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1719:1: ruleFunction returns [EObject current=null] : ( (lv_name_0= RULE_ID ) '(' ( (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_idList_2=null;
        Token lv_idList_4=null;
        Token lv_type_7=null;
        Token lv_type_8=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1724:6: ( ( (lv_name_0= RULE_ID ) '(' ( (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1725:1: ( (lv_name_0= RULE_ID ) '(' ( (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1725:1: ( (lv_name_0= RULE_ID ) '(' ( (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1725:2: (lv_name_0= RULE_ID ) '(' ( (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )* )? ')' ':' ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1725:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1727:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3799); 

            		createLeafNode(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,35,FOLLOW_35_in_ruleFunction3816); 

                    createLeafNode(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1749:1: ( (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_BASETYPE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1749:2: (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) ) ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )*
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1749:2: (lv_idList_2= ( RULE_ID | RULE_BASETYPE ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1751:6: lv_idList_2= ( RULE_ID | RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1751:18: ( RULE_ID | RULE_BASETYPE )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_BASETYPE) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1751:18: ( RULE_ID | RULE_BASETYPE )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1751:20: RULE_ID
                            {
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3840); 

                            		createLeafNode(grammarAccess.getFunctionAccess().getIdListIDTerminalRuleCall_2_0_0_0(), "idList"); 
                            	

                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1756:7: RULE_BASETYPE
                            {
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleFunction3852); 

                            		createLeafNode(grammarAccess.getFunctionAccess().getIdListBaseTypeTerminalRuleCall_2_0_0_1(), "idList"); 
                            	

                            }
                            break;

                    }


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "idList", lv_idList_2, null, lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1775:2: ( ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==22) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1775:3: ',' (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleFunction3872); 

                    	            createLeafNode(grammarAccess.getFunctionAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1779:1: (lv_idList_4= ( RULE_ID | RULE_BASETYPE ) )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1781:6: lv_idList_4= ( RULE_ID | RULE_BASETYPE )
                    	    {
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1781:18: ( RULE_ID | RULE_BASETYPE )
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==RULE_ID) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==RULE_BASETYPE) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("1781:18: ( RULE_ID | RULE_BASETYPE )", 23, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1781:20: RULE_ID
                    	            {
                    	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3895); 

                    	            		createLeafNode(grammarAccess.getFunctionAccess().getIdListIDTerminalRuleCall_2_1_1_0_0(), "idList"); 
                    	            	

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1786:7: RULE_BASETYPE
                    	            {
                    	            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleFunction3907); 

                    	            		createLeafNode(grammarAccess.getFunctionAccess().getIdListBaseTypeTerminalRuleCall_2_1_1_0_1(), "idList"); 
                    	            	

                    	            }
                    	            break;

                    	    }


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode, current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "idList", lv_idList_4, null, lastConsumedNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
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

            match(input,36,FOLLOW_36_in_ruleFunction3930); 

                    createLeafNode(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3(), null); 
                
            match(input,18,FOLLOW_18_in_ruleFunction3939); 

                    createLeafNode(grammarAccess.getFunctionAccess().getColonKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1813:1: ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_BASETYPE) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1813:1: ( (lv_type_7= RULE_ID ) | (lv_type_8= RULE_BASETYPE ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1813:2: (lv_type_7= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1813:2: (lv_type_7= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1815:6: lv_type_7= RULE_ID
                    {
                    lv_type_7=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunction3962); 

                    		createLeafNode(grammarAccess.getFunctionAccess().getTypeIDTerminalRuleCall_5_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_7, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1834:6: (lv_type_8= RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1834:6: (lv_type_8= RULE_BASETYPE )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1836:6: lv_type_8= RULE_BASETYPE
                    {
                    lv_type_8=(Token)input.LT(1);
                    match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleFunction3998); 

                    		createLeafNode(grammarAccess.getFunctionAccess().getTypeBaseTypeTerminalRuleCall_5_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_8, "BaseType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleFunction


    // $ANTLR start entryRuleStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1861:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1861:51: (iv_ruleStatement= ruleStatement EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1862:2: iv_ruleStatement= ruleStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement4040);
            iv_ruleStatement=ruleStatement();
            _fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement4050); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1869:1: ruleStatement returns [EObject current=null] : (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Sequence_0 = null;

        EObject lv_right_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1874:6: ( (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1875:1: (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1875:1: (this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1876:5: this_Sequence_0= ruleSequence ( () '||' (lv_right_3= ruleSequence ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStatementAccess().getSequenceParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleSequence_in_ruleStatement4097);
            this_Sequence_0=ruleSequence();
            _fsp--;

             
                    current = this_Sequence_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1884:1: ( () '||' (lv_right_3= ruleSequence ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==37) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1884:2: () '||' (lv_right_3= ruleSequence )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1884:2: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1885:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getStatementAccess().getParallelLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getParallelLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,37,FOLLOW_37_in_ruleStatement4115); 

            	            createLeafNode(grammarAccess.getStatementAccess().getVerticalLineVerticalLineKeyword_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1904:1: (lv_right_3= ruleSequence )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1907:6: lv_right_3= ruleSequence
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getRightSequenceParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSequence_in_ruleStatement4149);
            	    lv_right_3=ruleSequence();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "right", lv_right_3, "Sequence", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleAtomicStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1932:1: entryRuleAtomicStatement returns [EObject current=null] : iv_ruleAtomicStatement= ruleAtomicStatement EOF ;
    public final EObject entryRuleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicStatement = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1932:57: (iv_ruleAtomicStatement= ruleAtomicStatement EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1933:2: iv_ruleAtomicStatement= ruleAtomicStatement EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAtomicStatementRule(), currentNode); 
            pushFollow(FOLLOW_ruleAtomicStatement_in_entryRuleAtomicStatement4188);
            iv_ruleAtomicStatement=ruleAtomicStatement();
            _fsp--;

             current =iv_ruleAtomicStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicStatement4198); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAtomicStatement


    // $ANTLR start ruleAtomicStatement
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1940:1: ruleAtomicStatement returns [EObject current=null] : (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort ) ;
    public final EObject ruleAtomicStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Abort_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Await_2 = null;

        EObject this_Block_3 = null;

        EObject this_Do_4 = null;

        EObject this_Emit_5 = null;

        EObject this_EveryDo_6 = null;

        EObject this_Exit_7 = null;

        EObject this_Halt_8 = null;

        EObject this_IfTest_9 = null;

        EObject this_LocalSignalDecl_10 = null;

        EObject this_Loop_11 = null;

        EObject this_Nothing_12 = null;

        EObject this_Pause_13 = null;

        EObject this_Present_14 = null;

        EObject this_Repeat_15 = null;

        EObject this_Run_16 = null;

        EObject this_Suspend_17 = null;

        EObject this_Sustain_18 = null;

        EObject this_Trap_19 = null;

        EObject this_Variable_20 = null;

        EObject this_WeakAbort_21 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1945:6: ( (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1946:1: (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1946:1: (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort )
            int alt28=22;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                alt28=2;
                }
                break;
            case 45:
                {
                alt28=3;
                }
                break;
            case 38:
                {
                alt28=4;
                }
                break;
            case 43:
                {
                alt28=5;
                }
                break;
            case 49:
                {
                alt28=6;
                }
                break;
            case 50:
                {
                alt28=7;
                }
                break;
            case 51:
                {
                alt28=8;
                }
                break;
            case 52:
                {
                alt28=9;
                }
                break;
            case 53:
                {
                alt28=10;
                }
                break;
            case 68:
                {
                alt28=11;
                }
                break;
            case 57:
                {
                alt28=12;
                }
                break;
            case 59:
                {
                alt28=13;
                }
                break;
            case 60:
                {
                alt28=14;
                }
                break;
            case 61:
                {
                alt28=15;
                }
                break;
            case 62:
            case 63:
                {
                alt28=16;
                }
                break;
            case 65:
            case 66:
                {
                alt28=17;
                }
                break;
            case 70:
                {
                alt28=18;
                }
                break;
            case 71:
                {
                alt28=19;
                }
                break;
            case 72:
                {
                alt28=20;
                }
                break;
            case 74:
                {
                alt28=21;
                }
                break;
            case 75:
                {
                alt28=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1946:1: (this_Abort_0= ruleAbort | this_Assignment_1= ruleAssignment | this_Await_2= ruleAwait | this_Block_3= ruleBlock | this_Do_4= ruleDo | this_Emit_5= ruleEmit | this_EveryDo_6= ruleEveryDo | this_Exit_7= ruleExit | this_Halt_8= ruleHalt | this_IfTest_9= ruleIfTest | this_LocalSignalDecl_10= ruleLocalSignalDecl | this_Loop_11= ruleLoop | this_Nothing_12= ruleNothing | this_Pause_13= rulePause | this_Present_14= rulePresent | this_Repeat_15= ruleRepeat | this_Run_16= ruleRun | this_Suspend_17= ruleSuspend | this_Sustain_18= ruleSustain | this_Trap_19= ruleTrap | this_Variable_20= ruleVariable | this_WeakAbort_21= ruleWeakAbort )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1947:5: this_Abort_0= ruleAbort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getAbortParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbort_in_ruleAtomicStatement4245);
                    this_Abort_0=ruleAbort();
                    _fsp--;

                     
                            current = this_Abort_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1957:5: this_Assignment_1= ruleAssignment
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getAssignmentParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAssignment_in_ruleAtomicStatement4272);
                    this_Assignment_1=ruleAssignment();
                    _fsp--;

                     
                            current = this_Assignment_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1967:5: this_Await_2= ruleAwait
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getAwaitParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwait_in_ruleAtomicStatement4299);
                    this_Await_2=ruleAwait();
                    _fsp--;

                     
                            current = this_Await_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1977:5: this_Block_3= ruleBlock
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getBlockParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleAtomicStatement4326);
                    this_Block_3=ruleBlock();
                    _fsp--;

                     
                            current = this_Block_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1987:5: this_Do_4= ruleDo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getDoParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDo_in_ruleAtomicStatement4353);
                    this_Do_4=ruleDo();
                    _fsp--;

                     
                            current = this_Do_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:1997:5: this_Emit_5= ruleEmit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getEmitParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEmit_in_ruleAtomicStatement4380);
                    this_Emit_5=ruleEmit();
                    _fsp--;

                     
                            current = this_Emit_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2007:5: this_EveryDo_6= ruleEveryDo
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getEveryDoParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEveryDo_in_ruleAtomicStatement4407);
                    this_EveryDo_6=ruleEveryDo();
                    _fsp--;

                     
                            current = this_EveryDo_6; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2017:5: this_Exit_7= ruleExit
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getExitParserRuleCall_7(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExit_in_ruleAtomicStatement4434);
                    this_Exit_7=ruleExit();
                    _fsp--;

                     
                            current = this_Exit_7; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2027:5: this_Halt_8= ruleHalt
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getHaltParserRuleCall_8(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleHalt_in_ruleAtomicStatement4461);
                    this_Halt_8=ruleHalt();
                    _fsp--;

                     
                            current = this_Halt_8; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2037:5: this_IfTest_9= ruleIfTest
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getIfTestParserRuleCall_9(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleIfTest_in_ruleAtomicStatement4488);
                    this_IfTest_9=ruleIfTest();
                    _fsp--;

                     
                            current = this_IfTest_9; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2047:5: this_LocalSignalDecl_10= ruleLocalSignalDecl
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getLocalSignalDeclParserRuleCall_10(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLocalSignalDecl_in_ruleAtomicStatement4515);
                    this_LocalSignalDecl_10=ruleLocalSignalDecl();
                    _fsp--;

                     
                            current = this_LocalSignalDecl_10; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2057:5: this_Loop_11= ruleLoop
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getLoopParserRuleCall_11(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleLoop_in_ruleAtomicStatement4542);
                    this_Loop_11=ruleLoop();
                    _fsp--;

                     
                            current = this_Loop_11; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2067:5: this_Nothing_12= ruleNothing
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getNothingParserRuleCall_12(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleNothing_in_ruleAtomicStatement4569);
                    this_Nothing_12=ruleNothing();
                    _fsp--;

                     
                            current = this_Nothing_12; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2077:5: this_Pause_13= rulePause
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getPauseParserRuleCall_13(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePause_in_ruleAtomicStatement4596);
                    this_Pause_13=rulePause();
                    _fsp--;

                     
                            current = this_Pause_13; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 15 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2087:5: this_Present_14= rulePresent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getPresentParserRuleCall_14(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresent_in_ruleAtomicStatement4623);
                    this_Present_14=rulePresent();
                    _fsp--;

                     
                            current = this_Present_14; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 16 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2097:5: this_Repeat_15= ruleRepeat
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getRepeatParserRuleCall_15(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRepeat_in_ruleAtomicStatement4650);
                    this_Repeat_15=ruleRepeat();
                    _fsp--;

                     
                            current = this_Repeat_15; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 17 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2107:5: this_Run_16= ruleRun
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getRunParserRuleCall_16(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRun_in_ruleAtomicStatement4677);
                    this_Run_16=ruleRun();
                    _fsp--;

                     
                            current = this_Run_16; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 18 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2117:5: this_Suspend_17= ruleSuspend
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getSuspendParserRuleCall_17(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSuspend_in_ruleAtomicStatement4704);
                    this_Suspend_17=ruleSuspend();
                    _fsp--;

                     
                            current = this_Suspend_17; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 19 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2127:5: this_Sustain_18= ruleSustain
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getSustainParserRuleCall_18(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSustain_in_ruleAtomicStatement4731);
                    this_Sustain_18=ruleSustain();
                    _fsp--;

                     
                            current = this_Sustain_18; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 20 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2137:5: this_Trap_19= ruleTrap
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getTrapParserRuleCall_19(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleTrap_in_ruleAtomicStatement4758);
                    this_Trap_19=ruleTrap();
                    _fsp--;

                     
                            current = this_Trap_19; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 21 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2147:5: this_Variable_20= ruleVariable
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getVariableParserRuleCall_20(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariable_in_ruleAtomicStatement4785);
                    this_Variable_20=ruleVariable();
                    _fsp--;

                     
                            current = this_Variable_20; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 22 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2157:5: this_WeakAbort_21= ruleWeakAbort
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAtomicStatementAccess().getWeakAbortParserRuleCall_21(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWeakAbort_in_ruleAtomicStatement4812);
                    this_WeakAbort_21=ruleWeakAbort();
                    _fsp--;

                     
                            current = this_WeakAbort_21; 
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
    // $ANTLR end ruleAtomicStatement


    // $ANTLR start entryRuleSequence
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2172:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2172:50: (iv_ruleSequence= ruleSequence EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2173:2: iv_ruleSequence= ruleSequence EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSequenceRule(), currentNode); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence4844);
            iv_ruleSequence=ruleSequence();
            _fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence4854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSequence


    // $ANTLR start ruleSequence
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2180:1: ruleSequence returns [EObject current=null] : (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicStatement_0 = null;

        EObject lv_right_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2185:6: ( (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2186:1: (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2186:1: (this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2187:5: this_AtomicStatement_0= ruleAtomicStatement ( () ';' (lv_right_3= ruleAtomicStatement ) )* ( ';' )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getSequenceAccess().getAtomicStatementParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleAtomicStatement_in_ruleSequence4901);
            this_AtomicStatement_0=ruleAtomicStatement();
            _fsp--;

             
                    current = this_AtomicStatement_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2195:1: ( () ';' (lv_right_3= ruleAtomicStatement ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||LA29_1==38||LA29_1==41||LA29_1==43||LA29_1==45||(LA29_1>=49 && LA29_1<=53)||LA29_1==57||(LA29_1>=59 && LA29_1<=63)||(LA29_1>=65 && LA29_1<=66)||LA29_1==68||(LA29_1>=70 && LA29_1<=72)||(LA29_1>=74 && LA29_1<=75)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2195:2: () ';' (lv_right_3= ruleAtomicStatement )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2195:2: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2196:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,23,FOLLOW_23_in_ruleSequence4919); 

            	            createLeafNode(grammarAccess.getSequenceAccess().getSemicolonKeyword_1_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2215:1: (lv_right_3= ruleAtomicStatement )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2218:6: lv_right_3= ruleAtomicStatement
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSequenceAccess().getRightAtomicStatementParserRuleCall_1_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAtomicStatement_in_ruleSequence4953);
            	    lv_right_3=ruleAtomicStatement();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSequenceRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "right", lv_right_3, "AtomicStatement", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2236:4: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2236:5: ';'
                    {
                    match(input,23,FOLLOW_23_in_ruleSequence4969); 

                            createLeafNode(grammarAccess.getSequenceAccess().getSemicolonKeyword_2(), null); 
                        

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
    // $ANTLR end ruleSequence


    // $ANTLR start entryRuleBlock
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2247:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2247:47: (iv_ruleBlock= ruleBlock EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2248:2: iv_ruleBlock= ruleBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock5004);
            iv_ruleBlock=ruleBlock();
            _fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock5014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleBlock


    // $ANTLR start ruleBlock
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2255:1: ruleBlock returns [EObject current=null] : ( '[' (lv_statement_1= ruleStatement ) ']' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2260:6: ( ( '[' (lv_statement_1= ruleStatement ) ']' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2261:1: ( '[' (lv_statement_1= ruleStatement ) ']' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2261:1: ( '[' (lv_statement_1= ruleStatement ) ']' )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2261:2: '[' (lv_statement_1= ruleStatement ) ']'
            {
            match(input,38,FOLLOW_38_in_ruleBlock5048); 

                    createLeafNode(grammarAccess.getBlockAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2265:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2268:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleBlock5082);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,39,FOLLOW_39_in_ruleBlock5095); 

                    createLeafNode(grammarAccess.getBlockAccess().getRightSquareBracketKeyword_2(), null); 
                

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
    // $ANTLR end ruleBlock


    // $ANTLR start entryRuleAssignment
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2297:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2297:52: (iv_ruleAssignment= ruleAssignment EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2298:2: iv_ruleAssignment= ruleAssignment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment5128);
            iv_ruleAssignment=ruleAssignment();
            _fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment5138); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2305:1: ruleAssignment returns [EObject current=null] : ( (lv_variable_0= RULE_ID ) ':=' (lv_expr_2= ruleDataExpr ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0=null;
        EObject lv_expr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2310:6: ( ( (lv_variable_0= RULE_ID ) ':=' (lv_expr_2= ruleDataExpr ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2311:1: ( (lv_variable_0= RULE_ID ) ':=' (lv_expr_2= ruleDataExpr ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2311:1: ( (lv_variable_0= RULE_ID ) ':=' (lv_expr_2= ruleDataExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2311:2: (lv_variable_0= RULE_ID ) ':=' (lv_expr_2= ruleDataExpr )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2311:2: (lv_variable_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2313:6: lv_variable_0= RULE_ID
            {
            lv_variable_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment5185); 

            		createLeafNode(grammarAccess.getAssignmentAccess().getVariableIDTerminalRuleCall_0_0(), "variable"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "variable", lv_variable_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,40,FOLLOW_40_in_ruleAssignment5202); 

                    createLeafNode(grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2335:1: (lv_expr_2= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2338:6: lv_expr_2= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExprDataExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleAssignment5236);
            lv_expr_2=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_2, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleAssignment


    // $ANTLR start entryRuleAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2363:1: entryRuleAbort returns [EObject current=null] : iv_ruleAbort= ruleAbort EOF ;
    public final EObject entryRuleAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbort = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2363:47: (iv_ruleAbort= ruleAbort EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2364:2: iv_ruleAbort= ruleAbort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbort_in_entryRuleAbort5273);
            iv_ruleAbort=ruleAbort();
            _fsp--;

             current =iv_ruleAbort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbort5283); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbort


    // $ANTLR start ruleAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2371:1: ruleAbort returns [EObject current=null] : ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) ) ;
    public final EObject ruleAbort() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;

        EObject lv_body_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2376:6: ( ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2377:1: ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2377:1: ( 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2377:2: 'abort' (lv_statement_1= ruleStatement ) 'when' (lv_body_3= ruleAbortBody )
            {
            match(input,41,FOLLOW_41_in_ruleAbort5317); 

                    createLeafNode(grammarAccess.getAbortAccess().getAbortKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2381:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2384:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleAbort5351);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,42,FOLLOW_42_in_ruleAbort5364); 

                    createLeafNode(grammarAccess.getAbortAccess().getWhenKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2406:1: (lv_body_3= ruleAbortBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2409:6: lv_body_3= ruleAbortBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortAccess().getBodyAbortBodyParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortBody_in_ruleAbort5398);
            lv_body_3=ruleAbortBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_3, "AbortBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleAbort


    // $ANTLR start entryRuleAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2434:1: entryRuleAbortBody returns [EObject current=null] : iv_ruleAbortBody= ruleAbortBody EOF ;
    public final EObject entryRuleAbortBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2434:51: (iv_ruleAbortBody= ruleAbortBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2435:2: iv_ruleAbortBody= ruleAbortBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortBody_in_entryRuleAbortBody5435);
            iv_ruleAbortBody=ruleAbortBody();
            _fsp--;

             current =iv_ruleAbortBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortBody5445); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortBody


    // $ANTLR start ruleAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2442:1: ruleAbortBody returns [EObject current=null] : (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase ) ;
    public final EObject ruleAbortBody() throws RecognitionException {
        EObject current = null;

        EObject this_AbortInstance_0 = null;

        EObject this_AbortCase_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2447:6: ( (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2448:1: (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2448:1: (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||(LA31_0>=RULE_INT && LA31_0<=RULE_BOOLEAN)||LA31_0==33||LA31_0==35||LA31_0==38||LA31_0==67||(LA31_0>=76 && LA31_0<=90)) ) {
                alt31=1;
            }
            else if ( (LA31_0==44) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2448:1: (this_AbortInstance_0= ruleAbortInstance | this_AbortCase_1= ruleAbortCase )", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2449:5: this_AbortInstance_0= ruleAbortInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbortBodyAccess().getAbortInstanceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbortInstance_in_ruleAbortBody5492);
                    this_AbortInstance_0=ruleAbortInstance();
                    _fsp--;

                     
                            current = this_AbortInstance_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2459:5: this_AbortCase_1= ruleAbortCase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbortBodyAccess().getAbortCaseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAbortCase_in_ruleAbortBody5519);
                    this_AbortCase_1=ruleAbortCase();
                    _fsp--;

                     
                            current = this_AbortCase_1; 
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
    // $ANTLR end ruleAbortBody


    // $ANTLR start entryRuleAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2474:1: entryRuleAbortEnd returns [String current=null] : iv_ruleAbortEnd= ruleAbortEnd EOF ;
    public final String entryRuleAbortEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbortEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2474:49: (iv_ruleAbortEnd= ruleAbortEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2475:2: iv_ruleAbortEnd= ruleAbortEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortEnd_in_entryRuleAbortEnd5552);
            iv_ruleAbortEnd=ruleAbortEnd();
            _fsp--;

             current =iv_ruleAbortEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortEnd5563); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortEnd


    // $ANTLR start ruleAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2482:1: ruleAbortEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' (kw= 'abort' )? ) ;
    public final AntlrDatatypeRuleToken ruleAbortEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2488:6: ( (kw= 'end' (kw= 'abort' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2489:1: (kw= 'end' (kw= 'abort' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2489:1: (kw= 'end' (kw= 'abort' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2490:2: kw= 'end' (kw= 'abort' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleAbortEnd5601); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getAbortEndAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2495:1: (kw= 'abort' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2496:2: kw= 'abort'
                    {
                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleAbortEnd5615); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAbortEndAccess().getAbortKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAbortEnd


    // $ANTLR start entryRuleAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2509:1: entryRuleAbortInstance returns [EObject current=null] : iv_ruleAbortInstance= ruleAbortInstance EOF ;
    public final EObject entryRuleAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortInstance = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2509:55: (iv_ruleAbortInstance= ruleAbortInstance EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2510:2: iv_ruleAbortInstance= ruleAbortInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortInstance_in_entryRuleAbortInstance5655);
            iv_ruleAbortInstance=ruleAbortInstance();
            _fsp--;

             current =iv_ruleAbortInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortInstance5665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortInstance


    // $ANTLR start ruleAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2517:1: ruleAbortInstance returns [EObject current=null] : ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? ) ;
    public final EObject ruleAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_0 = null;

        EObject lv_statement_2 = null;

        AntlrDatatypeRuleToken lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2522:6: ( ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2523:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2523:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2523:2: (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2523:2: (lv_delay_0= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2526:6: lv_delay_0= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortInstanceAccess().getDelayDelayExprParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleAbortInstance5724);
            lv_delay_0=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_0, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2544:2: ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2544:3: 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAbortEnd )
                    {
                    match(input,43,FOLLOW_43_in_ruleAbortInstance5738); 

                            createLeafNode(grammarAccess.getAbortInstanceAccess().getDoKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2548:1: (lv_statement_2= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2551:6: lv_statement_2= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortInstanceAccess().getStatementStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleAbortInstance5772);
                    lv_statement_2=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2569:2: (lv_end_3= ruleAbortEnd )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2572:6: lv_end_3= ruleAbortEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortInstanceAccess().getEndAbortEndParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAbortEnd_in_ruleAbortInstance5810);
                    lv_end_3=ruleAbortEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "AbortEnd", currentNode);
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
    // $ANTLR end ruleAbortInstance


    // $ANTLR start entryRuleAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2597:1: entryRuleAbortCase returns [EObject current=null] : iv_ruleAbortCase= ruleAbortCase EOF ;
    public final EObject entryRuleAbortCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2597:51: (iv_ruleAbortCase= ruleAbortCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2598:2: iv_ruleAbortCase= ruleAbortCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortCase_in_entryRuleAbortCase5849);
            iv_ruleAbortCase=ruleAbortCase();
            _fsp--;

             current =iv_ruleAbortCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortCase5859); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortCase


    // $ANTLR start ruleAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2605:1: ruleAbortCase returns [EObject current=null] : ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) ) ;
    public final EObject ruleAbortCase() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0 = null;

        EObject lv_cases_1 = null;

        AntlrDatatypeRuleToken lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2610:6: ( ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2611:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2611:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2611:2: (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAbortEnd )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2611:2: (lv_cases_0= ruleAbortCaseSingle )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2614:6: lv_cases_0= ruleAbortCaseSingle
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase5918);
            lv_cases_0=ruleAbortCaseSingle();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "cases", lv_cases_0, "AbortCaseSingle", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2632:2: (lv_cases_1= ruleAbortCaseSingle )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2635:6: lv_cases_1= ruleAbortCaseSingle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase5956);
            	    lv_cases_1=ruleAbortCaseSingle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAbortCaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "cases", lv_cases_1, "AbortCaseSingle", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2653:3: (lv_end_2= ruleAbortEnd )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2656:6: lv_end_2= ruleAbortEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortCaseAccess().getEndAbortEndParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortEnd_in_ruleAbortCase5995);
            lv_end_2=ruleAbortEnd();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "end", lv_end_2, "AbortEnd", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleAbortCase


    // $ANTLR start entryRuleAbortCaseSingle
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2681:1: entryRuleAbortCaseSingle returns [EObject current=null] : iv_ruleAbortCaseSingle= ruleAbortCaseSingle EOF ;
    public final EObject entryRuleAbortCaseSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbortCaseSingle = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2681:57: (iv_ruleAbortCaseSingle= ruleAbortCaseSingle EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2682:2: iv_ruleAbortCaseSingle= ruleAbortCaseSingle EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbortCaseSingleRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_entryRuleAbortCaseSingle6032);
            iv_ruleAbortCaseSingle=ruleAbortCaseSingle();
            _fsp--;

             current =iv_ruleAbortCaseSingle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbortCaseSingle6042); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAbortCaseSingle


    // $ANTLR start ruleAbortCaseSingle
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2689:1: ruleAbortCaseSingle returns [EObject current=null] : ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? ) ;
    public final EObject ruleAbortCaseSingle() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2694:6: ( ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2695:1: ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2695:1: ( 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2695:2: 'case' (lv_delay_1= ruleDelayExpr ) ( 'do' (lv_statement_3= ruleStatement ) )?
            {
            match(input,44,FOLLOW_44_in_ruleAbortCaseSingle6076); 

                    createLeafNode(grammarAccess.getAbortCaseSingleAccess().getCaseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2699:1: (lv_delay_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2702:6: lv_delay_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAbortCaseSingleAccess().getDelayDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleAbortCaseSingle6110);
            lv_delay_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAbortCaseSingleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2720:2: ( 'do' (lv_statement_3= ruleStatement ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2720:3: 'do' (lv_statement_3= ruleStatement )
                    {
                    match(input,43,FOLLOW_43_in_ruleAbortCaseSingle6124); 

                            createLeafNode(grammarAccess.getAbortCaseSingleAccess().getDoKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2724:1: (lv_statement_3= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2727:6: lv_statement_3= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAbortCaseSingleAccess().getStatementStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleAbortCaseSingle6158);
                    lv_statement_3=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAbortCaseSingleRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
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
    // $ANTLR end ruleAbortCaseSingle


    // $ANTLR start entryRuleAwait
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2752:1: entryRuleAwait returns [EObject current=null] : iv_ruleAwait= ruleAwait EOF ;
    public final EObject entryRuleAwait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwait = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2752:47: (iv_ruleAwait= ruleAwait EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2753:2: iv_ruleAwait= ruleAwait EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwait_in_entryRuleAwait6197);
            iv_ruleAwait=ruleAwait();
            _fsp--;

             current =iv_ruleAwait; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwait6207); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwait


    // $ANTLR start ruleAwait
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2760:1: ruleAwait returns [EObject current=null] : ( 'await' (lv_body_1= ruleAwaitBody ) ) ;
    public final EObject ruleAwait() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2765:6: ( ( 'await' (lv_body_1= ruleAwaitBody ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2766:1: ( 'await' (lv_body_1= ruleAwaitBody ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2766:1: ( 'await' (lv_body_1= ruleAwaitBody ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2766:2: 'await' (lv_body_1= ruleAwaitBody )
            {
            match(input,45,FOLLOW_45_in_ruleAwait6241); 

                    createLeafNode(grammarAccess.getAwaitAccess().getAwaitKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2770:1: (lv_body_1= ruleAwaitBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2773:6: lv_body_1= ruleAwaitBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitAccess().getBodyAwaitBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAwaitBody_in_ruleAwait6275);
            lv_body_1=ruleAwaitBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_1, "AwaitBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleAwait


    // $ANTLR start entryRuleAwaitBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2798:1: entryRuleAwaitBody returns [EObject current=null] : iv_ruleAwaitBody= ruleAwaitBody EOF ;
    public final EObject entryRuleAwaitBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwaitBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2798:51: (iv_ruleAwaitBody= ruleAwaitBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2799:2: iv_ruleAwaitBody= ruleAwaitBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitBody_in_entryRuleAwaitBody6312);
            iv_ruleAwaitBody=ruleAwaitBody();
            _fsp--;

             current =iv_ruleAwaitBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitBody6322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitBody


    // $ANTLR start ruleAwaitBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2806:1: ruleAwaitBody returns [EObject current=null] : (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase ) ;
    public final EObject ruleAwaitBody() throws RecognitionException {
        EObject current = null;

        EObject this_AwaitInstance_0 = null;

        EObject this_AwaitCase_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2811:6: ( (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2812:1: (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2812:1: (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID||(LA36_0>=RULE_INT && LA36_0<=RULE_BOOLEAN)||LA36_0==33||LA36_0==35||LA36_0==38||LA36_0==67||(LA36_0>=76 && LA36_0<=90)) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2812:1: (this_AwaitInstance_0= ruleAwaitInstance | this_AwaitCase_1= ruleAwaitCase )", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2813:5: this_AwaitInstance_0= ruleAwaitInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAwaitBodyAccess().getAwaitInstanceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwaitInstance_in_ruleAwaitBody6369);
                    this_AwaitInstance_0=ruleAwaitInstance();
                    _fsp--;

                     
                            current = this_AwaitInstance_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2823:5: this_AwaitCase_1= ruleAwaitCase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAwaitBodyAccess().getAwaitCaseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleAwaitCase_in_ruleAwaitBody6396);
                    this_AwaitCase_1=ruleAwaitCase();
                    _fsp--;

                     
                            current = this_AwaitCase_1; 
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
    // $ANTLR end ruleAwaitBody


    // $ANTLR start entryRuleAwaitEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2838:1: entryRuleAwaitEnd returns [String current=null] : iv_ruleAwaitEnd= ruleAwaitEnd EOF ;
    public final String entryRuleAwaitEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAwaitEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2838:49: (iv_ruleAwaitEnd= ruleAwaitEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2839:2: iv_ruleAwaitEnd= ruleAwaitEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitEnd_in_entryRuleAwaitEnd6429);
            iv_ruleAwaitEnd=ruleAwaitEnd();
            _fsp--;

             current =iv_ruleAwaitEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitEnd6440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitEnd


    // $ANTLR start ruleAwaitEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2846:1: ruleAwaitEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' (kw= 'await' )? ) ;
    public final AntlrDatatypeRuleToken ruleAwaitEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2852:6: ( (kw= 'end' (kw= 'await' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2853:1: (kw= 'end' (kw= 'await' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2853:1: (kw= 'end' (kw= 'await' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2854:2: kw= 'end' (kw= 'await' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleAwaitEnd6478); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getAwaitEndAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2859:1: (kw= 'await' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2860:2: kw= 'await'
                    {
                    kw=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_ruleAwaitEnd6492); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getAwaitEndAccess().getAwaitKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleAwaitEnd


    // $ANTLR start entryRuleAwaitInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2873:1: entryRuleAwaitInstance returns [EObject current=null] : iv_ruleAwaitInstance= ruleAwaitInstance EOF ;
    public final EObject entryRuleAwaitInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwaitInstance = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2873:55: (iv_ruleAwaitInstance= ruleAwaitInstance EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2874:2: iv_ruleAwaitInstance= ruleAwaitInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitInstance_in_entryRuleAwaitInstance6532);
            iv_ruleAwaitInstance=ruleAwaitInstance();
            _fsp--;

             current =iv_ruleAwaitInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitInstance6542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitInstance


    // $ANTLR start ruleAwaitInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2881:1: ruleAwaitInstance returns [EObject current=null] : (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? ) ;
    public final EObject ruleAwaitInstance() throws RecognitionException {
        EObject current = null;

        EObject this_DelayExpr_0 = null;

        EObject lv_statement_2 = null;

        AntlrDatatypeRuleToken lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2886:6: ( (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2887:1: (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2887:1: (this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2888:5: this_DelayExpr_0= ruleDelayExpr ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )?
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAwaitInstanceAccess().getDelayExprParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleAwaitInstance6589);
            this_DelayExpr_0=ruleDelayExpr();
            _fsp--;

             
                    current = this_DelayExpr_0; 
                    currentNode = currentNode.getParent();
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2896:1: ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2896:2: 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleAwaitEnd )
                    {
                    match(input,43,FOLLOW_43_in_ruleAwaitInstance6598); 

                            createLeafNode(grammarAccess.getAwaitInstanceAccess().getDoKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2900:1: (lv_statement_2= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2903:6: lv_statement_2= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAwaitInstanceAccess().getStatementStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleAwaitInstance6632);
                    lv_statement_2=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAwaitInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2921:2: (lv_end_3= ruleAwaitEnd )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2924:6: lv_end_3= ruleAwaitEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getAwaitInstanceAccess().getEndAwaitEndParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleAwaitEnd_in_ruleAwaitInstance6670);
                    lv_end_3=ruleAwaitEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getAwaitInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "AwaitEnd", currentNode);
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
    // $ANTLR end ruleAwaitInstance


    // $ANTLR start entryRuleAwaitCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2949:1: entryRuleAwaitCase returns [EObject current=null] : iv_ruleAwaitCase= ruleAwaitCase EOF ;
    public final EObject entryRuleAwaitCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAwaitCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2949:51: (iv_ruleAwaitCase= ruleAwaitCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2950:2: iv_ruleAwaitCase= ruleAwaitCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAwaitCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleAwaitCase_in_entryRuleAwaitCase6709);
            iv_ruleAwaitCase=ruleAwaitCase();
            _fsp--;

             current =iv_ruleAwaitCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAwaitCase6719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleAwaitCase


    // $ANTLR start ruleAwaitCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2957:1: ruleAwaitCase returns [EObject current=null] : ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) ) ;
    public final EObject ruleAwaitCase() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0 = null;

        EObject lv_cases_1 = null;

        AntlrDatatypeRuleToken lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2962:6: ( ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2963:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2963:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2963:2: (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleAwaitEnd )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2963:2: (lv_cases_0= ruleAbortCaseSingle )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2966:6: lv_cases_0= ruleAbortCaseSingle
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitCaseAccess().getCasesAbortCaseSingleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase6778);
            lv_cases_0=ruleAbortCaseSingle();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "cases", lv_cases_0, "AbortCaseSingle", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2984:2: (lv_cases_1= ruleAbortCaseSingle )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==44) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:2987:6: lv_cases_1= ruleAbortCaseSingle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAwaitCaseAccess().getCasesAbortCaseSingleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase6816);
            	    lv_cases_1=ruleAbortCaseSingle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getAwaitCaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "cases", lv_cases_1, "AbortCaseSingle", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3005:3: (lv_end_2= ruleAwaitEnd )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3008:6: lv_end_2= ruleAwaitEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getAwaitCaseAccess().getEndAwaitEndParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAwaitEnd_in_ruleAwaitCase6855);
            lv_end_2=ruleAwaitEnd();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getAwaitCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "end", lv_end_2, "AwaitEnd", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleAwaitCase


    // $ANTLR start entryRuleDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3033:1: entryRuleDo returns [EObject current=null] : iv_ruleDo= ruleDo EOF ;
    public final EObject entryRuleDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDo = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3033:44: (iv_ruleDo= ruleDo EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3034:2: iv_ruleDo= ruleDo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoRule(), currentNode); 
            pushFollow(FOLLOW_ruleDo_in_entryRuleDo6892);
            iv_ruleDo=ruleDo();
            _fsp--;

             current =iv_ruleDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDo6902); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDo


    // $ANTLR start ruleDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3041:1: ruleDo returns [EObject current=null] : ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) ) ;
    public final EObject ruleDo() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;

        EObject lv_end_2 = null;

        EObject lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3046:6: ( ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3047:1: ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3047:1: ( 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3047:2: 'do' (lv_statement_1= ruleStatement ) ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) )
            {
            match(input,43,FOLLOW_43_in_ruleDo6936); 

                    createLeafNode(grammarAccess.getDoAccess().getDoKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3051:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3054:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleDo6970);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3072:2: ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            else if ( (LA40_0==47) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3072:2: ( (lv_end_2= ruleDoUpto ) | (lv_end_3= ruleDoWatching ) )", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3072:3: (lv_end_2= ruleDoUpto )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3072:3: (lv_end_2= ruleDoUpto )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3075:6: lv_end_2= ruleDoUpto
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoAccess().getEndDoUptoParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoUpto_in_ruleDo7009);
                    lv_end_2=ruleDoUpto();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_2, "DoUpto", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3094:6: (lv_end_3= ruleDoWatching )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3094:6: (lv_end_3= ruleDoWatching )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3097:6: lv_end_3= ruleDoWatching
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoAccess().getEndDoWatchingParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoWatching_in_ruleDo7053);
                    lv_end_3=ruleDoWatching();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "DoWatching", currentNode);
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
    // $ANTLR end ruleDo


    // $ANTLR start entryRuleDoUpto
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3122:1: entryRuleDoUpto returns [EObject current=null] : iv_ruleDoUpto= ruleDoUpto EOF ;
    public final EObject entryRuleDoUpto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoUpto = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3122:48: (iv_ruleDoUpto= ruleDoUpto EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3123:2: iv_ruleDoUpto= ruleDoUpto EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoUptoRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoUpto_in_entryRuleDoUpto7091);
            iv_ruleDoUpto=ruleDoUpto();
            _fsp--;

             current =iv_ruleDoUpto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoUpto7101); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoUpto


    // $ANTLR start ruleDoUpto
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3130:1: ruleDoUpto returns [EObject current=null] : ( 'upto' (lv_expr_1= ruleDelayExpr ) ) ;
    public final EObject ruleDoUpto() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3135:6: ( ( 'upto' (lv_expr_1= ruleDelayExpr ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3136:1: ( 'upto' (lv_expr_1= ruleDelayExpr ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3136:1: ( 'upto' (lv_expr_1= ruleDelayExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3136:2: 'upto' (lv_expr_1= ruleDelayExpr )
            {
            match(input,46,FOLLOW_46_in_ruleDoUpto7135); 

                    createLeafNode(grammarAccess.getDoUptoAccess().getUptoKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3140:1: (lv_expr_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3143:6: lv_expr_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoUptoAccess().getExprDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleDoUpto7169);
            lv_expr_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoUptoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleDoUpto


    // $ANTLR start entryRuleDoWatching
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3168:1: entryRuleDoWatching returns [EObject current=null] : iv_ruleDoWatching= ruleDoWatching EOF ;
    public final EObject entryRuleDoWatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWatching = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3168:52: (iv_ruleDoWatching= ruleDoWatching EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3169:2: iv_ruleDoWatching= ruleDoWatching EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoWatchingRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoWatching_in_entryRuleDoWatching7206);
            iv_ruleDoWatching=ruleDoWatching();
            _fsp--;

             current =iv_ruleDoWatching; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWatching7216); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoWatching


    // $ANTLR start ruleDoWatching
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3176:1: ruleDoWatching returns [EObject current=null] : ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? ) ;
    public final EObject ruleDoWatching() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_1 = null;

        EObject lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3181:6: ( ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3182:1: ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3182:1: ( 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3182:2: 'watching' (lv_delay_1= ruleDelayExpr ) (lv_end_2= ruleDoWatchingEnd )?
            {
            match(input,47,FOLLOW_47_in_ruleDoWatching7250); 

                    createLeafNode(grammarAccess.getDoWatchingAccess().getWatchingKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3186:1: (lv_delay_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3189:6: lv_delay_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWatchingAccess().getDelayDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleDoWatching7284);
            lv_delay_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoWatchingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3207:2: (lv_end_2= ruleDoWatchingEnd )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3210:6: lv_end_2= ruleDoWatchingEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDoWatchingAccess().getEndDoWatchingEndParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDoWatchingEnd_in_ruleDoWatching7322);
                    lv_end_2=ruleDoWatchingEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDoWatchingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_2, "DoWatchingEnd", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleDoWatching


    // $ANTLR start entryRuleDoWatchingEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3235:1: entryRuleDoWatchingEnd returns [EObject current=null] : iv_ruleDoWatchingEnd= ruleDoWatchingEnd EOF ;
    public final EObject entryRuleDoWatchingEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWatchingEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3235:55: (iv_ruleDoWatchingEnd= ruleDoWatchingEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3236:2: iv_ruleDoWatchingEnd= ruleDoWatchingEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDoWatchingEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleDoWatchingEnd_in_entryRuleDoWatchingEnd7360);
            iv_ruleDoWatchingEnd=ruleDoWatchingEnd();
            _fsp--;

             current =iv_ruleDoWatchingEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWatchingEnd7370); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDoWatchingEnd


    // $ANTLR start ruleDoWatchingEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3243:1: ruleDoWatchingEnd returns [EObject current=null] : ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? ) ;
    public final EObject ruleDoWatchingEnd() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3248:6: ( ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3249:1: ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3249:1: ( 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3249:2: 'timeout' (lv_statement_1= ruleStatement ) 'end' ( 'timeout' )?
            {
            match(input,48,FOLLOW_48_in_ruleDoWatchingEnd7404); 

                    createLeafNode(grammarAccess.getDoWatchingEndAccess().getTimeoutKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3253:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3256:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getDoWatchingEndAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleDoWatchingEnd7438);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDoWatchingEndRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleDoWatchingEnd7451); 

                    createLeafNode(grammarAccess.getDoWatchingEndAccess().getEndKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3278:1: ( 'timeout' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3278:2: 'timeout'
                    {
                    match(input,48,FOLLOW_48_in_ruleDoWatchingEnd7461); 

                            createLeafNode(grammarAccess.getDoWatchingEndAccess().getTimeoutKeyword_3(), null); 
                        

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
    // $ANTLR end ruleDoWatchingEnd


    // $ANTLR start entryRuleEmit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3289:1: entryRuleEmit returns [EObject current=null] : iv_ruleEmit= ruleEmit EOF ;
    public final EObject entryRuleEmit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmit = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3289:46: (iv_ruleEmit= ruleEmit EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3290:2: iv_ruleEmit= ruleEmit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEmitRule(), currentNode); 
            pushFollow(FOLLOW_ruleEmit_in_entryRuleEmit7496);
            iv_ruleEmit=ruleEmit();
            _fsp--;

             current =iv_ruleEmit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEmit7506); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEmit


    // $ANTLR start ruleEmit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3297:1: ruleEmit returns [EObject current=null] : ( 'emit' ( RULE_ID ) ( '(' (lv_expr_3= ruleDataExpr ) ')' )? ) ;
    public final EObject ruleEmit() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3302:6: ( ( 'emit' ( RULE_ID ) ( '(' (lv_expr_3= ruleDataExpr ) ')' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3303:1: ( 'emit' ( RULE_ID ) ( '(' (lv_expr_3= ruleDataExpr ) ')' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3303:1: ( 'emit' ( RULE_ID ) ( '(' (lv_expr_3= ruleDataExpr ) ')' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3303:2: 'emit' ( RULE_ID ) ( '(' (lv_expr_3= ruleDataExpr ) ')' )?
            {
            match(input,49,FOLLOW_49_in_ruleEmit7540); 

                    createLeafNode(grammarAccess.getEmitAccess().getEmitKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3307:1: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3310:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEmit7562); 

            		createLeafNode(grammarAccess.getEmitAccess().getSignalSignalCrossReference_1_0(), "signal"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3323:2: ( '(' (lv_expr_3= ruleDataExpr ) ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==35) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3323:3: '(' (lv_expr_3= ruleDataExpr ) ')'
                    {
                    match(input,35,FOLLOW_35_in_ruleEmit7575); 

                            createLeafNode(grammarAccess.getEmitAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3327:1: (lv_expr_3= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3330:6: lv_expr_3= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEmitAccess().getExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleEmit7609);
                    lv_expr_3=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getEmitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_3, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleEmit7622); 

                            createLeafNode(grammarAccess.getEmitAccess().getRightParenthesisKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleEmit


    // $ANTLR start entryRuleEveryDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3359:1: entryRuleEveryDo returns [EObject current=null] : iv_ruleEveryDo= ruleEveryDo EOF ;
    public final EObject entryRuleEveryDo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEveryDo = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3359:49: (iv_ruleEveryDo= ruleEveryDo EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3360:2: iv_ruleEveryDo= ruleEveryDo EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEveryDoRule(), currentNode); 
            pushFollow(FOLLOW_ruleEveryDo_in_entryRuleEveryDo7657);
            iv_ruleEveryDo=ruleEveryDo();
            _fsp--;

             current =iv_ruleEveryDo; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEveryDo7667); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEveryDo


    // $ANTLR start ruleEveryDo
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3367:1: ruleEveryDo returns [EObject current=null] : ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? ) ;
    public final EObject ruleEveryDo() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3372:6: ( ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3373:1: ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3373:1: ( 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3373:2: 'every' (lv_delay_1= ruleDelayExpr ) 'do' (lv_statement_3= ruleStatement ) 'end' ( 'every' )?
            {
            match(input,50,FOLLOW_50_in_ruleEveryDo7701); 

                    createLeafNode(grammarAccess.getEveryDoAccess().getEveryKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3377:1: (lv_delay_1= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3380:6: lv_delay_1= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEveryDoAccess().getDelayDelayExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleEveryDo7735);
            lv_delay_1=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEveryDoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_1, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,43,FOLLOW_43_in_ruleEveryDo7748); 

                    createLeafNode(grammarAccess.getEveryDoAccess().getDoKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3402:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3405:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getEveryDoAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleEveryDo7782);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEveryDoRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleEveryDo7795); 

                    createLeafNode(grammarAccess.getEveryDoAccess().getEndKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3427:1: ( 'every' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3427:2: 'every'
                    {
                    match(input,50,FOLLOW_50_in_ruleEveryDo7805); 

                            createLeafNode(grammarAccess.getEveryDoAccess().getEveryKeyword_5(), null); 
                        

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
    // $ANTLR end ruleEveryDo


    // $ANTLR start entryRuleExit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3438:1: entryRuleExit returns [EObject current=null] : iv_ruleExit= ruleExit EOF ;
    public final EObject entryRuleExit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExit = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3438:46: (iv_ruleExit= ruleExit EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3439:2: iv_ruleExit= ruleExit EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExitRule(), currentNode); 
            pushFollow(FOLLOW_ruleExit_in_entryRuleExit7840);
            iv_ruleExit=ruleExit();
            _fsp--;

             current =iv_ruleExit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExit7850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExit


    // $ANTLR start ruleExit
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3446:1: ruleExit returns [EObject current=null] : ( 'exit' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? ) ;
    public final EObject ruleExit() throws RecognitionException {
        EObject current = null;

        EObject lv_dataExpr_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3451:6: ( ( 'exit' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3452:1: ( 'exit' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3452:1: ( 'exit' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3452:2: 'exit' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )?
            {
            match(input,51,FOLLOW_51_in_ruleExit7884); 

                    createLeafNode(grammarAccess.getExitAccess().getExitKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3456:1: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3459:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getExitRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExit7906); 

            		createLeafNode(grammarAccess.getExitAccess().getTrapTrapCrossReference_1_0(), "trap"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3472:2: ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3472:3: '(' (lv_dataExpr_3= ruleDataExpr ) ')'
                    {
                    match(input,35,FOLLOW_35_in_ruleExit7919); 

                            createLeafNode(grammarAccess.getExitAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3476:1: (lv_dataExpr_3= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3479:6: lv_dataExpr_3= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getExitAccess().getDataExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleExit7953);
                    lv_dataExpr_3=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getExitRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "dataExpr", lv_dataExpr_3, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleExit7966); 

                            createLeafNode(grammarAccess.getExitAccess().getRightParenthesisKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleExit


    // $ANTLR start entryRuleHalt
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3508:1: entryRuleHalt returns [EObject current=null] : iv_ruleHalt= ruleHalt EOF ;
    public final EObject entryRuleHalt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHalt = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3508:46: (iv_ruleHalt= ruleHalt EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3509:2: iv_ruleHalt= ruleHalt EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHaltRule(), currentNode); 
            pushFollow(FOLLOW_ruleHalt_in_entryRuleHalt8001);
            iv_ruleHalt=ruleHalt();
            _fsp--;

             current =iv_ruleHalt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHalt8011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleHalt


    // $ANTLR start ruleHalt
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3516:1: ruleHalt returns [EObject current=null] : ( 'halt' () ) ;
    public final EObject ruleHalt() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3521:6: ( ( 'halt' () ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3522:1: ( 'halt' () )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3522:1: ( 'halt' () )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3522:2: 'halt' ()
            {
            match(input,52,FOLLOW_52_in_ruleHalt8045); 

                    createLeafNode(grammarAccess.getHaltAccess().getHaltKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3526:1: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3527:5: 
            {
             
                    temp=factory.create(grammarAccess.getHaltAccess().getHaltAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getHaltAccess().getHaltAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

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
    // $ANTLR end ruleHalt


    // $ANTLR start entryRuleIfTest
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3544:1: entryRuleIfTest returns [EObject current=null] : iv_ruleIfTest= ruleIfTest EOF ;
    public final EObject entryRuleIfTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfTest = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3544:48: (iv_ruleIfTest= ruleIfTest EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3545:2: iv_ruleIfTest= ruleIfTest EOF
            {
             currentNode = createCompositeNode(grammarAccess.getIfTestRule(), currentNode); 
            pushFollow(FOLLOW_ruleIfTest_in_entryRuleIfTest8087);
            iv_ruleIfTest=ruleIfTest();
            _fsp--;

             current =iv_ruleIfTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfTest8097); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleIfTest


    // $ANTLR start ruleIfTest
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3552:1: ruleIfTest returns [EObject current=null] : ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? ) ;
    public final EObject ruleIfTest() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1 = null;

        EObject lv_then_2 = null;

        EObject lv_elseIf_3 = null;

        EObject lv_else_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3557:6: ( ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3558:1: ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3558:1: ( 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3558:2: 'if' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? (lv_elseIf_3= ruleElsIfPart )? (lv_else_4= ruleElsePart )? 'end' ( 'if' )?
            {
            match(input,53,FOLLOW_53_in_ruleIfTest8131); 

                    createLeafNode(grammarAccess.getIfTestAccess().getIfKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3562:1: (lv_expr_1= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3565:6: lv_expr_1= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getExprDataExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleIfTest8165);
            lv_expr_1=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3583:2: (lv_then_2= ruleThenPart )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3586:6: lv_then_2= ruleThenPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getThenThenPartParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleThenPart_in_ruleIfTest8203);
                    lv_then_2=ruleThenPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "then", lv_then_2, "ThenPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3604:3: (lv_elseIf_3= ruleElsIfPart )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==54) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3607:6: lv_elseIf_3= ruleElsIfPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getElseIfElsIfPartParserRuleCall_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElsIfPart_in_ruleIfTest8242);
                    lv_elseIf_3=ruleElsIfPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elseIf", lv_elseIf_3, "ElsIfPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3625:3: (lv_else_4= ruleElsePart )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3628:6: lv_else_4= ruleElsePart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getIfTestAccess().getElseElsePartParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElsePart_in_ruleIfTest8281);
                    lv_else_4=ruleElsePart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getIfTestRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "else", lv_else_4, "ElsePart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleIfTest8295); 

                    createLeafNode(grammarAccess.getIfTestAccess().getEndKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3650:1: ( 'if' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==53) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3650:2: 'if'
                    {
                    match(input,53,FOLLOW_53_in_ruleIfTest8305); 

                            createLeafNode(grammarAccess.getIfTestAccess().getIfKeyword_6(), null); 
                        

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
    // $ANTLR end ruleIfTest


    // $ANTLR start entryRuleElsIfPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3661:1: entryRuleElsIfPart returns [EObject current=null] : iv_ruleElsIfPart= ruleElsIfPart EOF ;
    public final EObject entryRuleElsIfPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsIfPart = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3661:51: (iv_ruleElsIfPart= ruleElsIfPart EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3662:2: iv_ruleElsIfPart= ruleElsIfPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElsIfPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleElsIfPart_in_entryRuleElsIfPart8340);
            iv_ruleElsIfPart=ruleElsIfPart();
            _fsp--;

             current =iv_ruleElsIfPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElsIfPart8350); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElsIfPart


    // $ANTLR start ruleElsIfPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3669:1: ruleElsIfPart returns [EObject current=null] : ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* ) ;
    public final EObject ruleElsIfPart() throws RecognitionException {
        EObject current = null;

        EObject lv_elsif_0 = null;

        EObject lv_elsif_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3674:6: ( ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3675:1: ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3675:1: ( (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3675:2: (lv_elsif_0= ruleElsIf ) (lv_elsif_1= ruleElsIf )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3675:2: (lv_elsif_0= ruleElsIf )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3678:6: lv_elsif_0= ruleElsIf
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElsIfPartAccess().getElsifElsIfParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleElsIf_in_ruleElsIfPart8409);
            lv_elsif_0=ruleElsIf();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElsIfPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "elsif", lv_elsif_0, "ElsIf", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3696:2: (lv_elsif_1= ruleElsIf )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==54) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3699:6: lv_elsif_1= ruleElsIf
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getElsIfPartAccess().getElsifElsIfParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleElsIf_in_ruleElsIfPart8447);
            	    lv_elsif_1=ruleElsIf();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getElsIfPartRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "elsif", lv_elsif_1, "ElsIf", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end ruleElsIfPart


    // $ANTLR start entryRuleElsIf
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3724:1: entryRuleElsIf returns [EObject current=null] : iv_ruleElsIf= ruleElsIf EOF ;
    public final EObject entryRuleElsIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsIf = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3724:47: (iv_ruleElsIf= ruleElsIf EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3725:2: iv_ruleElsIf= ruleElsIf EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElsIfRule(), currentNode); 
            pushFollow(FOLLOW_ruleElsIf_in_entryRuleElsIf8485);
            iv_ruleElsIf=ruleElsIf();
            _fsp--;

             current =iv_ruleElsIf; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElsIf8495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElsIf


    // $ANTLR start ruleElsIf
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3732:1: ruleElsIf returns [EObject current=null] : ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? ) ;
    public final EObject ruleElsIf() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_1 = null;

        EObject lv_then_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3737:6: ( ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3738:1: ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3738:1: ( 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3738:2: 'elsif' (lv_expr_1= ruleDataExpr ) (lv_then_2= ruleThenPart )?
            {
            match(input,54,FOLLOW_54_in_ruleElsIf8529); 

                    createLeafNode(grammarAccess.getElsIfAccess().getElsifKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3742:1: (lv_expr_1= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3745:6: lv_expr_1= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElsIfAccess().getExprDataExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleElsIf8563);
            lv_expr_1=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElsIfRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3763:2: (lv_then_2= ruleThenPart )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3766:6: lv_then_2= ruleThenPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getElsIfAccess().getThenThenPartParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleThenPart_in_ruleElsIf8601);
                    lv_then_2=ruleThenPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getElsIfRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "then", lv_then_2, "ThenPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleElsIf


    // $ANTLR start entryRuleThenPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3791:1: entryRuleThenPart returns [EObject current=null] : iv_ruleThenPart= ruleThenPart EOF ;
    public final EObject entryRuleThenPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThenPart = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3791:50: (iv_ruleThenPart= ruleThenPart EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3792:2: iv_ruleThenPart= ruleThenPart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getThenPartRule(), currentNode); 
            pushFollow(FOLLOW_ruleThenPart_in_entryRuleThenPart8639);
            iv_ruleThenPart=ruleThenPart();
            _fsp--;

             current =iv_ruleThenPart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThenPart8649); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleThenPart


    // $ANTLR start ruleThenPart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3799:1: ruleThenPart returns [EObject current=null] : ( 'then' (lv_statement_1= ruleStatement ) ) ;
    public final EObject ruleThenPart() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3804:6: ( ( 'then' (lv_statement_1= ruleStatement ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3805:1: ( 'then' (lv_statement_1= ruleStatement ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3805:1: ( 'then' (lv_statement_1= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3805:2: 'then' (lv_statement_1= ruleStatement )
            {
            match(input,55,FOLLOW_55_in_ruleThenPart8683); 

                    createLeafNode(grammarAccess.getThenPartAccess().getThenKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3809:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3812:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getThenPartAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleThenPart8717);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getThenPartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleThenPart


    // $ANTLR start entryRuleElsePart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3837:1: entryRuleElsePart returns [EObject current=null] : iv_ruleElsePart= ruleElsePart EOF ;
    public final EObject entryRuleElsePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElsePart = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3837:50: (iv_ruleElsePart= ruleElsePart EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3838:2: iv_ruleElsePart= ruleElsePart EOF
            {
             currentNode = createCompositeNode(grammarAccess.getElsePartRule(), currentNode); 
            pushFollow(FOLLOW_ruleElsePart_in_entryRuleElsePart8754);
            iv_ruleElsePart=ruleElsePart();
            _fsp--;

             current =iv_ruleElsePart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElsePart8764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleElsePart


    // $ANTLR start ruleElsePart
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3845:1: ruleElsePart returns [EObject current=null] : ( 'else' (lv_statement_1= ruleStatement ) ) ;
    public final EObject ruleElsePart() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3850:6: ( ( 'else' (lv_statement_1= ruleStatement ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3851:1: ( 'else' (lv_statement_1= ruleStatement ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3851:1: ( 'else' (lv_statement_1= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3851:2: 'else' (lv_statement_1= ruleStatement )
            {
            match(input,56,FOLLOW_56_in_ruleElsePart8798); 

                    createLeafNode(grammarAccess.getElsePartAccess().getElseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3855:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3858:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getElsePartAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleElsePart8832);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getElsePartRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleElsePart


    // $ANTLR start entryRuleLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3883:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3883:46: (iv_ruleLoop= ruleLoop EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3884:2: iv_ruleLoop= ruleLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoop_in_entryRuleLoop8869);
            iv_ruleLoop=ruleLoop();
            _fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoop8879); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoop


    // $ANTLR start ruleLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3891:1: ruleLoop returns [EObject current=null] : ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1 = null;

        EObject lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3896:6: ( ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3897:1: ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3897:1: ( 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3897:2: 'loop' (lv_body_1= ruleLoopBody ) ( ruleEndLoop | (lv_end_3= ruleLoopEach ) )
            {
            match(input,57,FOLLOW_57_in_ruleLoop8913); 

                    createLeafNode(grammarAccess.getLoopAccess().getLoopKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3901:1: (lv_body_1= ruleLoopBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3904:6: lv_body_1= ruleLoopBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getBodyLoopBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLoopBody_in_ruleLoop8947);
            lv_body_1=ruleLoopBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_1, "LoopBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3922:2: ( ruleEndLoop | (lv_end_3= ruleLoopEach ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            else if ( (LA52_0==58) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("3922:2: ( ruleEndLoop | (lv_end_3= ruleLoopEach ) )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3922:3: ruleEndLoop
                    {
                    pushFollow(FOLLOW_ruleEndLoop_in_ruleLoop8961);
                    ruleEndLoop();
                    _fsp--;


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3923:6: (lv_end_3= ruleLoopEach )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3923:6: (lv_end_3= ruleLoopEach )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3926:6: lv_end_3= ruleLoopEach
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getLoopAccess().getEndLoopEachParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleLoopEach_in_ruleLoop8993);
                    lv_end_3=ruleLoopEach();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getLoopRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "LoopEach", currentNode);
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
    // $ANTLR end ruleLoop


    // $ANTLR start entryRuleEndLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3951:1: entryRuleEndLoop returns [String current=null] : iv_ruleEndLoop= ruleEndLoop EOF ;
    public final String entryRuleEndLoop() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndLoop = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3951:48: (iv_ruleEndLoop= ruleEndLoop EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3952:2: iv_ruleEndLoop= ruleEndLoop EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEndLoopRule(), currentNode); 
            pushFollow(FOLLOW_ruleEndLoop_in_entryRuleEndLoop9032);
            iv_ruleEndLoop=ruleEndLoop();
            _fsp--;

             current =iv_ruleEndLoop.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEndLoop9043); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleEndLoop


    // $ANTLR start ruleEndLoop
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3959:1: ruleEndLoop returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' (kw= 'loop' )? ) ;
    public final AntlrDatatypeRuleToken ruleEndLoop() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3965:6: ( (kw= 'end' (kw= 'loop' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3966:1: (kw= 'end' (kw= 'loop' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3966:1: (kw= 'end' (kw= 'loop' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3967:2: kw= 'end' (kw= 'loop' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleEndLoop9081); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getEndLoopAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3972:1: (kw= 'loop' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==57) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3973:2: kw= 'loop'
                    {
                    kw=(Token)input.LT(1);
                    match(input,57,FOLLOW_57_in_ruleEndLoop9095); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getEndLoopAccess().getLoopKeyword_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEndLoop


    // $ANTLR start entryRuleLoopEach
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3986:1: entryRuleLoopEach returns [EObject current=null] : iv_ruleLoopEach= ruleLoopEach EOF ;
    public final EObject entryRuleLoopEach() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopEach = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3986:50: (iv_ruleLoopEach= ruleLoopEach EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3987:2: iv_ruleLoopEach= ruleLoopEach EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopEachRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopEach_in_entryRuleLoopEach9135);
            iv_ruleLoopEach=ruleLoopEach();
            _fsp--;

             current =iv_ruleLoopEach; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopEach9145); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopEach


    // $ANTLR start ruleLoopEach
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3994:1: ruleLoopEach returns [EObject current=null] : ( 'each' this_LoopDelay_1= ruleLoopDelay ) ;
    public final EObject ruleLoopEach() throws RecognitionException {
        EObject current = null;

        EObject this_LoopDelay_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:3999:6: ( ( 'each' this_LoopDelay_1= ruleLoopDelay ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4000:1: ( 'each' this_LoopDelay_1= ruleLoopDelay )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4000:1: ( 'each' this_LoopDelay_1= ruleLoopDelay )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4000:2: 'each' this_LoopDelay_1= ruleLoopDelay
            {
            match(input,58,FOLLOW_58_in_ruleLoopEach9179); 

                    createLeafNode(grammarAccess.getLoopEachAccess().getEachKeyword_0(), null); 
                
             
                    currentNode=createCompositeNode(grammarAccess.getLoopEachAccess().getLoopDelayParserRuleCall_1(), currentNode); 
                
            pushFollow(FOLLOW_ruleLoopDelay_in_ruleLoopEach9201);
            this_LoopDelay_1=ruleLoopDelay();
            _fsp--;

             
                    current = this_LoopDelay_1; 
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
    // $ANTLR end ruleLoopEach


    // $ANTLR start entryRuleLoopDelay
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4020:1: entryRuleLoopDelay returns [EObject current=null] : iv_ruleLoopDelay= ruleLoopDelay EOF ;
    public final EObject entryRuleLoopDelay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopDelay = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4020:51: (iv_ruleLoopDelay= ruleLoopDelay EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4021:2: iv_ruleLoopDelay= ruleLoopDelay EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopDelayRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopDelay_in_entryRuleLoopDelay9233);
            iv_ruleLoopDelay=ruleLoopDelay();
            _fsp--;

             current =iv_ruleLoopDelay; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopDelay9243); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopDelay


    // $ANTLR start ruleLoopDelay
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4028:1: ruleLoopDelay returns [EObject current=null] : (lv_delay_0= ruleDelayExpr ) ;
    public final EObject ruleLoopDelay() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4033:6: ( (lv_delay_0= ruleDelayExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4034:1: (lv_delay_0= ruleDelayExpr )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4034:1: (lv_delay_0= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4037:6: lv_delay_0= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopDelayAccess().getDelayDelayExprParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleLoopDelay9301);
            lv_delay_0=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopDelayRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_0, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
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
    // $ANTLR end ruleLoopDelay


    // $ANTLR start entryRuleLoopBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4062:1: entryRuleLoopBody returns [EObject current=null] : iv_ruleLoopBody= ruleLoopBody EOF ;
    public final EObject entryRuleLoopBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4062:50: (iv_ruleLoopBody= ruleLoopBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4063:2: iv_ruleLoopBody= ruleLoopBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLoopBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleLoopBody_in_entryRuleLoopBody9337);
            iv_ruleLoopBody=ruleLoopBody();
            _fsp--;

             current =iv_ruleLoopBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopBody9347); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLoopBody


    // $ANTLR start ruleLoopBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4070:1: ruleLoopBody returns [EObject current=null] : (lv_statement_0= ruleStatement ) ;
    public final EObject ruleLoopBody() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4075:6: ( (lv_statement_0= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4076:1: (lv_statement_0= ruleStatement )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4076:1: (lv_statement_0= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4079:6: lv_statement_0= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLoopBodyAccess().getStatementStatementParserRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleLoopBody9405);
            lv_statement_0=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLoopBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_0, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
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
    // $ANTLR end ruleLoopBody


    // $ANTLR start entryRuleNothing
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4104:1: entryRuleNothing returns [EObject current=null] : iv_ruleNothing= ruleNothing EOF ;
    public final EObject entryRuleNothing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNothing = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4104:49: (iv_ruleNothing= ruleNothing EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4105:2: iv_ruleNothing= ruleNothing EOF
            {
             currentNode = createCompositeNode(grammarAccess.getNothingRule(), currentNode); 
            pushFollow(FOLLOW_ruleNothing_in_entryRuleNothing9441);
            iv_ruleNothing=ruleNothing();
            _fsp--;

             current =iv_ruleNothing; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNothing9451); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleNothing


    // $ANTLR start ruleNothing
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4112:1: ruleNothing returns [EObject current=null] : ( 'nothing' () ) ;
    public final EObject ruleNothing() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4117:6: ( ( 'nothing' () ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4118:1: ( 'nothing' () )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4118:1: ( 'nothing' () )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4118:2: 'nothing' ()
            {
            match(input,59,FOLLOW_59_in_ruleNothing9485); 

                    createLeafNode(grammarAccess.getNothingAccess().getNothingKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4122:1: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4123:5: 
            {
             
                    temp=factory.create(grammarAccess.getNothingAccess().getNothingAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getNothingAccess().getNothingAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

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
    // $ANTLR end ruleNothing


    // $ANTLR start entryRulePause
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4140:1: entryRulePause returns [EObject current=null] : iv_rulePause= rulePause EOF ;
    public final EObject entryRulePause() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePause = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4140:47: (iv_rulePause= rulePause EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4141:2: iv_rulePause= rulePause EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPauseRule(), currentNode); 
            pushFollow(FOLLOW_rulePause_in_entryRulePause9527);
            iv_rulePause=rulePause();
            _fsp--;

             current =iv_rulePause; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePause9537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePause


    // $ANTLR start rulePause
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4148:1: rulePause returns [EObject current=null] : ( 'pause' () ) ;
    public final EObject rulePause() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4153:6: ( ( 'pause' () ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4154:1: ( 'pause' () )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4154:1: ( 'pause' () )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4154:2: 'pause' ()
            {
            match(input,60,FOLLOW_60_in_rulePause9571); 

                    createLeafNode(grammarAccess.getPauseAccess().getPauseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4158:1: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4159:5: 
            {
             
                    temp=factory.create(grammarAccess.getPauseAccess().getPauseAction_1().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getPauseAccess().getPauseAction_1(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

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
    // $ANTLR end rulePause


    // $ANTLR start entryRulePresent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4176:1: entryRulePresent returns [EObject current=null] : iv_rulePresent= rulePresent EOF ;
    public final EObject entryRulePresent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4176:49: (iv_rulePresent= rulePresent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4177:2: iv_rulePresent= rulePresent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentRule(), currentNode); 
            pushFollow(FOLLOW_rulePresent_in_entryRulePresent9613);
            iv_rulePresent=rulePresent();
            _fsp--;

             current =iv_rulePresent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresent9623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresent


    // $ANTLR start rulePresent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4184:1: rulePresent returns [EObject current=null] : ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? ) ;
    public final EObject rulePresent() throws RecognitionException {
        EObject current = null;

        EObject lv_body_1 = null;

        EObject lv_elsePart_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4189:6: ( ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4190:1: ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4190:1: ( 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4190:2: 'present' (lv_body_1= rulePresentBody ) (lv_elsePart_2= ruleElsePart )? 'end' ( 'present' )?
            {
            match(input,61,FOLLOW_61_in_rulePresent9657); 

                    createLeafNode(grammarAccess.getPresentAccess().getPresentKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4194:1: (lv_body_1= rulePresentBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4197:6: lv_body_1= rulePresentBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getBodyPresentBodyParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentBody_in_rulePresent9691);
            lv_body_1=rulePresentBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "body", lv_body_1, "PresentBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4215:2: (lv_elsePart_2= ruleElsePart )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==56) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4218:6: lv_elsePart_2= ruleElsePart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentAccess().getElsePartElsePartParserRuleCall_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleElsePart_in_rulePresent9729);
                    lv_elsePart_2=ruleElsePart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "elsePart", lv_elsePart_2, "ElsePart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_rulePresent9743); 

                    createLeafNode(grammarAccess.getPresentAccess().getEndKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4240:1: ( 'present' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==61) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4240:2: 'present'
                    {
                    match(input,61,FOLLOW_61_in_rulePresent9753); 

                            createLeafNode(grammarAccess.getPresentAccess().getPresentKeyword_4(), null); 
                        

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
    // $ANTLR end rulePresent


    // $ANTLR start entryRulePresentBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4251:1: entryRulePresentBody returns [EObject current=null] : iv_rulePresentBody= rulePresentBody EOF ;
    public final EObject entryRulePresentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4251:53: (iv_rulePresentBody= rulePresentBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4252:2: iv_rulePresentBody= rulePresentBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentBodyRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentBody_in_entryRulePresentBody9788);
            iv_rulePresentBody=rulePresentBody();
            _fsp--;

             current =iv_rulePresentBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentBody9798); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentBody


    // $ANTLR start rulePresentBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4259:1: rulePresentBody returns [EObject current=null] : (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList ) ;
    public final EObject rulePresentBody() throws RecognitionException {
        EObject current = null;

        EObject this_PresentEventBody_0 = null;

        EObject this_PresentCaseList_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4264:6: ( (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4265:1: (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4265:1: (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID||LA56_0==35||LA56_0==38||LA56_0==81) ) {
                alt56=1;
            }
            else if ( (LA56_0==44) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4265:1: (this_PresentEventBody_0= rulePresentEventBody | this_PresentCaseList_1= rulePresentCaseList )", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4266:5: this_PresentEventBody_0= rulePresentEventBody
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPresentBodyAccess().getPresentEventBodyParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresentEventBody_in_rulePresentBody9845);
                    this_PresentEventBody_0=rulePresentEventBody();
                    _fsp--;

                     
                            current = this_PresentEventBody_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4276:5: this_PresentCaseList_1= rulePresentCaseList
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPresentBodyAccess().getPresentCaseListParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePresentCaseList_in_rulePresentBody9872);
                    this_PresentCaseList_1=rulePresentCaseList();
                    _fsp--;

                     
                            current = this_PresentCaseList_1; 
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
    // $ANTLR end rulePresentBody


    // $ANTLR start entryRulePresentEventBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4291:1: entryRulePresentEventBody returns [EObject current=null] : iv_rulePresentEventBody= rulePresentEventBody EOF ;
    public final EObject entryRulePresentEventBody() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentEventBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4291:58: (iv_rulePresentEventBody= rulePresentEventBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4292:2: iv_rulePresentEventBody= rulePresentEventBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentEventBodyRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentEventBody_in_entryRulePresentEventBody9904);
            iv_rulePresentEventBody=rulePresentEventBody();
            _fsp--;

             current =iv_rulePresentEventBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentEventBody9914); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentEventBody


    // $ANTLR start rulePresentEventBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4299:1: rulePresentEventBody returns [EObject current=null] : ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? ) ;
    public final EObject rulePresentEventBody() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0 = null;

        EObject lv_thenPart_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4304:6: ( ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4305:1: ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4305:1: ( (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4305:2: (lv_event_0= rulePresentEvent ) (lv_thenPart_1= ruleThenPart )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4305:2: (lv_event_0= rulePresentEvent )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4308:6: lv_event_0= rulePresentEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentEventBodyAccess().getEventPresentEventParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentEvent_in_rulePresentEventBody9973);
            lv_event_0=rulePresentEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentEventBodyRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_0, "PresentEvent", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4326:2: (lv_thenPart_1= ruleThenPart )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4329:6: lv_thenPart_1= ruleThenPart
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentEventBodyAccess().getThenPartThenPartParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleThenPart_in_rulePresentEventBody10011);
                    lv_thenPart_1=ruleThenPart();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentEventBodyRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "thenPart", lv_thenPart_1, "ThenPart", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end rulePresentEventBody


    // $ANTLR start entryRulePresentCaseList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4354:1: entryRulePresentCaseList returns [EObject current=null] : iv_rulePresentCaseList= rulePresentCaseList EOF ;
    public final EObject entryRulePresentCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentCaseList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4354:57: (iv_rulePresentCaseList= rulePresentCaseList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4355:2: iv_rulePresentCaseList= rulePresentCaseList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentCaseListRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentCaseList_in_entryRulePresentCaseList10049);
            iv_rulePresentCaseList=rulePresentCaseList();
            _fsp--;

             current =iv_rulePresentCaseList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentCaseList10059); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentCaseList


    // $ANTLR start rulePresentCaseList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4362:1: rulePresentCaseList returns [EObject current=null] : ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* ) ;
    public final EObject rulePresentCaseList() throws RecognitionException {
        EObject current = null;

        EObject lv_case_0 = null;

        EObject lv_case_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4367:6: ( ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4368:1: ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4368:1: ( (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4368:2: (lv_case_0= rulePresentCase ) (lv_case_1= rulePresentCase )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4368:2: (lv_case_0= rulePresentCase )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4371:6: lv_case_0= rulePresentCase
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentCaseListAccess().getCasePresentCaseParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentCase_in_rulePresentCaseList10118);
            lv_case_0=rulePresentCase();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentCaseListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "case", lv_case_0, "PresentCase", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4389:2: (lv_case_1= rulePresentCase )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==44) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4392:6: lv_case_1= rulePresentCase
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPresentCaseListAccess().getCasePresentCaseParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePresentCase_in_rulePresentCaseList10156);
            	    lv_case_1=rulePresentCase();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPresentCaseListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "case", lv_case_1, "PresentCase", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end rulePresentCaseList


    // $ANTLR start entryRulePresentCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4417:1: entryRulePresentCase returns [EObject current=null] : iv_rulePresentCase= rulePresentCase EOF ;
    public final EObject entryRulePresentCase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4417:53: (iv_rulePresentCase= rulePresentCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4418:2: iv_rulePresentCase= rulePresentCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentCaseRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentCase_in_entryRulePresentCase10194);
            iv_rulePresentCase=rulePresentCase();
            _fsp--;

             current =iv_rulePresentCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentCase10204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentCase


    // $ANTLR start rulePresentCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4425:1: rulePresentCase returns [EObject current=null] : ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? ) ;
    public final EObject rulePresentCase() throws RecognitionException {
        EObject current = null;

        EObject lv_event_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4430:6: ( ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4431:1: ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4431:1: ( 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4431:2: 'case' (lv_event_1= rulePresentEvent ) ( 'do' (lv_statement_3= ruleStatement ) )?
            {
            match(input,44,FOLLOW_44_in_rulePresentCase10238); 

                    createLeafNode(grammarAccess.getPresentCaseAccess().getCaseKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4435:1: (lv_event_1= rulePresentEvent )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4438:6: lv_event_1= rulePresentEvent
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPresentCaseAccess().getEventPresentEventParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePresentEvent_in_rulePresentCase10272);
            lv_event_1=rulePresentEvent();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPresentCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "event", lv_event_1, "PresentEvent", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4456:2: ( 'do' (lv_statement_3= ruleStatement ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==43) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4456:3: 'do' (lv_statement_3= ruleStatement )
                    {
                    match(input,43,FOLLOW_43_in_rulePresentCase10286); 

                            createLeafNode(grammarAccess.getPresentCaseAccess().getDoKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4460:1: (lv_statement_3= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4463:6: lv_statement_3= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentCaseAccess().getStatementStatementParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_rulePresentCase10320);
                    lv_statement_3=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentCaseRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
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
    // $ANTLR end rulePresentCase


    // $ANTLR start entryRulePresentEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4488:1: entryRulePresentEvent returns [EObject current=null] : iv_rulePresentEvent= rulePresentEvent EOF ;
    public final EObject entryRulePresentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePresentEvent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4488:54: (iv_rulePresentEvent= rulePresentEvent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4489:2: iv_rulePresentEvent= rulePresentEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPresentEventRule(), currentNode); 
            pushFollow(FOLLOW_rulePresentEvent_in_entryRulePresentEvent10359);
            iv_rulePresentEvent=rulePresentEvent();
            _fsp--;

             current =iv_rulePresentEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePresentEvent10369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePresentEvent


    // $ANTLR start rulePresentEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4496:1: rulePresentEvent returns [EObject current=null] : ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) ) ;
    public final EObject rulePresentEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0 = null;

        EObject lv_expression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4501:6: ( ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4502:1: ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4502:1: ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID||LA60_0==35||LA60_0==81) ) {
                alt60=1;
            }
            else if ( (LA60_0==38) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4502:1: ( (lv_expression_0= ruleSigExpr ) | ( '[' (lv_expression_2= ruleSigExpr ) ']' ) )", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4502:2: (lv_expression_0= ruleSigExpr )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4502:2: (lv_expression_0= ruleSigExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4505:6: lv_expression_0= ruleSigExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentEventAccess().getExpressionSigExprParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExpr_in_rulePresentEvent10428);
                    lv_expression_0=ruleSigExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expression", lv_expression_0, "SigExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4524:6: ( '[' (lv_expression_2= ruleSigExpr ) ']' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4524:6: ( '[' (lv_expression_2= ruleSigExpr ) ']' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4524:7: '[' (lv_expression_2= ruleSigExpr ) ']'
                    {
                    match(input,38,FOLLOW_38_in_rulePresentEvent10448); 

                            createLeafNode(grammarAccess.getPresentEventAccess().getLeftSquareBracketKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4528:1: (lv_expression_2= ruleSigExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4531:6: lv_expression_2= ruleSigExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPresentEventAccess().getExpressionSigExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExpr_in_rulePresentEvent10482);
                    lv_expression_2=ruleSigExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPresentEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expression", lv_expression_2, "SigExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,39,FOLLOW_39_in_rulePresentEvent10495); 

                            createLeafNode(grammarAccess.getPresentEventAccess().getRightSquareBracketKeyword_1_2(), null); 
                        

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
    // $ANTLR end rulePresentEvent


    // $ANTLR start entryRuleRepeat
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4560:1: entryRuleRepeat returns [EObject current=null] : iv_ruleRepeat= ruleRepeat EOF ;
    public final EObject entryRuleRepeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeat = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4560:48: (iv_ruleRepeat= ruleRepeat EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4561:2: iv_ruleRepeat= ruleRepeat EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRepeatRule(), currentNode); 
            pushFollow(FOLLOW_ruleRepeat_in_entryRuleRepeat10529);
            iv_ruleRepeat=ruleRepeat();
            _fsp--;

             current =iv_ruleRepeat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRepeat10539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRepeat


    // $ANTLR start ruleRepeat
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4568:1: ruleRepeat returns [EObject current=null] : ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? ) ;
    public final EObject ruleRepeat() throws RecognitionException {
        EObject current = null;

        Token lv_positive_0=null;
        EObject lv_dataExpr_2 = null;

        EObject lv_statement_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4573:6: ( ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4574:1: ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4574:1: ( (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4574:2: (lv_positive_0= 'positive' )? 'repeat' (lv_dataExpr_2= ruleDataExpr ) 'times' (lv_statement_4= ruleStatement ) 'end' ( 'repeat' )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4574:2: (lv_positive_0= 'positive' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4576:6: lv_positive_0= 'positive'
                    {
                    lv_positive_0=(Token)input.LT(1);
                    match(input,62,FOLLOW_62_in_ruleRepeat10585); 

                            createLeafNode(grammarAccess.getRepeatAccess().getPositivePositiveKeyword_0_0(), "positive"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRepeatRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "positive", true, "positive", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }
                    break;

            }

            match(input,63,FOLLOW_63_in_ruleRepeat10608); 

                    createLeafNode(grammarAccess.getRepeatAccess().getRepeatKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4599:1: (lv_dataExpr_2= ruleDataExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4602:6: lv_dataExpr_2= ruleDataExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRepeatAccess().getDataExprDataExprParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDataExpr_in_ruleRepeat10642);
            lv_dataExpr_2=ruleDataExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "dataExpr", lv_dataExpr_2, "DataExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,64,FOLLOW_64_in_ruleRepeat10655); 

                    createLeafNode(grammarAccess.getRepeatAccess().getTimesKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4624:1: (lv_statement_4= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4627:6: lv_statement_4= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRepeatAccess().getStatementStatementParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleRepeat10689);
            lv_statement_4=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRepeatRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_4, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleRepeat10702); 

                    createLeafNode(grammarAccess.getRepeatAccess().getEndKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4649:1: ( 'repeat' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==63) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4649:2: 'repeat'
                    {
                    match(input,63,FOLLOW_63_in_ruleRepeat10712); 

                            createLeafNode(grammarAccess.getRepeatAccess().getRepeatKeyword_6(), null); 
                        

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
    // $ANTLR end ruleRepeat


    // $ANTLR start entryRuleRun
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4660:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4660:45: (iv_ruleRun= ruleRun EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4661:2: iv_ruleRun= ruleRun EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRunRule(), currentNode); 
            pushFollow(FOLLOW_ruleRun_in_entryRuleRun10747);
            iv_ruleRun=ruleRun();
            _fsp--;

             current =iv_ruleRun; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRun10757); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRun


    // $ANTLR start ruleRun
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4668:1: ruleRun returns [EObject current=null] : ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        EObject lv_module_1 = null;

        EObject lv_list_3 = null;

        EObject lv_module_6 = null;

        EObject lv_list_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4673:6: ( ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4674:1: ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4674:1: ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==65) ) {
                alt65=1;
            }
            else if ( (LA65_0==66) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("4674:1: ( ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? ) | ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? ) )", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4674:2: ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4674:2: ( 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )? )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4674:3: 'run' (lv_module_1= ruleModuleRenaming ) ( '[' (lv_list_3= ruleRenamingList ) ']' )?
                    {
                    match(input,65,FOLLOW_65_in_ruleRun10792); 

                            createLeafNode(grammarAccess.getRunAccess().getRunKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4678:1: (lv_module_1= ruleModuleRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4681:6: lv_module_1= ruleModuleRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getModuleModuleRenamingParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleRenaming_in_ruleRun10826);
                    lv_module_1=ruleModuleRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "module", lv_module_1, "ModuleRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4699:2: ( '[' (lv_list_3= ruleRenamingList ) ']' )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==38) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4699:3: '[' (lv_list_3= ruleRenamingList ) ']'
                            {
                            match(input,38,FOLLOW_38_in_ruleRun10840); 

                                    createLeafNode(grammarAccess.getRunAccess().getLeftSquareBracketKeyword_0_2_0(), null); 
                                
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4703:1: (lv_list_3= ruleRenamingList )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4706:6: lv_list_3= ruleRenamingList
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getListRenamingListParserRuleCall_0_2_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleRenamingList_in_ruleRun10874);
                            lv_list_3=ruleRenamingList();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "list", lv_list_3, "RenamingList", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            match(input,39,FOLLOW_39_in_ruleRun10887); 

                                    createLeafNode(grammarAccess.getRunAccess().getRightSquareBracketKeyword_0_2_2(), null); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4729:6: ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4729:6: ( 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )? )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4729:7: 'copymodule' (lv_module_6= ruleModuleRenaming ) ( '[' (lv_list_8= ruleRenamingList ) ']' )?
                    {
                    match(input,66,FOLLOW_66_in_ruleRun10906); 

                            createLeafNode(grammarAccess.getRunAccess().getCopymoduleKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4733:1: (lv_module_6= ruleModuleRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4736:6: lv_module_6= ruleModuleRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getModuleModuleRenamingParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleModuleRenaming_in_ruleRun10940);
                    lv_module_6=ruleModuleRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "module", lv_module_6, "ModuleRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4754:2: ( '[' (lv_list_8= ruleRenamingList ) ']' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==38) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4754:3: '[' (lv_list_8= ruleRenamingList ) ']'
                            {
                            match(input,38,FOLLOW_38_in_ruleRun10954); 

                                    createLeafNode(grammarAccess.getRunAccess().getLeftSquareBracketKeyword_1_2_0(), null); 
                                
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4758:1: (lv_list_8= ruleRenamingList )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4761:6: lv_list_8= ruleRenamingList
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getRunAccess().getListRenamingListParserRuleCall_1_2_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleRenamingList_in_ruleRun10988);
                            lv_list_8=ruleRenamingList();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getRunRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "list", lv_list_8, "RenamingList", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            match(input,39,FOLLOW_39_in_ruleRun11001); 

                                    createLeafNode(grammarAccess.getRunAccess().getRightSquareBracketKeyword_1_2_2(), null); 
                                

                            }
                            break;

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
    // $ANTLR end ruleRun


    // $ANTLR start entryRuleModuleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4790:1: entryRuleModuleRenaming returns [EObject current=null] : iv_ruleModuleRenaming= ruleModuleRenaming EOF ;
    public final EObject entryRuleModuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4790:56: (iv_ruleModuleRenaming= ruleModuleRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4791:2: iv_ruleModuleRenaming= ruleModuleRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModuleRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleModuleRenaming_in_entryRuleModuleRenaming11037);
            iv_ruleModuleRenaming=ruleModuleRenaming();
            _fsp--;

             current =iv_ruleModuleRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleRenaming11047); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleModuleRenaming


    // $ANTLR start ruleModuleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4798:1: ruleModuleRenaming returns [EObject current=null] : ( ( RULE_ID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID ) )? ) ;
    public final EObject ruleModuleRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_renamed_1=null;
        Token lv_newName_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4803:6: ( ( ( RULE_ID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4804:1: ( ( RULE_ID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4804:1: ( ( RULE_ID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4804:2: ( RULE_ID ) ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4804:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4807:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getModuleRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModuleRenaming11094); 

            		createLeafNode(grammarAccess.getModuleRenamingAccess().getModuleModuleCrossReference_0_0(), "module"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4820:2: ( (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==67) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4820:3: (lv_renamed_1= '/' ) (lv_newName_2= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4820:3: (lv_renamed_1= '/' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4822:6: lv_renamed_1= '/'
                    {
                    lv_renamed_1=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_ruleModuleRenaming11119); 

                            createLeafNode(grammarAccess.getModuleRenamingAccess().getRenamedSolidusKeyword_1_0_0(), "renamed"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModuleRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "renamed", true, "/", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4841:2: (lv_newName_2= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4843:6: lv_newName_2= RULE_ID
                    {
                    lv_newName_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModuleRenaming11154); 

                    		createLeafNode(grammarAccess.getModuleRenamingAccess().getNewNameIDTerminalRuleCall_1_1_0(), "newName"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getModuleRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "newName", lv_newName_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

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
    // $ANTLR end ruleModuleRenaming


    // $ANTLR start entryRuleRenamingList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4868:1: entryRuleRenamingList returns [EObject current=null] : iv_ruleRenamingList= ruleRenamingList EOF ;
    public final EObject entryRuleRenamingList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenamingList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4868:54: (iv_ruleRenamingList= ruleRenamingList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4869:2: iv_ruleRenamingList= ruleRenamingList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRenamingListRule(), currentNode); 
            pushFollow(FOLLOW_ruleRenamingList_in_entryRuleRenamingList11197);
            iv_ruleRenamingList=ruleRenamingList();
            _fsp--;

             current =iv_ruleRenamingList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenamingList11207); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRenamingList


    // $ANTLR start ruleRenamingList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4876:1: ruleRenamingList returns [EObject current=null] : ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* ) ;
    public final EObject ruleRenamingList() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0 = null;

        EObject lv_list_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4881:6: ( ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4882:1: ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4882:1: ( (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4882:2: (lv_list_0= ruleRenaming ) ( ';' (lv_list_2= ruleRenaming ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4882:2: (lv_list_0= ruleRenaming )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4885:6: lv_list_0= ruleRenaming
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRenamingListAccess().getListRenamingParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleRenaming_in_ruleRenamingList11266);
            lv_list_0=ruleRenaming();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRenamingListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "list", lv_list_0, "Renaming", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4903:2: ( ';' (lv_list_2= ruleRenaming ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==23) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4903:3: ';' (lv_list_2= ruleRenaming )
            	    {
            	    match(input,23,FOLLOW_23_in_ruleRenamingList11280); 

            	            createLeafNode(grammarAccess.getRenamingListAccess().getSemicolonKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4907:1: (lv_list_2= ruleRenaming )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4910:6: lv_list_2= ruleRenaming
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRenamingListAccess().getListRenamingParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleRenaming_in_ruleRenamingList11314);
            	    lv_list_2=ruleRenaming();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRenamingListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "list", lv_list_2, "Renaming", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end ruleRenamingList


    // $ANTLR start entryRuleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4935:1: entryRuleRenaming returns [EObject current=null] : iv_ruleRenaming= ruleRenaming EOF ;
    public final EObject entryRuleRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4935:50: (iv_ruleRenaming= ruleRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4936:2: iv_ruleRenaming= ruleRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleRenaming_in_entryRuleRenaming11353);
            iv_ruleRenaming=ruleRenaming();
            _fsp--;

             current =iv_ruleRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRenaming11363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRenaming


    // $ANTLR start ruleRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4943:1: ruleRenaming returns [EObject current=null] : ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) ) ;
    public final EObject ruleRenaming() throws RecognitionException {
        EObject current = null;

        EObject lv_renaming_1 = null;

        EObject lv_renaming_3 = null;

        EObject lv_renaming_5 = null;

        EObject lv_renaming_7 = null;

        EObject lv_renaming_9 = null;

        EObject lv_renaming_11 = null;

        EObject lv_renaming_13 = null;

        EObject lv_renaming_15 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4948:6: ( ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4949:1: ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4949:1: ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) )
            int alt72=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt72=1;
                }
                break;
            case 32:
                {
                alt72=2;
                }
                break;
            case 34:
                {
                alt72=3;
                }
                break;
            case 68:
                {
                alt72=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("4949:1: ( ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* ) | ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* ) | ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* ) | ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* ) )", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4949:2: ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4949:2: ( 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4949:3: 'type' (lv_renaming_1= ruleTypeRenaming ) ( ',' (lv_renaming_3= ruleTypeRenaming ) )*
                    {
                    match(input,31,FOLLOW_31_in_ruleRenaming11398); 

                            createLeafNode(grammarAccess.getRenamingAccess().getTypeKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4953:1: (lv_renaming_1= ruleTypeRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4956:6: lv_renaming_1= ruleTypeRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingTypeRenamingParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTypeRenaming_in_ruleRenaming11432);
                    lv_renaming_1=ruleTypeRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_1, "TypeRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4974:2: ( ',' (lv_renaming_3= ruleTypeRenaming ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==22) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4974:3: ',' (lv_renaming_3= ruleTypeRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming11446); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_0_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4978:1: (lv_renaming_3= ruleTypeRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:4981:6: lv_renaming_3= ruleTypeRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingTypeRenamingParserRuleCall_0_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeRenaming_in_ruleRenaming11480);
                    	    lv_renaming_3=ruleTypeRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_3, "TypeRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5000:6: ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5000:6: ( 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5000:7: 'constant' (lv_renaming_5= ruleConstantRenaming ) ( ',' (lv_renaming_7= ruleConstantRenaming ) )*
                    {
                    match(input,32,FOLLOW_32_in_ruleRenaming11503); 

                            createLeafNode(grammarAccess.getRenamingAccess().getConstantKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5004:1: (lv_renaming_5= ruleConstantRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5007:6: lv_renaming_5= ruleConstantRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingConstantRenamingParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleConstantRenaming_in_ruleRenaming11537);
                    lv_renaming_5=ruleConstantRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_5, "ConstantRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5025:2: ( ',' (lv_renaming_7= ruleConstantRenaming ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==22) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5025:3: ',' (lv_renaming_7= ruleConstantRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming11551); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_1_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5029:1: (lv_renaming_7= ruleConstantRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5032:6: lv_renaming_7= ruleConstantRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingConstantRenamingParserRuleCall_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConstantRenaming_in_ruleRenaming11585);
                    	    lv_renaming_7=ruleConstantRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_7, "ConstantRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5051:6: ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5051:6: ( 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5051:7: 'function' (lv_renaming_9= ruleFunctionRenaming ) ( ',' (lv_renaming_11= ruleFunctionRenaming ) )*
                    {
                    match(input,34,FOLLOW_34_in_ruleRenaming11608); 

                            createLeafNode(grammarAccess.getRenamingAccess().getFunctionKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5055:1: (lv_renaming_9= ruleFunctionRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5058:6: lv_renaming_9= ruleFunctionRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingFunctionRenamingParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionRenaming_in_ruleRenaming11642);
                    lv_renaming_9=ruleFunctionRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_9, "FunctionRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5076:2: ( ',' (lv_renaming_11= ruleFunctionRenaming ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==22) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5076:3: ',' (lv_renaming_11= ruleFunctionRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming11656); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_2_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5080:1: (lv_renaming_11= ruleFunctionRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5083:6: lv_renaming_11= ruleFunctionRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingFunctionRenamingParserRuleCall_2_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleFunctionRenaming_in_ruleRenaming11690);
                    	    lv_renaming_11=ruleFunctionRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_11, "FunctionRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5102:6: ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5102:6: ( 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )* )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5102:7: 'signal' (lv_renaming_13= ruleSignalRenaming ) ( ',' (lv_renaming_15= ruleSignalRenaming ) )*
                    {
                    match(input,68,FOLLOW_68_in_ruleRenaming11713); 

                            createLeafNode(grammarAccess.getRenamingAccess().getSignalKeyword_3_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5106:1: (lv_renaming_13= ruleSignalRenaming )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5109:6: lv_renaming_13= ruleSignalRenaming
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingSignalRenamingParserRuleCall_3_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSignalRenaming_in_ruleRenaming11747);
                    lv_renaming_13=ruleSignalRenaming();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "renaming", lv_renaming_13, "SignalRenaming", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5127:2: ( ',' (lv_renaming_15= ruleSignalRenaming ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==22) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5127:3: ',' (lv_renaming_15= ruleSignalRenaming )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleRenaming11761); 

                    	            createLeafNode(grammarAccess.getRenamingAccess().getCommaKeyword_3_2_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5131:1: (lv_renaming_15= ruleSignalRenaming )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5134:6: lv_renaming_15= ruleSignalRenaming
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRenamingAccess().getRenamingSignalRenamingParserRuleCall_3_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignalRenaming_in_ruleRenaming11795);
                    	    lv_renaming_15=ruleSignalRenaming();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRenamingRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "renaming", lv_renaming_15, "SignalRenaming", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);


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
    // $ANTLR end ruleRenaming


    // $ANTLR start entryRuleTypeRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5159:1: entryRuleTypeRenaming returns [EObject current=null] : iv_ruleTypeRenaming= ruleTypeRenaming EOF ;
    public final EObject entryRuleTypeRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5159:54: (iv_ruleTypeRenaming= ruleTypeRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5160:2: iv_ruleTypeRenaming= ruleTypeRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRenaming_in_entryRuleTypeRenaming11835);
            iv_ruleTypeRenaming=ruleTypeRenaming();
            _fsp--;

             current =iv_ruleTypeRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRenaming11845); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeRenaming


    // $ANTLR start ruleTypeRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5167:1: ruleTypeRenaming returns [EObject current=null] : ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) ) ;
    public final EObject ruleTypeRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_newName_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5172:6: ( ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5173:1: ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5173:1: ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5173:2: ( RULE_ID ) '/' (lv_newName_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5173:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5176:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeRenaming11892); 

            		createLeafNode(grammarAccess.getTypeRenamingAccess().getOldNameTypeCrossReference_0_0(), "oldName"); 
            	

            }

            match(input,67,FOLLOW_67_in_ruleTypeRenaming11904); 

                    createLeafNode(grammarAccess.getTypeRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5193:1: (lv_newName_2= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5195:6: lv_newName_2= RULE_ID
            {
            lv_newName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeRenaming11926); 

            		createLeafNode(grammarAccess.getTypeRenamingAccess().getNewNameIDTerminalRuleCall_2_0(), "newName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "newName", lv_newName_2, "ID", lastConsumedNode);
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
    // $ANTLR end ruleTypeRenaming


    // $ANTLR start entryRuleConstantRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5220:1: entryRuleConstantRenaming returns [EObject current=null] : iv_ruleConstantRenaming= ruleConstantRenaming EOF ;
    public final EObject entryRuleConstantRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5220:58: (iv_ruleConstantRenaming= ruleConstantRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5221:2: iv_ruleConstantRenaming= ruleConstantRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getConstantRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleConstantRenaming_in_entryRuleConstantRenaming11967);
            iv_ruleConstantRenaming=ruleConstantRenaming();
            _fsp--;

             current =iv_ruleConstantRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantRenaming11977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleConstantRenaming


    // $ANTLR start ruleConstantRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5228:1: ruleConstantRenaming returns [EObject current=null] : ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ID ) ) ;
    public final EObject ruleConstantRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_newName_2=null;
        AntlrDatatypeRuleToken lv_value_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5233:6: ( ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5234:1: ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5234:1: ( (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5234:2: (lv_value_0= ruleConstantValue ) '/' (lv_newName_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5234:2: (lv_value_0= ruleConstantValue )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5237:6: lv_value_0= ruleConstantValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getConstantRenamingAccess().getValueConstantValueParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleConstantValue_in_ruleConstantRenaming12036);
            lv_value_0=ruleConstantValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "value", lv_value_0, "ConstantValue", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,67,FOLLOW_67_in_ruleConstantRenaming12049); 

                    createLeafNode(grammarAccess.getConstantRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5259:1: (lv_newName_2= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5261:6: lv_newName_2= RULE_ID
            {
            lv_newName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantRenaming12071); 

            		createLeafNode(grammarAccess.getConstantRenamingAccess().getNewNameIDTerminalRuleCall_2_0(), "newName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getConstantRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "newName", lv_newName_2, "ID", lastConsumedNode);
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
    // $ANTLR end ruleConstantRenaming


    // $ANTLR start entryRuleFunctionRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5286:1: entryRuleFunctionRenaming returns [EObject current=null] : iv_ruleFunctionRenaming= ruleFunctionRenaming EOF ;
    public final EObject entryRuleFunctionRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5286:58: (iv_ruleFunctionRenaming= ruleFunctionRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5287:2: iv_ruleFunctionRenaming= ruleFunctionRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionRenaming_in_entryRuleFunctionRenaming12112);
            iv_ruleFunctionRenaming=ruleFunctionRenaming();
            _fsp--;

             current =iv_ruleFunctionRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionRenaming12122); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleFunctionRenaming


    // $ANTLR start ruleFunctionRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5294:1: ruleFunctionRenaming returns [EObject current=null] : ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) ) ;
    public final EObject ruleFunctionRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_newName_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5299:6: ( ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5300:1: ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5300:1: ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5300:2: ( RULE_ID ) '/' (lv_newName_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5300:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5303:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionRenaming12169); 

            		createLeafNode(grammarAccess.getFunctionRenamingAccess().getOldNameFunctionCrossReference_0_0(), "oldName"); 
            	

            }

            match(input,67,FOLLOW_67_in_ruleFunctionRenaming12181); 

                    createLeafNode(grammarAccess.getFunctionRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5320:1: (lv_newName_2= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5322:6: lv_newName_2= RULE_ID
            {
            lv_newName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionRenaming12203); 

            		createLeafNode(grammarAccess.getFunctionRenamingAccess().getNewNameIDTerminalRuleCall_2_0(), "newName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "newName", lv_newName_2, "ID", lastConsumedNode);
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
    // $ANTLR end ruleFunctionRenaming


    // $ANTLR start entryRuleSignalRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5347:1: entryRuleSignalRenaming returns [EObject current=null] : iv_ruleSignalRenaming= ruleSignalRenaming EOF ;
    public final EObject entryRuleSignalRenaming() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalRenaming = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5347:56: (iv_ruleSignalRenaming= ruleSignalRenaming EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5348:2: iv_ruleSignalRenaming= ruleSignalRenaming EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRenamingRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming12244);
            iv_ruleSignalRenaming=ruleSignalRenaming();
            _fsp--;

             current =iv_ruleSignalRenaming; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalRenaming12254); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSignalRenaming


    // $ANTLR start ruleSignalRenaming
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5355:1: ruleSignalRenaming returns [EObject current=null] : ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) ) ;
    public final EObject ruleSignalRenaming() throws RecognitionException {
        EObject current = null;

        Token lv_newName_2=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5360:6: ( ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5361:1: ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5361:1: ( ( RULE_ID ) '/' (lv_newName_2= RULE_ID ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5361:2: ( RULE_ID ) '/' (lv_newName_2= RULE_ID )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5361:2: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5364:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalRenaming12301); 

            		createLeafNode(grammarAccess.getSignalRenamingAccess().getOldNameSignalCrossReference_0_0(), "oldName"); 
            	

            }

            match(input,67,FOLLOW_67_in_ruleSignalRenaming12313); 

                    createLeafNode(grammarAccess.getSignalRenamingAccess().getSolidusKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5381:1: (lv_newName_2= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5383:6: lv_newName_2= RULE_ID
            {
            lv_newName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignalRenaming12335); 

            		createLeafNode(grammarAccess.getSignalRenamingAccess().getNewNameIDTerminalRuleCall_2_0(), "newName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRenamingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "newName", lv_newName_2, "ID", lastConsumedNode);
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
    // $ANTLR end ruleSignalRenaming


    // $ANTLR start entryRuleLocalSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5408:1: entryRuleLocalSignalDecl returns [EObject current=null] : iv_ruleLocalSignalDecl= ruleLocalSignalDecl EOF ;
    public final EObject entryRuleLocalSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSignalDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5408:57: (iv_ruleLocalSignalDecl= ruleLocalSignalDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5409:2: iv_ruleLocalSignalDecl= ruleLocalSignalDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalSignalDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalSignalDecl_in_entryRuleLocalSignalDecl12376);
            iv_ruleLocalSignalDecl=ruleLocalSignalDecl();
            _fsp--;

             current =iv_ruleLocalSignalDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalSignalDecl12386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalSignalDecl


    // $ANTLR start ruleLocalSignalDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5416:1: ruleLocalSignalDecl returns [EObject current=null] : ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? ) ;
    public final EObject ruleLocalSignalDecl() throws RecognitionException {
        EObject current = null;

        EObject lv_signalList_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5421:6: ( ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5422:1: ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5422:1: ( 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5422:2: 'signal' (lv_signalList_1= ruleLocalSignalList ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'signal' )?
            {
            match(input,68,FOLLOW_68_in_ruleLocalSignalDecl12420); 

                    createLeafNode(grammarAccess.getLocalSignalDeclAccess().getSignalKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5426:1: (lv_signalList_1= ruleLocalSignalList )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5429:6: lv_signalList_1= ruleLocalSignalList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocalSignalDeclAccess().getSignalListLocalSignalListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleLocalSignalList_in_ruleLocalSignalDecl12454);
            lv_signalList_1=ruleLocalSignalList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalSignalDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "signalList", lv_signalList_1, "LocalSignalList", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,69,FOLLOW_69_in_ruleLocalSignalDecl12467); 

                    createLeafNode(grammarAccess.getLocalSignalDeclAccess().getInKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5451:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5454:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocalSignalDeclAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleLocalSignalDecl12501);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalSignalDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleLocalSignalDecl12514); 

                    createLeafNode(grammarAccess.getLocalSignalDeclAccess().getEndKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5476:1: ( 'signal' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==68) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5476:2: 'signal'
                    {
                    match(input,68,FOLLOW_68_in_ruleLocalSignalDecl12524); 

                            createLeafNode(grammarAccess.getLocalSignalDeclAccess().getSignalKeyword_5(), null); 
                        

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
    // $ANTLR end ruleLocalSignalDecl


    // $ANTLR start entryRuleLocalSignalList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5487:1: entryRuleLocalSignalList returns [EObject current=null] : iv_ruleLocalSignalList= ruleLocalSignalList EOF ;
    public final EObject entryRuleLocalSignalList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalSignalList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5487:57: (iv_ruleLocalSignalList= ruleLocalSignalList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5488:2: iv_ruleLocalSignalList= ruleLocalSignalList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getLocalSignalListRule(), currentNode); 
            pushFollow(FOLLOW_ruleLocalSignalList_in_entryRuleLocalSignalList12559);
            iv_ruleLocalSignalList=ruleLocalSignalList();
            _fsp--;

             current =iv_ruleLocalSignalList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalSignalList12569); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleLocalSignalList


    // $ANTLR start ruleLocalSignalList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5495:1: ruleLocalSignalList returns [EObject current=null] : ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* ) ;
    public final EObject ruleLocalSignalList() throws RecognitionException {
        EObject current = null;

        EObject lv_signal_1 = null;

        EObject lv_signal_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5500:6: ( ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5501:1: ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5501:1: ( () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5501:2: () (lv_signal_1= ruleSignal ) ( ',' (lv_signal_3= ruleSignal ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5501:2: ()
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5502:5: 
            {
             
                    temp=factory.create(grammarAccess.getLocalSignalListAccess().getLocalSignalAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getLocalSignalListAccess().getLocalSignalAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5512:2: (lv_signal_1= ruleSignal )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5515:6: lv_signal_1= ruleSignal
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getLocalSignalListAccess().getSignalSignalParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSignal_in_ruleLocalSignalList12637);
            lv_signal_1=ruleSignal();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getLocalSignalListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "signal", lv_signal_1, "Signal", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5533:2: ( ',' (lv_signal_3= ruleSignal ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==22) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5533:3: ',' (lv_signal_3= ruleSignal )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleLocalSignalList12651); 

            	            createLeafNode(grammarAccess.getLocalSignalListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5537:1: (lv_signal_3= ruleSignal )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5540:6: lv_signal_3= ruleSignal
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getLocalSignalListAccess().getSignalSignalParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSignal_in_ruleLocalSignalList12685);
            	    lv_signal_3=ruleSignal();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getLocalSignalListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "signal", lv_signal_3, "Signal", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // $ANTLR end ruleLocalSignalList


    // $ANTLR start entryRuleSuspend
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5565:1: entryRuleSuspend returns [EObject current=null] : iv_ruleSuspend= ruleSuspend EOF ;
    public final EObject entryRuleSuspend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuspend = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5565:49: (iv_ruleSuspend= ruleSuspend EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5566:2: iv_ruleSuspend= ruleSuspend EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSuspendRule(), currentNode); 
            pushFollow(FOLLOW_ruleSuspend_in_entryRuleSuspend12724);
            iv_ruleSuspend=ruleSuspend();
            _fsp--;

             current =iv_ruleSuspend; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuspend12734); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSuspend


    // $ANTLR start ruleSuspend
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5573:1: ruleSuspend returns [EObject current=null] : ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) ) ;
    public final EObject ruleSuspend() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_1 = null;

        EObject lv_delay_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5578:6: ( ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5579:1: ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5579:1: ( 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5579:2: 'suspend' (lv_statement_1= ruleStatement ) 'when' (lv_delay_3= ruleDelayExpr )
            {
            match(input,70,FOLLOW_70_in_ruleSuspend12768); 

                    createLeafNode(grammarAccess.getSuspendAccess().getSuspendKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5583:1: (lv_statement_1= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5586:6: lv_statement_1= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSuspendAccess().getStatementStatementParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleSuspend12802);
            lv_statement_1=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSuspendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_1, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,42,FOLLOW_42_in_ruleSuspend12815); 

                    createLeafNode(grammarAccess.getSuspendAccess().getWhenKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5608:1: (lv_delay_3= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5611:6: lv_delay_3= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSuspendAccess().getDelayDelayExprParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleSuspend12849);
            lv_delay_3=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSuspendRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_3, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleSuspend


    // $ANTLR start entryRuleSustain
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5636:1: entryRuleSustain returns [EObject current=null] : iv_ruleSustain= ruleSustain EOF ;
    public final EObject entryRuleSustain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSustain = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5636:49: (iv_ruleSustain= ruleSustain EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5637:2: iv_ruleSustain= ruleSustain EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSustainRule(), currentNode); 
            pushFollow(FOLLOW_ruleSustain_in_entryRuleSustain12886);
            iv_ruleSustain=ruleSustain();
            _fsp--;

             current =iv_ruleSustain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSustain12896); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSustain


    // $ANTLR start ruleSustain
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5644:1: ruleSustain returns [EObject current=null] : ( 'sustain' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? ) ;
    public final EObject ruleSustain() throws RecognitionException {
        EObject current = null;

        EObject lv_dataExpr_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5649:6: ( ( 'sustain' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5650:1: ( 'sustain' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5650:1: ( 'sustain' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5650:2: 'sustain' ( RULE_ID ) ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )?
            {
            match(input,71,FOLLOW_71_in_ruleSustain12930); 

                    createLeafNode(grammarAccess.getSustainAccess().getSustainKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5654:1: ( RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5657:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getSustainRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSustain12952); 

            		createLeafNode(grammarAccess.getSustainAccess().getSignalSignalCrossReference_1_0(), "signal"); 
            	

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5670:2: ( '(' (lv_dataExpr_3= ruleDataExpr ) ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==35) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5670:3: '(' (lv_dataExpr_3= ruleDataExpr ) ')'
                    {
                    match(input,35,FOLLOW_35_in_ruleSustain12965); 

                            createLeafNode(grammarAccess.getSustainAccess().getLeftParenthesisKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5674:1: (lv_dataExpr_3= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5677:6: lv_dataExpr_3= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSustainAccess().getDataExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleSustain12999);
                    lv_dataExpr_3=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSustainRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "dataExpr", lv_dataExpr_3, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleSustain13012); 

                            createLeafNode(grammarAccess.getSustainAccess().getRightParenthesisKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleSustain


    // $ANTLR start entryRuleTrap
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5706:1: entryRuleTrap returns [EObject current=null] : iv_ruleTrap= ruleTrap EOF ;
    public final EObject entryRuleTrap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrap = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5706:46: (iv_ruleTrap= ruleTrap EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5707:2: iv_ruleTrap= ruleTrap EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrap_in_entryRuleTrap13047);
            iv_ruleTrap=ruleTrap();
            _fsp--;

             current =iv_ruleTrap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrap13057); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrap


    // $ANTLR start ruleTrap
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5714:1: ruleTrap returns [EObject current=null] : ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? ) ;
    public final EObject ruleTrap() throws RecognitionException {
        EObject current = null;

        EObject lv_trapDeclList_1 = null;

        EObject lv_statement_3 = null;

        EObject lv_trapHandlerList_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5719:6: ( ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5720:1: ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5720:1: ( 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5720:2: 'trap' (lv_trapDeclList_1= ruleTrapDeclList ) 'in' (lv_statement_3= ruleStatement ) (lv_trapHandlerList_4= ruleTrapHandlerList )? 'end' ( 'trap' )?
            {
            match(input,72,FOLLOW_72_in_ruleTrap13091); 

                    createLeafNode(grammarAccess.getTrapAccess().getTrapKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5724:1: (lv_trapDeclList_1= ruleTrapDeclList )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5727:6: lv_trapDeclList_1= ruleTrapDeclList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapAccess().getTrapDeclListTrapDeclListParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapDeclList_in_ruleTrap13125);
            lv_trapDeclList_1=ruleTrapDeclList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "trapDeclList", lv_trapDeclList_1, "TrapDeclList", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,69,FOLLOW_69_in_ruleTrap13138); 

                    createLeafNode(grammarAccess.getTrapAccess().getInKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5749:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5752:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleTrap13172);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5770:2: (lv_trapHandlerList_4= ruleTrapHandlerList )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==73) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5773:6: lv_trapHandlerList_4= ruleTrapHandlerList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTrapAccess().getTrapHandlerListTrapHandlerListParserRuleCall_4_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleTrapHandlerList_in_ruleTrap13210);
                    lv_trapHandlerList_4=ruleTrapHandlerList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTrapRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "trapHandlerList", lv_trapHandlerList_4, "TrapHandlerList", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleTrap13224); 

                    createLeafNode(grammarAccess.getTrapAccess().getEndKeyword_5(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5795:1: ( 'trap' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==72) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5795:2: 'trap'
                    {
                    match(input,72,FOLLOW_72_in_ruleTrap13234); 

                            createLeafNode(grammarAccess.getTrapAccess().getTrapKeyword_6(), null); 
                        

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
    // $ANTLR end ruleTrap


    // $ANTLR start entryRuleTrapDeclList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5806:1: entryRuleTrapDeclList returns [EObject current=null] : iv_ruleTrapDeclList= ruleTrapDeclList EOF ;
    public final EObject entryRuleTrapDeclList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapDeclList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5806:54: (iv_ruleTrapDeclList= ruleTrapDeclList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5807:2: iv_ruleTrapDeclList= ruleTrapDeclList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapDeclListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapDeclList_in_entryRuleTrapDeclList13269);
            iv_ruleTrapDeclList=ruleTrapDeclList();
            _fsp--;

             current =iv_ruleTrapDeclList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapDeclList13279); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapDeclList


    // $ANTLR start ruleTrapDeclList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5814:1: ruleTrapDeclList returns [EObject current=null] : ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* ) ;
    public final EObject ruleTrapDeclList() throws RecognitionException {
        EObject current = null;

        EObject lv_trapDecl_0 = null;

        EObject lv_trapDecl_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5819:6: ( ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5820:1: ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5820:1: ( (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5820:2: (lv_trapDecl_0= ruleTrapDecl ) ( ',' (lv_trapDecl_2= ruleTrapDecl ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5820:2: (lv_trapDecl_0= ruleTrapDecl )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5823:6: lv_trapDecl_0= ruleTrapDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapDeclListAccess().getTrapDeclTrapDeclParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13338);
            lv_trapDecl_0=ruleTrapDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapDeclListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "trapDecl", lv_trapDecl_0, "TrapDecl", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5841:2: ( ',' (lv_trapDecl_2= ruleTrapDecl ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==22) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5841:3: ',' (lv_trapDecl_2= ruleTrapDecl )
            	    {
            	    match(input,22,FOLLOW_22_in_ruleTrapDeclList13352); 

            	            createLeafNode(grammarAccess.getTrapDeclListAccess().getCommaKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5845:1: (lv_trapDecl_2= ruleTrapDecl )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5848:6: lv_trapDecl_2= ruleTrapDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTrapDeclListAccess().getTrapDeclTrapDeclParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13386);
            	    lv_trapDecl_2=ruleTrapDecl();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTrapDeclListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "trapDecl", lv_trapDecl_2, "TrapDecl", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // $ANTLR end ruleTrapDeclList


    // $ANTLR start entryRuleTrapDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5873:1: entryRuleTrapDecl returns [EObject current=null] : iv_ruleTrapDecl= ruleTrapDecl EOF ;
    public final EObject entryRuleTrapDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5873:50: (iv_ruleTrapDecl= ruleTrapDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5874:2: iv_ruleTrapDecl= ruleTrapDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapDecl_in_entryRuleTrapDecl13425);
            iv_ruleTrapDecl=ruleTrapDecl();
            _fsp--;

             current =iv_ruleTrapDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapDecl13435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapDecl


    // $ANTLR start ruleTrapDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5881:1: ruleTrapDecl returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_channelDesc_1= ruleChannelDescription )? ) ;
    public final EObject ruleTrapDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_channelDesc_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5886:6: ( ( (lv_name_0= RULE_ID ) (lv_channelDesc_1= ruleChannelDescription )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5887:1: ( (lv_name_0= RULE_ID ) (lv_channelDesc_1= ruleChannelDescription )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5887:1: ( (lv_name_0= RULE_ID ) (lv_channelDesc_1= ruleChannelDescription )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5887:2: (lv_name_0= RULE_ID ) (lv_channelDesc_1= ruleChannelDescription )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5887:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5889:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrapDecl13482); 

            		createLeafNode(grammarAccess.getTrapDeclAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5907:2: (lv_channelDesc_1= ruleChannelDescription )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==18||LA79_0==35||LA79_0==40) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5910:6: lv_channelDesc_1= ruleChannelDescription
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getTrapDeclAccess().getChannelDescChannelDescriptionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleChannelDescription_in_ruleTrapDecl13524);
                    lv_channelDesc_1=ruleChannelDescription();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTrapDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "channelDesc", lv_channelDesc_1, "ChannelDescription", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleTrapDecl


    // $ANTLR start entryRuleTrapHandlerList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5935:1: entryRuleTrapHandlerList returns [EObject current=null] : iv_ruleTrapHandlerList= ruleTrapHandlerList EOF ;
    public final EObject entryRuleTrapHandlerList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapHandlerList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5935:57: (iv_ruleTrapHandlerList= ruleTrapHandlerList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5936:2: iv_ruleTrapHandlerList= ruleTrapHandlerList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapHandlerListRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapHandlerList_in_entryRuleTrapHandlerList13562);
            iv_ruleTrapHandlerList=ruleTrapHandlerList();
            _fsp--;

             current =iv_ruleTrapHandlerList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapHandlerList13572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapHandlerList


    // $ANTLR start ruleTrapHandlerList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5943:1: ruleTrapHandlerList returns [EObject current=null] : ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* ) ;
    public final EObject ruleTrapHandlerList() throws RecognitionException {
        EObject current = null;

        EObject lv_trapHandler_0 = null;

        EObject lv_trapHandler_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5948:6: ( ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5949:1: ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5949:1: ( (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5949:2: (lv_trapHandler_0= ruleTrapHandler ) (lv_trapHandler_1= ruleTrapHandler )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5949:2: (lv_trapHandler_0= ruleTrapHandler )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5952:6: lv_trapHandler_0= ruleTrapHandler
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerListAccess().getTrapHandlerTrapHandlerParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList13631);
            lv_trapHandler_0=ruleTrapHandler();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapHandlerListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "trapHandler", lv_trapHandler_0, "TrapHandler", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5970:2: (lv_trapHandler_1= ruleTrapHandler )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==73) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5973:6: lv_trapHandler_1= ruleTrapHandler
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerListAccess().getTrapHandlerTrapHandlerParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList13669);
            	    lv_trapHandler_1=ruleTrapHandler();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getTrapHandlerListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "trapHandler", lv_trapHandler_1, "TrapHandler", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end ruleTrapHandlerList


    // $ANTLR start entryRuleTrapHandler
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5998:1: entryRuleTrapHandler returns [EObject current=null] : iv_ruleTrapHandler= ruleTrapHandler EOF ;
    public final EObject entryRuleTrapHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapHandler = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5998:53: (iv_ruleTrapHandler= ruleTrapHandler EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:5999:2: iv_ruleTrapHandler= ruleTrapHandler EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapHandlerRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapHandler_in_entryRuleTrapHandler13707);
            iv_ruleTrapHandler=ruleTrapHandler();
            _fsp--;

             current =iv_ruleTrapHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapHandler13717); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapHandler


    // $ANTLR start ruleTrapHandler
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6006:1: ruleTrapHandler returns [EObject current=null] : ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) ) ;
    public final EObject ruleTrapHandler() throws RecognitionException {
        EObject current = null;

        EObject lv_trapExpr_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6011:6: ( ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6012:1: ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6012:1: ( 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6012:2: 'handle' (lv_trapExpr_1= ruleTrapExpr ) 'do' (lv_statement_3= ruleStatement )
            {
            match(input,73,FOLLOW_73_in_ruleTrapHandler13751); 

                    createLeafNode(grammarAccess.getTrapHandlerAccess().getHandleKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6016:1: (lv_trapExpr_1= ruleTrapExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6019:6: lv_trapExpr_1= ruleTrapExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerAccess().getTrapExprTrapExprParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTrapExpr_in_ruleTrapHandler13785);
            lv_trapExpr_1=ruleTrapExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "trapExpr", lv_trapExpr_1, "TrapExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,43,FOLLOW_43_in_ruleTrapHandler13798); 

                    createLeafNode(grammarAccess.getTrapHandlerAccess().getDoKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6041:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6044:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getTrapHandlerAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleTrapHandler13832);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTrapHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleTrapHandler


    // $ANTLR start entryRuleVariable
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6069:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6069:50: (iv_ruleVariable= ruleVariable EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6070:2: iv_ruleVariable= ruleVariable EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable13869);
            iv_ruleVariable=ruleVariable();
            _fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable13879); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6077:1: ruleVariable returns [EObject current=null] : ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_varDecl_1 = null;

        EObject lv_statement_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6082:6: ( ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6083:1: ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6083:1: ( 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6083:2: 'var' (lv_varDecl_1= ruleVariableDecl ) 'in' (lv_statement_3= ruleStatement ) 'end' ( 'var' )?
            {
            match(input,74,FOLLOW_74_in_ruleVariable13913); 

                    createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6087:1: (lv_varDecl_1= ruleVariableDecl )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6090:6: lv_varDecl_1= ruleVariableDecl
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getVarDeclVariableDeclParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableDecl_in_ruleVariable13947);
            lv_varDecl_1=ruleVariableDecl();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "varDecl", lv_varDecl_1, "VariableDecl", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,69,FOLLOW_69_in_ruleVariable13960); 

                    createLeafNode(grammarAccess.getVariableAccess().getInKeyword_2(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6112:1: (lv_statement_3= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6115:6: lv_statement_3= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getStatementStatementParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleVariable13994);
            lv_statement_3=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_3, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,19,FOLLOW_19_in_ruleVariable14007); 

                    createLeafNode(grammarAccess.getVariableAccess().getEndKeyword_4(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6137:1: ( 'var' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==74) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6137:2: 'var'
                    {
                    match(input,74,FOLLOW_74_in_ruleVariable14017); 

                            createLeafNode(grammarAccess.getVariableAccess().getVarKeyword_5(), null); 
                        

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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleVariableDecl
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6148:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6148:54: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6149:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl14052);
            iv_ruleVariableDecl=ruleVariableDecl();
            _fsp--;

             current =iv_ruleVariableDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDecl14062); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6156:1: ruleVariableDecl returns [EObject current=null] : ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) ) )* ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_type_2=null;
        Token lv_type_3=null;
        Token lv_type_8=null;
        Token lv_type_9=null;
        EObject lv_varList_0 = null;

        EObject lv_varList_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6161:6: ( ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6162:1: ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6162:1: ( (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6162:2: (lv_varList_0= ruleVariableList ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6162:2: (lv_varList_0= ruleVariableList )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6165:6: lv_varList_0= ruleVariableList
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVarListVariableListParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleVariableList_in_ruleVariableDecl14121);
            lv_varList_0=ruleVariableList();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "varList", lv_varList_0, "VariableList", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,18,FOLLOW_18_in_ruleVariableDecl14134); 

                    createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6187:1: ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_BASETYPE) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6187:1: ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) )", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6187:2: (lv_type_2= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6187:2: (lv_type_2= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6189:6: lv_type_2= RULE_ID
                    {
                    lv_type_2=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDecl14157); 

                    		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeIDTerminalRuleCall_2_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_2, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6208:6: (lv_type_3= RULE_BASETYPE )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6208:6: (lv_type_3= RULE_BASETYPE )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6210:6: lv_type_3= RULE_BASETYPE
                    {
                    lv_type_3=(Token)input.LT(1);
                    match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14193); 

                    		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeBaseTypeTerminalRuleCall_2_1_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_3, "BaseType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6228:3: ( () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==22) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6228:4: () ',' (lv_varList_6= ruleVariableList ) ':' ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) )
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6228:4: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6229:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getVariableDeclAccess().getVariableDeclLeftAction_3_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getVariableDeclAccess().getVariableDeclLeftAction_3_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,22,FOLLOW_22_in_ruleVariableDecl14221); 

            	            createLeafNode(grammarAccess.getVariableDeclAccess().getCommaKeyword_3_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6248:1: (lv_varList_6= ruleVariableList )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6251:6: lv_varList_6= ruleVariableList
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getVariableDeclAccess().getVarListVariableListParserRuleCall_3_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableList_in_ruleVariableDecl14255);
            	    lv_varList_6=ruleVariableList();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "varList", lv_varList_6, "VariableList", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,18,FOLLOW_18_in_ruleVariableDecl14268); 

            	            createLeafNode(grammarAccess.getVariableDeclAccess().getColonKeyword_3_3(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6273:1: ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) )
            	    int alt83=2;
            	    int LA83_0 = input.LA(1);

            	    if ( (LA83_0==RULE_ID) ) {
            	        alt83=1;
            	    }
            	    else if ( (LA83_0==RULE_BASETYPE) ) {
            	        alt83=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("6273:1: ( (lv_type_8= RULE_ID ) | (lv_type_9= RULE_BASETYPE ) )", 83, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt83) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6273:2: (lv_type_8= RULE_ID )
            	            {
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6273:2: (lv_type_8= RULE_ID )
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6275:6: lv_type_8= RULE_ID
            	            {
            	            lv_type_8=(Token)input.LT(1);
            	            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDecl14291); 

            	            		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeIDTerminalRuleCall_3_4_0_0(), "type"); 
            	            	

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "type", lv_type_8, "ID", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6294:6: (lv_type_9= RULE_BASETYPE )
            	            {
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6294:6: (lv_type_9= RULE_BASETYPE )
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6296:6: lv_type_9= RULE_BASETYPE
            	            {
            	            lv_type_9=(Token)input.LT(1);
            	            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14327); 

            	            		createLeafNode(grammarAccess.getVariableDeclAccess().getTypeBaseTypeTerminalRuleCall_3_4_1_0(), "type"); 
            	            	

            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariableDeclRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode, current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "type", lv_type_9, "BaseType", lastConsumedNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end ruleVariableDecl


    // $ANTLR start entryRuleVariableList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6321:1: entryRuleVariableList returns [EObject current=null] : iv_ruleVariableList= ruleVariableList EOF ;
    public final EObject entryRuleVariableList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableList = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6321:54: (iv_ruleVariableList= ruleVariableList EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6322:2: iv_ruleVariableList= ruleVariableList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableListRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableList_in_entryRuleVariableList14371);
            iv_ruleVariableList=ruleVariableList();
            _fsp--;

             current =iv_ruleVariableList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableList14381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleVariableList


    // $ANTLR start ruleVariableList
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6329:1: ruleVariableList returns [EObject current=null] : ( (lv_variable_0= RULE_ID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* ) ;
    public final EObject ruleVariableList() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0=null;
        Token lv_variable_5=null;
        EObject lv_expression_2 = null;

        EObject lv_expression_7 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6334:6: ( ( (lv_variable_0= RULE_ID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6335:1: ( (lv_variable_0= RULE_ID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6335:1: ( (lv_variable_0= RULE_ID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6335:2: (lv_variable_0= RULE_ID ) ( ':=' (lv_expression_2= ruleDataExpr ) )? ( () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6335:2: (lv_variable_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6337:6: lv_variable_0= RULE_ID
            {
            lv_variable_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableList14428); 

            		createLeafNode(grammarAccess.getVariableListAccess().getVariableIDTerminalRuleCall_0_0(), "variable"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "variable", lv_variable_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6355:2: ( ':=' (lv_expression_2= ruleDataExpr ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==40) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6355:3: ':=' (lv_expression_2= ruleDataExpr )
                    {
                    match(input,40,FOLLOW_40_in_ruleVariableList14446); 

                            createLeafNode(grammarAccess.getVariableListAccess().getColonEqualsSignKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6359:1: (lv_expression_2= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6362:6: lv_expression_2= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getVariableListAccess().getExpressionDataExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleVariableList14480);
                    lv_expression_2=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expression", lv_expression_2, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6380:4: ( () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )? )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==22) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6380:5: () ',' (lv_variable_5= RULE_ID ) ( ':=' (lv_expression_7= ruleDataExpr ) )?
            	    {
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6380:5: ()
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6381:5: 
            	    {
            	     
            	            temp=factory.create(grammarAccess.getVariableListAccess().getVariableListLeftAction_2_0().getType().getClassifier());
            	            try {
            	            	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	            } catch(ValueConverterException vce) {
            	            	handleValueConverterException(vce);
            	            }
            	            current = temp; 
            	            temp = null;
            	            CompositeNode newNode = createCompositeNode(grammarAccess.getVariableListAccess().getVariableListLeftAction_2_0(), currentNode.getParent());
            	        newNode.getChildren().add(currentNode);
            	        moveLookaheadInfo(currentNode, newNode);
            	        currentNode = newNode; 
            	            associateNodeWithAstElement(currentNode, current); 
            	        

            	    }

            	    match(input,22,FOLLOW_22_in_ruleVariableList14505); 

            	            createLeafNode(grammarAccess.getVariableListAccess().getCommaKeyword_2_1(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6400:1: (lv_variable_5= RULE_ID )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6402:6: lv_variable_5= RULE_ID
            	    {
            	    lv_variable_5=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableList14527); 

            	    		createLeafNode(grammarAccess.getVariableListAccess().getVariableIDTerminalRuleCall_2_2_0(), "variable"); 
            	    	

            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode, current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		set(current, "variable", lv_variable_5, "ID", lastConsumedNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	    

            	    }

            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6420:2: ( ':=' (lv_expression_7= ruleDataExpr ) )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==40) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6420:3: ':=' (lv_expression_7= ruleDataExpr )
            	            {
            	            match(input,40,FOLLOW_40_in_ruleVariableList14545); 

            	                    createLeafNode(grammarAccess.getVariableListAccess().getColonEqualsSignKeyword_2_3_0(), null); 
            	                
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6424:1: (lv_expression_7= ruleDataExpr )
            	            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6427:6: lv_expression_7= ruleDataExpr
            	            {
            	             
            	            	        currentNode=createCompositeNode(grammarAccess.getVariableListAccess().getExpressionDataExprParserRuleCall_2_3_1_0(), currentNode); 
            	            	    
            	            pushFollow(FOLLOW_ruleDataExpr_in_ruleVariableList14579);
            	            lv_expression_7=ruleDataExpr();
            	            _fsp--;


            	            	        if (current==null) {
            	            	            current = factory.create(grammarAccess.getVariableListRule().getType().getClassifier());
            	            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	        }
            	            	        
            	            	        try {
            	            	       		set(current, "expression", lv_expression_7, "DataExpr", currentNode);
            	            	        } catch (ValueConverterException vce) {
            	            				handleValueConverterException(vce);
            	            	        }
            	            	        currentNode = currentNode.getParent();
            	            	    

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop87;
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
    // $ANTLR end ruleVariableList


    // $ANTLR start entryRuleWeakAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6452:1: entryRuleWeakAbort returns [EObject current=null] : iv_ruleWeakAbort= ruleWeakAbort EOF ;
    public final EObject entryRuleWeakAbort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbort = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6452:51: (iv_ruleWeakAbort= ruleWeakAbort EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6453:2: iv_ruleWeakAbort= ruleWeakAbort EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbort_in_entryRuleWeakAbort14620);
            iv_ruleWeakAbort=ruleWeakAbort();
            _fsp--;

             current =iv_ruleWeakAbort; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbort14630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbort


    // $ANTLR start ruleWeakAbort
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6460:1: ruleWeakAbort returns [EObject current=null] : ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) ) ;
    public final EObject ruleWeakAbort() throws RecognitionException {
        EObject current = null;

        EObject lv_statement_2 = null;

        EObject lv_weakAbortBody_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6465:6: ( ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6466:1: ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6466:1: ( 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6466:2: 'weak' 'abort' (lv_statement_2= ruleStatement ) 'when' (lv_weakAbortBody_4= ruleWeakAbortBody )
            {
            match(input,75,FOLLOW_75_in_ruleWeakAbort14664); 

                    createLeafNode(grammarAccess.getWeakAbortAccess().getWeakKeyword_0(), null); 
                
            match(input,41,FOLLOW_41_in_ruleWeakAbort14673); 

                    createLeafNode(grammarAccess.getWeakAbortAccess().getAbortKeyword_1(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6474:1: (lv_statement_2= ruleStatement )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6477:6: lv_statement_2= ruleStatement
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortAccess().getStatementStatementParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStatement_in_ruleWeakAbort14707);
            lv_statement_2=ruleStatement();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,42,FOLLOW_42_in_ruleWeakAbort14720); 

                    createLeafNode(grammarAccess.getWeakAbortAccess().getWhenKeyword_3(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6499:1: (lv_weakAbortBody_4= ruleWeakAbortBody )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6502:6: lv_weakAbortBody_4= ruleWeakAbortBody
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortAccess().getWeakAbortBodyWeakAbortBodyParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWeakAbortBody_in_ruleWeakAbort14754);
            lv_weakAbortBody_4=ruleWeakAbortBody();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "weakAbortBody", lv_weakAbortBody_4, "WeakAbortBody", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleWeakAbort


    // $ANTLR start entryRuleWeakAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6527:1: entryRuleWeakAbortBody returns [EObject current=null] : iv_ruleWeakAbortBody= ruleWeakAbortBody EOF ;
    public final EObject entryRuleWeakAbortBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbortBody = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6527:55: (iv_ruleWeakAbortBody= ruleWeakAbortBody EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6528:2: iv_ruleWeakAbortBody= ruleWeakAbortBody EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortBodyRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortBody_in_entryRuleWeakAbortBody14791);
            iv_ruleWeakAbortBody=ruleWeakAbortBody();
            _fsp--;

             current =iv_ruleWeakAbortBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortBody14801); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortBody


    // $ANTLR start ruleWeakAbortBody
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6535:1: ruleWeakAbortBody returns [EObject current=null] : (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase ) ;
    public final EObject ruleWeakAbortBody() throws RecognitionException {
        EObject current = null;

        EObject this_WeakAbortInstance_0 = null;

        EObject this_WeakAbortCase_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6540:6: ( (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6541:1: (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6541:1: (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID||(LA88_0>=RULE_INT && LA88_0<=RULE_BOOLEAN)||LA88_0==33||LA88_0==35||LA88_0==38||LA88_0==67||(LA88_0>=76 && LA88_0<=90)) ) {
                alt88=1;
            }
            else if ( (LA88_0==44) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6541:1: (this_WeakAbortInstance_0= ruleWeakAbortInstance | this_WeakAbortCase_1= ruleWeakAbortCase )", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6542:5: this_WeakAbortInstance_0= ruleWeakAbortInstance
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWeakAbortBodyAccess().getWeakAbortInstanceParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWeakAbortInstance_in_ruleWeakAbortBody14848);
                    this_WeakAbortInstance_0=ruleWeakAbortInstance();
                    _fsp--;

                     
                            current = this_WeakAbortInstance_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6552:5: this_WeakAbortCase_1= ruleWeakAbortCase
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getWeakAbortBodyAccess().getWeakAbortCaseParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleWeakAbortCase_in_ruleWeakAbortBody14875);
                    this_WeakAbortCase_1=ruleWeakAbortCase();
                    _fsp--;

                     
                            current = this_WeakAbortCase_1; 
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
    // $ANTLR end ruleWeakAbortBody


    // $ANTLR start entryRuleWeakAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6567:1: entryRuleWeakAbortEnd returns [String current=null] : iv_ruleWeakAbortEnd= ruleWeakAbortEnd EOF ;
    public final String entryRuleWeakAbortEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleWeakAbortEnd = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6567:53: (iv_ruleWeakAbortEnd= ruleWeakAbortEnd EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6568:2: iv_ruleWeakAbortEnd= ruleWeakAbortEnd EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortEndRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortEnd_in_entryRuleWeakAbortEnd14908);
            iv_ruleWeakAbortEnd=ruleWeakAbortEnd();
            _fsp--;

             current =iv_ruleWeakAbortEnd.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortEnd14919); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortEnd


    // $ANTLR start ruleWeakAbortEnd
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6575:1: ruleWeakAbortEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? ) ;
    public final AntlrDatatypeRuleToken ruleWeakAbortEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6581:6: ( (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6582:1: (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6582:1: (kw= 'end' ( (kw= 'weak' )? kw= 'abort' )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6583:2: kw= 'end' ( (kw= 'weak' )? kw= 'abort' )?
            {
            kw=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_ruleWeakAbortEnd14957); 

                    current.merge(kw);
                    createLeafNode(grammarAccess.getWeakAbortEndAccess().getEndKeyword_0(), null); 
                
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6588:1: ( (kw= 'weak' )? kw= 'abort' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==41||LA90_0==75) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6588:2: (kw= 'weak' )? kw= 'abort'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6588:2: (kw= 'weak' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==75) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6589:2: kw= 'weak'
                            {
                            kw=(Token)input.LT(1);
                            match(input,75,FOLLOW_75_in_ruleWeakAbortEnd14972); 

                                    current.merge(kw);
                                    createLeafNode(grammarAccess.getWeakAbortEndAccess().getWeakKeyword_1_0(), null); 
                                

                            }
                            break;

                    }

                    kw=(Token)input.LT(1);
                    match(input,41,FOLLOW_41_in_ruleWeakAbortEnd14987); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getWeakAbortEndAccess().getAbortKeyword_1_1(), null); 
                        

                    }
                    break;

            }


            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleWeakAbortEnd


    // $ANTLR start entryRuleWeakAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6608:1: entryRuleWeakAbortInstance returns [EObject current=null] : iv_ruleWeakAbortInstance= ruleWeakAbortInstance EOF ;
    public final EObject entryRuleWeakAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbortInstance = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6608:59: (iv_ruleWeakAbortInstance= ruleWeakAbortInstance EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6609:2: iv_ruleWeakAbortInstance= ruleWeakAbortInstance EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortInstanceRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortInstance_in_entryRuleWeakAbortInstance15027);
            iv_ruleWeakAbortInstance=ruleWeakAbortInstance();
            _fsp--;

             current =iv_ruleWeakAbortInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortInstance15037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortInstance


    // $ANTLR start ruleWeakAbortInstance
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6616:1: ruleWeakAbortInstance returns [EObject current=null] : ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? ) ;
    public final EObject ruleWeakAbortInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_delay_0 = null;

        EObject lv_statement_2 = null;

        AntlrDatatypeRuleToken lv_end_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6621:6: ( ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6622:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6622:1: ( (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6622:2: (lv_delay_0= ruleDelayExpr ) ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6622:2: (lv_delay_0= ruleDelayExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6625:6: lv_delay_0= ruleDelayExpr
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortInstanceAccess().getDelayDelayExprParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleDelayExpr_in_ruleWeakAbortInstance15096);
            lv_delay_0=ruleDelayExpr();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortInstanceRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "delay", lv_delay_0, "DelayExpr", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6643:2: ( 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==43) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6643:3: 'do' (lv_statement_2= ruleStatement ) (lv_end_3= ruleWeakAbortEnd )
                    {
                    match(input,43,FOLLOW_43_in_ruleWeakAbortInstance15110); 

                            createLeafNode(grammarAccess.getWeakAbortInstanceAccess().getDoKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6647:1: (lv_statement_2= ruleStatement )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6650:6: lv_statement_2= ruleStatement
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWeakAbortInstanceAccess().getStatementStatementParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleStatement_in_ruleWeakAbortInstance15144);
                    lv_statement_2=ruleStatement();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWeakAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "statement", lv_statement_2, "Statement", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6668:2: (lv_end_3= ruleWeakAbortEnd )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6671:6: lv_end_3= ruleWeakAbortEnd
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getWeakAbortInstanceAccess().getEndWeakAbortEndParserRuleCall_1_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortInstance15182);
                    lv_end_3=ruleWeakAbortEnd();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getWeakAbortInstanceRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "end", lv_end_3, "WeakAbortEnd", currentNode);
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
    // $ANTLR end ruleWeakAbortInstance


    // $ANTLR start entryRuleWeakAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6696:1: entryRuleWeakAbortCase returns [EObject current=null] : iv_ruleWeakAbortCase= ruleWeakAbortCase EOF ;
    public final EObject entryRuleWeakAbortCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeakAbortCase = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6696:55: (iv_ruleWeakAbortCase= ruleWeakAbortCase EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6697:2: iv_ruleWeakAbortCase= ruleWeakAbortCase EOF
            {
             currentNode = createCompositeNode(grammarAccess.getWeakAbortCaseRule(), currentNode); 
            pushFollow(FOLLOW_ruleWeakAbortCase_in_entryRuleWeakAbortCase15221);
            iv_ruleWeakAbortCase=ruleWeakAbortCase();
            _fsp--;

             current =iv_ruleWeakAbortCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWeakAbortCase15231); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleWeakAbortCase


    // $ANTLR start ruleWeakAbortCase
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6704:1: ruleWeakAbortCase returns [EObject current=null] : ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) ) ;
    public final EObject ruleWeakAbortCase() throws RecognitionException {
        EObject current = null;

        EObject lv_cases_0 = null;

        EObject lv_cases_1 = null;

        AntlrDatatypeRuleToken lv_end_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6709:6: ( ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6710:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6710:1: ( (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6710:2: (lv_cases_0= ruleAbortCaseSingle ) (lv_cases_1= ruleAbortCaseSingle )* (lv_end_2= ruleWeakAbortEnd )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6710:2: (lv_cases_0= ruleAbortCaseSingle )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6713:6: lv_cases_0= ruleAbortCaseSingle
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15290);
            lv_cases_0=ruleAbortCaseSingle();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "cases", lv_cases_0, "AbortCaseSingle", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6731:2: (lv_cases_1= ruleAbortCaseSingle )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==44) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6734:6: lv_cases_1= ruleAbortCaseSingle
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getWeakAbortCaseAccess().getCasesAbortCaseSingleParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15328);
            	    lv_cases_1=ruleAbortCaseSingle();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getWeakAbortCaseRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "cases", lv_cases_1, "AbortCaseSingle", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6752:3: (lv_end_2= ruleWeakAbortEnd )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6755:6: lv_end_2= ruleWeakAbortEnd
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getWeakAbortCaseAccess().getEndWeakAbortEndParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortCase15367);
            lv_end_2=ruleWeakAbortEnd();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getWeakAbortCaseRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "end", lv_end_2, "WeakAbortEnd", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

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
    // $ANTLR end ruleWeakAbortCase


    // $ANTLR start entryRuleDataExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6780:1: entryRuleDataExpr returns [EObject current=null] : iv_ruleDataExpr= ruleDataExpr EOF ;
    public final EObject entryRuleDataExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6780:50: (iv_ruleDataExpr= ruleDataExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6781:2: iv_ruleDataExpr= ruleDataExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataExpr_in_entryRuleDataExpr15404);
            iv_ruleDataExpr=ruleDataExpr();
            _fsp--;

             current =iv_ruleDataExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataExpr15414); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataExpr


    // $ANTLR start ruleDataExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6788:1: ruleDataExpr returns [EObject current=null] : ( ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) ) | ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? ) ) ;
    public final EObject ruleDataExpr() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0 = null;

        EObject lv_expr_1 = null;

        EObject lv_expr_2 = null;

        AntlrDatatypeRuleToken lv_op_4 = null;

        EObject lv_expr_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6793:6: ( ( ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) ) | ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6794:1: ( ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) ) | ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6794:1: ( ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) ) | ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==33||LA94_0==67||(LA94_0>=79 && LA94_0<=90)) ) {
                alt94=1;
            }
            else if ( (LA94_0==RULE_ID||(LA94_0>=RULE_INT && LA94_0<=RULE_BOOLEAN)||LA94_0==35||(LA94_0>=76 && LA94_0<=78)) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("6794:1: ( ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) ) | ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? ) )", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6794:2: ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6794:2: ( (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6794:3: (lv_op_0= ruleDataOp ) (lv_expr_1= ruleDataExpr )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6794:3: (lv_op_0= ruleDataOp )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6797:6: lv_op_0= ruleDataOp
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getOpDataOpParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataOp_in_ruleDataExpr15474);
                    lv_op_0=ruleDataOp();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "op", lv_op_0, "DataOp", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6815:2: (lv_expr_1= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6818:6: lv_expr_1= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getExprDataExprParserRuleCall_0_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleDataExpr15512);
                    lv_expr_1=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6837:6: ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6837:6: ( (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )? )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6837:7: (lv_expr_2= ruleDataUnaryExpr ) ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )?
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6837:7: (lv_expr_2= ruleDataUnaryExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6840:6: lv_expr_2= ruleDataUnaryExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getExprDataUnaryExprParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataUnaryExpr_in_ruleDataExpr15558);
                    lv_expr_2=ruleDataUnaryExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_2, "DataUnaryExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6858:2: ( () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==33||LA93_0==67||(LA93_0>=79 && LA93_0<=90)) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6858:3: () (lv_op_4= ruleDataOp ) (lv_expr_5= ruleDataExpr )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6858:3: ()
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6859:5: 
                            {
                             
                                    temp=factory.create(grammarAccess.getDataExprAccess().getDataExprLeftAction_1_1_0().getType().getClassifier());
                                    try {
                                    	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                    } catch(ValueConverterException vce) {
                                    	handleValueConverterException(vce);
                                    }
                                    current = temp; 
                                    temp = null;
                                    CompositeNode newNode = createCompositeNode(grammarAccess.getDataExprAccess().getDataExprLeftAction_1_1_0(), currentNode.getParent());
                                newNode.getChildren().add(currentNode);
                                moveLookaheadInfo(currentNode, newNode);
                                currentNode = newNode; 
                                    associateNodeWithAstElement(currentNode, current); 
                                

                            }

                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6874:2: (lv_op_4= ruleDataOp )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6877:6: lv_op_4= ruleDataOp
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getOpDataOpParserRuleCall_1_1_1_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataOp_in_ruleDataExpr15606);
                            lv_op_4=ruleDataOp();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "op", lv_op_4, "DataOp", currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6895:2: (lv_expr_5= ruleDataExpr )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6898:6: lv_expr_5= ruleDataExpr
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getDataExprAccess().getExprDataExprParserRuleCall_1_1_2_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataExpr_in_ruleDataExpr15644);
                            lv_expr_5=ruleDataExpr();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getDataExprRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "expr", lv_expr_5, "DataExpr", currentNode);
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
    // $ANTLR end ruleDataExpr


    // $ANTLR start entryRuleDataUnaryExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6923:1: entryRuleDataUnaryExpr returns [EObject current=null] : iv_ruleDataUnaryExpr= ruleDataUnaryExpr EOF ;
    public final EObject entryRuleDataUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataUnaryExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6923:55: (iv_ruleDataUnaryExpr= ruleDataUnaryExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6924:2: iv_ruleDataUnaryExpr= ruleDataUnaryExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataUnaryExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataUnaryExpr_in_entryRuleDataUnaryExpr15684);
            iv_ruleDataUnaryExpr=ruleDataUnaryExpr();
            _fsp--;

             current =iv_ruleDataUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataUnaryExpr15694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataUnaryExpr


    // $ANTLR start ruleDataUnaryExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6931:1: ruleDataUnaryExpr returns [EObject current=null] : ( RULE_ID | RULE_FLOAT | RULE_BOOLEAN | RULE_INT | RULE_STRING | ( '(' this_DataExpr_6= ruleDataExpr ')' ) | ( '?' ( RULE_ID ) ) | ( 'pre' '(' '?' ( RULE_ID ) ')' ) | ( '??' ( RULE_ID ) ) | ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' ) ) ;
    public final EObject ruleDataUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject this_DataExpr_6 = null;

        EObject lv_expression_19 = null;

        EObject lv_expression_21 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6936:6: ( ( RULE_ID | RULE_FLOAT | RULE_BOOLEAN | RULE_INT | RULE_STRING | ( '(' this_DataExpr_6= ruleDataExpr ')' ) | ( '?' ( RULE_ID ) ) | ( 'pre' '(' '?' ( RULE_ID ) ')' ) | ( '??' ( RULE_ID ) ) | ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6937:1: ( RULE_ID | RULE_FLOAT | RULE_BOOLEAN | RULE_INT | RULE_STRING | ( '(' this_DataExpr_6= ruleDataExpr ')' ) | ( '?' ( RULE_ID ) ) | ( 'pre' '(' '?' ( RULE_ID ) ')' ) | ( '??' ( RULE_ID ) ) | ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6937:1: ( RULE_ID | RULE_FLOAT | RULE_BOOLEAN | RULE_INT | RULE_STRING | ( '(' this_DataExpr_6= ruleDataExpr ')' ) | ( '?' ( RULE_ID ) ) | ( 'pre' '(' '?' ( RULE_ID ) ')' ) | ( '??' ( RULE_ID ) ) | ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' ) )
            int alt96=10;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA96_1 = input.LA(2);

                if ( (LA96_1==35) ) {
                    alt96=10;
                }
                else if ( (LA96_1==EOF||LA96_1==RULE_ID||(LA96_1>=18 && LA96_1<=20)||(LA96_1>=22 && LA96_1<=23)||LA96_1==33||(LA96_1>=36 && LA96_1<=39)||LA96_1==42||LA96_1==44||(LA96_1>=46 && LA96_1<=47)||(LA96_1>=54 && LA96_1<=56)||LA96_1==58||LA96_1==64||LA96_1==67||LA96_1==73||LA96_1==77||(LA96_1>=79 && LA96_1<=90)) ) {
                    alt96=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("6937:1: ( RULE_ID | RULE_FLOAT | RULE_BOOLEAN | RULE_INT | RULE_STRING | ( '(' this_DataExpr_6= ruleDataExpr ')' ) | ( '?' ( RULE_ID ) ) | ( 'pre' '(' '?' ( RULE_ID ) ')' ) | ( '??' ( RULE_ID ) ) | ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' ) )", 96, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_FLOAT:
                {
                alt96=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt96=3;
                }
                break;
            case RULE_INT:
                {
                alt96=4;
                }
                break;
            case RULE_STRING:
                {
                alt96=5;
                }
                break;
            case 35:
                {
                alt96=6;
                }
                break;
            case 76:
                {
                alt96=7;
                }
                break;
            case 77:
                {
                alt96=8;
                }
                break;
            case 78:
                {
                alt96=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("6937:1: ( RULE_ID | RULE_FLOAT | RULE_BOOLEAN | RULE_INT | RULE_STRING | ( '(' this_DataExpr_6= ruleDataExpr ')' ) | ( '?' ( RULE_ID ) ) | ( 'pre' '(' '?' ( RULE_ID ) ')' ) | ( '??' ( RULE_ID ) ) | ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' ) )", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6937:2: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataUnaryExpr15728); 
                     
                        createLeafNode(grammarAccess.getDataUnaryExprAccess().getIDTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6942:6: RULE_FLOAT
                    {
                    match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_ruleDataUnaryExpr15742); 
                     
                        createLeafNode(grammarAccess.getDataUnaryExprAccess().getFloatTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6947:6: RULE_BOOLEAN
                    {
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleDataUnaryExpr15756); 
                     
                        createLeafNode(grammarAccess.getDataUnaryExprAccess().getBooleanTerminalRuleCall_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6952:6: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDataUnaryExpr15770); 
                     
                        createLeafNode(grammarAccess.getDataUnaryExprAccess().getINTTerminalRuleCall_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6957:6: RULE_STRING
                    {
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataUnaryExpr15784); 
                     
                        createLeafNode(grammarAccess.getDataUnaryExprAccess().getSTRINGTerminalRuleCall_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6962:6: ( '(' this_DataExpr_6= ruleDataExpr ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6962:6: ( '(' this_DataExpr_6= ruleDataExpr ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6962:7: '(' this_DataExpr_6= ruleDataExpr ')'
                    {
                    match(input,35,FOLLOW_35_in_ruleDataUnaryExpr15799); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getLeftParenthesisKeyword_5_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getDataExprParserRuleCall_5_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleDataUnaryExpr15821);
                    this_DataExpr_6=ruleDataExpr();
                    _fsp--;

                     
                            current = this_DataExpr_6; 
                            currentNode = currentNode.getParent();
                        
                    match(input,36,FOLLOW_36_in_ruleDataUnaryExpr15829); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getRightParenthesisKeyword_5_2(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6980:6: ( '?' ( RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6980:6: ( '?' ( RULE_ID ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6980:7: '?' ( RULE_ID )
                    {
                    match(input,76,FOLLOW_76_in_ruleDataUnaryExpr15846); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getQuestionMarkKeyword_6_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6984:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:6987:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDataUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataUnaryExpr15868); 

                    		createLeafNode(grammarAccess.getDataUnaryExprAccess().getSignalSignalCrossReference_6_1_0(), "signal"); 
                    	

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7001:6: ( 'pre' '(' '?' ( RULE_ID ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7001:6: ( 'pre' '(' '?' ( RULE_ID ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7001:7: 'pre' '(' '?' ( RULE_ID ) ')'
                    {
                    match(input,77,FOLLOW_77_in_ruleDataUnaryExpr15888); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getPreKeyword_7_0(), null); 
                        
                    match(input,35,FOLLOW_35_in_ruleDataUnaryExpr15897); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getLeftParenthesisKeyword_7_1(), null); 
                        
                    match(input,76,FOLLOW_76_in_ruleDataUnaryExpr15906); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getQuestionMarkKeyword_7_2(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7013:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7016:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDataUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataUnaryExpr15928); 

                    		createLeafNode(grammarAccess.getDataUnaryExprAccess().getSignalSignalCrossReference_7_3_0(), "signal"); 
                    	

                    }

                    match(input,36,FOLLOW_36_in_ruleDataUnaryExpr15940); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getRightParenthesisKeyword_7_4(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7034:6: ( '??' ( RULE_ID ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7034:6: ( '??' ( RULE_ID ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7034:7: '??' ( RULE_ID )
                    {
                    match(input,78,FOLLOW_78_in_ruleDataUnaryExpr15957); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getQuestionMarkQuestionMarkKeyword_8_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7038:1: ( RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7041:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDataUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataUnaryExpr15979); 

                    		createLeafNode(grammarAccess.getDataUnaryExprAccess().getTrapTrapCrossReference_8_1_0(), "trap"); 
                    	

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7055:6: ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7055:6: ( ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7055:7: ( RULE_ID ) '(' (lv_expression_19= ruleDataExpr ) ( ',' (lv_expression_21= ruleDataExpr ) )* ')'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7055:7: ( RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7058:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDataUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataUnaryExpr16012); 

                    		createLeafNode(grammarAccess.getDataUnaryExprAccess().getFunctionFunctionCrossReference_9_0_0(), "function"); 
                    	

                    }

                    match(input,35,FOLLOW_35_in_ruleDataUnaryExpr16024); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getLeftParenthesisKeyword_9_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7075:1: (lv_expression_19= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7078:6: lv_expression_19= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getExpressionDataExprParserRuleCall_9_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleDataUnaryExpr16058);
                    lv_expression_19=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDataUnaryExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		add(current, "expression", lv_expression_19, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7096:2: ( ',' (lv_expression_21= ruleDataExpr ) )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==22) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7096:3: ',' (lv_expression_21= ruleDataExpr )
                    	    {
                    	    match(input,22,FOLLOW_22_in_ruleDataUnaryExpr16072); 

                    	            createLeafNode(grammarAccess.getDataUnaryExprAccess().getCommaKeyword_9_3_0(), null); 
                    	        
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7100:1: (lv_expression_21= ruleDataExpr )
                    	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7103:6: lv_expression_21= ruleDataExpr
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getDataUnaryExprAccess().getExpressionDataExprParserRuleCall_9_3_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDataExpr_in_ruleDataUnaryExpr16106);
                    	    lv_expression_21=ruleDataExpr();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getDataUnaryExprRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        
                    	    	        try {
                    	    	       		add(current, "expression", lv_expression_21, "DataExpr", currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);

                    match(input,36,FOLLOW_36_in_ruleDataUnaryExpr16121); 

                            createLeafNode(grammarAccess.getDataUnaryExprAccess().getRightParenthesisKeyword_9_4(), null); 
                        

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
    // $ANTLR end ruleDataUnaryExpr


    // $ANTLR start entryRuleDataOp
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7132:1: entryRuleDataOp returns [String current=null] : iv_ruleDataOp= ruleDataOp EOF ;
    public final String entryRuleDataOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataOp = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7132:47: (iv_ruleDataOp= ruleDataOp EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7133:2: iv_ruleDataOp= ruleDataOp EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDataOpRule(), currentNode); 
            pushFollow(FOLLOW_ruleDataOp_in_entryRuleDataOp16156);
            iv_ruleDataOp=ruleDataOp();
            _fsp--;

             current =iv_ruleDataOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataOp16167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDataOp


    // $ANTLR start ruleDataOp
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7140:1: ruleDataOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' ) ;
    public final AntlrDatatypeRuleToken ruleDataOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7146:6: ( (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7147:1: (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7147:1: (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' )
            int alt97=14;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt97=1;
                }
                break;
            case 80:
                {
                alt97=2;
                }
                break;
            case 81:
                {
                alt97=3;
                }
                break;
            case 82:
                {
                alt97=4;
                }
                break;
            case 83:
                {
                alt97=5;
                }
                break;
            case 84:
                {
                alt97=6;
                }
                break;
            case 85:
                {
                alt97=7;
                }
                break;
            case 86:
                {
                alt97=8;
                }
                break;
            case 33:
                {
                alt97=9;
                }
                break;
            case 87:
                {
                alt97=10;
                }
                break;
            case 88:
                {
                alt97=11;
                }
                break;
            case 89:
                {
                alt97=12;
                }
                break;
            case 67:
                {
                alt97=13;
                }
                break;
            case 90:
                {
                alt97=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7147:1: (kw= 'and' | kw= 'or' | kw= 'not' | kw= '<' | kw= '>' | kw= '<=' | kw= '>=' | kw= '<>' | kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= 'mod' )", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7148:2: kw= 'and'
                    {
                    kw=(Token)input.LT(1);
                    match(input,79,FOLLOW_79_in_ruleDataOp16205); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getAndKeyword_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7155:2: kw= 'or'
                    {
                    kw=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_ruleDataOp16224); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getOrKeyword_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7162:2: kw= 'not'
                    {
                    kw=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_ruleDataOp16243); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getNotKeyword_2(), null); 
                        

                    }
                    break;
                case 4 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7169:2: kw= '<'
                    {
                    kw=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_ruleDataOp16262); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getLessThanSignKeyword_3(), null); 
                        

                    }
                    break;
                case 5 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7176:2: kw= '>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_ruleDataOp16281); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getGreaterThanSignKeyword_4(), null); 
                        

                    }
                    break;
                case 6 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7183:2: kw= '<='
                    {
                    kw=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_ruleDataOp16300); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getLessThanSignEqualsSignKeyword_5(), null); 
                        

                    }
                    break;
                case 7 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7190:2: kw= '>='
                    {
                    kw=(Token)input.LT(1);
                    match(input,85,FOLLOW_85_in_ruleDataOp16319); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getGreaterThanSignEqualsSignKeyword_6(), null); 
                        

                    }
                    break;
                case 8 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7197:2: kw= '<>'
                    {
                    kw=(Token)input.LT(1);
                    match(input,86,FOLLOW_86_in_ruleDataOp16338); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getLessThanSignGreaterThanSignKeyword_7(), null); 
                        

                    }
                    break;
                case 9 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7204:2: kw= '='
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleDataOp16357); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getEqualsSignKeyword_8(), null); 
                        

                    }
                    break;
                case 10 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7211:2: kw= '+'
                    {
                    kw=(Token)input.LT(1);
                    match(input,87,FOLLOW_87_in_ruleDataOp16376); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getPlusSignKeyword_9(), null); 
                        

                    }
                    break;
                case 11 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7218:2: kw= '-'
                    {
                    kw=(Token)input.LT(1);
                    match(input,88,FOLLOW_88_in_ruleDataOp16395); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getHyphenMinusKeyword_10(), null); 
                        

                    }
                    break;
                case 12 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7225:2: kw= '*'
                    {
                    kw=(Token)input.LT(1);
                    match(input,89,FOLLOW_89_in_ruleDataOp16414); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getAsteriskKeyword_11(), null); 
                        

                    }
                    break;
                case 13 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7232:2: kw= '/'
                    {
                    kw=(Token)input.LT(1);
                    match(input,67,FOLLOW_67_in_ruleDataOp16433); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getSolidusKeyword_12(), null); 
                        

                    }
                    break;
                case 14 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7239:2: kw= 'mod'
                    {
                    kw=(Token)input.LT(1);
                    match(input,90,FOLLOW_90_in_ruleDataOp16452); 

                            current.merge(kw);
                            createLeafNode(grammarAccess.getDataOpAccess().getModKeyword_13(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
            	    lastConsumedDatatypeToken = current;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataOp


    // $ANTLR start entryRuleTrapExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7252:1: entryRuleTrapExpr returns [EObject current=null] : iv_ruleTrapExpr= ruleTrapExpr EOF ;
    public final EObject entryRuleTrapExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrapExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7252:50: (iv_ruleTrapExpr= ruleTrapExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7253:2: iv_ruleTrapExpr= ruleTrapExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTrapExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleTrapExpr_in_entryRuleTrapExpr16490);
            iv_ruleTrapExpr=ruleTrapExpr();
            _fsp--;

             current =iv_ruleTrapExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrapExpr16500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTrapExpr


    // $ANTLR start ruleTrapExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7260:1: ruleTrapExpr returns [EObject current=null] : this_SigExpr_0= ruleSigExpr ;
    public final EObject ruleTrapExpr() throws RecognitionException {
        EObject current = null;

        EObject this_SigExpr_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7265:6: (this_SigExpr_0= ruleSigExpr )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7267:5: this_SigExpr_0= ruleSigExpr
            {
             
                    currentNode=createCompositeNode(grammarAccess.getTrapExprAccess().getSigExprParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleSigExpr_in_ruleTrapExpr16546);
            this_SigExpr_0=ruleSigExpr();
            _fsp--;

             
                    current = this_SigExpr_0; 
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
    // $ANTLR end ruleTrapExpr


    // $ANTLR start entryRuleSigExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7282:1: entryRuleSigExpr returns [EObject current=null] : iv_ruleSigExpr= ruleSigExpr EOF ;
    public final EObject entryRuleSigExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7282:49: (iv_ruleSigExpr= ruleSigExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7283:2: iv_ruleSigExpr= ruleSigExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleSigExpr_in_entryRuleSigExpr16577);
            iv_ruleSigExpr=ruleSigExpr();
            _fsp--;

             current =iv_ruleSigExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExpr16587); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExpr


    // $ANTLR start ruleSigExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7290:1: ruleSigExpr returns [EObject current=null] : ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* ) ;
    public final EObject ruleSigExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_andExpr_0 = null;

        EObject lv_andExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7295:6: ( ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7296:1: ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7296:1: ( (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7296:2: (lv_andExpr_0= ruleSigExprAND ) ( 'or' (lv_andExpr_2= ruleSigExprAND ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7296:2: (lv_andExpr_0= ruleSigExprAND )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7299:6: lv_andExpr_0= ruleSigExprAND
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSigExprAccess().getAndExprSigExprANDParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSigExprAND_in_ruleSigExpr16646);
            lv_andExpr_0=ruleSigExprAND();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSigExprRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "andExpr", lv_andExpr_0, "SigExprAND", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7317:2: ( 'or' (lv_andExpr_2= ruleSigExprAND ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==80) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7317:3: 'or' (lv_andExpr_2= ruleSigExprAND )
            	    {
            	    match(input,80,FOLLOW_80_in_ruleSigExpr16660); 

            	            createLeafNode(grammarAccess.getSigExprAccess().getOrKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7321:1: (lv_andExpr_2= ruleSigExprAND )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7324:6: lv_andExpr_2= ruleSigExprAND
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSigExprAccess().getAndExprSigExprANDParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSigExprAND_in_ruleSigExpr16694);
            	    lv_andExpr_2=ruleSigExprAND();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSigExprRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "andExpr", lv_andExpr_2, "SigExprAND", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
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
    // $ANTLR end ruleSigExpr


    // $ANTLR start entryRuleSigExprAND
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7349:1: entryRuleSigExprAND returns [EObject current=null] : iv_ruleSigExprAND= ruleSigExprAND EOF ;
    public final EObject entryRuleSigExprAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExprAND = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7349:52: (iv_ruleSigExprAND= ruleSigExprAND EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7350:2: iv_ruleSigExprAND= ruleSigExprAND EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigExprANDRule(), currentNode); 
            pushFollow(FOLLOW_ruleSigExprAND_in_entryRuleSigExprAND16733);
            iv_ruleSigExprAND=ruleSigExprAND();
            _fsp--;

             current =iv_ruleSigExprAND; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExprAND16743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExprAND


    // $ANTLR start ruleSigExprAND
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7357:1: ruleSigExprAND returns [EObject current=null] : ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* ) ;
    public final EObject ruleSigExprAND() throws RecognitionException {
        EObject current = null;

        EObject lv_unaExpr_0 = null;

        EObject lv_unaExpr_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7362:6: ( ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7363:1: ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7363:1: ( (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )* )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7363:2: (lv_unaExpr_0= ruleSigExprUnary ) ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )*
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7363:2: (lv_unaExpr_0= ruleSigExprUnary )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7366:6: lv_unaExpr_0= ruleSigExprUnary
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getSigExprANDAccess().getUnaExprSigExprUnaryParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleSigExprUnary_in_ruleSigExprAND16802);
            lv_unaExpr_0=ruleSigExprUnary();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSigExprANDRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		add(current, "unaExpr", lv_unaExpr_0, "SigExprUnary", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7384:2: ( 'and' (lv_unaExpr_2= ruleSigExprUnary ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==79) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7384:3: 'and' (lv_unaExpr_2= ruleSigExprUnary )
            	    {
            	    match(input,79,FOLLOW_79_in_ruleSigExprAND16816); 

            	            createLeafNode(grammarAccess.getSigExprANDAccess().getAndKeyword_1_0(), null); 
            	        
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7388:1: (lv_unaExpr_2= ruleSigExprUnary )
            	    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7391:6: lv_unaExpr_2= ruleSigExprUnary
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getSigExprANDAccess().getUnaExprSigExprUnaryParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleSigExprUnary_in_ruleSigExprAND16850);
            	    lv_unaExpr_2=ruleSigExprUnary();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getSigExprANDRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "unaExpr", lv_unaExpr_2, "SigExprUnary", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
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
    // $ANTLR end ruleSigExprAND


    // $ANTLR start entryRuleSigExprUnary
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7416:1: entryRuleSigExprUnary returns [EObject current=null] : iv_ruleSigExprUnary= ruleSigExprUnary EOF ;
    public final EObject entryRuleSigExprUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigExprUnary = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7416:54: (iv_ruleSigExprUnary= ruleSigExprUnary EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7417:2: iv_ruleSigExprUnary= ruleSigExprUnary EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSigExprUnaryRule(), currentNode); 
            pushFollow(FOLLOW_ruleSigExprUnary_in_entryRuleSigExprUnary16889);
            iv_ruleSigExprUnary=ruleSigExprUnary();
            _fsp--;

             current =iv_ruleSigExprUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSigExprUnary16899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSigExprUnary


    // $ANTLR start ruleSigExprUnary
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7424:1: ruleSigExprUnary returns [EObject current=null] : ( (lv_expr_0= RULE_ID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) ) ;
    public final EObject ruleSigExprUnary() throws RecognitionException {
        EObject current = null;

        Token lv_expr_0=null;
        EObject lv_sigExpr_2 = null;

        EObject lv_sigExpr_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7429:6: ( ( (lv_expr_0= RULE_ID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7430:1: ( (lv_expr_0= RULE_ID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7430:1: ( (lv_expr_0= RULE_ID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt100=1;
                }
                break;
            case 35:
                {
                alt100=2;
                }
                break;
            case 81:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7430:1: ( (lv_expr_0= RULE_ID ) | ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' ) | ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) ) )", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7430:2: (lv_expr_0= RULE_ID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7430:2: (lv_expr_0= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7432:6: lv_expr_0= RULE_ID
                    {
                    lv_expr_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSigExprUnary16946); 

                    		createLeafNode(grammarAccess.getSigExprUnaryAccess().getExprIDTerminalRuleCall_0_0(), "expr"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSigExprUnaryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7451:6: ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7451:6: ( '(' (lv_sigExpr_2= ruleSigExpr ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7451:7: '(' (lv_sigExpr_2= ruleSigExpr ) ')'
                    {
                    match(input,35,FOLLOW_35_in_ruleSigExprUnary16970); 

                            createLeafNode(grammarAccess.getSigExprUnaryAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7455:1: (lv_sigExpr_2= ruleSigExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7458:6: lv_sigExpr_2= ruleSigExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSigExprUnaryAccess().getSigExprSigExprParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExpr_in_ruleSigExprUnary17004);
                    lv_sigExpr_2=ruleSigExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSigExprUnaryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "sigExpr", lv_sigExpr_2, "SigExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,36,FOLLOW_36_in_ruleSigExprUnary17017); 

                            createLeafNode(grammarAccess.getSigExprUnaryAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7481:6: ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7481:6: ( 'not' (lv_sigExpr_5= ruleSigExprUnary ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7481:7: 'not' (lv_sigExpr_5= ruleSigExprUnary )
                    {
                    match(input,81,FOLLOW_81_in_ruleSigExprUnary17034); 

                            createLeafNode(grammarAccess.getSigExprUnaryAccess().getNotKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7485:1: (lv_sigExpr_5= ruleSigExprUnary )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7488:6: lv_sigExpr_5= ruleSigExprUnary
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSigExprUnaryAccess().getSigExprSigExprUnaryParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleSigExprUnary_in_ruleSigExprUnary17068);
                    lv_sigExpr_5=ruleSigExprUnary();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSigExprUnaryRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "sigExpr", lv_sigExpr_5, "SigExprUnary", currentNode);
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
    // $ANTLR end ruleSigExprUnary


    // $ANTLR start entryRuleDelayExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7513:1: entryRuleDelayExpr returns [EObject current=null] : iv_ruleDelayExpr= ruleDelayExpr EOF ;
    public final EObject entryRuleDelayExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayExpr = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7513:51: (iv_ruleDelayExpr= ruleDelayExpr EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7514:2: iv_ruleDelayExpr= ruleDelayExpr EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelayExprRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelayExpr_in_entryRuleDelayExpr17106);
            iv_ruleDelayExpr=ruleDelayExpr();
            _fsp--;

             current =iv_ruleDelayExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayExpr17116); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDelayExpr


    // $ANTLR start ruleDelayExpr
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7521:1: ruleDelayExpr returns [EObject current=null] : ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) ) ;
    public final EObject ruleDelayExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_event_0 = null;

        EObject lv_expr_1 = null;

        EObject lv_event_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7526:6: ( ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7527:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7527:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )
            int alt101=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==RULE_ID||LA101_1==33||LA101_1==35||LA101_1==38||LA101_1==67||LA101_1==77||(LA101_1>=79 && LA101_1<=90)) ) {
                    alt101=2;
                }
                else if ( (LA101_1==EOF||(LA101_1>=19 && LA101_1<=20)||LA101_1==23||LA101_1==37||LA101_1==39||(LA101_1>=42 && LA101_1<=44)||(LA101_1>=46 && LA101_1<=48)||LA101_1==54||LA101_1==56||LA101_1==58||LA101_1==73) ) {
                    alt101=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("7527:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 101, 1, input);

                    throw nvae;
                }
                }
                break;
            case 77:
                {
                int LA101_2 = input.LA(2);

                if ( (LA101_2==35) ) {
                    int LA101_5 = input.LA(3);

                    if ( (LA101_5==76) ) {
                        alt101=2;
                    }
                    else if ( (LA101_5==RULE_ID||LA101_5==35||LA101_5==81) ) {
                        alt101=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("7527:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 101, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("7527:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 101, 2, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                alt101=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
            case 33:
            case 35:
            case 67:
            case 76:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt101=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7527:1: ( (lv_event_0= ruleDelayEvent ) | ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) ) )", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7527:2: (lv_event_0= ruleDelayEvent )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7527:2: (lv_event_0= ruleDelayEvent )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7530:6: lv_event_0= ruleDelayEvent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDelayExprAccess().getEventDelayEventParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDelayEvent_in_ruleDelayExpr17175);
                    lv_event_0=ruleDelayEvent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "event", lv_event_0, "DelayEvent", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7549:6: ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7549:6: ( (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7549:7: (lv_expr_1= ruleDataExpr ) (lv_event_2= ruleDelayEvent )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7549:7: (lv_expr_1= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7552:6: lv_expr_1= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDelayExprAccess().getExprDataExprParserRuleCall_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleDelayExpr17220);
                    lv_expr_1=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "expr", lv_expr_1, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7570:2: (lv_event_2= ruleDelayEvent )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7573:6: lv_event_2= ruleDelayEvent
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getDelayExprAccess().getEventDelayEventParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDelayEvent_in_ruleDelayExpr17258);
                    lv_event_2=ruleDelayEvent();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayExprRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "event", lv_event_2, "DelayEvent", currentNode);
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
    // $ANTLR end ruleDelayExpr


    // $ANTLR start entryRuleDelayEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7598:1: entryRuleDelayEvent returns [EObject current=null] : iv_ruleDelayEvent= ruleDelayEvent EOF ;
    public final EObject entryRuleDelayEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelayEvent = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7598:52: (iv_ruleDelayEvent= ruleDelayEvent EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7599:2: iv_ruleDelayEvent= ruleDelayEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDelayEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleDelayEvent_in_entryRuleDelayEvent17296);
            iv_ruleDelayEvent=ruleDelayEvent();
            _fsp--;

             current =iv_ruleDelayEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayEvent17306); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleDelayEvent


    // $ANTLR start ruleDelayEvent
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7606:1: ruleDelayEvent returns [EObject current=null] : ( ( RULE_ID ) | ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' ) | ( '[' this_SigExpr_6= ruleSigExpr ']' ) ) ;
    public final EObject ruleDelayEvent() throws RecognitionException {
        EObject current = null;

        EObject this_SigExpr_3 = null;

        EObject this_SigExpr_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7611:6: ( ( ( RULE_ID ) | ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' ) | ( '[' this_SigExpr_6= ruleSigExpr ']' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7612:1: ( ( RULE_ID ) | ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' ) | ( '[' this_SigExpr_6= ruleSigExpr ']' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7612:1: ( ( RULE_ID ) | ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' ) | ( '[' this_SigExpr_6= ruleSigExpr ']' ) )
            int alt102=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt102=1;
                }
                break;
            case 77:
                {
                alt102=2;
                }
                break;
            case 38:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7612:1: ( ( RULE_ID ) | ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' ) | ( '[' this_SigExpr_6= ruleSigExpr ']' ) )", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7612:2: ( RULE_ID )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7612:2: ( RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7615:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getDelayEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDelayEvent17353); 

                    		createLeafNode(grammarAccess.getDelayEventAccess().getSignalSignalCrossReference_0_0(), "signal"); 
                    	

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7629:6: ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7629:6: ( 'pre' '(' this_SigExpr_3= ruleSigExpr ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7629:7: 'pre' '(' this_SigExpr_3= ruleSigExpr ')'
                    {
                    match(input,77,FOLLOW_77_in_ruleDelayEvent17372); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getPreKeyword_1_0(), null); 
                        
                    match(input,35,FOLLOW_35_in_ruleDelayEvent17381); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDelayEventAccess().getSigExprParserRuleCall_1_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSigExpr_in_ruleDelayEvent17403);
                    this_SigExpr_3=ruleSigExpr();
                    _fsp--;

                     
                            current = this_SigExpr_3; 
                            currentNode = currentNode.getParent();
                        
                    match(input,36,FOLLOW_36_in_ruleDelayEvent17411); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getRightParenthesisKeyword_1_3(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7651:6: ( '[' this_SigExpr_6= ruleSigExpr ']' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7651:6: ( '[' this_SigExpr_6= ruleSigExpr ']' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7651:7: '[' this_SigExpr_6= ruleSigExpr ']'
                    {
                    match(input,38,FOLLOW_38_in_ruleDelayEvent17428); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getLeftSquareBracketKeyword_2_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getDelayEventAccess().getSigExprParserRuleCall_2_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleSigExpr_in_ruleDelayEvent17450);
                    this_SigExpr_6=ruleSigExpr();
                    _fsp--;

                     
                            current = this_SigExpr_6; 
                            currentNode = currentNode.getParent();
                        
                    match(input,39,FOLLOW_39_in_ruleDelayEvent17458); 

                            createLeafNode(grammarAccess.getDelayEventAccess().getRightSquareBracketKeyword_2_2(), null); 
                        

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
    // $ANTLR end ruleDelayEvent


    // $ANTLR start entryRuleChannelDescription
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7675:1: entryRuleChannelDescription returns [EObject current=null] : iv_ruleChannelDescription= ruleChannelDescription EOF ;
    public final EObject entryRuleChannelDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannelDescription = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7675:60: (iv_ruleChannelDescription= ruleChannelDescription EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7676:2: iv_ruleChannelDescription= ruleChannelDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getChannelDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription17492);
            iv_ruleChannelDescription=ruleChannelDescription();
            _fsp--;

             current =iv_ruleChannelDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelDescription17502); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7683:1: ruleChannelDescription returns [EObject current=null] : ( ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) ) ) ;
    public final EObject ruleChannelDescription() throws RecognitionException {
        EObject current = null;

        Token lv_type_1=null;
        Token lv_type_2=null;
        Token lv_type_4=null;
        Token lv_type_5=null;
        Token lv_type_10=null;
        Token lv_type_11=null;
        EObject lv_dataExpr_8 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7688:6: ( ( ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7689:1: ( ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7689:1: ( ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) ) )
            int alt106=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt106=1;
                }
                break;
            case 35:
                {
                alt106=2;
                }
                break;
            case 40:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("7689:1: ( ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) ) | ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' ) | ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) ) )", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7689:2: ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7689:2: ( ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7689:3: ':' ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) )
                    {
                    match(input,18,FOLLOW_18_in_ruleChannelDescription17537); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_0_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7693:1: ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==RULE_ID) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==RULE_BASETYPE) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("7693:1: ( (lv_type_1= RULE_ID ) | (lv_type_2= RULE_BASETYPE ) )", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7693:2: (lv_type_1= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7693:2: (lv_type_1= RULE_ID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7695:6: lv_type_1= RULE_ID
                            {
                            lv_type_1=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChannelDescription17560); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeIDTerminalRuleCall_0_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_1, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7714:6: (lv_type_2= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7714:6: (lv_type_2= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7716:6: lv_type_2= RULE_BASETYPE
                            {
                            lv_type_2=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleChannelDescription17596); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeBaseTypeTerminalRuleCall_0_1_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_2, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7735:6: ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7735:6: ( '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7735:7: '(' ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) ) ')'
                    {
                    match(input,35,FOLLOW_35_in_ruleChannelDescription17622); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7739:1: ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==RULE_ID) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==RULE_BASETYPE) ) {
                        alt104=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("7739:1: ( (lv_type_4= RULE_ID ) | (lv_type_5= RULE_BASETYPE ) )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7739:2: (lv_type_4= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7739:2: (lv_type_4= RULE_ID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7741:6: lv_type_4= RULE_ID
                            {
                            lv_type_4=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChannelDescription17645); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeIDTerminalRuleCall_1_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_4, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7760:6: (lv_type_5= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7760:6: (lv_type_5= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7762:6: lv_type_5= RULE_BASETYPE
                            {
                            lv_type_5=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleChannelDescription17681); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeBaseTypeTerminalRuleCall_1_1_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    match(input,36,FOLLOW_36_in_ruleChannelDescription17699); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getRightParenthesisKeyword_1_2(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7785:6: ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7785:6: ( ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7785:7: ':=' (lv_dataExpr_8= ruleDataExpr ) ':' ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) )
                    {
                    match(input,40,FOLLOW_40_in_ruleChannelDescription17716); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonEqualsSignKeyword_2_0(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7789:1: (lv_dataExpr_8= ruleDataExpr )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7792:6: lv_dataExpr_8= ruleDataExpr
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getChannelDescriptionAccess().getDataExprDataExprParserRuleCall_2_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataExpr_in_ruleChannelDescription17750);
                    lv_dataExpr_8=ruleDataExpr();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "dataExpr", lv_dataExpr_8, "DataExpr", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleChannelDescription17763); 

                            createLeafNode(grammarAccess.getChannelDescriptionAccess().getColonKeyword_2_2(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7814:1: ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==RULE_ID) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==RULE_BASETYPE) ) {
                        alt105=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("7814:1: ( (lv_type_10= RULE_ID ) | (lv_type_11= RULE_BASETYPE ) )", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7814:2: (lv_type_10= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7814:2: (lv_type_10= RULE_ID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7816:6: lv_type_10= RULE_ID
                            {
                            lv_type_10=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleChannelDescription17786); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeIDTerminalRuleCall_2_3_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_10, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7835:6: (lv_type_11= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7835:6: (lv_type_11= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7837:6: lv_type_11= RULE_BASETYPE
                            {
                            lv_type_11=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleChannelDescription17822); 

                            		createLeafNode(grammarAccess.getChannelDescriptionAccess().getTypeBaseTypeTerminalRuleCall_2_3_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getChannelDescriptionRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_11, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
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
    // $ANTLR end ruleChannelDescription


    // $ANTLR start entryRuleSignal
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7862:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7862:48: (iv_ruleSignal= ruleSignal EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7863:2: iv_ruleSignal= ruleSignal EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSignalRule(), currentNode); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal17865);
            iv_ruleSignal=ruleSignal();
            _fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal17875); 

            }

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
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7870:1: ruleSignal returns [EObject current=null] : ( (lv_name_0= RULE_ID ) (lv_channel_1= ruleChannelDescription )? ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        EObject lv_channel_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7875:6: ( ( (lv_name_0= RULE_ID ) (lv_channel_1= ruleChannelDescription )? ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7876:1: ( (lv_name_0= RULE_ID ) (lv_channel_1= ruleChannelDescription )? )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7876:1: ( (lv_name_0= RULE_ID ) (lv_channel_1= ruleChannelDescription )? )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7876:2: (lv_name_0= RULE_ID ) (lv_channel_1= ruleChannelDescription )?
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7876:2: (lv_name_0= RULE_ID )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7878:6: lv_name_0= RULE_ID
            {
            lv_name_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal17922); 

            		createLeafNode(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7896:2: (lv_channel_1= ruleChannelDescription )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==18||LA107_0==35||LA107_0==40) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7899:6: lv_channel_1= ruleChannelDescription
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getSignalAccess().getChannelChannelDescriptionParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleChannelDescription_in_ruleSignal17964);
                    lv_channel_1=ruleChannelDescription();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSignalRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "channel", lv_channel_1, "ChannelDescription", currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

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
    // $ANTLR end ruleSignal


    // $ANTLR start entryRuleSensor
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7926:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7926:48: (iv_ruleSensor= ruleSensor EOF )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7927:2: iv_ruleSensor= ruleSensor EOF
            {
             currentNode = createCompositeNode(grammarAccess.getSensorRule(), currentNode); 
            pushFollow(FOLLOW_ruleSensor_in_entryRuleSensor18004);
            iv_ruleSensor=ruleSensor();
            _fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSensor18014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleSensor


    // $ANTLR start ruleSensor
    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7934:1: ruleSensor returns [EObject current=null] : ( ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token lv_name_0=null;
        Token lv_type_2=null;
        Token lv_type_3=null;
        Token lv_name_4=null;
        Token lv_type_6=null;
        Token lv_type_7=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7939:6: ( ( ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) ) )
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7940:1: ( ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )
            {
            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7940:1: ( ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_ID) ) {
                int LA110_1 = input.LA(2);

                if ( (LA110_1==35) ) {
                    alt110=2;
                }
                else if ( (LA110_1==18) ) {
                    alt110=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("7940:1: ( ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )", 110, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("7940:1: ( ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) ) | ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' ) )", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7940:2: ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7940:2: ( (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) ) )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7940:3: (lv_name_0= RULE_ID ) ':' ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7940:3: (lv_name_0= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7942:6: lv_name_0= RULE_ID
                    {
                    lv_name_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensor18062); 

                    		createLeafNode(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_0_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_0, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleSensor18079); 

                            createLeafNode(grammarAccess.getSensorAccess().getColonKeyword_0_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7964:1: ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) )
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==RULE_ID) ) {
                        alt108=1;
                    }
                    else if ( (LA108_0==RULE_BASETYPE) ) {
                        alt108=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("7964:1: ( (lv_type_2= RULE_ID ) | (lv_type_3= RULE_BASETYPE ) )", 108, 0, input);

                        throw nvae;
                    }
                    switch (alt108) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7964:2: (lv_type_2= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7964:2: (lv_type_2= RULE_ID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7966:6: lv_type_2= RULE_ID
                            {
                            lv_type_2=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensor18102); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeIDTerminalRuleCall_0_2_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_2, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7985:6: (lv_type_3= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7985:6: (lv_type_3= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:7987:6: lv_type_3= RULE_BASETYPE
                            {
                            lv_type_3=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleSensor18138); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeBaseTypeTerminalRuleCall_0_2_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_3, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8006:6: ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' )
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8006:6: ( (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')' )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8006:7: (lv_name_4= RULE_ID ) '(' ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) ) ')'
                    {
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8006:7: (lv_name_4= RULE_ID )
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8008:6: lv_name_4= RULE_ID
                    {
                    lv_name_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensor18177); 

                    		createLeafNode(grammarAccess.getSensorAccess().getNameIDTerminalRuleCall_1_0_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_4, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,35,FOLLOW_35_in_ruleSensor18194); 

                            createLeafNode(grammarAccess.getSensorAccess().getLeftParenthesisKeyword_1_1(), null); 
                        
                    // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8030:1: ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) )
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==RULE_ID) ) {
                        alt109=1;
                    }
                    else if ( (LA109_0==RULE_BASETYPE) ) {
                        alt109=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("8030:1: ( (lv_type_6= RULE_ID ) | (lv_type_7= RULE_BASETYPE ) )", 109, 0, input);

                        throw nvae;
                    }
                    switch (alt109) {
                        case 1 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8030:2: (lv_type_6= RULE_ID )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8030:2: (lv_type_6= RULE_ID )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8032:6: lv_type_6= RULE_ID
                            {
                            lv_type_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSensor18217); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeIDTerminalRuleCall_1_2_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_6, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8051:6: (lv_type_7= RULE_BASETYPE )
                            {
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8051:6: (lv_type_7= RULE_BASETYPE )
                            // ../de.cau.cs.kieler.esterel/src-gen/de/cau/cs/kieler/parser/antlr/internal/InternalEsterel.g:8053:6: lv_type_7= RULE_BASETYPE
                            {
                            lv_type_7=(Token)input.LT(1);
                            match(input,RULE_BASETYPE,FOLLOW_RULE_BASETYPE_in_ruleSensor18253); 

                            		createLeafNode(grammarAccess.getSensorAccess().getTypeBaseTypeTerminalRuleCall_1_2_1_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getSensorRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_7, "BaseType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;

                    }

                    match(input,36,FOLLOW_36_in_ruleSensor18271); 

                            createLeafNode(grammarAccess.getSensorAccess().getRightParenthesisKeyword_1_3(), null); 
                        

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
    // $ANTLR end ruleSensor


 

    public static final BitSet FOLLOW_ruleProgramm_in_entryRuleProgramm73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgramm83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainModule_in_ruleProgramm142 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleProgramm180 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleMainModule_in_entryRuleMainModule218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainModule228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMainModule262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMainModule284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMainModule301 = new BitSet(new long[]{0xFA3E2A459F200010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleModuleInterface_in_ruleMainModule335 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleModuleBody_in_ruleMainModule374 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEndModule_in_ruleMainModule387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModule456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModule478 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleModule495 = new BitSet(new long[]{0xFA3E2A459F200010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleModuleInterface_in_ruleModule529 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleModuleBody_in_ruleModule568 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleEndModule_in_ruleModule581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndModule_in_entryRuleEndModule607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndModule618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEndModule657 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEndModule670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEndModule690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleBody_in_entryRuleModuleBody728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleBody738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleModuleBody796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleInterface_in_entryRuleModuleInterface832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleInterface842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalDecl_in_ruleModuleInterface901 = new BitSet(new long[]{0x000000059F200002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_ruleModuleInterface945 = new BitSet(new long[]{0x000000059F200002L});
    public static final BitSet FOLLOW_ruleSensorDecl_in_ruleModuleInterface989 = new BitSet(new long[]{0x000000059F200002L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_ruleModuleInterface1033 = new BitSet(new long[]{0x000000059F200002L});
    public static final BitSet FOLLOW_ruleRelationDecl_in_ruleModuleInterface1077 = new BitSet(new long[]{0x000000059F200002L});
    public static final BitSet FOLLOW_ruleFunctionDecl_in_ruleModuleInterface1121 = new BitSet(new long[]{0x000000059F200002L});
    public static final BitSet FOLLOW_ruleSignalDecl_in_entryRuleSignalDecl1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalDecl1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSignalDecl1213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1247 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1295 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSignalDecl1336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1370 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1418 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSignalDecl1459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1493 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1541 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleSignalDecl1582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1616 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSignalDecl1630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleSignalDecl1664 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSignalDecl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensorDecl_in_entryRuleSensorDecl1713 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensorDecl1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSensorDecl1757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleSensorDecl1791 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleSensorDecl1805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSensor_in_ruleSensorDecl1839 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleSensorDecl1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationDecl_in_entryRuleRelationDecl1887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationDecl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationDecl1931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleRelationDecl1965 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleRelationDecl1979 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleRelationDecl2013 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleRelationDecl2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation2061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationImplication_in_ruleRelation2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationIncompatibility_in_ruleRelation2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationImplication_in_entryRuleRelationImplication2177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationImplication2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationImplication2234 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRelationImplication2258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationImplication2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationIncompatibility_in_entryRuleRelationIncompatibility2329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationIncompatibility2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationIncompatibility2386 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRelationIncompatibility2410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationIncompatibility2445 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleRelationIncompatibility2458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRelationIncompatibility2480 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleTypeDecl_in_entryRuleTypeDecl2518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDecl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeDecl2562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDecl2596 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTypeDecl2610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDecl2644 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDecl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleType2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDecl_in_entryRuleConstantDecl2788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDecl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConstantDecl2832 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2866 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleConstantDecl2880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOneTypeConstantDecl_in_ruleConstantDecl2914 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleConstantDecl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOneTypeConstantDecl_in_entryRuleOneTypeConstantDecl2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOneTypeConstantDecl2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl3031 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleOneTypeConstantDecl3045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleOneTypeConstantDecl3079 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleOneTypeConstantDecl3094 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOneTypeConstantDecl3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleOneTypeConstantDecl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant3195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant3252 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleConstant3270 = new BitSet(new long[]{0x00000000000007D0L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleConstant3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue3344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantValue3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleConstantValue3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantValue3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantValue3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleConstantValue3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleConstantValue3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDecl_in_entryRuleFunctionDecl3568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDecl3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFunctionDecl3612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFunctionDecl3646 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionDecl3660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleFunctionDecl3694 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionDecl3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3799 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleFunction3816 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3840 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleFunction3852 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunction3872 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3895 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleFunction3907 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_36_in_ruleFunction3930 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunction3939 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunction3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleFunction3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement4040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleStatement4097 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleStatement4115 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleStatement4149 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleAtomicStatement_in_entryRuleAtomicStatement4188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicStatement4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_ruleAtomicStatement4245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleAtomicStatement4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_ruleAtomicStatement4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAtomicStatement4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_ruleAtomicStatement4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_ruleAtomicStatement4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEveryDo_in_ruleAtomicStatement4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_ruleAtomicStatement4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHalt_in_ruleAtomicStatement4461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfTest_in_ruleAtomicStatement4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSignalDecl_in_ruleAtomicStatement4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_ruleAtomicStatement4542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNothing_in_ruleAtomicStatement4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_ruleAtomicStatement4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_ruleAtomicStatement4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_ruleAtomicStatement4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_ruleAtomicStatement4677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuspend_in_ruleAtomicStatement4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSustain_in_ruleAtomicStatement4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrap_in_ruleAtomicStatement4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAtomicStatement4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbort_in_ruleAtomicStatement4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence4844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence4854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicStatement_in_ruleSequence4901 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSequence4919 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleAtomicStatement_in_ruleSequence4953 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSequence4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock5004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBlock5048 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlock5082 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleBlock5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment5128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment5185 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAssignment5202 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleAssignment5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbort_in_entryRuleAbort5273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbort5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAbort5317 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbort5351 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleAbort5364 = new BitSet(new long[]{0x0000104A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleAbortBody_in_ruleAbort5398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortBody_in_entryRuleAbortBody5435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortBody5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortInstance_in_ruleAbortBody5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCase_in_ruleAbortBody5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortEnd_in_entryRuleAbortEnd5552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortEnd5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAbortEnd5601 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleAbortEnd5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortInstance_in_entryRuleAbortInstance5655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortInstance5665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleAbortInstance5724 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAbortInstance5738 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbortInstance5772 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAbortEnd_in_ruleAbortInstance5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCase_in_entryRuleAbortCase5849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortCase5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase5918 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAbortCase5956 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleAbortEnd_in_ruleAbortCase5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_entryRuleAbortCaseSingle6032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbortCaseSingle6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAbortCaseSingle6076 = new BitSet(new long[]{0x0000004A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleAbortCaseSingle6110 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAbortCaseSingle6124 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAbortCaseSingle6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwait_in_entryRuleAwait6197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwait6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAwait6241 = new BitSet(new long[]{0x0000104A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleAwaitBody_in_ruleAwait6275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitBody_in_entryRuleAwaitBody6312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitBody6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitInstance_in_ruleAwaitBody6369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitCase_in_ruleAwaitBody6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitEnd_in_entryRuleAwaitEnd6429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitEnd6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAwaitEnd6478 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleAwaitEnd6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitInstance_in_entryRuleAwaitInstance6532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitInstance6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleAwaitInstance6589 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleAwaitInstance6598 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleAwaitInstance6632 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAwaitEnd_in_ruleAwaitInstance6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAwaitCase_in_entryRuleAwaitCase6709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAwaitCase6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase6778 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleAwaitCase6816 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleAwaitEnd_in_ruleAwaitCase6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDo_in_entryRuleDo6892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDo6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDo6936 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDo6970 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_ruleDoUpto_in_ruleDo7009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWatching_in_ruleDo7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoUpto_in_entryRuleDoUpto7091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoUpto7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDoUpto7135 = new BitSet(new long[]{0x0000004A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleDoUpto7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWatching_in_entryRuleDoWatching7206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWatching7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDoWatching7250 = new BitSet(new long[]{0x0000004A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleDoWatching7284 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleDoWatchingEnd_in_ruleDoWatching7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWatchingEnd_in_entryRuleDoWatchingEnd7360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWatchingEnd7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDoWatchingEnd7404 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleDoWatchingEnd7438 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDoWatchingEnd7451 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDoWatchingEnd7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEmit_in_entryRuleEmit7496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEmit7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleEmit7540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEmit7562 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleEmit7575 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleEmit7609 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEmit7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEveryDo_in_entryRuleEveryDo7657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEveryDo7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEveryDo7701 = new BitSet(new long[]{0x0000004A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleEveryDo7735 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleEveryDo7748 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleEveryDo7782 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEveryDo7795 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_ruleEveryDo7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExit_in_entryRuleExit7840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExit7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExit7884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExit7906 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleExit7919 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleExit7953 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleExit7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHalt_in_entryRuleHalt8001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHalt8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleHalt8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfTest_in_entryRuleIfTest8087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfTest8097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIfTest8131 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleIfTest8165 = new BitSet(new long[]{0x01C0000000080000L});
    public static final BitSet FOLLOW_ruleThenPart_in_ruleIfTest8203 = new BitSet(new long[]{0x0140000000080000L});
    public static final BitSet FOLLOW_ruleElsIfPart_in_ruleIfTest8242 = new BitSet(new long[]{0x0100000000080000L});
    public static final BitSet FOLLOW_ruleElsePart_in_ruleIfTest8281 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIfTest8295 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIfTest8305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElsIfPart_in_entryRuleElsIfPart8340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElsIfPart8350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElsIf_in_ruleElsIfPart8409 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleElsIf_in_ruleElsIfPart8447 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleElsIf_in_entryRuleElsIf8485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElsIf8495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleElsIf8529 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleElsIf8563 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleThenPart_in_ruleElsIf8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenPart_in_entryRuleThenPart8639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThenPart8649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleThenPart8683 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleThenPart8717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElsePart_in_entryRuleElsePart8754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElsePart8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleElsePart8798 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleElsePart8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoop_in_entryRuleLoop8869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoop8879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLoop8913 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleLoopBody_in_ruleLoop8947 = new BitSet(new long[]{0x0400000000080000L});
    public static final BitSet FOLLOW_ruleEndLoop_in_ruleLoop8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopEach_in_ruleLoop8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEndLoop_in_entryRuleEndLoop9032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEndLoop9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEndLoop9081 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleEndLoop9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopEach_in_entryRuleLoopEach9135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopEach9145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLoopEach9179 = new BitSet(new long[]{0x0000004A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleLoopDelay_in_ruleLoopEach9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopDelay_in_entryRuleLoopDelay9233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopDelay9243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleLoopDelay9301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopBody_in_entryRuleLoopBody9337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopBody9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLoopBody9405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNothing_in_entryRuleNothing9441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNothing9451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNothing9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePause_in_entryRulePause9527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePause9537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePause9571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresent_in_entryRulePresent9613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresent9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePresent9657 = new BitSet(new long[]{0x0000104800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_rulePresentBody_in_rulePresent9691 = new BitSet(new long[]{0x0100000000080000L});
    public static final BitSet FOLLOW_ruleElsePart_in_rulePresent9729 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePresent9743 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePresent9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentBody_in_entryRulePresentBody9788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentBody9798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEventBody_in_rulePresentBody9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentCaseList_in_rulePresentBody9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEventBody_in_entryRulePresentEventBody9904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentEventBody9914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEvent_in_rulePresentEventBody9973 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleThenPart_in_rulePresentEventBody10011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentCaseList_in_entryRulePresentCaseList10049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentCaseList10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentCase_in_rulePresentCaseList10118 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rulePresentCase_in_rulePresentCaseList10156 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rulePresentCase_in_entryRulePresentCase10194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentCase10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePresentCase10238 = new BitSet(new long[]{0x0000004800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_rulePresentEvent_in_rulePresentCase10272 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_rulePresentCase10286 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_rulePresentCase10320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePresentEvent_in_entryRulePresentEvent10359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePresentEvent10369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExpr_in_rulePresentEvent10428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePresentEvent10448 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_rulePresentEvent10482 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rulePresentEvent10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRepeat_in_entryRuleRepeat10529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRepeat10539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRepeat10585 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleRepeat10608 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleRepeat10642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleRepeat10655 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleRepeat10689 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRepeat10702 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRepeat10712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_entryRuleRun10747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRun10757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRun10792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModuleRenaming_in_ruleRun10826 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleRun10840 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenamingList_in_ruleRun10874 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRun10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleRun10906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleModuleRenaming_in_ruleRun10940 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleRun10954 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenamingList_in_ruleRun10988 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleRun11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleRenaming_in_entryRuleModuleRenaming11037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleRenaming11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModuleRenaming11094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleModuleRenaming11119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModuleRenaming11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenamingList_in_entryRuleRenamingList11197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenamingList11207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleRenamingList11266 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleRenamingList11280 = new BitSet(new long[]{0x0000000580000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleRenaming_in_ruleRenamingList11314 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleRenaming_in_entryRuleRenaming11353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRenaming11363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRenaming11398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRenaming_in_ruleRenaming11432 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming11446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTypeRenaming_in_ruleRenaming11480 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_32_in_ruleRenaming11503 = new BitSet(new long[]{0x00000000000007D0L});
    public static final BitSet FOLLOW_ruleConstantRenaming_in_ruleRenaming11537 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming11551 = new BitSet(new long[]{0x00000000000007D0L});
    public static final BitSet FOLLOW_ruleConstantRenaming_in_ruleRenaming11585 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_34_in_ruleRenaming11608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionRenaming_in_ruleRenaming11642 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming11656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFunctionRenaming_in_ruleRenaming11690 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_68_in_ruleRenaming11713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_ruleRenaming11747 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRenaming11761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_ruleRenaming11795 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTypeRenaming_in_entryRuleTypeRenaming11835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRenaming11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRenaming11892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleTypeRenaming11904 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRenaming11926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantRenaming_in_entryRuleConstantRenaming11967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantRenaming11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleConstantRenaming12036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleConstantRenaming12049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantRenaming12071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionRenaming_in_entryRuleFunctionRenaming12112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionRenaming12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionRenaming12169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleFunctionRenaming12181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionRenaming12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalRenaming_in_entryRuleSignalRenaming12244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalRenaming12254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalRenaming12301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ruleSignalRenaming12313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignalRenaming12335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSignalDecl_in_entryRuleLocalSignalDecl12376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalSignalDecl12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleLocalSignalDecl12420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLocalSignalList_in_ruleLocalSignalDecl12454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleLocalSignalDecl12467 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleLocalSignalDecl12501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLocalSignalDecl12514 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleLocalSignalDecl12524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalSignalList_in_entryRuleLocalSignalList12559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalSignalList12569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleLocalSignalList12637 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleLocalSignalList12651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleLocalSignalList12685 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleSuspend_in_entryRuleSuspend12724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuspend12734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleSuspend12768 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleSuspend12802 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSuspend12815 = new BitSet(new long[]{0x0000004A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleSuspend12849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSustain_in_entryRuleSustain12886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSustain12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSustain12930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSustain12952 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleSustain12965 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleSustain12999 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSustain13012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrap_in_entryRuleTrap13047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrap13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTrap13091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTrapDeclList_in_ruleTrap13125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleTrap13138 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTrap13172 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTrapHandlerList_in_ruleTrap13210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTrap13224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleTrap13234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapDeclList_in_entryRuleTrapDeclList13269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapDeclList13279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13338 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTrapDeclList13352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTrapDecl_in_ruleTrapDeclList13386 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleTrapDecl_in_entryRuleTrapDecl13425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapDecl13435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrapDecl13482 = new BitSet(new long[]{0x0000010800040002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_ruleTrapDecl13524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapHandlerList_in_entryRuleTrapHandlerList13562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapHandlerList13572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList13631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTrapHandler_in_ruleTrapHandlerList13669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleTrapHandler_in_entryRuleTrapHandler13707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapHandler13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleTrapHandler13751 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleTrapExpr_in_ruleTrapHandler13785 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTrapHandler13798 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleTrapHandler13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable13869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable13879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleVariable13913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_ruleVariable13947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleVariable13960 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVariable13994 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleVariable14007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleVariable14017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDecl_in_entryRuleVariableDecl14052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDecl14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableList_in_ruleVariableDecl14121 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDecl14134 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDecl14157 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14193 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleVariableDecl14221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableList_in_ruleVariableDecl14255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVariableDecl14268 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDecl14291 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleVariableDecl14327 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleVariableList_in_entryRuleVariableList14371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableList14381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableList14428 = new BitSet(new long[]{0x0000010000400002L});
    public static final BitSet FOLLOW_40_in_ruleVariableList14446 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleVariableList14480 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleVariableList14505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableList14527 = new BitSet(new long[]{0x0000010000400002L});
    public static final BitSet FOLLOW_40_in_ruleVariableList14545 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleVariableList14579 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleWeakAbort_in_entryRuleWeakAbort14620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbort14630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleWeakAbort14664 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWeakAbort14673 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWeakAbort14707 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleWeakAbort14720 = new BitSet(new long[]{0x0000104A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleWeakAbortBody_in_ruleWeakAbort14754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortBody_in_entryRuleWeakAbortBody14791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortBody14801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortInstance_in_ruleWeakAbortBody14848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortCase_in_ruleWeakAbortBody14875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortEnd_in_entryRuleWeakAbortEnd14908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortEnd14919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWeakAbortEnd14957 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_ruleWeakAbortEnd14972 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleWeakAbortEnd14987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortInstance_in_entryRuleWeakAbortInstance15027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortInstance15037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_ruleWeakAbortInstance15096 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleWeakAbortInstance15110 = new BitSet(new long[]{0xFA3E2A4000000010L,0x0000000000000DD6L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleWeakAbortInstance15144 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortInstance15182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWeakAbortCase_in_entryRuleWeakAbortCase15221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWeakAbortCase15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15290 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleAbortCaseSingle_in_ruleWeakAbortCase15328 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_ruleWeakAbortEnd_in_ruleWeakAbortCase15367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataExpr_in_entryRuleDataExpr15404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataExpr15414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataOp_in_ruleDataExpr15474 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataExpr15512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataUnaryExpr_in_ruleDataExpr15558 = new BitSet(new long[]{0x0000000200000002L,0x0000000007FF8008L});
    public static final BitSet FOLLOW_ruleDataOp_in_ruleDataExpr15606 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataExpr15644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataUnaryExpr_in_entryRuleDataUnaryExpr15684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataUnaryExpr15694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataUnaryExpr15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_ruleDataUnaryExpr15742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleDataUnaryExpr15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDataUnaryExpr15770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataUnaryExpr15784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataUnaryExpr15799 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataUnaryExpr15821 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDataUnaryExpr15829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleDataUnaryExpr15846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataUnaryExpr15868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDataUnaryExpr15888 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDataUnaryExpr15897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleDataUnaryExpr15906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataUnaryExpr15928 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDataUnaryExpr15940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDataUnaryExpr15957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataUnaryExpr15979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataUnaryExpr16012 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDataUnaryExpr16024 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataUnaryExpr16058 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_22_in_ruleDataUnaryExpr16072 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDataUnaryExpr16106 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_36_in_ruleDataUnaryExpr16121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataOp_in_entryRuleDataOp16156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataOp16167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDataOp16205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDataOp16224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDataOp16243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleDataOp16262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleDataOp16281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleDataOp16300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleDataOp16319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleDataOp16338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataOp16357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleDataOp16376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleDataOp16395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleDataOp16414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDataOp16433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleDataOp16452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrapExpr_in_entryRuleTrapExpr16490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrapExpr16500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleTrapExpr16546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExpr_in_entryRuleSigExpr16577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExpr16587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExprAND_in_ruleSigExpr16646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSigExpr16660 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExprAND_in_ruleSigExpr16694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleSigExprAND_in_entryRuleSigExprAND16733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExprAND16743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_ruleSigExprAND16802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleSigExprAND16816 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_ruleSigExprAND16850 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_entryRuleSigExprUnary16889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSigExprUnary16899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSigExprUnary16946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleSigExprUnary16970 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleSigExprUnary17004 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSigExprUnary17017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleSigExprUnary17034 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExprUnary_in_ruleSigExprUnary17068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayExpr_in_entryRuleDelayExpr17106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayExpr17116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayEvent_in_ruleDelayExpr17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleDelayExpr17220 = new BitSet(new long[]{0x0000004000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleDelayEvent_in_ruleDelayExpr17258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayEvent_in_entryRuleDelayEvent17296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayEvent17306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDelayEvent17353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDelayEvent17372 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDelayEvent17381 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleDelayEvent17403 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleDelayEvent17411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDelayEvent17428 = new BitSet(new long[]{0x0000000800000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSigExpr_in_ruleDelayEvent17450 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleDelayEvent17458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_entryRuleChannelDescription17492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelDescription17502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleChannelDescription17537 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChannelDescription17560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleChannelDescription17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleChannelDescription17622 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChannelDescription17645 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleChannelDescription17681 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleChannelDescription17699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleChannelDescription17716 = new BitSet(new long[]{0x0000000A00000790L,0x0000000007FFF008L});
    public static final BitSet FOLLOW_ruleDataExpr_in_ruleChannelDescription17750 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleChannelDescription17763 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleChannelDescription17786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleChannelDescription17822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal17865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal17875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal17922 = new BitSet(new long[]{0x0000010800040002L});
    public static final BitSet FOLLOW_ruleChannelDescription_in_ruleSignal17964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor18004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSensor18014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensor18062 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSensor18079 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensor18102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleSensor18138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensor18177 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSensor18194 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSensor18217 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RULE_BASETYPE_in_ruleSensor18253 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSensor18271 = new BitSet(new long[]{0x0000000000000002L});

}